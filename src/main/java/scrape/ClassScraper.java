package scrape;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Joe on 5/21/2017.
 */
public class ClassScraper {

    private final Logger logger = Logger.getLogger("logger");

    public ClassScraper() {};

    /**
     * Will go through each class-link on the index page for that category (core, hybrid, etc.)
     * @param link link to the class index page
     */
    public void scrapeIndexPage(String link) {

        //fetch document over HTTP
        try {
            Document doc = Jsoup.connect(link).get();

            Elements classElements = doc.select(".body a");

            String linkCheck = link.replaceAll("classes.*", "");
            ArrayList<String> classPageLinks = new ArrayList<String>();

            String pageLink;
            for (Element e : classElements) {
                pageLink = e.attr("abs:href");
                if (pageLink.replaceFirst("classes.*", "").equals(linkCheck) &&
                        !pageLink.replaceFirst("#.*", "").equals(link.replaceFirst("#.*", ""))) {
                    classPageLinks.add(pageLink);
                    scrapeClassPage(pageLink);
                } else {
                    logger.info("rejected href = " + pageLink);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Something went wrong while trying to access link : " +
                    link);
        }
    }

    /**
     * This method exists because I didn't feel like writing a special case for Base Classes
     * @param links an array of the links leading to each class page
     */
    public void scrapeIndexPage(String[] links) {

    }

    private void scrapeClassPage(String link) {

        logger.info("Scraping page : " + link);

        //fetch document over HTTP
        try {
            Document doc = Jsoup.connect(link).get();

            Elements classBody = doc.select("div.body");

            String className = classBody.select("div.body > h1").first().text();
            logger.info(className);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Something went wrong while trying to access CLASS link : " +
                link);
        }
    }



}

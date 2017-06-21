package scrape;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Joe on 5/21/2017.
 */
public class ClassScraperTest  {

    private final Logger logger = Logger.getLogger("logger");

    private ClassScraper scraper;

    private String[] classIndexLinks = {
            "http://paizo.com/pathfinderRPG/prd/coreRulebook/classes.html",
            "http://paizo.com/pathfinderRPG/prd/advancedClassGuide/classes/index.html",
            "http://paizo.com/pathfinderRPG/prd/unchained/classes/index.html",
            "http://paizo.com/pathfinderRPG/prd/occultAdventures/classes/index.html"
    };

    @Before
    public void setUp() {
        scraper = new ClassScraper();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testScrapeIndexPage() {
        for (String classLink : classIndexLinks) {
            scraper.scrapeIndexPage(classLink);

        }
    }

    @Test
    public void testRegex() {
        String regex = "([A-Z][A-Za-z\\-]+ )*Spell-Like Abilities";
        String test = "Kitsune Spell-Like Abilities (CL 1st; concentration +4)  3/day-dancing lights   Bloodline-Ability Spell-Like Abilities (CL 1st; concentration +4)  6/day-laughing touch";

        //need to split and get Ability Sources!
        String[] abilitySplit1 = test.split(regex);

        for (int i = 0; i < abilitySplit1.length; i++) {
            logger.info(abilitySplit1[i]);
        }
    }
}

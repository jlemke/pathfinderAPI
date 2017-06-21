package scrape;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Joe on 5/22/2017.
 *
 * This isn't a web scraper, but what am I gunna do? Make a whole other package for excel reading?
 */
public class ExcelToMysql {

    private final Logger logger = Logger.getLogger("logger");

    /**
     * Goes through the bestiary excel sheet found on pathfindercommunity.net and saves
     * it in normalized form using the Monster hibernate object
     * @return returns a list of Monster names that could not be saved properly
     */
    public ArrayList<String> normalizeBestiary(String excelFilePath) {

        ArrayList<String> monstersSkipped = new ArrayList<String>();

        try {
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

            try {
                Workbook workbook = new XSSFWorkbook(inputStream);
                Sheet firstSheet = workbook.getSheetAt(0);
                Iterator<Row> iterator = firstSheet.iterator();

                ArrayList<Cell> cells;

                //each row = 1 Monster
                while (iterator.hasNext()) {
                    Row nextRow = iterator.next();
                    Iterator<Cell> cellIterator = nextRow.cellIterator();

                    //make an array of the cells in this row
                    cells = new ArrayList<Cell>();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                    }


                    cells.get(0); //name
                    cells.get(1); //cr
                    cells.get(2); //xp
                    cells.get(3); //race
                    cells.get(4); //class string, delimited by /, archetype in (), may include deity
                    // 5 = Monster source, but not very useful (?)
                    cells.get(6); //alignment
                    cells.get(7); //size
                    cells.get(8); //type
                    cells.get(9); //subtypes, enclosed in ( ), comma-delimited
                    cells.get(10); //init, M indicates mythic initiative, ( ) indicates potential modifier, / indicates dual initiative
                    cells.get(11); //senses!
                    //dragon senses: add darkvision 120ft. and blindsense 60ft.

                    /*
                        Feats :
                        separated by ,
                        Improved Critical(bite)
                        Improved Critical (bite, gore, and claws)
                        Skill Focus (Knowledge[religion])
                        Improved InitiativeM
                        Combat CastingB
                        Improved Sunder[M]
                        Dazing AssaultB APG
                     */

                    //weapon dismantling!
                    /*
                        split weapons into their own strings
                        check how many weapons
                        check for feats:

                            Weapon Finesse, Multiattack,
                        split the weapon into its components:
                        (enhancement bonus,
                        weapon name,
                        touch attack?,
                        attack bonus

                        )
                        determine whether it is a primary or secondary
                        primary = bite, claw, gore, slam, sting, talons
                        other = secondary

                        calculatedBonus =
                        BAB + sizeMod + Math.floor((strScore-10)/2)
                        BAB + sizeMod + Math.floor((dexScore-10)/2)
                        actualBonus - calculatedBonus = miscMod

                        calculatedDamage = Math.floor((strScore-10)/2)

                     */


                    /*
                        special attack regex (split on this)
                        [a-zA-Z][a-zA-Z ]+(\([^\(\)]+\))*
                        split on \([^\(\)]+\) for NOTE
                     */

                    /*
                        Spell-Like Abilities
                        String spellLikeStr = cells.get(36);
                        if (!spellLikeStr.equals("")) {
                            String[] spellLikeArray = cells.get(36).split("([A-Z][A-Za-z\-]+ )*Spell-Like Abilities");
                            //still need to get ability sources!
                        }
                     */

                }

                workbook.close();
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("Error reading file in path : " + excelFilePath);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            logger.error("Could not find file with path : " + excelFilePath);
        }

        //return any Monster names that weren't added successfully
        return monstersSkipped;
    }


    public ArrayList<String> normalizeSpellList(String excelFilePath) {
        ArrayList<String> spellsSkipped = new ArrayList<String>();

        return spellsSkipped;
    };

}

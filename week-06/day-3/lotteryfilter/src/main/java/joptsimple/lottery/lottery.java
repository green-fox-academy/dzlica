package joptsimple.lottery;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class lottery {
    public static void main (String[] args) {
        argHandler(args);
    }

    public static void argHandler (String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts("y").withRequiredArg();
        parser.accepts("f");
        parser.accepts("o");

        OptionSet options = parser.parse(args);
        String year = String.valueOf(options.valueOf("y"));


        if (options.has("y")) {
            try {
            CSVReader reader = new CSVReader(new FileReader("/Users/lica/GreenFox/dzlica/week-06/day-3/lotteryfilter/src/main/java/joptsimple/lottery/otos.csv"));
                CSVWriter writer = new CSVWriter(new FileWriter("/Users/lica/GreenFox/dzlica/week-06/day-3/lotteryfilter/src/main/java/joptsimple/lottery/output.csv"));
                List<String[]> lines = reader.readAll();
                List<String[]> temp = new ArrayList();
                for (int i = 0; i < lines.size(); i++) {
                    if (lines.get(i)[0].startsWith(year)) {
                        temp.add(lines.get(i));
                    }
                }
                writer.writeAll(temp);
                writer.close();

        } catch (Exception e) {
                System.out.println("Unreadable");
            }
        }
    }
}



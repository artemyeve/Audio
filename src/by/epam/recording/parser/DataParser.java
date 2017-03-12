package by.epam.recording.parser;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Created by Acer on 03.03.2017.
 */
public class DataParser {
    private static Logger logger = LogManager.getLogger(DataParser.class);
    private static final String SPLIT_PARAMETERS = ",";
    private static final String SPLIT_KEY_VALUE = ":";

    public static List<Map<String, String>> defineData(List<String> fileData) {

        List<Map<String, String>> result = new ArrayList<>();

        for (String line : fileData) {
            line = line.substring(1, line.length() - 1);
            String[] strings = line.split(SPLIT_PARAMETERS);
            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < strings.length; i++) {
                String pair = strings[i];
                String[] keyValue = pair.split(SPLIT_KEY_VALUE);
                if (keyValue.length != 2) {
                    logger.log(Level.INFO, "Problem parsing key values, could not split on ':' sign?!");
                }
                map.put(keyValue[0].trim(), keyValue[1].trim());

            }
            result.add(map);
        }

        return result;
    }
}

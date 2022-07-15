package NaiveVersion;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Anthony Z.
 * @Date 9/7/2022
 * @Description: This class has no relation with other class,
 *
 * Most simple version to convert String from outout.json to map.
 * But it cannot meet the complex requirements in this project.
 *
 */
public class EasyConverter {
    private String variable;
    private String num;

    public static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static void main(String[] args) throws IOException {
        String file = "src/main/resources/output.json";
        String jsonString = readFileAsString(file);
//        Test output
//        System.out.println(jsonString);
        Map<String, Object> mapping1 = new ObjectMapper().readValue(jsonString, HashMap.class);

        // Iterate the map
        for(Map.Entry<String, Object> entry:mapping1.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
//            System.out.println(entry.getValue());
        }
    }
}

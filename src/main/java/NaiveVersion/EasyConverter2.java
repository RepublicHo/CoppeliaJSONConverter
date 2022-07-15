package NaiveVersion;

import java.io.*;
import java.nio.file.Files;
import java.util.Map;

import com.google.gson.Gson;

/**
 * @Author Anthony Z.
 * @Date 15/7/2022
 * @Description:
 * Similar to the first easy converter,
 * it cannot get a specific parameter within
 */
public class EasyConverter2 {
    public static Map<String, Object> readJsonFile(String fileName) {
        Gson gson = new Gson();
        String json = "";
        try {
            File file = new File(fileName);
            Reader reader = new InputStreamReader(Files.newInputStream(file.toPath()), "utf-8");
            int ch = 0;
            StringBuffer buffer = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                buffer.append((char) ch);
            }
            reader.close();
            json = buffer.toString();
            return gson.fromJson(json, Map.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Map<String, Object> objectMap = readJsonFile("src/main/resources/output.json");
        System.out.println(objectMap.get("FeatureSatisfaction"));
        System.out.println(objectMap.get("Similarity"));
        System.out.println(objectMap.get("SatisfactionTotal"));

    }
}

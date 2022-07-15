package AdvancedVersion;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author Anthony Z.
 * @Date 15/7/2022
 * @Description:
 */
public class GetJSON{
    String file = "src/main/resources/output.json";

    static void startParsing(String result){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            DimensionDetails dimensionDetails = objectMapper.readValue(result, DimensionDetails.class);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(result);
            stringBuilder.append("\n\n\n"+dimensionDetails.getAction());
            System.out.println(stringBuilder);
        }catch (JsonParseException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (JsonMappingException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    private static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
    public static void main(String[] args) throws IOException{

        String file = "src/main/resources/output.json";
        String jsonString = readFileAsString(file);
        startParsing(jsonString);

    }
}

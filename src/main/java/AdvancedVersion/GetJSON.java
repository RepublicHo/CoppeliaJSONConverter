package AdvancedVersion;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @Author Anthony Z.
 * @Date 15/7/2022
 * @Description:
 */
public class GetJSON{
    String file = "src/main/resources/output.json";

    protected void StartParsing(String result){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            DimensionDetails userDetails = objectMapper.readValue(result, DimensionDetails.class);

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(result);
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
}

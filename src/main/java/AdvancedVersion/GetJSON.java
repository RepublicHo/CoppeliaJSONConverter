package AdvancedVersion;
import net.sf.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author Anthony Z.
 * @Date 15/7/2022
 * @Description:
 *
 * @Reference:
 * 1. java如何解析JSON字符串（复杂json解析详解） from CSDN.
 *
 */
public class GetJSON{
    private String filePath = "src/main/resources/output.json";
    private static JSONObject jsonObject;
    private static DimensionDetails dimensionDetails;
    public GetJSON(){
        try{
            String jsonString = readFileAsString(filePath);
            jsonObject = JSONObject.fromObject(jsonString);
            dimensionDetails = new DimensionDetails();
            startParsing();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private void startParsing(){
        dimensionDetails.setFeatureSatisfaction(parseFeatureSatisfaction());
        dimensionDetails.setAction(parseAction());
//        dimensionDetails.setRelevanceTotal(parseRelevanceTotal());

    }
    private static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static void main(String[] args) { // for testing

        GetJSON getJSON = new GetJSON();

    }

    /**
     * Parse FeatureSatisfaction
     */
    private AllActions parseFeatureSatisfaction(){
        JSONObject featureSatisfaction = jsonObject.getJSONObject("FeatureSatisfaction");
        AllActions temp = (AllActions) JSONObject.toBean(featureSatisfaction, AllActions.class);

        return new AllActions(
                temp.getNil(), temp.getNegative(), temp.getChange(),
                temp.getAvoid(), temp.getPositive()
        );
    }
    private String parseAction(){
        return jsonObject.getString("Action");
    }

    private Indicative parseRelevanceTotal(){
        JSONObject relevanceTotal = jsonObject.getJSONObject("RelevanceTotal");
        Indicative temp = (Indicative) JSONObject.toBean(relevanceTotal, Indicative.class);
        System.out.println(temp.getCounterIndicative());
        return new Indicative(temp.getCounterIndicative(), temp.getIndicative());
    }
}

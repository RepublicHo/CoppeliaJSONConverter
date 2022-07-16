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
 * 1. Prototype Design Pattern is used to
 * reduce the complexity of the code.
 *
 */
public class GetJSON{
    private String filePath = "src/main/resources/output.json";
    private static JSONObject jsonObject;
    private static DimensionDetails dimensionDetails;
    public GetJSON(){
        try{
            // Get the content of json file as string
            String jsonString = readFileAsString(filePath);
            // Store the content into jsonObject converted from String
            jsonObject = JSONObject.fromObject(jsonString);
            // Initialize the DimensionDetails which will store all the data
            dimensionDetails = new DimensionDetails();
            // Start parse and set the value into dimensionDetails
            startParsing();

        }catch (IOException e){
            e.printStackTrace();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Read the content from the file as String
     * @param file
     * @return String as the content of json file
     * @throws IOException
     */
    private static String readFileAsString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    private void startParsing() throws CloneNotSupportedException {

        dimensionDetails.setFeatureSatisfaction(parseAllActions("FeatureSatisfaction"));
        dimensionDetails.setAction(parseString("Action"));
        dimensionDetails.setRelevanceTotal(parseIndicative("RelevanceTotal"));
        dimensionDetails.setSimilarity(parseFeatureIndicative("Similarity"));
        dimensionDetails.setSimilarityTotal(parseIndicative("SimilarityTotal"));
        dimensionDetails.setUseIntentions(parseFeatureIndicative("UseIntentions"));
        dimensionDetails.setEngagementTotal(parseIndicative("EngagementTotal"));
        dimensionDetails.setTradeoffTotal(parseDouble("TradeoffTotal"));
        dimensionDetails.setUseIntentionsTotal(parseIndicative("UseIntentionsTotal"));
        dimensionDetails.setRelevance(parseFeatureIndicative("Relevance"));
        dimensionDetails.setSatisfactionTotal(parseDouble("SatisfactionTotal"));
        dimensionDetails.setValenceTotal(parseFeatureIndicative("ValenceTotal"));
        dimensionDetails.setActionTendencies(parseAllFeatures("ActionTendencies"));
        dimensionDetails.setEngagement(parseFeatureIndicative("Engagement"));
        dimensionDetails.setValence(parseFeatureIndicative("Valence"));
        dimensionDetails.setTradeoff(parseFeatures("Tradeoff"));
    }


    public static void main(String[] args) { // for testing

        GetJSON JsonInfo = new GetJSON();
        DimensionDetails dd = JsonInfo.getDimensionDetails();
        System.out.println("Engagement-Lost10$-Indicative:\t" +
                dd.getEngagement().getLost10().getIndicative());
        System.out.println("UseIntentionsTotal-Indicative:\t" +
                dd.getUseIntentionsTotal().getIndicative());
        System.out.println("SatisfactionTotal:\t" + dd.getSatisfactionTotal());
    }

    /**
     * Parse all whose return type should be AllActions.
     * Shallow clone can meet the requirements, given we wouldn't modify the data.
     * @param s
     * @return Clone of that object
     * @throws CloneNotSupportedException
     */
    private AllActions parseAllActions(String s) throws CloneNotSupportedException{
        JSONObject aa = jsonObject.getJSONObject(s);
        AllActions temp = (AllActions) JSONObject.toBean(aa, AllActions.class);
//        test
//        System.out.println(temp.getNegative());
        return (AllActions) temp.clone();
    }

    /**
     * Parse all whose return type should be AllFeatures.
     * @param s
     * @return Clone of that object
     * @throws CloneNotSupportedException
     */
    private AllFeatures parseAllFeatures(String s) throws CloneNotSupportedException{
        JSONObject af = jsonObject.getJSONObject(s);
        AllFeatures temp = (AllFeatures) JSONObject.toBean(af, AllFeatures.class);
//        test
//        System.out.println(temp.getNegative());
        return (AllFeatures) temp.clone();
    }

    /**
     * Parse all whose return type should be String.
     * @param s
     * @return
     */
    private String parseString(String s){
        return jsonObject.getString(s);
    }

    /**
     * Parse all whose return type should be double.
     * @param s
     * @return
     */
    private double parseDouble(String s){
//        System.out.println(jsonObject.getDouble("TradeoffTotal"));
        return jsonObject.getDouble(s);
    }

    /**
     * Parse all whose return type should be Indicative.
     * @param s
     * @return Clone of that object
     */
    private Indicative parseIndicative(String s){
        JSONObject ind = jsonObject.getJSONObject(s);
        Indicative temp = (Indicative) JSONObject.toBean(ind, Indicative.class);
//        System.out.println(temp.getCounterIndicative());
        return (Indicative) temp.clone();
    }

    /**
     * Parse all whose return type should be FeatureIndicative.
     * @param s
     * @return
     * @throws CloneNotSupportedException
     */
    private FeatureIndicative parseFeatureIndicative(String s) throws CloneNotSupportedException {
        JSONObject fi = jsonObject.getJSONObject(s);
        FeatureIndicative temp = (FeatureIndicative) JSONObject.toBean(fi, FeatureIndicative.class);
//        System.out.println(temp.getLost10().getIndicative());
        return (FeatureIndicative) temp.clone();
    }

    /**
     * Parse all whose return type should be Features.
     * @param s
     * @return
     * @throws CloneNotSupportedException
     */
    private Features parseFeatures(String s) throws CloneNotSupportedException{
        JSONObject fe = jsonObject.getJSONObject(s);
        Features temp = (Features) JSONObject.toBean(fe, Features.class);
//        System.out.println(temp.getLost10().getIndicative());
        return (Features) temp.clone();
    }
    /**
     * Parse FeatureSatisfaction and return the clone of the object,
     * which will be stored in the dimensionDetails.
     * Shallow clone can meet the requirements, given we wouldn't modify
     * the data yet.
     */

    private DimensionDetails getDimensionDetails(){
        return dimensionDetails;
    }

}

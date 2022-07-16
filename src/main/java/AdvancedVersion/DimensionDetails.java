package AdvancedVersion;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 10/7/2022
 * @Description: All the getters and setters are required.
 *
 * This class is used in GetJSON class, where a new DimensionDetails
 * is initialized as GetJSON class is initialized,
 * so that guys for NLP part can directly get parameters from
 *
 * Builder pattern is not used here. If considered better, it can be used
 * to replace setters.
 */
public class DimensionDetails {
    private AllActions featureSatisfaction;
    private String action;
    private Indicative relevanceTotal;
    private FeatureIndicative similarity;
    private Indicative similarityTotal;
    private FeatureIndicative useIntentions;
    private Indicative engagementTotal;
    private Features satisfaction;
    private double tradeoffTotal;
    private Indicative useIntentionsTotal;
    private FeatureIndicative relevance;
    private double satisfactionTotal;
    private FeatureIndicative valenceTotal;
    private AllFeatures actionTendencies;
    private FeatureIndicative engagement;
    private FeatureIndicative valence;
    private Features tradeoff;

    public DimensionDetails(){}
    public AllActions getFeatureSatisfaction() {
        return featureSatisfaction;
    }
//
    public double getTradeoffTotal() {
        return tradeoffTotal;
    }

    public AllFeatures getActionTendencies() {
        return actionTendencies;
    }

    public double getSatisfactionTotal() {
        return satisfactionTotal;
    }

    public Indicative getEngagementTotal() {
        return engagementTotal;
    }

    public Indicative getRelevanceTotal() {
        return relevanceTotal;
    }

    public Indicative getSimilarityTotal() {
        return similarityTotal;
    }

    public Indicative getUseIntentionsTotal() {
        return useIntentionsTotal;
    }

    public Features getSatisfaction() {
        return satisfaction;
    }

    public FeatureIndicative getEngagement() {
        return engagement;
    }

    public FeatureIndicative getRelevance() {
        return relevance;
    }

    public FeatureIndicative getSimilarity() {
        return similarity;
    }

    public FeatureIndicative getUseIntentions() {
        return useIntentions;
    }

    public FeatureIndicative getValenceTotal() {
        return valenceTotal;
    }

    public FeatureIndicative getValence() {
        return valence;
    }

    public void setFeatureSatisfaction(AllActions featureSatisfaction) {
        this.featureSatisfaction = featureSatisfaction;
    }

    public String getAction() {
        return action;
    }

    public Features getTradeoff() {
        return tradeoff;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setActionTendencies(AllFeatures actionTendencies) {
        this.actionTendencies = actionTendencies;
    }

    public void setEngagementTotal(Indicative engagementTotal) {
        this.engagementTotal = engagementTotal;
    }

    public void setEngagement(FeatureIndicative engagement) {
        this.engagement = engagement;
    }

    public void setRelevance(FeatureIndicative relevance) {
        this.relevance = relevance;
    }

    public void setRelevanceTotal(Indicative relevanceTotal) {
        this.relevanceTotal = relevanceTotal;
    }

    public void setSatisfaction(Features satisfaction) {
        this.satisfaction = satisfaction;
    }

    public void setSatisfactionTotal(double satisfactionTotal) {
        this.satisfactionTotal = satisfactionTotal;
    }

    public void setSimilarity(FeatureIndicative similarity) {
        this.similarity = similarity;
    }

    public void setSimilarityTotal(Indicative similarityTotal) {
        this.similarityTotal = similarityTotal;
    }

    public void setTradeoffTotal(double tradeoffTotal) {
        this.tradeoffTotal = tradeoffTotal;
    }

    public void setUseIntentions(FeatureIndicative useIntentions) {
        this.useIntentions = useIntentions;
    }

    public void setTradeoff(Features tradeoff) {
        this.tradeoff = tradeoff;
    }

    public void setUseIntentionsTotal(Indicative useIntentionsTotal) {
        this.useIntentionsTotal = useIntentionsTotal;
    }

    public void setValence(FeatureIndicative valence) {
        this.valence = valence;
    }

    public void setValenceTotal(FeatureIndicative valenceTotal) {
        this.valenceTotal = valenceTotal;
    }

}

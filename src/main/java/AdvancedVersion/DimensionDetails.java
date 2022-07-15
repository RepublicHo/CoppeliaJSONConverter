package AdvancedVersion;
import java.util.List;

/**
 * @Author Anthony Z.
 * @Date 10/7/2022
 * @Description:
 */
public class DimensionDetails {
    private AllActions featureSatisfaction;
    private String action;
    private Indicative relevanceTotal;
    private List<Indicative> similarity;
    private Indicative similarityTotal;
    private List<Indicative> useIntentions;
    private Indicative engagementTotal;
    private List<Feature> satisfaction;
    private double tradeoffTotal;
    private Indicative useIntentionsTotal;
    private List<Indicative> relevance;
    private double satisfactionTotal;
    private List<Indicative> valenceTotal;
    private AllFeatures actionTendencies;
    private List<Indicative> engagement;
    private List<Indicative> valence;
    private List<Feature> tradeoff;

    public AllActions getAllActions() {
        return featureSatisfaction;
    }

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

    public List<Feature> getSatisfaction() {
        return satisfaction;
    }

    public List<Indicative> getEngagement() {
        return engagement;
    }

    public List<Indicative> getRelevance() {
        return relevance;
    }

    public List<Indicative> getSimilarity() {
        return similarity;
    }

    public List<Indicative> getUseIntentions() {
        return useIntentions;
    }

    public List<Indicative> getValenceTotal() {
        return valenceTotal;
    }

    public List<Indicative> getValence() {
        return valence;
    }

    public void setAllActions(AllActions allActions) {
        this.featureSatisfaction = allActions;
    }

    public String getAction() {
        return action;
    }

    public List<Feature> getTradeoff() {
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

    public void setEngagement(List<Indicative> engagement) {
        this.engagement = engagement;
    }

    public void setRelevance(List<Indicative> relevance) {
        this.relevance = relevance;
    }

    public void setRelevanceTotal(Indicative relevanceTotal) {
        this.relevanceTotal = relevanceTotal;
    }

    public void setSatisfaction(List<Feature> satisfaction) {
        this.satisfaction = satisfaction;
    }

    public void setSatisfactionTotal(double satisfactionTotal) {
        this.satisfactionTotal = satisfactionTotal;
    }

    public void setSimilarity(List<Indicative> similarity) {
        this.similarity = similarity;
    }

    public void setSimilarityTotal(Indicative similarityTotal) {
        this.similarityTotal = similarityTotal;
    }

    public void setTradeoffTotal(double tradeoffTotal) {
        this.tradeoffTotal = tradeoffTotal;
    }

    public void setUseIntentions(List<Indicative> useIntentions) {
        this.useIntentions = useIntentions;
    }

    public void setTradeoff(List<Feature> tradeoff) {
        this.tradeoff = tradeoff;
    }

    public void setUseIntentionsTotal(Indicative useIntentionsTotal) {
        this.useIntentionsTotal = useIntentionsTotal;
    }

    public void setValence(List<Indicative> valence) {
        this.valence = valence;
    }

    public void setValenceTotal(List<Indicative> valenceTotal) {
        this.valenceTotal = valenceTotal;
    }

    // Builder Pattern
    //    public static class Builder{
//        private AllActions allActions;
//        private String action;
//        private Indicative relevanceTotal;
//        private List<Indicative> similarity;
//        private Indicative similarityTotal;
//        private List<Indicative> useIntentions;
//        private Indicative engagementTotal;
//        private List<Feature> satisfaction;
//        private double tradeoffTotal;
//        private Indicative useIntentionsTotal;
//        private List<Indicative> relevance;
//        private double satisfactionTotal;
//        private List<Indicative> valenceTotal;
//        private AllFeatures actionTendencies;
//        private List<Indicative> engagement;
//        private List<Indicative> valence;
//        private List<Feature> tradeoff;
//
//
//    }



}

package AdvancedVersion;
/**
 * @Author Anthony Z.
 * @Date 10/7/2022
 * @Description: All actions towards all features.\
 * Example:
"FeatureSatisfaction": {
    "nil": 0.198,
    "negative": 0.23925,
    "change": 0,
    "avoid": 0,
    "positive": 0.462
}
 * In practice, we will be dealing with some specific problem and
 * the corresponding features, actions, and goals.
 *
 * In the example json file provided by Baier Thomas,
 * the tokens {"blond hair", "lost 10$"} correspond to
 * the set of observed features, and {"avoid", "approach"} is
 * the set of actions related to the feature "blond hair",
 * {"keep", "ignore", "return"} is the set of actions
 * related to feature "lost 10$".
 *
 * All, like "blond hair' -> "avoid", "approach" setup
 * are just examples. When dealing with more complex
 * world affective model, the fields should be modified.
 */
public class AllActions implements Cloneable{
    private double nil;
    private double negative;
    private double change;
    private double avoid;
    private double positive;

    public double getNil() {
        return nil;
    }

    public void setNil(double nil) {
        this.nil = nil;
    }

    public double getAvoid() {
        return avoid;
    }

    public void setAvoid(double avoid) {
        this.avoid = avoid;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getNegative() {
        return negative;
    }

    public void setNegative(double negative) {
        this.negative = negative;
    }

    public double getPositive() {
        return positive;
    }

    public void setPositive(double positive) {
        this.positive = positive;
    }


    @Override
    protected Object clone() {
        AllActions allActions = null;
        try{
            allActions = (AllActions) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return allActions;
    }
}
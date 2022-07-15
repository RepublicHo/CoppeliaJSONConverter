package AdvancedVersion;
/**
 * @Author Anthony Z.
 * @Date 10/7/2022
 * @Description:
 *
 * In the example json file provided by Baier Thomas,
 * the tokens {"blond hair", "lost 10$"} correspond to
 * the set of observed features, and {"avoid", "approach"} is
 * the set of actions related to the feature "blond hair",
 * {"keep", "ignore", "return"} is the set of actions
 * related to feature "lost 10$".
 *
 * The "blond hair' -> "avoid", "approach" setup is just an example.
 */
public class AllActions {
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
}
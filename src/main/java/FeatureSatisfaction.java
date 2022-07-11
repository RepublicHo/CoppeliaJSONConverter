/**
 * @Author Anthony Z.
 * @Date 10/7/2022
 * @Description:
 * "FeatureSatisfaction": {
 *     "nil": 0.198,
 *     "negative": 0.23925000000000002,
 *     "change": 0,
 *     "avoid": 0,
 *     "positive": 0.462
 *   }
 */
public class FeatureSatisfaction {
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

package AdvancedVersion;
/**
 * @Author Anthony Z.
 * @Date 15/7/2022
 * @Description: Lost 10 dollar is one of the features observed in the
 * CV system, as an example provided by Thomas.
 *
 * In practice, we will be dealing with some specific problem and
 * the corresponding features, actions, and goals.
 * In that case, this class is to be modified.
 */
public class LostMoneyFeature {
    double keep;
    double ignore;
    double Return;

    public double getIgnore() {
        return ignore;
    }

    public double getKeep() {
        return keep;
    }

    public double getReturn() {
        return Return;
    }

    public void setIgnore(double ignore) {
        this.ignore = ignore;
    }

    public void setKeep(double keep) {
        this.keep = keep;
    }

    public void setReturn(double aReturn) {
        Return = aReturn;
    }
}


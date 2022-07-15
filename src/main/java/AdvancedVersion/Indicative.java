package AdvancedVersion;
/**
 * @Author Anthony Z.
 * @Date 10/7/2022
 * @Description:
 * An example:
 *
 * "RelevanceTotal": {
 *     "counterIndicative": 0.75,
 *     "indicative": 0.75
 *  }
 */
public class Indicative {
    private double counterIndicative;
    private double indicative;

    public Indicative(double counterIndicative, double indicative){
        this.counterIndicative = counterIndicative;
        this.indicative = indicative;
    }


    public double getCounterIndicative() {
        return counterIndicative;
    }

    public void setCounterIndicative(double counterIndicative) {
        this.counterIndicative = counterIndicative;
    }

    public double getIndicative() {
        return indicative;
    }

    public void setIndicative(double indicative) {
        this.indicative = indicative;
    }
}

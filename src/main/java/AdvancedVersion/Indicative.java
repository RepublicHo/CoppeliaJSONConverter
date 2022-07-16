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
public class Indicative implements Cloneable{
    private double counterIndicative;
    private double indicative;

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

    @Override
    protected Object clone() {
        Indicative indicative1 = null;

        try{
            indicative1 = (Indicative) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return indicative1;
    }
}

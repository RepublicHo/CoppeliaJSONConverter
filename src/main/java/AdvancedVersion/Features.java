package AdvancedVersion;
/**
 * @Author Anthony Z.
 * @Date 10/7/2022
 * @Description:
 * An example:
 *
 */
public class Features implements Cloneable{
    private double blondHair;
    private double lost10;

    public void setBlondHair(double blondHair) {
        this.blondHair = blondHair;
    }

    public void setLost10(double lost10) {
        this.lost10 = lost10;
    }

    public double getBlondHair() {
        return blondHair;
    }

    public double getLost10() {
        return lost10;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Features features = null;
        try{
            features = (Features) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return features;
    }
}


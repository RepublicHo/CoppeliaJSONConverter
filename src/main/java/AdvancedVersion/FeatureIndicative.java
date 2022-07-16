package AdvancedVersion;

/**
 * @Author Anthony Z.
 * @Date 16/7/2022
 * @Description:
 */
public class FeatureIndicative implements Cloneable {
    private Indicative blondHair;
    private Indicative lost10;

    public void setBlondHair(Indicative blondHair) {
        this.blondHair = blondHair;
    }

    public Indicative getBlondHair() {
        return blondHair;
    }

    public Indicative getLost10() {
        return lost10;
    }

    public void setLost10(Indicative lost10) {
        this.lost10 = lost10;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FeatureIndicative featureIndicative = null;
        try{
            featureIndicative = (FeatureIndicative) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  featureIndicative;
    }
}

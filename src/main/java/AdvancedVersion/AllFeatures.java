package AdvancedVersion;
/**
 * @Author Anthony Z.
 * @Date 15/7/2022
 * @Description: All features observed.
 *
 * In practice, we will be dealing with some specific problem and
 * the corresponding features, actions, and goals.
 *
 * An example:
"ActionTendencies": {
    "blondHair": {
        "avoid": 0,
        "approach": 0.03125
    },
    "lost10": {
        "keep": 0.125,
        "ignore": 0,
        "return": 0
}
 */
public class AllFeatures implements Cloneable{
    private BlondHairFeature blondHair;
    private LostMoneyFeature lost10;

    public BlondHairFeature getBlondHair() {
        return blondHair;
    }

    public LostMoneyFeature getLost10() {
        return lost10;
    }

    public void setBlondHair(BlondHairFeature blondHair) {
        this.blondHair = blondHair;
    }

    public void setLost10(LostMoneyFeature lost10) {
        this.lost10 = lost10;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        AllFeatures allFeatures1 = null;
        try{
            allFeatures1 = (AllFeatures) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return allFeatures1;
    }
}

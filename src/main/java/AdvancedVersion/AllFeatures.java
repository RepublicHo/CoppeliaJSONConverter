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
 *
 */
public class AllFeatures {
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
}

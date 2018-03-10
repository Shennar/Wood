package JavaGuruHomeWorks;

public class LightBulb {
    private int switchesRemains=5;
    private boolean onOff = false;
    private String firmName;
    public LightBulb(int maxSwitches){
        switchesRemains = maxSwitches;
    }
    public int getSwitchesRemains() {
        return switchesRemains;
    }
    public LightBulb(){

    }

    public void setSwitchesRemains(int switchesRemains) {
        this.switchesRemains = switchesRemains;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }
}

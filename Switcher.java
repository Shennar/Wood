package JavaGuruHomeWorks;

public class Switcher {
    private boolean isOn=false;
    public void pushSwitcher(LightBulb bulb){
        if (this.isOn()) {
            this.setOn(false);
            bulb.setOnOff(false);
        } else {
            if (bulb.getSwitchesRemains()>0){
                bulb.setOnOff(true);
                bulb.setSwitchesRemains(bulb.getSwitchesRemains()-1);
            } else {
                System.out.println("Lightbulb is dead...");;}
        }
    }
    public boolean isOn() {
        return isOn;
    }

    private void setOn(boolean on) {
        isOn = on;
    }
}

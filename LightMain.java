package JavaGuruHomeWorks;

public class LightMain {
    public static void main(String[] args) {
        LightBulb myBulb = new LightBulb(7);
        Switcher mySwitcher = new Switcher();
        myBulb.setFirmName("Philips");
        mySwitcher.pushSwitcher(myBulb);
        System.out.println("Is on? "+myBulb.isOnOff());
        System.out.println("Firm is: "+myBulb.getFirmName());
        System.out.println("Is good? "+(myBulb.getSwitchesRemains()>0));
        System.out.println("Switches remain: "+myBulb.getSwitchesRemains());

        while (myBulb.getSwitchesRemains() > 0) {
            mySwitcher.pushSwitcher(myBulb);
            System.out.println("Switcher's state is: " + mySwitcher.isOn());
            System.out.println("Is on? " + myBulb.isOnOff());
            System.out.println("Is good? " + (myBulb.getSwitchesRemains()>0));
            System.out.println("Switches remain: "+myBulb.getSwitchesRemains());
        }
        }
    }

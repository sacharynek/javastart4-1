public class Televisor {

    private boolean isOn = false;

    public Televisor() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }


    public void showStatus() {
        if (this.isOn) {
            System.out.println("TV is on");
        } else {
            System.out.println("TV is off");
        }
    }
}

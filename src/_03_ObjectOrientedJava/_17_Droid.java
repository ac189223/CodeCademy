package _03_ObjectOrientedJava;

public class _17_Droid {
    int batteryLevel;
    String name;

    public _17_Droid(String droidName) {
        this.batteryLevel = 100;
        this.name = droidName;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println("Battery level: " + batteryLevel);
    }

    public void energyTransfer() {
        System.out.println("Battery loaded");
        batteryLevel = 100;
    }

    public static void main(String[] args) {
        _17_Droid droid01 = new _17_Droid("Codey");
        System.out.println(droid01);
        droid01.performTask("gardening");
        droid01.performTask("biking");
        droid01.performTask("charging");
        droid01.energyTransfer();
        droid01.performTask("talking a lot");
        droid01.energyReport();
    }
}

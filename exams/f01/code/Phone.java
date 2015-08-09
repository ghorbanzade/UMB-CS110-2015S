public abstract class Phone {
    private int battery;
    private int maxBattery;
    public Phone(int maxBattery) {
        this.maxBattery = maxBattery;
	this.battery = maxBattery;
    }
    public abstract void call(int minutes);
    public void charge() {
        battery = maxBattery;
    }
    public int getBattery() {
        return battery;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }
}

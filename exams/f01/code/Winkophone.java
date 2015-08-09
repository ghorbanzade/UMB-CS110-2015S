public class Winkophone extends Phone {
    public Winkophone() {
	super(1000);
    }
    @Override
    public void call(int minutes) {
        int max = Math.max(this.getBattery()-minutes, 0);
	this.setBattery(max);
    }
}

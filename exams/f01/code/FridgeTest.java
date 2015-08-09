public class FridgeTest {
    public static void main(String[] args) {
        Fridge myFridge = new Fridge(15);
        myFridge.plug();
        myFridge.setTemperature(50);
        myFridge.refrigerate(5);
    }
}

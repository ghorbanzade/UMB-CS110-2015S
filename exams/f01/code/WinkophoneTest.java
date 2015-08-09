public class WinkophoneTest {
    public static void main(String[] args) {
        Winkophone myPhone = new Winkophone();
        System.out.println(myPhone.getBattery());
        myPhone.call(100);
        System.out.println(myPhone.getBattery());
    }
}

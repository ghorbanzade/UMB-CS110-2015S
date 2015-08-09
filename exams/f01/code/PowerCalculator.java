public class PowerCalculator {
    public static void main(String[] args) {
        System.out.println(findPow(2,8));
    }
    public static long findPow(int num, int pow) {
        if (pow == 0)
            return 1;
        return num*findPow(num, pow-1);
    }
}

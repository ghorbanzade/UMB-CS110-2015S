import java.util.Scanner;
public class Patch {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        scnr.close();
        int[] matrix = new int[num];
        for (int i = 0; i <= num; i++)
            matrix[i] = i;
        System.out.println(Math.sqrt(matrix[num/2]));
    }
}

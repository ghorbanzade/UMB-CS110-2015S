import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NegativeArraySizeException;
public class PatchRevised {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a number: ");
                int num = scnr.nextInt();
                int[] matrix = new int[num];
                for (int i = 0; i < num; i++)
                    matrix[i] = i;
                System.out.println(Math.sqrt(matrix[num/2]));
                break;
            }
            catch (InputMismatchException e) {
                scnr.next();
                System.out.println("Enter an Integer Number.");
            }
            catch (NegativeArraySizeException e) {
                System.out.println("Enter a Positive Integer.");
            }
        }
        scnr.close();
    }
}

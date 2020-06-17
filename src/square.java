import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner square= new Scanner (System.in);
        System.out.println("Enter the number");
        int userAnswer = square.nextInt();
        System.out.println("number\t square: ");
        for (int i = 1; i <= userAnswer; i++) {
        System.out.print(i);
        System.out.println("\t\t"+i*i);
        }
    }
}

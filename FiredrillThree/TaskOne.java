import java.util.Scanner;
import java.util.Arrays;
public class TaskOne {
    public static void main(String[] args) {
        int[] scores = Scores(); 

    }

    public static int[] Scores() {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];

        for (int count = 0; count < 10; count++) {
            System.out.print("Enter score " + (count + 1) + ": ");
            scores[count] = input.nextInt();
        }

        return scores;
    }
}

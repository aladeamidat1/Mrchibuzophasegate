import java.util.Scanner;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int[] scores = Scores(); 

        for (int score : scores) {
            System.out.println(score);
        }
    }




    public static int[] Scores() {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];

        for (int count = 0; count < 10; count++) {
            System.out.print("Enter scores " + (count + 1) + ": ");
            scores[count] = input.nextInt();
        }

        return scores;
    }
}

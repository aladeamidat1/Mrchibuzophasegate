import java.util.Scanner;
public class TaskThree{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		int sum = 0;
		for(int count =1; count <= 10; count++){
			System.out.print("score" + count + " ");
			int score = input.nextInt();
			sum += score;
		}	
		int average = sum / 10;
		System.out.println(sum);
		System.out.print(average);
		
	}

}
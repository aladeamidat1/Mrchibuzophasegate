import java.util.Scanner;
public class TaskFour{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		int sum = 0;
		for(int count =1; count <= 10; count++){
			System.out.print("scores" + count + " ");
			int scores = input.nextInt();
			if(count % 2 == 0){
				sum += scores;
			}
		}	
		System.out.print(sum);
	}

}
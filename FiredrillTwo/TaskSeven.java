import java.util.Scanner;
public class TaskSeven{
	
public static void main(String[] args){
Scanner input = new Scanner(System.in);
	
int sum = 0;
for(int count =1; count <= 10; count++){
System.out.print("score" + count + " ");
int score = input.nextInt();
if(score % 2 == 0){
sum += score;
}
}
System.out.println(sum);	
System.out.print(sum / 10);
}

}
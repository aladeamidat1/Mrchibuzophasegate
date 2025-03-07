import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){
Scanner number = new Scanner(System.in);
	
int sum = 0;
for(int count = 1; count <= 10; count++){
System.out.print("score" + count + " ");
int score = number.nextInt();

while(score < 0 || score > 100){

System.out.println("invalid number must be 0 - 100: ");
System.out.print("score" + count + " ");
score = number.nextInt();
}
sum += score;
		
}	
		
System.out.print(sum);
		
	
}


}
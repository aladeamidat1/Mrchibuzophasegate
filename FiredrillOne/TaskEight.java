public class TaskEight{
	public static void main(String... args){
	
		int sumOfFour = 0;
		int multiples = 4;
		for(int number = 0; number < 5; number++){
			sumOfFour += multiples;
			multiples *= 4;
		}

		int sumOfEight = 0;
		int multiples2 = 8;
		for(int number = 0; number < 5; number++){
			sumOfEight += multiples2;
			multiples2 *= 8;
		}
		System.out.print(sumOfFour + sumOfEight);
		
	}


}


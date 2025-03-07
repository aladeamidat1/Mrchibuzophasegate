public class TaskNine{
	public static void main(String... args){
	
		int sumOfFour = 0;
		int multiplesOfFour = 4;
		for(int number = 0; number < 5; number++){
			sumOfFour += multiplesOfFour;
			multiplesOfFour *= 4;
		}

		int sumOfEight = 0;
		int multiplesOfEight = 8;
		for(int number = 0; number < 5; number++){
			sumOfEight += multiplesOfEight;
			multiplesOfEight *= 8;
		}
		int total = sumOfFour + sumOfEight;
		System.out.print(total * total);
	}


}


package pe006_sum_square_difference;

public class SumSquareDifference {

	public static void main(String[] args) {
		int sumSquares = 0, squaresSum = 0, dif = 0;
		for(int i = 1; i <= 100; i++){
			squaresSum += i*i;
		}
		for(int i = 1; i <= 100; i++){
			sumSquares += i;
		}
		sumSquares *= sumSquares;
		dif = sumSquares - squaresSum;
		System.out.println(dif);
	}

}

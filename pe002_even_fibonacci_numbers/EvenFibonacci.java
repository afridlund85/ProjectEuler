package pe002_even_fibonacci_numbers;

public class EvenFibonacci {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		int sum = 0;
		while(n1 < 4000000){
			n2 = n1 + n2;
			n1 = n2 - n1;
			if(n1 % 2 == 0)
				sum += n1;
		}
		System.out.println(sum);
	}

}

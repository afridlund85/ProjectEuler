package pe007_10001st_prime;

import java.util.ArrayList;

public class NthPrime {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int n = 2;
		primes.add(n);
		while(primes.size() <= 10000){
			n++;
			if(isPrime(n)){
				primes.add(n);
			}
		}
		System.out.println(primes.get(10000));
	}
	
	public static boolean isPrime(int n){
		boolean isPrime = true;
		for(int p: primes){
			if(n % p == 0)
				isPrime = false;
		}
		return isPrime;
	}

}

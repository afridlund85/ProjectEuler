package pe003_largest_prime_factor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		BigInteger n = new BigInteger("600851475143");
		ArrayList<Integer> factors = new ArrayList<Integer>();
		BigInteger i = new BigInteger("2");
		BigInteger inc = new BigInteger("1");
		while(n.compareTo(i) == 1){
			 if(n.mod(i).equals(new BigInteger("0"))){
				 factors.add(i.intValue());
				 n = n.divide(i);
			 }
			 i = i.add(inc);
		}
		factors.add(n.intValue());
		Collections.sort(factors);
		System.out.println(factors.get(factors.size()-1));
		for(Integer j: factors)
			System.out.println(j.intValue());

	}

}

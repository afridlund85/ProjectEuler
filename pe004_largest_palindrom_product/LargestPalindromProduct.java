package pe004_largest_palindrom_product;

public class LargestPalindromProduct {

	public static void main(String[] args) {
		String prod, rev;
		int product, largest = 0;
		for(int i = 1; i < 1000; i++){
			for(int j = 1; j < 1000; j++){
				product = i * j;
				prod = Integer.toString(product);
				rev = new StringBuilder(prod).reverse().toString();
				if(prod.equals(rev) && product > largest)
					largest = product;
			}
		}
		System.out.println(largest);
	}
	
}

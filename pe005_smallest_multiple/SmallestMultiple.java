package pe005_smallest_multiple;

public class SmallestMultiple {

	public static void main(String[] args) {
		boolean b = false;
		int n = 20;
		while(b == false){
			b = true;
			for(int i = 1; i <= 20; i++){
				if(n % i != 0){
					b = false;
					break;
				}
			}
			if(!b)
				n++;
		}
		System.out.println(n);
	}

}

public class Main {
	public static void main(String[] args) {
		int x = 6;
		SumOfNNatural(x);
		
		int y = 12;
		PrimeFactorial(y);
	}
	
	public static void SumOfNNatural(int x){
		System.out.println((x*(x+1))/2);
	}
	
	public static void PrimeFactorial(int y){
		for(int i=1; i<=y; i++) {
			if(y%i==0) {
				System.out.println(i);
			}
		}
	}
}
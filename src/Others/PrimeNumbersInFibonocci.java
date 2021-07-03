package Others;

//Fibonocci numbers which are prime

public class PrimeNumbersInFibonocci {
	public static void main(String[] args) {
		fibonocciWithPrimes(100);
		
	}
	
	private static void fibonocciWithPrimes(int num) {

		int a =0;
		int b=1;
		int c =0;
		while((c=a+b)<num) {
			if(isPrime(c)) {
				System.out.println(c);
			}
			a=b;
			b=c;
		}
	}

	private static boolean isPrime(int c) {
		if(c==1) {
			return false;
		}
		boolean isPrime = true;
			for(int i=2;i<c;i++) {
				if(c%i==0) {
					isPrime=false;
				}
			}
		return isPrime;
		
	}
	
}

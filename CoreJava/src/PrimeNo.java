import java.math.BigInteger;

public class PrimeNo {

	public static void main(String[] args) {
		int a=3;
		findPrime(a);
	}
	public static void findPrime(int a) {
		boolean b=BigInteger.valueOf(a).isProbablePrime(0); //class BigInteger  
		System.out.println(b);
	}
}

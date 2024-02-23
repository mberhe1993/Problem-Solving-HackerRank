//Java program for checking a number is prime and the followed by N count  composite numbers.
public class NFollowingComposits {

	public static void main(String[] args) {
		System.out.println(isHasNFollowingComposits(89,6));

	}
	public static int isHasNFollowingComposits(int n,int count)
	{
		if((isPrime(n)==false)||(n==0))
			return 0;
		else
			for(int i=n+1;i<=n+count;i++) {
				if(isCompsit(i)==false)
					return 0;
			}
			return 1;	
	}
	//check the number is prime or not
public static boolean isPrime(int n) {
	for(int i=2;i<n;i++) {
		if(n%i==0)
			return false;
	}
	return true;
}
//check the number is composite or not
public static boolean isCompsit(int n) {
	for(int j=2;j<n;j++) {
		if(n%j==0)
			return true;
	}
	return false;
}
}

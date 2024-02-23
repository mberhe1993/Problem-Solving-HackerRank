
public class LargestPrimeFactor {

	public static void main(String[] args) {
	System.out.println(largestPrimeFactor(23));

	}
public static int largestPrimeFactor(int n) {
	int largestPrime=0;
	if(n<2)
		return 0;
	for(int i=2;i<=n;i++) {
		if(n%i==0) {
			n=n/i;
			if(i%2!=0)
				largestPrime=i;
			i=2;
		}
	}
	return largestPrime;
}
}

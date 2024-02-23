
public class FibonacciSeries {

	public static void main(String[] args) {
	
		System.out.println(isfibonacciNumber(21));

	}
public static int isfibonacciNumber(int n) {
	int n1=0,n2=1,temp;
	while(n2<=n) {
		if(n2==n)
			return 1;
		temp=n2;
		n2=n1+n2;
		n1=temp;
	}
	return 0;
}
}

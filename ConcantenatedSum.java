
public class ConcantenatedSum {

	public static void main(String[] args) {
	System.out.println(checkSum(198,2));

	}
public static int checkSum(int n, int catlen) {
	int sum=0, val=0, rem=0, init=n;
	while(n>0) {
		rem=n%10;
		val=rem;
		for(int i=0;i<catlen-1;i++)
			val=val*10+rem;
		sum+=val;
		n=n/10;
	}
	if(init==sum)
		return 1;
	else
		return 0;
}
}

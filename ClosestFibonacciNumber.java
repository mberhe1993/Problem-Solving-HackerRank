

public class ClosestFibonacciNumber {

	public static void main(String[] args) {
System.out.println(closestFibonacci(13));
	}
public static int closestFibonacci(int n) 
{
	int n1=0,n2=1,temp;
while(n2<=n)	
{
	temp=n2;
	n2=n2+n1;

	n1=temp;
	
}
if(n==n2)
	return n2;
else
	return n1;
}
}

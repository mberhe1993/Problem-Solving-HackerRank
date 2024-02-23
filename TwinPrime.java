public class TwinPrime {

	public static void main(String[] args) {
System.out.println(isTwinPrime(15));
	}
public static int isTwinPrime(int n) 
{
	if((isPrime(n)==true &&isPrime(n+2)==true) ||(isPrime(n)==true && isPrime(n-2)==true))
		return 1;
	else
		return 0;
}
public static boolean isPrime(int n)
{
for(int i=2;i<n;i++)
	if(n%i==0)
		return false;
return true;
}
}

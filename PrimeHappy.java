

public class PrimeHappy {

	public static void main(String[] args) {
System.out.println(isPrimeHappy(20));
	}
public static int isPrimeHappy(int n)
{
	int sum=0;
for(int i=2;i<n;i++)
		if(isPrime(i)==true)
			sum+=i;


if(sum%n==0)
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

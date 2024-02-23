
public class Abernathy {

	public static void main(String[] args) {
	
System.out.println(countPairOfPrimes(14));
	}
public static int countPairOfPrimes(int n) {
int count=0;
for(int i=2;i<n/2-1;i++) {
if(isPrime(i)==1 && isPrime(n-i)==1)
	count++;
}
if(count>1)
	return 1;
else {
return 0;
}
}
public static int isPrime(int n) {
	for(int i=2;i<n;i++) {
		if(n%i==0)
			return 0;
	}
	return 1;
}
}
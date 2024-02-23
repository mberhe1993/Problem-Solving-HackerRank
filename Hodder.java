
public class Hodder {
public static void main(String []args) {
	System.out.println(isHodder(127));
}
public static int isHodder(int n) {
	
		if(isPrime(n)==false)
			return 0;
		else {	
			for(int j=2;j<n;j++) {
	if(n==Math.pow(2,j)-1)
		return 1;
		}
	}
	return 0;
	
}
public static boolean isPrime(int n) {
	for(int i=2;i<n;i++)
		if(n%i==0)
			return false;
	return true;
}
}

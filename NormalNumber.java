//A normal number is defined to be one that has no odd factors, except for 1 and possibly itself
public class NormalNumber {

	public static void main(String[] args) {
		System.out.println(isNormal(29));
	}
public static int isNormal(int n) {
	for(int i=2;i<n;i++)
		if((n%i==0)&&(i%2!=0))
			return 0;
	return 1;
}
}

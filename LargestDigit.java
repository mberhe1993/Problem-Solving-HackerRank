
public class LargestDigit {

	public static void main(String[] args) {
		
System.out.println(isLargest(1238348));
	}
public static int isLargest(int n) {
	int remainder;
	int largestDigit=0;
	n=Math.abs(n);
	while(n>0) {
		remainder=n%10;
		if(remainder>largestDigit) {
			largestDigit=remainder;
		}
		n=n/10;
	}
	return largestDigit;
}
}

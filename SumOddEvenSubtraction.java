
public class SumOddEvenSubtraction {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(sumOfOddEvenSub(a));

	}
public static int sumOfOddEvenSub(int a[]) {
	int sumEven=0;
	int sumOdd=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0)
			sumEven+=a[i];
		else
			sumOdd+=a[i];
	}
	return sumOdd-sumEven;
}
}

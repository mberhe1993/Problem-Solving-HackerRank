
public class LargestAdjacentSum {

	public static void main(String[] args) {
		int a[]= {2,3,5,6,9};
		System.out.println(largestAdjacentSum(a));

	}
	public static int largestAdjacentSum(int a[]) {
		if(a.length>1) {
			int sum=0;
		for(int i=0;i<a.length-1;i++)
			if(sum < a[i]+a[i+1])
				sum=a[i]+a[i+1];
		return sum;
	}return 0;
	}
}

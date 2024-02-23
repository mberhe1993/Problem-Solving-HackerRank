
public class AdjacentLargestSum {

	public static void main(String[] args) {
		
		int a[]= {1,5,8,9,23,45,6};
		System.out.println(adjacentLargestSum(a));
	}
public static int adjacentLargestSum(int a[]) {
	if(a.length>1) {
		int sum=0;
	for(int i=0;i<a.length-1;i++)
		if(sum < a[i]+a[i+1])
			sum=a[i]+a[i+1];
	return sum;
}
	return 0;
}
}

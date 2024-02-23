
public class BiggestDifference {

	public static void main(String[] args) {
	int a[]= {15,5,3};
	System.out.println(biggestDifference(a));

	}
public static int biggestDifference(int a[]) {
	int max_diff=0;
	if(a.length<=1 || a==null)
		return -1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
				if(a[j]-a[i]>max_diff)
					max_diff=a[j]-a[i];
		}
	return max_diff;
}
}

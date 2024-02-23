
public class LoopSum {

	public static void main(String[] args) {
		System.out.println(isLoopSum(new int[] {1,2,3,4,5,6},8));
	}
public static int isLoopSum(int a[],int n) {
	int sum=0;
	if(a.length>=n) {
		for(int i=0;i<n;i++)
			sum+=a[i];
		
	}
	else {
		int times=n/a.length;
		int remainder=n%a.length;
		for(int y=0;y<a.length;y++)
			sum+=a[y];
		sum*=times;
		for(int z=0;z<remainder;z++)
			sum+=a[z];
		
	}
	return sum;
}
}

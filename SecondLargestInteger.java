
public class SecondLargestInteger {

	public static void main(String[] args) {
		int a[]= {1,1,2,3};
		System.out.println(secondLargestInt(a));

	}
public static int secondLargestInt(int a[]) {
	int max1=0;
	int max2=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max1) {
			max2=max1;
			max1=a[i];
		}
		else if(a[i]!=max1 && a[i]>max2)
			max2=a[i];
	}
if(max2==0)
	return -1;
return  max2;
}
}
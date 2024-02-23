public class LargestDifferenceOfEvens {

	public static void main(String[] args) {
 System.out.println(largestEvendif(new int [] {1,3,5,8}));
	}
public static int largestEvendif(int a[])
{
	int count=0,min=0,max=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			min=a[i];
		    max=a[i];}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
			{
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
			count++;
			}
	}
	if(count<2)
		return -1;
	return max-min;
}
}

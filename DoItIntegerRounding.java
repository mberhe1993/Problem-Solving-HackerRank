
public class DoItIntegerRounding {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int result[]=doItIntegerRounding(a,4);
		for(int i=0;i<result.length;i++)
		System.out.println(result[i]);
	}
public static int[] doItIntegerRounding(int[] a,int n) {
	int result[]=new int[a.length];
	for(int i=0;i<a.length-1;i++) {
	if(n<=0)
		result[i]=a[i];
	else {
			if(a[i]<=0)
				result[i]=a[i];
			else  {
				int  nearest=((n/a[i])*a[i]);
				if(n>a[i])
			result[i]=nearest;
				else
					result[i]=a[i];
			}
			
		}
	}
	return result;
	
}
}

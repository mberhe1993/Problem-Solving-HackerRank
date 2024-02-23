//Dual Array is even no of elements and each pair consecutive  even and odd elements sum to z same value
public class Dual {

	public static void main(String[] args) {
		int a[]= {1,2,2,1,3,2};
	System.out.println(isDual(a));

	}
public static int isDual(int a[]) {
	int value=0;
	if(a.length%2!=0)
		return 0;
	if(a.length>0)
		value=a[0]+a[1];
	for(int i=0;i<a.length;i=+2) {
		if(a[i]%2==0) {
			if(a[i+1]%2==0)
			return 0;
		}
		if(a[i]%2!=0) {
			if( a[i+1]!=0)
			return 1;
		}
		if(value!=a[i]+a[i+1])
			return 0;
	}
	return 1;	
}
}

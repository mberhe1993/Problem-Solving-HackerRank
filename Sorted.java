
public class Sorted {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println(isSorted(a));
	}
public static int isSorted(int a[]) {
	if(a.length==0 || a.length==1)
		return 0;
	for(int i=1;i<a.length-2;i++) {
		if(a[i]<a[i+1]&& a[i+1]>a[i+2])
			return 0;
		else {
			if(a[i]>a[i+1]&& a[i+1]<a[i+2])
				return 0;
		}
	}
	return 1;
}
}

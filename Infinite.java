
public class Infinite {

	public static void main(String[] args) {
	int a[]= {1,3,2,4,5,-1};
System.out.println(isInfinite(a));
	}
public static int isInfinite(int a[]) {
	for(int i=0;i<a.length;i++) {
		if(a[i]>a.length || a[i]<-1)
			return 1;
		if(a[i]==-1)
			return -1;
		
	}
	return 0;
}
}

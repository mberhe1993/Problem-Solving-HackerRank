
public class Finite {

	public static void main(String[] args) {
	int a[]= {1,2,3,2};
System.out.println(isFinite(a));
	}
public static int isFinite(int a[]) {
	for(int i=0;i<a.length;i++) {
		if(a[i]>=a.length || a[i]<-1)
			return 1;
		else if(a[i]==-1)
			return -1;
	}
	return 0;
}
}

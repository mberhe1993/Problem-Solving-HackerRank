
public class SequencedArray {
public static void main(String[] args) {
		int n=6, m=1;
		int a[]= {1,2,3,4,5,6};
		System.out.println(isSequenced(a,m,n));
	}
public static int isSequenced(int a[],int m, int n) {
	for(int i=0;i<a.length-1;i++) {
		int max=a[a.length-1];
		int min=a[0];
		if(a[i]<m ||a[i]>n)
			return 0;
			if(n!=max ||m!=min)
			return 0;
		if(a[i]>a[i+1])
			return 0;
		if(a[i]!=a[i+1] && a[i]!=a[i+1]-1)
		return 0;
	}
	return 1;
}
}

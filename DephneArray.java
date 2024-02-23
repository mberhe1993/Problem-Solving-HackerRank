/*it is an dephne  array that iterates alternatively either positive or nagative*/
public class DephneArray {

	public static void main(String[] args) {
		int a[]= {1,-2,3,-8};
System.out.println(isDephneArray(a));
	}
public static int isDephneArray(int a[]) {
	if(a.length<2) {
		return 0;
	}
	else {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<0) {
					if(a[i+1]< 0 )
					return 0;
			}
					if(a[i]>0) { 
							
							if(a[i+1]>0)
					return 0;
							}
		}
		return 1;
	}
}
}

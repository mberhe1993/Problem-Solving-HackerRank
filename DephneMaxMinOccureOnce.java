
public class DephneMaxMinOccureOnce {

	public static void main(String[] args) {
int a[]= {1,2,3,5};
System.out.println(isDephne(a));
	}
public static int isDephne(int a[]) {
	int max=0;
	int min=0 ;
	int countmax=0;
	int countmin=0;
	for(int i=1;i<a.length;i++) {
	if(a[i]>max) {
		max=a[i];
		
	}
	else {
		if(a[i]<min) {
		min=a[i];
	}
	}
	for(int j=0;j<a.length;j++) {
		if(max==a[j])
			countmax++;
		if(min==a[j])
			countmin++;
	}
	}
	if(countmax !=1 ||countmin !=1)
	return 0;
	
	return 1;
	}
}


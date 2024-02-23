
public class Olympic {

	public static void main(String[] args) {
		int a[]= {1,2,3,6};
		System.out.println(isOlympic(a));

	}
public static int isOlympic(int a[]) {
	for(int i=0;i<a.length;i++) {
		int sum=0;
		if(a[i]<0)
			return 0;
		for(int j=0; j<a.length;j++) {
			if(a[i]>a[j]) {
				sum+=a[j];
			}
			if(a[i]< sum)
				return 0;
		}
	}
	return 1;
}
}

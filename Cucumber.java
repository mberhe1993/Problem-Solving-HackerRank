
public class Cucumber {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,12,15};
		System.out.println(isCucumber(a));

	}
public static int isCucumber(int a[]) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==15)
				count++;
		}
		if(count >1)
			return 0;
	}
	return 1;
}
}

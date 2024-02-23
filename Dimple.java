
public class Dimple {

	public static void main(String[] args) {
		int a[]= {3,2,1,3,1,2};
System.out.println(countDimples(a));
	}
public static int countDimples(int a[]) {
	int count=0;
	if(a.length<3)
		return 0;
	
	for(int i=0;i<a.length-2;i++) {
		if(a[i]>a[i+1] && a[i+1]< a[i+2])
			count++;
	}
	return count;
}
}

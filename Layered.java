
public class Layered {

	public static void main(String[] args) {
	int a[]= {2,2,3,3,4,4,5,5,6,6};
	System.out.println(isLayered(a));
	}
public static int isLayered(int a[]) {
	int count=1;
	if(a.length<2)
		return 0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]<a[i+1])
			count++;
		else if((count<2)||(a[i]>a[i+1]))
		return 0;
		
		else count=1;
	}
	return 1;
}
}

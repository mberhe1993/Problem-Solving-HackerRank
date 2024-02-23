// Martian array is an array if z number of 1s is greater than number of 2s and no adjacent elements
//equal
public class Martian {

	public static void main(String[] args) {
	int a[]= {3,4,1,3,1,2,2,3};
	System.out.println(isMartian(a));

	}
public static int isMartian(int a[]) {
	int count1=0, count2=0;
	for(int i=0;i<a.length;i++) {
		if(i<a.length-1) {
		if(a[i]==a[i+1])
			return 0;
		}
		if(a[i]==1)
			count1++;
		if(a[i]==2)
			count2++;
		
	}
	if(count1<=count2)
		return 0;
	return 1;
}
}


public class EquivalentArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {2,3,5,1,4};
System.out.println(isEquivalentArrays(a,b));
	}
public static int isEquivalentArrays(int a[], int b[]) {
	if(a.length==0 ||b.length==0)
		return 0;
	if(a.length!=b.length)
		return 0; 
	for(int i:a) {
		if(((count(a,i))!=(count(b,i))))
			return 0;
	}
	return 1;
}
//Java function used to count Array Elements
public static int count(int a[], int x) {
int count=0;
for(int i:a)
	if(i==x)
		count++;
return count++;
}
}

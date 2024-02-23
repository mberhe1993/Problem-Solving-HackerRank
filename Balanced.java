
public class Balanced {

	public static void main(String[] args) {
	int a[]= {0,1,2,3,4,5};
	System.out.println(isBalanced(a));

	}
public static int isBalanced(int [] a) {
	if(a.length==0 || a==null) {
		return 0;
	}
for(int i=0;i<a.length;i+=2) {
	if(a[i]%2!=0)
		return 0;
}
for(int i=1;i<a.length;i+=2) {
	if(a[i]%2==0)
		return 0;
}
return 1;
}
}
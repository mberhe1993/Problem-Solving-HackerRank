
public class HasTwoValues {

	public static void main(String[] args) {
		int a[]= {1,2,1,1,2,2,2};
System.out.println(isArrayHasTwoValues(a));
	}
public static int isArrayHasTwoValues(int a[]) {
	int n1=a[0],n2=0;
	int count1=0, count2=0;
	if(a.length==0)
		return 0;
	for(int x:a) {
		if(n1!=x)
			n2=x;
	}
	count1=count(a,n1);
	count2=count(a,n2);
	if(count2==0)
		return 0;
	if(a.length!=count1+count2)
		return 0;
	else return 1;
}
public static int count(int a[], int x) {
int count=0;
for(int i:a)
	if(i==x)
		count++;
return count++;
}
}


public class NZeroPacked {

	public static void main(String[] args) {
int a[]= {1,0,0,0,2,0,0,0,3};
int n=3;
System.out.println(isNZeroPacked(n,a));
	}
public static int isNZeroPacked(int n,int a[]) {
	int countNonZero=0;
	for(int i=0;i<a.length;i++) 
		if(a[i]!=0) {
			countNonZero++;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]!=0) {
					if((j-i)!=n+1)
						return 0;
					else {
						i=j-1;
						break;
					
					}
				}
			}
		}
	if(countNonZero<2)
		return 0;
		return 1;
}
}
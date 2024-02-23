public class PairedN {

	public static void main(String[] args) {
System.out.println(isPairedN(new int [] {1, 4, 1, 4, 5, 6},5));
	}
public static int isPairedN(int a[],int n)
{
if(a.length-1+a.length-2<n || n<1)	
	return 0;
for(int i=0;i<a.length;i++)
	for(int j=i+1;j<a.length;j++)
		if(a[i]+a[j]==n && i+j==n)
			return 1;
return 0;
}
}

public class Onion {

	public static void main(String[] args) {
		
		System.out.println(isOnion(new int[] {12,4,5,7,9} ));
	}
public static int isOnion(int a[])
{
	if(a.length == 0) return 1;
	  if(a.length == 1 && a[0] < 10) return 1;
	
for(int i=0, j=a.length-1;i<j;i++,j--)
	if(a[i]+a[j]>10)
		return 0;
return 1;
}
}

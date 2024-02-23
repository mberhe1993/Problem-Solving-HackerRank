public class ComputeHMS {

	public static void main(String[] args) {
		int a[]=computeHMS(37893 );
System.out.println(a[0]+"  "+a[1]+"  "+a[2]);
	}
public static int[] computeHMS(int n)
{
	int a[]= new int[3];
	a[0]=n/3600;
	a[1]=(n%3600)/60;
	a[2]=(n%3600)%60;
	return a;
}
}

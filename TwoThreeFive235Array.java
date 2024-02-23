public class TwoThreeFive235Array {

	public static void main(String[] args) {
		
System.out.println(is235Array(new int [] {2,3,5,7,13}));
	}
public static int is235Array(int a[])
{
	int d2Count=0,d3Count=0,d5Count=0,nd235Count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
			d2Count++;
		if(a[i]%3==0)
			d3Count++;
		if(a[i]%5==0)
			d5Count++;
		if((a[i]%2!=0) && (a[i]%3!=0) && (a[i]%5!=0))
			nd235Count++;	
	}
	
	if(a.length!=d2Count+d3Count+d5Count+nd235Count)
		return 0;
	else 
		return 1;
}
}

public class MileAge {

	public static void main(String[] args) {
		updateMileage(new int [] {8,9,9,5,0},100);
	}
public static void updateMileage(int a[],int n)

{
	int rem=n;
	while(rem>0) 
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]+rem<=9)
				{
				a[i]=a[i]+rem;
				rem=0;
				break;
				}
			else if(a[i]+rem>9 && i==a.length-1) 
			{
				rem=a[i]+rem-9-1;
				a[i]=0;
				i=-1;
				
			}
			else if(a[i]+rem>9) 
			{
				rem=a[i]+rem-9;
				a[i]=0;
				
			}
		}
	}
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]);
} 

}

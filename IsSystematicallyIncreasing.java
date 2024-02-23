public class IsSystematicallyIncreasing {

	public static void main(String[] args) {
		System.out.println(isSystematicallyIncreasing(new int[] {1, 1,2,1,2, 3,1,2,3,4,1,2,3,4,5} ));
	}
public static int isSystematicallyIncreasing(int a[])
{
	int temp=0,num=0;
	
		for(int i=0, j=1;i<a.length;i++,j++)
			{
			if(j>temp)
				{
				j=1;
				temp++;
				}
			
			if(a[i]!=j )
			{
				return 0;
			}
		   num=i;
			}
		
		
		if(a[num]!=temp)
			return 0;
	return 1;
}
}

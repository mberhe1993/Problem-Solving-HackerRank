
public class IsZeroPlentiful {

	public static void main(String[] args) {
System.out.println(isZeroPlentiful(new int []{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0,0,0}));
	}
public static int isZeroPlentiful(int a[]) 
{
	int count=0,countall=0;
for(int i=0;i<a.length;i++)	
	if(a[i]==0)
		count++;

	else if(count!=0 && count<4)
		return 0;
	else if( count>=4)
		{
		count=0;
		countall++;
		}

if(count>=4 )
	countall++;
if(count!=0 && count<4)
	return 0;
	
return countall;
}
}

public class HasNValues {

	public static void main(String[] args) {
System.out.println(hasNValues(new int[] {1,1,1, 2, 2,3,4, 1},2));
	}
public static int hasNValues(int a[],int n)
{
int	count=0;
for(int i=0;i<a.length;i++)
{
	int j;
for(j=0;j<i;j++ )
	if(a[i]==a[j])
		break;
if(i==j)
	count++;
}
	  if(count>=n)
		  return 1;
	  else
		  return 0;
}
}

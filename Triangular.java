

public class Triangular {

	public static void main(String[] args) {
System.out.println(isTriangular(15));
	}
public static int isTriangular(int n)
{
	int sum=0;
for(int i=1;i<n;i++)
	{
	sum+=i;
	if(sum==n)
		return 1;
	}
return 0;
}
}

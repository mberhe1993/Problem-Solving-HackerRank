public class ConsecutiveFactored {

	public static void main(String[] args) {
System.out.println(isConsecutiveFactored(15));
	}
public static int isConsecutiveFactored(int n) 
{
	int fat1;
	if(n%2==0)
	fat1=2;
	else
	fat1=0;
	
	for(int i=3;i<n;i++)
		if(n%i==0 && fat1+1==i)
			return 1;
		else fat1=i;
	
	return 0;
			
}
}

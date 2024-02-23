

public class Vasuvian {

	public static void main(String[] args) {
System.out.println(isvesuvian(50));
	}
public static int isvesuvian(int n)
{
	int count=0;
	for(int i=1;i<n;i++)
		for(int j=1;j<n;j++)
			if(n==Math.pow(i, 2) +Math.pow(j, 2))
				count++;
	if(count>=2)
		return 1;
	else return 0;
}
}

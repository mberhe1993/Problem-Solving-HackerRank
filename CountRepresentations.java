

public class CountRepresentations {

	public static void main(String[] args) {
System.out .println(countRep(25));
	}
public static int countRep(int n) 
{int count=0;
	for (int denom20=0; denom20<=n/20; denom20++)
		for (int denom10=0; denom10<=n/10; denom10++)
		for (int denom5=0; denom5<=n/5; denom5++)
		for (int denom1=0; denom1<=n; denom1++)
		{
		if (denom20*20+denom10*10+denom5*5+denom1==n)
		count++;
		}
	return count;
}
}

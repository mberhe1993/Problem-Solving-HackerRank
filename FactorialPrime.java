public class FactorialPrime {

	public static void main(String[] args) {
System.out.println(isFactorialPrime(7));
	}
public static int isFactorialPrime(int n) 
{
	for(int i=2;i<n;i++)
    if(n%i==0)
    	return 0;
	for(int i=1;i<n;i++)
      if(n==fact(i)+1)
    	  return 1;
	return 0;
}
public static int fact(int n)
{
	if(n==1)
		return 1;
	else
		
	return n*fact(n-1);
}

}

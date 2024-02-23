public class ConsecutiveFactored2 {

	public static void main(String[] args) {
System.out.println(isConsecutiveFactored(24));
	}
public static int isConsecutiveFactored(int n) 
{
	for(int i=2;i<n;i++) {
		
	 for(int j=i+1;j<n;j++) {
		 
		if(n%i==0 && n%j==0 && j==i+1)
			return 1;
	 }
	 }
	return 0;
	}
}


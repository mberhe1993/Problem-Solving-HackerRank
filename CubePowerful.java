
public class CubePowerful {

			public static void main(String[] args) {
		System.out.println(isCubePowerful(371));
			}
		public static int isCubePowerful(int n) 
		{
			int initialN=n;
		int val=0,rem=0;
		while(n>0) {
			
			rem=n%10;
			val=val+rem*rem*rem;
			n=n/10;
			
		}
		if(initialN==val)
			return 1;
		else 
			return 0;
		}
		}


public class PrimeFactors {
    public static void main(String[] args) {
 
        System.out.println(primeFactor(8));}
    public static int primeFactor(int n) {
               int count=0;
        for (int i = 2; i<=n; i++) {
            while(n % i == 0) {
                n=n/ i;
                count++;
            }
               
           /* if(count!=0) {
            	for(int j=n;j>0;j--) {
            		System.out.print(i);
            		
            		//if(n!=1)
            		//	System.out.print("*");
            	}
            }*/
               
                }
		return count;
    }
}
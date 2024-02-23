
public class KSmallFactors {

	public static void main(String[] args) {
		System.out.println(hasKSmallFactors(12,7));

	}
public static int hasKSmallFactors(int n,int k) {
	if(k==0)
		return 0;
	for(int u=2;u<k;u++)
		for(int v=2;v<k;v++) {
			if(v*u==n)
				return 1;
		}
	return 0;
}
}

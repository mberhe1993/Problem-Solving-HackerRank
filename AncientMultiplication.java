//Ancient multiplication of numbers
public class AncientMultiplication {

	public static void main(String[] args) {
		System.out.println(ancientMultiplication(23,25));

	}
public static int ancientMultiplication(int n1,int n2) {
	int sum=0;
	int a=Math.abs(n1);
	int b=Math.abs(n2);
	while(a>0) {
		if(a%2!=0)
			sum+=b;
		a=a/2;
		b=b*2;
		
	}
	if(n1<0 &&n2>0 || n1>0 && n2<0)
		sum*=-1;
	return sum;
}

}

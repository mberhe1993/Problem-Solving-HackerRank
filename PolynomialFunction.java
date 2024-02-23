
public class PolynomialFunction {

	public static void main(String[] args) {
int a[]= {1,2};
double x=2;
System.out.println(eval(x,a));
	}
public static double eval(double x , int a[]) {
	double sum=0;
	for(int n=0;n<a.length;n++) {
		sum+= a[n]*(Math.pow(x,n));
	}
	return sum;
}
}

//an array to be cumulative if the nth (n > 0) element of the array is the sum of the first n elements of the array. So {1, 1, 2, 4, 8} is cumulative because 
//1.a[1] == 1 == a[0] 
//2.a[2] == 2 == a[0] + a[1] 
//3.a[3] == 4 == a[0] + a[1] + a[2] 
//4.a[4] == 8 == a[0] + a[1] + a[2] + a[4] 
public class Cummulative {

	public static void main(String[] args) {
		int a[]= {1,1,2,4,8,16};
System.out.println(isCummulative(a));

	}
public static int isCummulative(int []a) {
	if(a.length<=1)
		return 0;
	int sum=a[0];
	for(int i=1;i<a.length;i++) {
		
			if(sum!=a[i])
				return 0;
			else
				sum+=a[i];
	}
	return 1;
}	

}

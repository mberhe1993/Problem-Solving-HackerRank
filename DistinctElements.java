
public class DistinctElements {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,56,7,7};
		System.out.println(numberOfDistinctElements(a));
	}
public static int numberOfDistinctElements(int a[]) {
	int count=0;
	top:
		for(int k=0;k<a.length;k++) {
			for(int j=k+1;j<a.length;j++) {
				if(a[k]==a[j])
					continue top;
		}
	count++;
}
return count;
}
}
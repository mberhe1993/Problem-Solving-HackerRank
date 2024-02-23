//a function all possibilities contains all numbers b/n 0 and a.length-1
public class AllPosibilities {

	public static void main(String[] args) {
		int[] a= { 1,2,3,0};
		System.out.println(isAllPossibilitiesArray(a));

	}
	public static int isAllPossibilitiesArray(int []a) {
		 for (int i = 0; i < a.length; i++) {
			  boolean flag=false;
			  for(int j=0;j<a.length;j++){
				  if(i==a[j]){
					  flag=true;
				  }
			  }
			if(flag==false){
				return 0;
			}
		}
		  return 1;
	  }

}

public class HollowArray {

	public static void main(String[] args) {
		int a[]=new int[]{0,2,3,0,0,0,0,0,3,4,8};
        System.out.println(isHellow(a));
	}
public static int isHellow(int[] a){
	if(a.length%2==0){
		return 0;
	}
	
		int mid=a.length/2+1;
		if(a[mid]!=0&&a[mid-1]!=0&&a[mid+1]!=0){
		
			return 0;
		}
	return 1;
}
}
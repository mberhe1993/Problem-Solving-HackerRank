
public class DecodedArray {
	public static void main(String args[]) {
		int a[] = {-1,5,8,17,15};
		System.out.println(isDecodeNumber(a));
	}

	public static int isDecodeNumber(int a[]) {
		int temp=0, decoded=0;
		for(int i=0;i<a.length-1;i++) {
			temp=Math.abs(a[i]-a[i+1]);
			if(temp>=0 && temp<=9) {
			decoded=10*decoded+temp;
			
			}
			}
		if((a[0])<0)
			return	-decoded;
		
		return decoded;
		
	}
}


public class Palindrome {

	public static void main(String[] args) {
	char[] a= {'i','p','r','e','f','e','r','p','i'};
	char[] b= {'t','o','p','s','p','o','t'};
	char[] c= {'g','o','o','g','l','e'};
System.out.println(isPalindrome(a));
System.out.println(isPalindrome(b));
System.out.println(isPalindrome(c));
	}
public static boolean isPalindrome(char [] a) {
	for(int i=0;i<a.length;i++)
		if(a[i]!=a[(a.length-1)-i])
			return false;
	return true;
}
}

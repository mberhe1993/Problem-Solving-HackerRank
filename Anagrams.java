

public class Anagrams {

	public static void main(String[] args) {
		char a[]={'p', 'o', 'o','l'};
		char b[]=	{'l', 'o', 'o','p'};
System.out.println(areAnagrams(a,b));
	}
public static int areAnagrams(char a[],char b[])
{
	if(a.length!=b.length)
		return 0;
	if(a.length==0 ||b.length==0)
		return 0;
for(int i=0;i<a.length;i++)
	if(count(a,a[i])!=count(b,a[i]))
		return 0;
return 1;
}
public static int count(char a[],char c)
{
	int count=0;
for(int i=0;i<a.length;i++)
	if(a[i]==c)
		count++;
return count;

}
}

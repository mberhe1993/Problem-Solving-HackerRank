

public class OneBalanced {

	public static void main(String[] args) {
System.out.println(isOneBalanced(new int [] {1, 1, 1, 2, 3, -18, 45,1,1}));
	}
public static int isOneBalanced(int a[]) 
{
int b1s=0,e1s=0,n1s=0;
if(a[0]!=1)
	n1s=1;

for(int i=0;i<a.length;i++)
{
	if(a[i]==1 && n1s<1 )
		b1s++;
	else if(a[i]!=1 && e1s>=1)
		return 0;
	else if(a[i]!=1)
		n1s++;
	else if(a[1]==1 && n1s>=1)
		e1s++;
}
if(a[0]!=1)
	n1s--;
if(n1s==b1s+e1s)
return 1;
else return 0;
}
}

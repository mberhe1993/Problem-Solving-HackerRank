

public class Mercurial {

	public static void main(String[] args) {
System.out.println(isMercurial(new int [] { 2, 10, 3, 15, 1, 2, 2}));

	}
public static int isMercurial(int a[])
{
int hot=1;
for(int i=0;i<a.length;i++)
{
if(a[i]==3&&hot==1)
	hot=2;
else if(a[i]==1&&hot==2)
     return 0;
else if(a[i]==1&& hot==0)
	hot=1;
	
}
return 1;

}
}

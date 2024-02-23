

public class EncodedNumber {


	public static void main(String[] args) {
		int result[]=enc(12);
		for(int i =0;i<result.length;i++)
		System.out.println(result[i]);
	}
public static int[] enc(int n)
{
int temp[]=new int[n];
if(n<=1)
	return null;
int counter=0 ,devider=2;
while(n>1)
{
while(n%devider==0)
	{
	n=n/devider;
    temp[counter]=devider;
    counter++;
	}
devider++;
}


int result[]=new int[counter];
for(int i=0;i<counter;i++)
	result[i]=temp[i];
return result;
}
}

public class OneTwoOne121 {
public static void main(String[] args) {

int a [] = new int[]{1, 1, 2, 2, 2, 1, 1};
System.out.print(is121Array(a));
}

public static int is121Array(int[] a) {

int NB1s=0, NE1s=0 , CountN1s=0;
for (int i = 0; i < a.length; i++) {//checking 1's and 2's in an array

if (a[i] == 1) {

NB1s++;
}
else return 0;

if (a[i] != 1) {
CountN1s++;
}
if(CountN1s>1)
	return 0;
}

for (int i = a.length-1; i >= a.length/2; i--) {//counting number of 1's at end of array

if (a[i] == 1) {
NE1s++;
}
else return 0;

}
if( NB1s!=NE1s )
return 0;

return 1;
}
}
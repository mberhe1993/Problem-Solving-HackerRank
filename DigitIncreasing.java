public class DigitIncreasing {
	public static void main(String args[]) {
System.out.println(isDigitIncreasing(7404));

	}

	public static int isDigitIncreasing(int n) {

		for (int i = 1; i < 10; i++) {
			int k = 10;
			int result =i;
			int digit = i;
			while (result<= n) {
				if (result== n) {
					return 1;
				} else {
					digit = digit + i * k;
					result = result + digit;
					k *= 10;
				}
			}
		}

		return 0;
	}

}

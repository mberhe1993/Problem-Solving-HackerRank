

public class DecodedArray2 {
	public static void main(String args[]) {
		int a1[] = { 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1 };// encode 1234
		int a2[] = { 1 };
		int a3[] = { 0, 1 };// encode 1
		int a4[] = { -1, 0, 0, 1, 1, 0, 1 };// encode -201
		int a5[] = { 0, 1, 1, 1, 1, 1, 0, 1 };// encode 1000001
		int a6[] = { 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 };// encode 999

		System.out.println(isDecodedArray(a1));
		System.out.println(isDecodedArray(a2));
		System.out.println(isDecodedArray(a3));
		System.out.println(isDecodedArray(a4));
		System.out.println(isDecodedArray(a5));
		System.out.println(isDecodedArray(a6));

	}

	public static int isDecodedArray(int a[]) {
		int decoded = 0;
		int countzeros = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				countzeros++;
			} else {
				decoded = decoded * 10 + countzeros;
				countzeros = 0;
			}
		}
		if (a[0] == -1)
			return -decoded;

		return decoded;
	}
}

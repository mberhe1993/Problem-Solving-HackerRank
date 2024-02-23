

public class Mercurial2 {
	public static void main(String args[]) {
		int a[] = { 1, 3,2, 10,1,15, 1, 2, 2 };
		

		System.out.println(isMercurial(a));
	
	}

	public static int isMercurial(int a[]) {

		for (int i = 0; i < a.length - 2; i++)

			if (a[i] == 1) {

				for (int j = i + 1; j < a.length - 1; j++)
					if (a[j] == 3) {

						for (int k = j + 1; k < a.length; k++)
							if (a[k] == 1)
								return 0;

						return 1;
					}

				return 1;
			}

		return 1;
	}
}
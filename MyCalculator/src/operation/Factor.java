package operation;

public class Factor {
	public static void factor(int num) {
		for (int i = 1; i <= num ; i++) {
			if (num % i == 0) System.out.print(i + " ");			
		}
		System.out.println();
	}
}

package operation;

public class Count {
	public static int count(int num) {
		int ctr = 0;
		while (num > 0) {
			ctr++;
			num /= 10;
		}
		return ctr;
	}
}

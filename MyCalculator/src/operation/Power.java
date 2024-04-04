package operation;

public class Power {
	public static int pwr(int base, int pwr) {
		int i = 1, ans = 1;
		while (i <= pwr) {
			ans *= base;
			i++;
		}
		return ans;
	}
}

package operation;

public class Cube {
	public int cube(int num) {
		int i = 1, ans = 1;
		while (i <= 3) {
			ans *= num;
			i++;
		}
		return ans;
	}
}

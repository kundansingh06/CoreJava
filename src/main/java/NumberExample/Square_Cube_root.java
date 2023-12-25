package NumberExample;
public class Square_Cube_root {
	public static void main(String[] args) {
		int num = 5;
		Double square = (double) (num * num);
		System.out.println(square);
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.sqrt(25));
	}
	public static int square(int number) {
		int t;
		int squareroot = number / 2;
		do {
			t = squareroot;
			squareroot = (t + (number / t)) / 2;
		} 
		while ((t - squareroot) != 0);
		return squareroot;
	}
}

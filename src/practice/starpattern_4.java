package practice;

public class starpattern_4 {

	public static void main(String[] args) {

		for (int i = 4; i > 0; i--) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" " + "*");
			}
			System.out.println();
		}

	}

}

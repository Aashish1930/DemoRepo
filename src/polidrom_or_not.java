import java.io.InputStream;
import java.util.Scanner;

//-	Palimdron no.(madam, nitin)
public class polidrom_or_not {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter here "
		 * ); String str = sc.nextLine(); String rev = " "; int len =
		 * str.length(); for (int i = len - 1; i >= 0; i--) {
		 * 
		 * rev = rev + str.charAt(i);
		 * 
		 * }
		 * 
		 * System.out.println(str);
		 * 
		 * System.out.println(rev);
		 * System.out.println(str.equalsIgnoreCase(rev));
		 */

		String a="z";
		String b = new String();
		System.out.println("enter here ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		
		int len = a.length();
		for (int i = len - 1; i >= 0; i--) {

			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("palidrome");

		} else {
			System.out.println("no palidrome");
		}

	}
}
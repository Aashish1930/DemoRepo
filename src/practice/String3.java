
/*18.  Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)

*/
package practice;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter here ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
	}
}

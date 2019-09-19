
/*interview question 
 * String str = "name123xyz75ABC12";
 * write a program to get output of sum of number present in string 
 * Output is = 123+75+12=ie total

*/
//not done

package practice;

public class String2 {

	public static void main(String[] args) {

		int count = 0;
		String str = "name123xyz75ABC12";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				
				System.out.println(ch);
				count++;
				
			}

		}

	}

}

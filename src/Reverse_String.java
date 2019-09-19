
//-	Reverse String without using funtion. (using for Loop)



public class Reverse_String {

	public static void main(String[] args) {

		String s = "Selenium";
		String Reverse = " ";

		for (int i = s.length() - 1; i >= 0; i--) {

			char ch = s.charAt(i);
			Reverse = Character.toString(ch);
			System.out.print(Reverse);

		}	
	}

}

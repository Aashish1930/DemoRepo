

// input:- my name is aashish 12345
//print only digit

package practice;

public class String1 {

	public static void main(String[] args) {
		
		String str="my name is aashish 12345";
		
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)){
				System.out.print(ch);
			}
		}
		
	}

}

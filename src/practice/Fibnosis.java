package practice;

import java.util.Scanner;

public class Fibnosis {

	public static void main(String[] args) {
	
		
		int a=0,b=1,c=0,total=0;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++){
			
			total=a+b+c;
			System.out.println(total);
			a=b;
			b=c;
			c=total;
			
			
		}

	}

}

package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		
		
		al.add("Aashish");
		al.add("Aashish");
		al.add("Aashish");
		
		Iterator<String >it= al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}

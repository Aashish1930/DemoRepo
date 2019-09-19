package demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String>hs=new HashSet<String>();
		
		hs.add("aashish");
		hs.add("aashish");
		hs.add("aashish");
		
		Iterator< String>it= hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}

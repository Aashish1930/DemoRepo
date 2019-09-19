import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {

		
		ArrayList<Integer>al = new ArrayList();
	
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(20);
		
		
		
		Iterator<Integer>it= al.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
		
		
	}

}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
	HashSet<String>set= new HashSet();
	set.add("naval");
	set.add("naval");// hash set provide only unique value duplicate not allow here
	set.add("naval");
	set.add("navl");
	
	Iterator<String> it= set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
		
	}

}

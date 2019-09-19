import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(101, "aashish");
		map.put(102, "aashish");
		map.put(105, "aashish");
		map.put(11, "aashish");

		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}

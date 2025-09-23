import java.util.*;
import java.util.Map.Entry;
public class Demo {
	public static void main(String[] args) {
		TreeMap<Integer,Float> tm=new TreeMap<>();
		tm.put(101, 500.0f);
		tm.put(102, 600.0f);
		tm.put(103, 700.0f);
		tm.put(104, 800.0f);
		System.out.println(tm);
		/*Set<Entry<Integer, Float>> s = tm.entrySet(); //Tree converted into Set(2D--->1D)
		Iterator<Entry<Integer, Float>> iterator = s.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Float> me = iterator.next();
			int key = me.getKey();
			float value=me.getValue();
			System.out.println(value+500.0f);
		}*/
		
		//Using Enhance For loop
		for(Map.Entry<Integer,Float> entry:tm.entrySet()) {
			Integer key = entry.getKey();
			Float value = entry.getValue();
			System.out.println(value+50.0f);
		}
	}

}

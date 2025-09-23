import java.util.*;
class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		Iterator<Integer> i= list.iterator();
		while(i.hasNext()) {
			int x=i.next();
			System.out.println(x+5);
		}
	}

}

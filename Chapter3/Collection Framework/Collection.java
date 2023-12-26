import java.util.*;
// import java.util.list;
public class Collection{
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		ArrayList<Integer> l = new ArrayList();
		l.add(34);
		l.add(24);
		l.add(14);
		l.add(44);
		l.add(34);
		System.out.println("Array List : "+l);

		LinkedList<Integer> ll = new LinkedList();
		ll.add(12);
		ll.add(3);
		ll.add(10);
		ll.add(35);
		System.out.println("Linked List : "+ll);

		Vector<Integer> v = new Vector();
		v.add(2);
		v.add(12);
		v.add(42);
		v.add(3);
		v.add(6);
		System.out.println("Vector : "+v);

		

		// @SuppressWarnings("unchecked")
		try{
			Stack<Integer> s = new Stack<>();
			s.push(23);
			s.push(11);
			s.push(10);
			System.out.println(s.peek());
			System.out.println("Stack : "+s);
		}catch(Exception e){}


		HashSet<Integer> hs = new HashSet();
		hs.add(22);
		hs.add(72);
		hs.add(82);
		hs.add(92);
		System.out.println("HashSet : "+hs);

		LinkedHashSet<String> ls = new LinkedHashSet();
		ls.add("apple");
		ls.add("banana");
		ls.add("mango");
		ls.add("papaya");
		System.out.println("LinkedSet : "+ls);

		TreeSet<Integer> ts = new TreeSet();
		ts.add(23);
		ts.add(13);
		ts.add(3);
		ts.add(1);
		System.out.println("Tree Set : "+ts);

	}

}
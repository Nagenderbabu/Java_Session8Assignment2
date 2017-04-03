package course.Collection.sets;

import java.util.HashSet;
import java.util.Iterator;

public class StringSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating string objects with values
		String one=new String("arun");
		String two=new String("naveen");
		String three=new String("dinesh");
		String four=new String("sravan");
	
// creating hash set object
		HashSet hs=new HashSet();
	
	//  collecting string objects into hash set	
	hs.add(one);
	hs.add(two);
	hs.add(three);
	hs.add(four);
	
	// // calling iterator method using array list object
	Iterator iter=hs.iterator();
	
	// checks if there is a element in the list and prints if there are in random order
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
	}

}

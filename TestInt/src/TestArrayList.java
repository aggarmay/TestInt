import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> strList = new ArrayList<>();
		strList.add(new Integer(3));
		strList.add(new Integer(1));
		strList.add(1,new Integer(10));
		
		System.out.println(strList);
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add(null);
		hashSet.add(null);
		


		//System.out.println(hashSet);
		/*for(String s:hashSet)
		{
			System.out.println(s);
		}
		*/
		Iterator<String> i = hashSet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		try
		{
			System.out.println(hashSet.size()+" **** ");
		}
		finally
		{
			System.out.println("inside finally");
		}
	}

}

import java.util.List;
import java.util.ArrayList;


public class TestLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//ITERATING OVER ARRAY
		//String[] xx = new String[] {"abc","def"};
		String[] xx = {"abc","def"};

		for(String s: xx)
		{
			System.out.println(s);
		}
		
		//ITERATING OVER AN ITERABLE OBJECT (i.e. a Collection class)
		List<String> ls = new ArrayList<>();
		ls.add("c");
		ls.add("d");
		
		for(String s:ls)
		{
			System.out.println(s);
		}
	}

}

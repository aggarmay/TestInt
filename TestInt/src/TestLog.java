import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class TestLog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toTest = "abc def";
		
		List <String> listToRemove = new ArrayList<String> () ;
		
		listToRemove.add("this");
		listToRemove.add("is");
		listToRemove.add("xyz");
		
		
		StringTokenizer st = new StringTokenizer(toTest);
		
		while(st.hasMoreElements())
		{
			//System.out.println(st.);
		}

	}

}

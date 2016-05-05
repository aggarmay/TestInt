import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TestPass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String abc = "a0Ba";

		int len = abc.length();
		TreeMap<Integer, Integer> tm = new TreeMap();
		int startPosition = 0;
		boolean  CapsFound = false;
		
		for (int i=0;i<len;i++)	//for the entire input string
		{
			//startPosition = i;
			
			
			String charAbc = String.valueOf(abc.charAt(i));
			if(charAbc.matches("\\d"))
			{
				
				if(CapsFound == true) //discard current pattern
				{
					tm.put(Integer.valueOf(i-startPosition), Integer.valueOf(startPosition));
				}
				//start search again with new word
				startPosition = i;
				CapsFound = false;
				
			}
			else if (charAbc.matches("\\p{Upper}"))
			{
				CapsFound = true;
			}
		}	//end of for
		
		//tm.put(Integer.valueOf(i-startPosition), Integer.valueOf(startPosition));
		Set set = tm.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey() + " ");
			System.out.println(entry.getValue());
			System.out.println();
		}
	}

}

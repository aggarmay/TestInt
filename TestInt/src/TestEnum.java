import java.util.StringTokenizer;


public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		colors a;
		a = colors.red;
		System.out.println(a);
		*/
		
		String pathForHierarchy = "HOME/Transactions/chkicb/";
		StringTokenizer st = new StringTokenizer(pathForHierarchy,"/");
		
		String finalString = "<h4> ";
		
		int numTokens = st.countTokens();
		for(int i=0;i<numTokens; i++)
		{
			String linkString = "<a href='";
		
			for(int j=numTokens; j>i+1 ; j--)
			{
				linkString = linkString + "../";
			}
			
			linkString = linkString + "'>"+st.nextToken()+"</a> > ";
			finalString = finalString  + linkString;					
		}
		
		finalString = finalString + "</h4>";
		System.out.println(finalString);
	}

}

enum colors
{
	red, green, blue
}
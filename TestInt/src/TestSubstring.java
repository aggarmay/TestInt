
public class TestSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String commandParams = ";COMPCODE=EDMEA";//;LOCATION=C:\\ABC";

		if(commandParams.contains(""))
			System.out.println("contains");
/*
		int indexOfLOCATION = commandParams.indexOf("LOCATION=");
		System.out.println("indexOfLOCATION : "+indexOfLOCATION);
		int indexEndOfLOCATION =  commandParams.indexOf(";",indexOfLOCATION);
		System.out.println("indexEndOfLOCATION : "+indexEndOfLOCATION);
		
		String LOCATION = "";
		if(indexEndOfLOCATION == -1)	//char ';' does not exist at end of value of LOCATION parameter
		{
			LOCATION = commandParams.substring(indexOfLOCATION+9);
		}
		else
		{
			LOCATION = commandParams.substring(indexOfLOCATION+9, indexEndOfLOCATION);
		}
*/
	}

}

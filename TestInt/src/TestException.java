
public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try
		{
			//String[] arr = {"1","22","31","42","59"};
			String[] arr = new String[5];
			arr[0] = "1";arr[1] = "21";arr[2] = "31";arr[3] = "42";arr[4] = "59";
			
			try
			{
				throw new Exception ("custom message");

/*				if(arr[4] == "59")
				{
					arr[5] = "53";

				}
*/				//arr[5] = "53";
			}
			catch(Exception e)
			{
				System.out.println("exception raised :");
				//e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());

				
				throw e;
			}
			
			//System.out.println(arr[6]);
		}
		catch (Exception f)
		{
			//System.out.println("exception raised outer catch :");
			//f.printStackTrace();
		}
		
	}

}

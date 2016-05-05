
public class TestStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abc";
		String str1 = "abc";
		
		//if(str1.equals("abc"))
		if(str == "abc")	
		{
			System.out.println("equated");
		}
		else
			System.out.println("Not equal");
	
	
	String abc = "/omlwds/reports";
	String[] def = abc.split("/"); 
	if(def.length > 2)
	{
		System.out.println("error case");
	}
	
	/*
	for(String i:def)
	{
		System.out.println(i);
	}
	*/
	System.out.println(def.length);
	for (int i=0;i<def.length;i++)
	{
		System.out.println(def[i]+","+i);
	}
	
	}
}

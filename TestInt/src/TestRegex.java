import java.util.regex.*;
public class TestRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 /*Pattern p = Pattern.compile("RegenMark=[1234]");
		 Matcher m = p.matcher("RegenMark=1");
		 */
		
		//Pattern p = Pattern.compile("RegenMark=2[,$;]|RegenMark=[1234,[;]]2[,$;]");
		Pattern p = Pattern.compile(".*RegenMark=[1234,&&[^;]]*2[,$;]*.*");
		
		
		 //Matcher m = p.matcher("Run_63=jd6_16;de;RegenMark=4,3,2;ac");
		 Matcher m = p.matcher("Run_63=jd6_16;de;RegenMark=4,3,2;uue");

		 boolean b = m.matches();
		 System.out.println(b);

		 
			Pattern p1 = Pattern.compile(".*=[,4321&&[^-]].*type'$");
			 //Matcher m = p.matcher("Run_63=jd6_16;de;RegenMark=4,3,2;ac");
			 Matcher m1 = p1.matcher("jddje;=1;jdfjdtype'");

			 boolean b1 = m1.matches();
			 System.out.println(b1);
	}

}

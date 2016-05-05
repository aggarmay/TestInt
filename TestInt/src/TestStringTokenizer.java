import java.io.File;


public class TestStringTokenizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ChaineAdeCode = "Basic\\Channel_User_Balance_by_Network_Report_G4-1.0.2.cmd";
		String sourceFileName, targetFileName;
		args = ChaineAdeCode.split("^");
		sourceFileName = args[0];
		//targetFileName = args[1];
		
		System.out.println("sourceFileName:"+sourceFileName);

		//System.out.println("sourceFileName:"+sourceFileName+":targetFileName:"+targetFileName);
		
		File f = new File("");
		System.out.println( ((f.getParent() == null) ? "": f.getParent()) + ":" + f.getName());
		
		String c = null;
		String toPrint = (c == null) ? "null": "not null";
		System.out.println(toPrint);
	}

}

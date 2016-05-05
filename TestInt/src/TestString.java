
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "Basic\\Channel_User_Balance_by_Network_Report_G4-1.0.2.rpt;<QueryExec>;"; //QueryExec=sql\\HeadsOfNetwokList.sql";
		
		int indexSqlPath = value.indexOf("QueryExec=");
		//int indexSqlPath = value.indexOf("Channel");

		System.out.println(indexSqlPath);

		if(indexSqlPath != -1)
		{
			indexSqlPath += 9;
		}
		System.out.println(indexSqlPath);

		//int indexVeryNextSemiColon = value.indexOf(";",indexSqlPath);
		int indexVeryNextSemiColon = value.indexOf(';',1);

		
		System.out.println(indexVeryNextSemiColon);
		
		
		String sqlPath = "";
		if(indexVeryNextSemiColon != -1)
		{
			// ';' char exists after value of 'QueryExec=' parameter
			sqlPath = value.substring(indexSqlPath+1, indexVeryNextSemiColon);
		}
		else
		{
			sqlPath = value.substring(indexSqlPath+1);
		}
		
		System.out.println(sqlPath);
		
		System.out.println("abcde".indexOf("c", -2));
	}

}

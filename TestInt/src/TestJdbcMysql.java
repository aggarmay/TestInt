import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

//import fr.orange.utils.AESencrp;


public class TestJdbcMysql {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		String url = "jdbc:mysql://localhost:3306/test";
		String driver = "com.mysql.jdbc.Driver";
		String user = "omc";
		//String pathMiseAjour = p.getProperty("orange.money.transaction.update");
		String pdw = "omc";
		/*
		try {
			pdw = AESencrp.decrypt(pdw);
		} catch (Exception e) {

			logger.error("Password : " + pdw + " can not decrypted ", e);
		}
		*/
		//String path = p.getProperty("orange.money.file.sql");
	
		/*
		String path = pathMiseAjour;

		//List<UserChannel> resultats = new ArrayList<UserChannel>();
		List<String> resultats = new ArrayList<String>();
		*/
		
			/* try { */

				Class.forName(driver).newInstance();
				//Connection conn = DriverManager.getConnection(url, user, pdw);
				Connection conn = DriverManager.getConnection(url);
				
				//Statement st = conn.createStatement();
				
				PreparedStatement st = null;
						
				String query;
				/*
				if (timeSlot.contains("Current")) {
					query = getQueryByTimeSlote(timeSlot, pathMiseAjour);
				} else {
					query = getQueryByTimeSlote(timeSlot, path);
				}
				*/
				//query = getQueryByTimeSlote(pathMiseAjour);
				query = "select * from team";
				
				
				//logger.info("*** G, query : "+query);

				//change requested by francis: 5 nov
				//logger.info("Query for " + timeSlot + " : " + query);
				
				/*
				String queryFinal = query;
				int fromIndex=0, whereIndex=0;
				fromIndex = query.indexOf("FROM");
				whereIndex = query.lastIndexOf("WHERE");
				queryFinal = query.substring(0,fromIndex)+"... "+ query.substring(whereIndex);
				*/

				//to be removed later
				//query = "SELECT U.USER_ID as USER_ID, \'C:\R\Reports\Transactions'|| SYS_CONNECT_BY_PATH (translate(u.last_name,'ýÂà âäéèêëîïôöùûüç/&+','yAa_aaeeeeiioouuuc___')||'_'|| translate(u.user_name,'ýÂà âäéèêëîïôöùûüç/&+','yAa_aaeeeeiioouuuc___')||'_'||u.msisdn, '\')|| '\_Synthesis\' as Location, U.MSISDN as MSISDN FROM mmoney.USERS U WHERE U.USER_TYPE='CHANNEL' AND U.STATUS ='Y' AND CONNECT_BY_ISLEAF = 0 AND LEVEL = 1 connect by nocycle prior u.user_id = u.parent_id start with u.user_id = u.owner_id";
				//query = "SELECT U.USER_ID as USER_ID, 'C:\\R\\Reports\\Transactions'";
				//query = "SELECT U.USER_ID as USER_ID,'C:\\R\\Reports\\Transactions'||SYS_CONNECT_BY_PATH (translate(u.last_name,'ýÂà âäéèêëîïôöùûüç/&+','yAa_aaeeeeiioouuuc___')||'_'||translate(u.user_name,'ýÂà âäéèêëîïôöùûüç/&+','yAa_aaeeeeiioouuuc___')||'_'||u.msisdn, '\')||  '\\_Synthesis\' as Location,   U.MSISDN as MSISDNFROM mmoney.USERS UWHERE U.USER_TYPE='CHANNEL'   AND U.STATUS ='Y'   AND CONNECT_BY_ISLEAF = 0   AND LEVEL = 1   connect by nocycle prior u.user_id = u.parent_id   start with u.user_id = u.owner_id";

				//remove sundry binary characters from beginning of Query string
				int indexOfSELECT = query.toLowerCase().indexOf("select");
				if(indexOfSELECT != -1 && indexOfSELECT < 6)	//'select' exists within first 6 characters of the query
				{
					query = query.substring(indexOfSELECT);
				}
				
						
						
				//logger.info("Query : " + queryFinal);
				//logger.info("Query : " + query);
				
				st = conn.prepareStatement(query);
				// filter out empty statements
				//ResultSet rs = st.executeQuery(query);
				ResultSet rs = st.executeQuery();

				
				// logger.info("Generating channel-user list");
				
				ResultSetMetaData rsmd = rs.getMetaData();
				int numberOfColumns = rsmd.getColumnCount();
				//logger.info("numberOfColumns : " + numberOfColumns);

				String columnNames[] = new String[numberOfColumns];	//array containing column names
				for(int i=0;i<numberOfColumns;i++)
				{
					columnNames[i] = rsmd.getColumnLabel(i+1);
				//	logger.info("columnNames["+i+"] : " + columnNames[i]);

				}
				
				while (rs.next()) {
					String params="";
					
					for(String colName: columnNames)
					{
						params += ";" + colName + "="+rs.getString(colName);
					}
					
					System.out.println(params);
				}
		
		
	}

}

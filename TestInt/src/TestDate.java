import java.util.Calendar;


public class TestDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		int checkLagHour = cal.get(Calendar.HOUR_OF_DAY);
		int checkLagMin = cal.get(Calendar.MINUTE);
		int checkLagSec = cal.get(Calendar.SECOND);
		
		System.out.println(""+checkLagHour + checkLagMin + checkLagSec);
		
		System.out.println(String.format("%02d", 9));

	}

}

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


public class TestInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//List<Integer> keySet = new ArrayList<Integer> ();

	/*	String a = "ab/cd/ef";
		String b = a.replaceAll("/", " > ");
		System.out.println(b);
		*/
		String heure;
		Calendar c;
		String stringSplite = "startDate=02/01/2016 00:00:00";	//dd/mm/yyyy
		int equalIndex = stringSplite.indexOf("=");

		String completeDate = stringSplite.substring(equalIndex+1);

		int index1Slash = completeDate.indexOf("/");
		int index2Slash = completeDate.lastIndexOf("/");

		int day = Integer.parseInt(completeDate.substring(0,index1Slash));
		int month = Integer.parseInt(completeDate.substring(index1Slash+1,index2Slash))-1;
		int year = Integer.parseInt(completeDate.substring(index2Slash+1,completeDate.indexOf(" ")));

		heure = completeDate.substring(completeDate.indexOf(" ")+1);
		c = Calendar.getInstance();
		SimpleDateFormat formatDate = new SimpleDateFormat("YYYY-MM-dd");

		c.set(Calendar.DAY_OF_MONTH, day);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);

		System.out.println(day + " " + month + " "+year);
		System.out.println(formatDate.format(c.getTime()));


		System.out.println(formatDate.getCalendar().isWeekDateSupported());
		/*
		String foramtDate = "yyyyMMdd";
		DateFormat dateFormat = new SimpleDateFormat(foramtDate);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		String dateString = dateFormat.format(cal.getTime());

		System.out.println("date is :"+dateString);
		*/
		/*
		String foramtDate = luncherInfo.getDailyDateFormat();
		dateFormat = new SimpleDateFormat(foramtDate);
		cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		String dateString = dateFormat.format(cal.getTime());
		*/

		//System.out.println(args[1] + args[2] + args[3]);
		/*
		String a = "abcdefg";
		int i=a.indexOf("c");
		System.out.println(i);
		System.out.println(a.substring(i));
		System.out.println(a.substring(0,i));
		*/

		/*
		 int a[] = new int[] {1,2,3,4,7};
		 try
		 {
			System.out.println(a[6]);
		 }
		 catch(Exception e)
		 {
			 System.out.println("catching exception ...");
		 }
		 */
	}

}

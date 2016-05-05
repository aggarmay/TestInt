import java.text.DecimalFormat;
import java.math.BigDecimal;

public class TestFloat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println("abc:"+System.currentTimeMillis() / 1000);
		//System.out.println("abc:"+349878 / 1000);
		
		DecimalFormat df = new DecimalFormat("#.##");
		//df.setRoundingMode(RoundingMode.CEILING); //Optional
		//Double d = new Double(2341234.212431324);
		Double d = new Double(25656f/1000);
		//System.out.println("a"+(224546465/1000)+"");
		//System.out.println(df.format(d));
		//System.out.println(256f/1000);
		//System.out.println(df.format(new Double(256f/1000)));
		
		
		//System.out.println(df.format(256f/1000));

		
		//df.format(new Double(25656f/1000))
		
		/*
		  BigDecimal bigDecimal = new BigDecimal(38947323.545456);
	        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
	        System.out.println(bigDecimal.doubleValue());
	      */  
	        
	       // double dnexp = 256565676454456f/1000;//12345678.847474;
	       // System.out.println("dexp: "+dnexp);
	       // System.out.printf("A"+"%.2f may"+23, dnexp);
	        
	     //   String a = "dexp: %.2f", dnexp;
		float f = 25224f/1000;
		
		System.out.println("A "+df.format(new Double(f)));
		
		System.out.println("A "+df.format(f));

	        
		
	}
}
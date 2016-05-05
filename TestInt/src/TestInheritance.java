import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.DateFormat;


public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		A a = new B();
		a.print();
		a.printAnother();
	}
}

class A
{
	public void print()
	{
		System.out.println("class A");
	}
	public void printAnother()
	{
		System.out.println("printAnother method in class A");

	}
}

class B extends A
{
/*	public void print()
	{
		System.out.println("class B");

	}*/
	public void printAnother()
	{
		System.out.println("method only in class B");

	}
	
}
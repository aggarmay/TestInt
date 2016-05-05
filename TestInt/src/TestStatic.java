
public class TestStatic {

	public static void main(String[] args) {
		//Stat a = new Stat();
		System.out.println(Stat.a);
		//a = new Stat();
	}
}

class Stat
{
	public static int a = 2;
	
	{
		System.out.println("inside non-static block 1");
	}
	
	static
	{
		System.out.println("inside STATIC  block 1");
	}
	
	static
	{
		System.out.println("inside STATIC block 2");
	}
	
	{
		System.out.println("inside non-static block 2");
	}
	
	public Stat()
	{
		System.out.println("inside constructor of Stat class");
	}
}

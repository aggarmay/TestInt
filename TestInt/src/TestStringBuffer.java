
public class TestStringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		
		sb.insert(1, "def");
		System.out.println(sb);

	}

}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class TestQueryCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String queryLine, query = null;
		StringBuffer sBuffer = new StringBuffer();
		String path = "F:\\OM\\global reporting\\Java\\HEAD_OF_NETWORKS\\HeadsOfNetwokList.sql";
		
		try {
			FileReader fr = new FileReader(new File(path));
			BufferedReader br = new BufferedReader(fr);

			// read the SQL file line by line
			while ((queryLine = br.readLine()) != null) {
				// ignore comments beginning with #
				int indexOfCommentSign = queryLine.indexOf('#');
				if (indexOfCommentSign != -1) {
					if (queryLine.startsWith("#")) {
						queryLine = new String("");
					} else
						queryLine = new String(queryLine.substring(0,
								indexOfCommentSign - 1));
				}
				// ignore comments beginning with --
				indexOfCommentSign = queryLine.indexOf("--");
				if (indexOfCommentSign != -1) {
					if (queryLine.startsWith("--")) {
						queryLine = new String("");
					} else
						queryLine = new String(queryLine.substring(0,
								indexOfCommentSign - 1));
				}
				// ignore comments surrounded by /* */
				indexOfCommentSign = queryLine.indexOf("/*");
				if (indexOfCommentSign != -1) {
					if (queryLine.startsWith("/*")) {
						queryLine = new String("");
					} else
						queryLine = new String(queryLine.substring(0,
								indexOfCommentSign - 1));

					sBuffer.append(queryLine + " ");
					// ignore all characters within the comment
					do {
						queryLine = br.readLine();
					} while (queryLine != null && !queryLine.contains("*/"));
					indexOfCommentSign = queryLine.indexOf("*/");
					if (indexOfCommentSign != -1) {
						if (queryLine.endsWith("*/")) {
							queryLine = new String("");
						} else
							queryLine = new String(queryLine.substring(
									indexOfCommentSign + 2,
									queryLine.length() - 1));
					}
				}

				// the + " " is necessary, because otherwise the content before
				// and after a line break are concatenated
				// like e.g. a.xyz FROM becomes a.xyzFROM otherwise and can not
				// be executed
				if (queryLine != null)
					sBuffer.append(" " + queryLine.trim());
			}
			br.close();

			// here is our splitter ! We use ";" as a delimiter for each request

			query = sBuffer.toString();
		} catch (Exception e) {

			System.out.println("Error : "+e);
		}
		System.out.println(query);
	}

}

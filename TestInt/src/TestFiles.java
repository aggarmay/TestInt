import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TestFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		Path tempDir = Paths.get("f:\\xyz3\\");
		//Path tempPath = Paths.get("f:\\xyz2\\abc.txt");
		Path tempPath = Paths.get("abcd.txt");
		
		Files.deleteIfExists(tempPath);
		//logger.info("** 6 **");

		
		Files.createDirectories(tempDir);
		Path p = Files.createFile(tempPath); 
		
		
		
	}

}

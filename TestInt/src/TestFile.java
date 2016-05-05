
import java.io.File;

public class TestFile {
   public static void main(String[] args) {
      
      File f = null;
      boolean bool = false;
      
      try{      
         // returns pathnames for files and directory
         f = new File("C:/Texts/TutorialsPoint/Java1.txt");
       //  f = new File("C:\\Texts\\TutorialsPoint\\Java1.txt");

         // create directories
       //  bool = f.mkdirs();
         
         // print
        // f.createNewFile();
         
         System.out.println(f.length());
         /* IMPORTANT LEARNING :-
          * 1) new File(<path>) does NOT actually create the file
          * createNewFile() method is needed to actually create the file
          * 2) Also before calling the createNewFile() method, the folder structure to contain the file SHOULD be present
          * else java.io.IOException: The system cannot find the path specified
         */
         System.out.print("Directory created? "+bool);
         
      }catch(Exception e){
         // if any error occurs
         e.printStackTrace();
      }
   }

}

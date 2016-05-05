import java.net.*;
import java.io.*;
import org.apache.commons.net.ftp.*;

public class TestFTP
{

	public static void main(String args[]) //throws Exception
	{
		/*
		try
		{

		
		URL url = new URL("ftp://omgr_ftp:omgr_2012@10.98.233.34/Report1.xls;type=i");
		URLConnection urlc = url.openConnection();
		//InputStream is = urlc.getInputStream(); // To download

		FileInputStream is = (FileInputStream ) urlc.getInputStream();
		//OutputStream os = urlc.getOutputStream();
		*/


			String server = "10.98.233.34";
        	int port = 21;
        	String user = "omgr_ftp";
       		 String pass = "omgr_2012";
 
      		  FTPClient ftpClient = new FTPClient();
       		 try {
 
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
 
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
 
            // APPROACH #1: uploads first file using an InputStream
            File firstLocalFile = new File("c:\\tmp\\mail.jar");
 
            String firstRemoteFile = "mail.jar";
            InputStream inputStream = new FileInputStream(firstLocalFile);
 
            System.out.println("Start uploading first file");
            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
            inputStream.close();
            if (done) {
                System.out.println("The first file is uploaded successfully.");
            }

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
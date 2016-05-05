import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.LinkedHashSet;
import java.util.Set;

//import fr.orange.utils.GRUtils;

//import fr.orange.utils.LuncherInfo;


public class TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		List<String> keySet = new ArrayList<String> ();
		
		/* requirement by francis to provide more details in start execution */
		//logger.info("**** Start execution of task  '" + generateType
		//		+ "'  ****");
		//String path = "C:\\Program Files (x86)\\i-net Clear Reports\\GR-Properties\\";
		String urlFileProperties = "F:\\Reports1.properties";
		
		BufferedReader input = null;
		try {
			//f = new FileInputStream(urlFileProperties);
			input =  new BufferedReader(new FileReader(urlFileProperties)); 
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException"+ e);
		}
		
		Properties prop = new Properties();
		try {
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException "+ e);
		}
		//return p;
		
		
		//propeties = GRUtils.loadProperties(urlFileProperties);
		
		
		
		//luncherInfo = new LuncherInfo();

		//Properties prop = luncherInfo.getPropeties();
		
		//Iterator<Object> it = prop.keySet().iterator();
		//Iterator<Object> it = new LinkedHashSet(prop.keySet()).iterator();
		
		Set s = prop.stringPropertyNames();
		Object[] it = s.toArray();
		for(int i=0;i<it.length;i++)
		{
			//System.out.println(it[i]);
		}
		
		
		
		
		
        File file = new File("F:\\Reports1.properties");
        InputStream inputStream = new FileInputStream(file);
        LinkedProperties linkedProperties = new LinkedProperties();
        linkedProperties.load(inputStream);
        //Iterable<Object> iterator = linkedProperties.orderedKeys();
        //System.out.println(iterator);
        Enumeration names = linkedProperties.keys();
        while (names.hasMoreElements()){
            String name = (String)names.nextElement();
            System.out.println(name);
        }
        
		
		//prop.list(System.out);
		
		
		/*
		Object[] it = prop.keySet().toArray();
		for(int i=0;i<it.length;i++)
		{
			System.out.println(it[i]);
		}
		*/
		/*
		int countLocal = 0;
		while (it.hasNext()) {

			
			String key = (String) it.next();

			
			//add the keys from the properties
			keySet.add(key);
			System.out.println("#"+key+"#");
			countLocal = countLocal + 1;
		}
		
		System.out.println("**** Start execution of task ;Nb of reports scheduled to run:"+countLocal+" ****");
		
		
	

		List<Integer> numportionSet = new ArrayList<Integer> ();
		List<String> resultats;

		for(String keyportion:keySet){
			Integer numportion = Integer.valueOf(keyportion.substring( keyportion.lastIndexOf("_")+1));
			System.out.println("***"+numportion+"***");
		}*/
	}

}

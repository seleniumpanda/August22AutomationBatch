package understanding_filehanding_again;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingFromPropertiesFile {

	public static void main(String[] args) throws Exception {
    String path = System.getProperty("user.dir") + "\\config.properties";
    
    //Step 1
    Properties prop = new Properties();
    
    //Step 2
    FileInputStream ip = new FileInputStream(path);
    
    //Step 3
    prop.load(ip);
    
   System.out.println(prop.getProperty("url"));

	}

}

package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class Understanding_Properties_File {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream ip;

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\filehandling\\config.properties";
		
		prop = new Properties();
		ip = new FileInputStream(path);
		prop.load(ip);

	}

}

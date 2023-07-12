package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	
	public static String readProperty(String propname) {
		
		FileReader inputFile=null;
	try {
		 inputFile=new FileReader("C:\\Users\\suhas\\eclipse-workspace\\July23SeleniumFrameworkAssignment\\src\\main\\java\\configuration\\TestConfiguration.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Properties p=new Properties();
	
	try {
		p.load(inputFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return p.getProperty(propname);

	}
}

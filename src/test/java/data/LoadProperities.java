package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperities {
	// load the properties file from the folder 
	public static Properties userdata = 
			loadProperties(System.getProperty("user.dir") + "\\src\\main\\java\\properities\\UserData.properities");
	
	private static Properties loadProperties (String path)
	{
		Properties pro = new Properties();
		try {
			FileInputStream stream = new FileInputStream(path);
			pro.load(stream);
		
		} catch (FileNotFoundException e) {
			System.out.println("Error occured : " + e.getMessage());
		} catch (IOException e) {

			System.out.println("Error occured : " + e.getMessage());
		}
		return pro;
	}

}

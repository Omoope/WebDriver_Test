package prop;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
	static Properties properties;
	
	public static void loadData() throws IOException{
		properties = new Properties();
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Test0.Properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
	}
	
	public static String getData(String data) throws IOException{
		loadData();
		data = properties.getProperty(data);
		return data;
	}
}

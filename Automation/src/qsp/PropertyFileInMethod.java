package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileInMethod {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyFile(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./data/commandata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		
		return  data;
		}

}

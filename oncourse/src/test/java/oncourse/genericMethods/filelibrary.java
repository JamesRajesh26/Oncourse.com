package oncourse.genericMethods;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class filelibrary {


public String getDataFromProperties (String path, String key) throws IOException {
	FileInputStream ip= new FileInputStream(path);
	Properties prop=new Properties();
		prop.load(ip);	
	String data=prop.getProperty(key);
	return data;
}



}

package maps;
import java.io.*;
import java.util.*;

public class PropertiesMap  {

	public static void main(String[] args)throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("/home/dhanraj/java/collections/src/maps/application.properties");
		p.load(fis);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		FileOutputStream fos=new FileOutputStream("/home/dhanraj/java/collections/src/maps/application.properties");
		p.setProperty("host","2021");
		p.store(fos,"Added");
		
	}

}

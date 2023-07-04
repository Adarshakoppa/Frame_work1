package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Generic_properties {
	@Test
	public void test1(String path,String key) throws FileNotFoundException, IOException
	{
	Properties p=new Properties();
	p.load(new FileInputStream(path));
	String u=p.getProperty(key);
	System.out.println(u);
	}

}

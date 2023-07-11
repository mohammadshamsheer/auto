package com.home.webutil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

import com.home.tests.Base;

public class FileUtil {
	
	public static void readObjectRepository() {
		Properties prop = new Properties();
		try {
			prop.load(new FileReader(new File(System.getProperty("user.dir")+"\\testdata\\objectrepository.props")));
			for(Entry e:prop.entrySet()) {
				Base.object_repo.put(e.getKey().toString(), e.getValue().toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

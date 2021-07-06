package meli.sort;

import java.io.FileInputStream;
import java.util.Properties;

public class MyFactory<T> {

	public static <T> T getInstance() {
		Properties properties = new Properties();
		String className = "";
		try {
			properties.load(new FileInputStream("MyFactory.properties"));
			className = properties.getProperty("sorter");
			Class<?> clazz = Class.forName(className);
			final Object instance = clazz.newInstance();
			return (T) instance;
		} catch (Exception e) {
			// TODO Auto-g
			e.printStackTrace();
		}
		return null;
	}
}

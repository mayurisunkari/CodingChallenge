package com.java.PP.Util;

import java.util.ResourceBundle;

public class DBPropertyUtil {
	public static String connectionString(String propertyFile) {
		ResourceBundle rb= ResourceBundle.getBundle(propertyFile);
		return rb.getString("url");
	}

}

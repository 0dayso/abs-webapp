package com.sn.abs.conf;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author yangzhi
 */
public class Dictionary {
	private static Dictionary dictionary;
	private static ResourceBundle resource;
	private static Object locker = new Object();
	public static String MENUS = "menus";

	static {
		resource = ResourceBundle.getBundle("conf/dictionary", Locale.SIMPLIFIED_CHINESE);
	}

	public String get(String name) {
		return resource.getString(name);
	}

	public static Dictionary getInstance() {
		if (dictionary == null) {
			synchronized (locker) {
				dictionary = new Dictionary();
			}
		}
		return dictionary;
	}
}

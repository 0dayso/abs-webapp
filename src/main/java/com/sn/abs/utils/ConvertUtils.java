package com.sn.abs.utils;

import java.util.List;

public class ConvertUtils {

	public static <T> List<T> getPageList(List<T> list, int offset, int limit) {
		List<T> result = null;
		if (null != list && !list.isEmpty()) {
			int end = offset + limit;
			if (list.size() - offset < limit) {
				end = list.size();
			}
			result = list.subList(offset, end);
		}
		return result;
	}

}

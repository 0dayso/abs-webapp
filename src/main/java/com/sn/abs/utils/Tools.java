package com.sn.abs.utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class Tools {
	public static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM");
	public static SimpleDateFormat formatTime1 = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat formatTime2 = new SimpleDateFormat("yyyy/MM/dd");
	public static SimpleDateFormat formatTime3 = new SimpleDateFormat("HH:mm:ss");

	/**
	 * 保留2位小数
	 */
	public static BigDecimal divideWith2Precision(BigDecimal val1, BigDecimal val2) {
		BigDecimal ret = null;
		if (val2 == BigDecimal.ZERO || val2.doubleValue() == 0) {
			ret = BigDecimal.ZERO;
		} else {
			ret = val1.divide(val2, 2, BigDecimal.ROUND_HALF_UP);
		}
		return ret;
	}

	/**
	 * 保留4位小数
	 */
	public static BigDecimal divideWith4Precision(BigDecimal val1, BigDecimal val2) {
		BigDecimal ret = null;
		if (val2 == BigDecimal.ZERO || val2.doubleValue() == 0) {
			ret = BigDecimal.ZERO;
		} else {
			ret = val1.divide(val2, 4, BigDecimal.ROUND_HALF_UP);
		}
		return ret;
	}

	public static BigDecimal round(BigDecimal val, int scale) {
		if (val != null) {
			val = val.setScale(scale, BigDecimal.ROUND_HALF_UP);
			return val;
		}
		return BigDecimal.ZERO;
	}

}

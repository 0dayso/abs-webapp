package com.sn.abs.web.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.sn.abs.conf.CommonConstants;
import com.sn.abs.utils.Tools;
import com.sn.abs.web.dto.DataGridPage;
import com.sn.abs.web.dto.Option;
import com.sn.abs.web.dto.ResultObject;

@Controller
@RequestMapping("/ctl/common")
public class CommonController {
	public Logger logger = Logger.getLogger(CommonController.class);
	private final String pattern1 = "yyyy-MM-dd HH:mm:ss";
	private final String pattern2 = "yyyy-MM-dd";


	public void ajaxWrite(HttpServletResponse response, ResultObject<?> result) {
		response.setContentType("text/html;charset=UTF-8");
		try {
			SerializeConfig config = getSerializeConfig(pattern1);
			response.getWriter().print(JSON.toJSONString(result, config));
		} catch (IOException e) {
			logger.info("服务其返回响应发生异常!", e);
		}
	}

	public void ajaxWrite(HttpServletResponse response, DataGridPage<?> result) {
		response.setContentType("text/html;charset=UTF-8");
		try {
			SerializeConfig config = getSerializeConfig(pattern1);
			response.getWriter().print(JSON.toJSONString(result, config));
		} catch (IOException e) {
			logger.info("服务其返回响应发生异常!", e);
		}
	}

	private SerializeConfig getSerializeConfig(String pattern) {
		SerializeConfig config = new SerializeConfig();
		config.put(Date.class, new SimpleDateFormatSerializer(pattern));
		return config;
	}

	public void ajaxWrite2(HttpServletResponse response, DataGridPage<?> result) {
		response.setContentType("text/html;charset=UTF-8");
		try {
			SerializeConfig config = getSerializeConfig(pattern2);
			response.getWriter().print(JSON.toJSONString(result, config));
		} catch (IOException e) {
			logger.info("服务其返回响应发生异常!", e);
		}
	}

	public void ajaxWrite4(HttpServletResponse response, List<?> result) {
		response.setContentType("text/html;charset=UTF-8");
		try {
			SerializeConfig config = getSerializeConfig(pattern2);
			response.getWriter().print(JSON.toJSONString(result, config));
		} catch (IOException e) {
			logger.info("服务其返回响应发生异常!", e);
		}
	}

	public <T> List<Option> convertOptions(List<T> datas, String idName, String valueName) throws Exception {
		List<Option> list = new ArrayList<Option>();
		if (null != datas && !datas.isEmpty()) {
			for (T t : datas) {
				Option option = new Option();
				Object idObj = PropertyUtils.getProperty(t, idName);
				if (null != idObj) {
					String id = idObj.toString();
					option.setId(Integer.parseInt(id));
				}

				Object valueObj = PropertyUtils.getProperty(t, valueName);
				if (null != valueObj) {
					String value = valueObj.toString();
					option.setValue(value);
				}

				list.add(option);
			}
		}

		return list;
	}


	public void setPeriod(String period, Map<String, Object> map) {
		if (StringUtils.isNotEmpty(period)) {
			String[] timeArr = period.split(CommonConstants.PERIOD_SPLIT, -1);
			if (null != timeArr && timeArr.length > 0) {
				map.put("startTime", timeArr[0]);
				map.put("endTime", timeArr[1]);
			}
		}
	}

	public String getDefaultPeriod() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, -1);
		String endTime = Tools.formatTime1.format(calendar.getTime());
		calendar.add(Calendar.DATE, -6);
		String startTime = Tools.formatTime1.format(calendar.getTime());
		String period = startTime + CommonConstants.PERIOD_SPLIT + endTime;
		return period;
	}

}

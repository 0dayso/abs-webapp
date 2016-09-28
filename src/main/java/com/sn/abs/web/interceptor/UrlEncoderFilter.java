package com.sn.abs.web.interceptor;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.log4j.Logger;

public class UrlEncoderFilter implements Filter {
	private Logger logger = Logger.getLogger(UrlEncoderFilter.class);
	private final String UTF_8 = "utf-8";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		if ("GET".equalsIgnoreCase(req.getMethod())) {
//			HttpServletRequest encoderRequest  = new UrlEncoderRequest(req);
			chain.doFilter(req, response);
		} else {
			request.setCharacterEncoding(UTF_8);
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	private class UrlEncoderRequest extends HttpServletRequestWrapper {
		private HttpServletRequest request;

		private Map<String, Object> params;

		public UrlEncoderRequest(HttpServletRequest request) {
			super(request);
			this.request = request;
		}

		@Override
		public String getParameter(String name) {
			// TODO Auto-generated method stub
			String value = this.request.getParameter(name);
			try {
				if (value != null) {
					value = new String(value.getBytes("iso-8859-1"), "utf-8");
				}
			} catch (UnsupportedEncodingException e) {
				value = null;
			}
			return value;
		}

		@Override
		public Map<String, Object> getParameterMap() {
			// TODO Auto-generated method stub
			Map<String, Object> ordinalParams = this.request.getParameterMap();
			this.params = new HashMap<String, Object>();
			// 实现原始请求参数的对拷(复制)
			try {
				for (Map.Entry<String, Object> entry : ordinalParams.entrySet()) {
					if (entry.getValue().getClass() == String.class) {
						// 字符串类型
						String value = (String) entry.getValue();
						params.put(entry.getKey(), new String(value.getBytes("iso-8859-1"), "UTF-8"));
					} else if (entry.getValue().getClass() == String[].class) {
						// 数组类型
						String[] values = (String[]) entry.getValue();
						final int len = values.length;
						for (int i = 0; i < len; i++) {
							values[i] = new String(values[i].getBytes("iso-8859-1"), "utf-8");
						}
						params.put(entry.getKey(), values);
					}
				}
			} catch (UnsupportedEncodingException e) {
				logger.info("URLEncoder参数转换异常！", e);
			}
			return this.params;
		}
	}

}

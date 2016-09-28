package com.sn.abs.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class ApplicationException extends SimpleMappingExceptionResolver{
	private Logger logger = Logger.getLogger(ApplicationException.class);
	
	protected void logException(Exception e, HttpServletRequest request) {
		//往数据库写日志
		logger.info("服务器运行时异常!", e);
		super.logException(e, request);
	}
}

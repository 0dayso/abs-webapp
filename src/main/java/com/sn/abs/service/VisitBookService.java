package com.sn.abs.service;

import java.util.Map;

import com.sn.abs.domain.BookInfo;
import com.sn.abs.domain.StaffInfo;
import com.sn.abs.domain.VisitInfo;
import com.sn.abs.utils.Page;


public interface VisitBookService {

	Page<BookInfo> queryBookInfoPage(Map<String, Object> map) throws Exception;

	void deleteBookInfoById(Long id);

	void addOrUpdateBookInfo(BookInfo book);

	Page<StaffInfo> queryStaffInfoPage(Map<String, Object> map) throws Exception;

	Page<VisitInfo> queryVisitInfoPage(Map<String, Object> map) throws Exception;


}

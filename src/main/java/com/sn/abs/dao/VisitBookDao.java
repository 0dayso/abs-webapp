package com.sn.abs.dao;

import java.util.List;
import java.util.Map;

import com.sn.abs.domain.BookInfo;
import com.sn.abs.domain.StaffInfo;
import com.sn.abs.domain.VisitInfo;

public interface VisitBookDao {
	public List<BookInfo> queryBookInfoPage(Map<String, Object> map);

	public long queryBookInfoCount(Map<String, Object> map);

	public int insertBookInfo(BookInfo bookInfo);

	public int updateBookInfo(BookInfo bookInfo);

	public int deleteBookInfoById(long id);

	public StaffInfo getStaffInfo(String erpCode);
	
	public List<StaffInfo> queryStaffInfoPage(Map<String, Object> map);

	public long queryStaffInfoCount(Map<String, Object> map);

	public List<VisitInfo> queryVisitInfoPage(Map<String, Object> map);

	public long queryVisitInfoCount(Map<String, Object> map);


}

package com.sn.abs.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.abs.dao.VisitBookDao;
import com.sn.abs.domain.BookInfo;
import com.sn.abs.domain.StaffInfo;
import com.sn.abs.domain.VisitInfo;
import com.sn.abs.service.VisitBookService;
import com.sn.abs.utils.Page;

@Service("visitBookServiceImpl")
public class VisitBookServiceImpl implements VisitBookService {

	@Autowired
	private VisitBookDao visitBookDao;

	@Override
	public Page<BookInfo> queryBookInfoPage(Map<String, Object> map) throws Exception {
		Page<BookInfo> page = new Page<BookInfo>();
		page.setTotalLine(visitBookDao.queryBookInfoCount(map));
		List<BookInfo> resultInfos = visitBookDao.queryBookInfoPage(map);
		page.setRecordList(resultInfos);
		return page;
	}

	@Override
	public void addOrUpdateBookInfo(BookInfo book) {
		if (null != book) {
			StaffInfo staff = visitBookDao.getStaffInfo(book.getErpCode());
			String erpName = null != staff ? staff.getErpName() : "";
			book.setErpName(erpName);
			if (null == book.getId()) {
				visitBookDao.insertBookInfo(book);
			} else {
				visitBookDao.updateBookInfo(book);
			}
		}
	}

	@Override
	public void deleteBookInfoById(Long id) {
		visitBookDao.deleteBookInfoById(id);
	}
	
	
	@Override
	public Page<StaffInfo> queryStaffInfoPage(Map<String, Object> map) throws Exception {
		Page<StaffInfo> page = new Page<StaffInfo>();
		page.setTotalLine(visitBookDao.queryStaffInfoCount(map));
		List<StaffInfo> resultInfos = visitBookDao.queryStaffInfoPage(map);
		page.setRecordList(resultInfos);
		return page;
	}
	
	@Override
	public Page<VisitInfo> queryVisitInfoPage(Map<String, Object> map) throws Exception {
		Page<VisitInfo> page = new Page<VisitInfo>();
		page.setTotalLine(visitBookDao.queryVisitInfoCount(map));
		List<VisitInfo> resultInfos = visitBookDao.queryVisitInfoPage(map);
		page.setRecordList(resultInfos);
		return page;
	}

}

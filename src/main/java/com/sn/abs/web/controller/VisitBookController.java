package com.sn.abs.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sn.abs.domain.BookInfo;
import com.sn.abs.domain.StaffInfo;
import com.sn.abs.domain.VisitInfo;
import com.sn.abs.service.VisitBookService;
import com.sn.abs.utils.Page;
import com.sn.abs.web.dto.DataGridPage;
import com.sn.abs.web.dto.ResultObject;

@Controller
@RequestMapping("/ctl/visitBook")
public class VisitBookController extends CommonController{
	public Logger logger = Logger.getLogger(VisitBookController.class);

	@Autowired
	protected VisitBookService visitBookService;

	@RequestMapping("/showBookInfo")
	public String showBookInfo(Model model, HttpServletRequest request) {
		try {

		} catch (Exception e) {
			logger.info(e);
		}
		return "/views/book_manage/book_list";
	}

	@ResponseBody
	@RequestMapping("queryBookInfoPage")
	public void queryBookInfoPage(@RequestParam(value = "erpCode", required = false) String erpCode, @RequestParam(value = "visitName", required = false) String visitName,
			@RequestParam(value = "cellphone", required = false) String cellphone, @RequestParam(value = "period", required = false) String period,
			@RequestParam(value = "limit", required = false) int limit, @RequestParam(value = "offset", required = false) long offset, HttpServletRequest request,
			HttpServletResponse response, Model view) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("offset", offset);
			map.put("limit", limit);
			map.put("erpCode", erpCode);
			map.put("visitName", visitName);
			map.put("cellphone", cellphone);
			setPeriod(period, map);
			Page<BookInfo> page = visitBookService.queryBookInfoPage(map);
			DataGridPage<BookInfo> result = new DataGridPage<BookInfo>();

			result.setRows(page.getRecordList());
			result.setTotal(page.getTotalLine());
			ajaxWrite(response, result);
		} catch (Exception e) {
			logger.info(e);
		}
	}

	/**
	 * 保存或者更新
	 */
	@RequestMapping("/saveOrUpdateBook")
	@ResponseBody
	public void saveOrUpdateBook(HttpServletRequest request, HttpServletResponse response, BookInfo book) {
		ResultObject<String> result = new ResultObject<String>();
		try {
			if (null != book) {
				visitBookService.addOrUpdateBookInfo(book);
			}
		} catch (Exception e) {
			result.setCode(1);
			result.setMsg("保存失败!");
			logger.info(e);
		}

		ajaxWrite(response, result);
	}

	/**
	 * 删除
	 */
	@RequestMapping("/deleteBook")
	@ResponseBody
	public void deleteBook(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "id", required = false) Long id) {
		ResultObject<String> result = new ResultObject<String>();
		try {
			if (null != id) {
				visitBookService.deleteBookInfoById(id);
				result.setMsg("删除成功!");
			} else {
				result.setCode(1);
				result.setMsg("删除失败!");
			}
		} catch (Exception e) {
			result.setCode(1);
			result.setMsg("删除失败!");
		}
		ajaxWrite(response, result);
	}
	
	@RequestMapping("/showStaffInfo")
	public String showStaffInfo(Model model, HttpServletRequest request) {
		try {

		} catch (Exception e) {
			logger.info(e);
		}
		return "/views/book_manage/staff_list";
	}

	@ResponseBody
	@RequestMapping("queryStaffInfoPage")
	public void queryStaffInfoPage(@RequestParam(value = "erpCode", required = false) String erpCode, @RequestParam(value = "erpName", required = false) String erpName,
			@RequestParam(value = "cellphone", required = false) String cellphone, @RequestParam(value = "dept", required = false) String dept,
			@RequestParam(value = "limit", required = false) int limit, @RequestParam(value = "offset", required = false) long offset, HttpServletRequest request,
			HttpServletResponse response, Model view) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("offset", offset);
			map.put("limit", limit);
			map.put("erpCode", erpCode);
			map.put("erpName", erpName);
			map.put("cellphone", cellphone);
			map.put("dept", dept);
			Page<StaffInfo> page = visitBookService.queryStaffInfoPage(map);
			DataGridPage<StaffInfo> result = new DataGridPage<StaffInfo>();

			result.setRows(page.getRecordList());
			result.setTotal(page.getTotalLine());
			ajaxWrite(response, result);
		} catch (Exception e) {
			logger.info(e);
		}
	}
	
	@RequestMapping("/showVisitInfo")
	public String showVisitInfo(Model model, HttpServletRequest request) {
		try {

		} catch (Exception e) {
			logger.info(e);
		}
		return "/views/book_manage/visit_list";
	}

	@ResponseBody
	@RequestMapping("queryVisitInfoPage")
	public void queryVisitInfoPage(@RequestParam(value = "visitName", required = false) String visitName, @RequestParam(value = "identityCard", required = false) String identityCard,
			@RequestParam(value = "cellphone", required = false) String cellphone, @RequestParam(value = "address", required = false) String address,
			@RequestParam(value = "limit", required = false) int limit, @RequestParam(value = "offset", required = false) long offset, HttpServletRequest request,
			HttpServletResponse response, Model view) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("offset", offset);
			map.put("limit", limit);
			map.put("visitName", visitName);
			map.put("identityCard", identityCard);
			map.put("cellphone", cellphone);
			map.put("address", address);
			Page<VisitInfo> page = visitBookService.queryVisitInfoPage(map);
			DataGridPage<VisitInfo> result = new DataGridPage<VisitInfo>();

			result.setRows(page.getRecordList());
			result.setTotal(page.getTotalLine());
			ajaxWrite(response, result);
		} catch (Exception e) {
			logger.info(e);
		}
	}
	
	
}

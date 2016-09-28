package com.sn.abs.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.sn.abs.conf.Dictionary;
import com.sn.abs.domain.Menu;

@Controller
@RequestMapping("/")
public class IndexController extends CommonController {

	@RequestMapping(value = "/ctl/index")
	public String index(HttpServletRequest request, HttpServletResponse response, Model view) {
		String addr = "/views/index";
		try {
			String menusJson = Dictionary.getInstance().get(Dictionary.MENUS);
			request.setAttribute("menus", JSONArray.parseArray(menusJson, Menu.class));
		} catch (Exception e) {
			logger.info("首页查询异常！", e);
		}
		return addr;
	}

	@RequestMapping(value = "/default")
	public String forwardDefault(HttpServletRequest request, HttpServletResponse response, Model model) {
		String addr = "/views/forward/default";
		return addr;
	}

//	public static void main(String[] args) {
//		List<Menu> menus = new ArrayList<Menu>();
//		Menu re = new Menu();
//		re.setName("预约管理");
//		re.setHasSubMenus(true);
//		re.setSubMenus(getSubMenus1());
//		
//		Menu re1 = new Menu();
//		re1.setName("预约管理");
//		re1.setHasSubMenus(true);
//		re1.setSubMenus(getSubMenus1());
//		
//		menus.add(re);
//		menus.add(re1);
//		
//		System.out.println(JSONArray.toJSONString(menus));
//	}
//
//	public static List<Menu> getSubMenus1() {
//		List<Menu> subMenus = new ArrayList<Menu>();
//		Menu re1 = new Menu();
//		re1.setName("预约查询");
//
//		Menu re2 = new Menu();
//		re2.setName("员工查询");
//
//		subMenus.add(re1);
//		subMenus.add(re2);
//		return subMenus;
//	}
	

}

package com.sn.abs.domain;

import java.util.List;

public class Menu {
	private String name;
	private String value;
	private List<Menu> subMenus;
	private boolean hasSubMenus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}

	public boolean hasSubMenus() {
		return hasSubMenus;
	}

	public void setHasSubMenus(boolean hasSubMenus) {
		this.hasSubMenus = hasSubMenus;
	}

}

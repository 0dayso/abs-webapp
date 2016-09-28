package com.sn.abs.web.dto;

import java.util.ArrayList;
import java.util.List;

public class DataGridPage<T> {
	private long total = 0;
	private long pageIndex = 1;
	private List<T> rows = new ArrayList<T>();
	public DataGridPage() {
		// TODO Auto-generated constructor stub
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public void setPageIndex(long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public long getPageIndex() {
		return pageIndex;
	}
	
	

}

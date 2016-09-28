package com.sn.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sn.abs.web.dto.Option;

public class Test1 {

	@Test
	public void json() {
		List<Option> list = new ArrayList<Option>();
		for (int i = 0; i < 3; i++) {
			Option p = new Option();
			p.setId(i);
			p.setValue("name" + i);
			list.add(p);
		}
	}

	@Test
	public void testSplit() {
		String s = "";
		System.out.println(Arrays.toString(s.split(",")));
	}

}

package com.lau.test;

import com.lau.pojo.Category;
import com.lau.service.CategoryService;
import com.lau.service.impl.CategoryServiceImpl;

public class Test {

	public static void main(String[] args) {
		int i = 8;
		CategoryService s = new CategoryServiceImpl();
		Category c = new Category();
		c.setName("��㺣�⾴��Ŷ�滮");
		s.add(c);
		System.out.println(i+" "+c.getId());
	}

}

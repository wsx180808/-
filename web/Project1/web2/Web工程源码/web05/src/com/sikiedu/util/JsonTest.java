package com.sikiedu.util;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.sikiedu.model.Goods;

public class JsonTest {
	
	public static void main(String[] args) {
		
		// ���л� �־û�
//		Goods goods = new Goods("�㽶","�������㽶",100,400);
//		String json = JSON.toJSONString(goods);
//		System.out.println(json);
		//�����л�  json����
//		String s = "{\"des\":\"�������㽶\",\"inventory\":400,\"name\":\"�㽶\",\"price\":100}";
//		Goods goods = JSON.parseObject(s, Goods.class);
//		System.out.println(goods.getName());
//		System.out.println(goods.getDes());
//		System.out.println(goods.getPrice());
//		System.out.println(goods.getInventory());
		
		String s = "[{" + 
				"	\"name\":\"Midheal\"," + 
				"	\"age\":20," + 
				"	\"sex\":\"��\"" + 
				"}," + 
				"{" + 
				"	\"name\":\"Micsdfheal\"," + 
				"	\"age\":21," + 
				"	\"sex\":\"��\"" + 
				"}," + 
				"{" + 
				"	\"name\":\"Micsdfsdfeal\"," + 
				"	\"age\":22," + 
				"	\"sex\":\"��\"" + 
				"}" + 
				"]";
		List<UserTest> list = JSON.parseArray(s, UserTest.class);
		for(UserTest ut : list) {
			System.out.println(ut);
		}
	}
}

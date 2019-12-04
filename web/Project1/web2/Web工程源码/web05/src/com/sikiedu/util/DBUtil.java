package com.sikiedu.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sikiedu.model.Goods;
import com.sikiedu.model.User;

public class DBUtil {
	public static Map<String, User> userMap = new HashMap<String, User>();
	
	public static List<Goods> goodsList = new ArrayList<Goods>();
	
	static {
		addUser(new User("siki","123",10,"��",true));
		addUser(new User("123","123",10,"��",true));

		goodsList.add(new Goods("�㽶","�������㽶",100,400));
		goodsList.add(new Goods("�·�","�ǳ��ÿ�",100,56));
		goodsList.add(new Goods("�㽶","�������㽶",100,34));
		goodsList.add(new Goods("�ƹ�","ˮ���ƹ�",100,22));
		goodsList.add(new Goods("�㽶","�������㽶",100,777));
		goodsList.add(new Goods("�㽶","�������㽶",34,45));
		goodsList.add(new Goods("â��","�������㽶",100,456));
		goodsList.add(new Goods("�㽶","�������㽶",34,456));
		goodsList.add(new Goods("�㽶","�������㽶",100,400));
		goodsList.add(new Goods("�㽶","�������㽶",100,89));
		goodsList.add(new Goods("ƻ��","�������㽶",34,400));
		goodsList.add(new Goods("�㽶","�������㽶",100,456));
		goodsList.add(new Goods("�㳦","�ǳ���",34,546));
		goodsList.add(new Goods("�㽶","�������㽶",100,89));
		goodsList.add(new Goods("�㽶","�������㽶",23,400));
	}
	private static void addUser(User user) {
		userMap.put(user.getUsername(), user);
	}
	
}

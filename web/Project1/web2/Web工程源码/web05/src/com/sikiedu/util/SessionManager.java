package com.sikiedu.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

public class SessionManager {
	public static Map<String,HttpSession> sessionMap = new HashMap<String,HttpSession >();
}

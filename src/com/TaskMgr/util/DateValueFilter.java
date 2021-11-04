package com.TaskMgr.util;

import java.sql.Date;

import com.alibaba.fastjson.serializer.ValueFilter;

public class DateValueFilter implements ValueFilter {

	@Override
	public Object process(Object arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub
		//fastjson中的过滤器，将null值转为空字符串
		try {
			if (arg2==null && arg0 != null && Date.class.isAssignableFrom(arg0.getClass().getDeclaredField(arg1).getType())) {
				return "";
			}
			if (arg2==null) {
				return "";
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
			return arg2;
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return arg2;
		}
		return arg2;
			
	}

}

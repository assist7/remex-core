package com.july.remex.utils;

import java.util.Collection;

/**
 * 验证工具类
 * 
 * @author Qiaoxin.Hong
 *
 */
public class ValidateUtils {
	/**
	 * 是否为空 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj) {
		if (obj == null)
			return true;
		
		if (obj instanceof String)
			return StringUtils.isBlank((String) obj);
		if (obj instanceof Collection) 
			return ((Collection<?>) obj).size() == 0;
		
		
		return false;
	}
	
	/**
	 * 是否不为空 
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}
}

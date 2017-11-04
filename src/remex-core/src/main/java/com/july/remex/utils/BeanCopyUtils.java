package com.july.remex.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

import com.july.remex.exception.RemexException;

/**
 * bean copy工具类
 * 
 * @author Qiaoxin.Hong
 *
 */
public class BeanCopyUtils {
	
	/**
	 * 拷贝对象属性值到另一个对象
	 * @param to 目标对象
	 * @param from 源对象
	 */
	public static void copyProperties(Object to, Object from) {
		try {
			PropertyUtils.copyProperties(to, from);
		} catch (Exception e) {
			throw new RemexException("Copy properties error!");
		}
	}
	
	/**
	 * 将对象转换为另一个对象
	 * @param toClass
	 * @param from
	 */
	public static <T> T convertBean(Class<T> toClass, Object from) {
		if (toClass == null)
			throw new RemexException("ToClass cannot be null!");
		if (from == null)
			return null;
		
		try {
			T to = toClass.newInstance();
			copyProperties(to, from);
			return to;
		} catch (Exception e) {
			throw new RemexException("Convert bean error!");
		}
	}
	
	/**
	 * 将一个类的list转换为另一个类的list
	 * @param toClass
	 * @param fromList
	 * @return
	 */
	public static <T> List<T> convertBeanList(Class<T> toClass, List<?> fromList) {
		if (toClass == null)
			throw new RemexException("ToClass cannot be null!");
		
		if (fromList == null)
			return null;
		if (fromList.isEmpty())
			return new ArrayList<T>();
		
		List<T> toList = new ArrayList<T>();
		for (Object from : fromList)
			toList.add(convertBean(toClass, from));
		return toList;
	}
	
}

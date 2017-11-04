//package com.july.remex.utils;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 提高代码容错率的一个工具类
// * 
// * @author Qiaoxin.Hong
// *
// */
//public class TolerantUtils {
//	
//	/**
//	 * 在list为null时，返回一个空数量的集合
//	 * @param list
//	 * @return
//	 */
//	public static <T> List<T> defaultList(List<T> list) {
//		return list == null ? new ArrayList<T>() : list;
//	}
//	
//	/**
//	 * 取得默认字符串，null =》 ""
//	 * @param value
//	 * @return
//	 */
//	public static String defaultStr(Object value) {
//		return value == null ? BConst.EMPTY_STR : value.toString().trim();
//	}
//}

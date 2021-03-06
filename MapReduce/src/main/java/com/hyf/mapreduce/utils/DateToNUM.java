package com.hyf.mapreduce.utils;

import java.util.HashMap;

/**
 * DateToNUM的作用是将nginx日志中的英文月份转化为数字
 * @author 黄永丰
 * @createtime 2015年12月22日
 * @version 1.0
 */
public class DateToNUM
{
	public static HashMap map = new HashMap();

	public static void initMap()
	{
		map.put("JAN", "01");
		map.put("FEB", "02");
		map.put("MAR", "03");
		map.put("APR", "04");
		map.put("MAY", "05");
		map.put("JUN", "06");
		map.put("JUL", "07");
		map.put("AUG", "08");
		map.put("SEPT", "09");
		map.put("OCT", "10");
		map.put("NOV", "11");
		map.put("DEC", "12");
	}
}

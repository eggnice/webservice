package com.ws.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 异常处理工具类
 * 
 * @author eggnice
 *
 */
public class AbnormalUtils {

	/**
	 * 获取异常信息
	 * 
	 * @param abnormalType
	 * @param abnormalName
	 * @return
	 */
	public static Object getAbnormal(String abnormalType,String abnormalName){
		List<String> list = new ArrayList<String>();
		list.add("异常类型："+abnormalType);
		list.add("异常点信息："+abnormalName);
		return JsonUtils.toJSON(list,false);
	}
}

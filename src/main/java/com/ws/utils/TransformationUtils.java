package com.ws.utils;

import java.text.DecimalFormat;
/**
 * 进制转换工具
 * 
 * @author eggnice
 *
 */
public class TransformationUtils {
	
	/**
	 * byte 转 TB
	 * 
	 * @param number
	 * @return
	 */
	public static Integer byteTurnTb(Long number){
		Long standard = 1024*1024*1024*1024L;
		float calculation = (float) (number/standard);
		Integer result = Math.round(calculation);
		return result;
	}
	
	/**
	 * GB 转 TB
	 *
	 * @param number
	 * @return
	 */
	public static Integer gbTurnTb(Integer number){
		Integer standard = 1024;
		float result = (float) (number/standard);
		return Math.round(result);
	}
	
	/**
	 * KB 转 TB
	 * 
	 * @param number
	 * @return
	 */
	public static Integer kbTurnGb(Integer number){
		Integer standard = 1024*1024;
		float result = (float) (number/standard);
		return Math.round(result);
	}
	
	/**
	 * Kbps 转 Gbps
	 * 
	 * @param number
	 * @return
	 */
	public static Integer kbpsTurnGbps(Integer number){
		Integer standard = 1000;
		Integer result = (int) (number/standard);
		return result;
	}
	
	/**
	 * KB 转 TB
	 * 
	 * @param number
	 * @return
	 */
	public static Integer mbpsTurnGbps(Integer number){
		Integer standard = 1000*1000;
		Integer result = (int) (number/standard);
		return result;
	}
	
	public static String intTrunStr(Integer var, String company) {
		String s = String.valueOf(var);
		return s + company;
	}
	

}


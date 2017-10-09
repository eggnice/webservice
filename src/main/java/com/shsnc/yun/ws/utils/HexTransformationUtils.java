package com.shsnc.yun.ws.utils;

/**
 * 进制转换工具
 * 
 * @author volitation
 *
 */
public class HexTransformationUtils {
	
	/**
	 * byte 转 TB
	 * 
	 * @param number
	 * @return
	 */
	public static Integer byteTurnTb(Long number){
		Long standard = 1024*1024*1024*1024L;
		Long calculation = (long) (number/standard*0.9);
		Integer result = calculation.intValue();
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
		Integer result = (int) (number/standard*0.9);
		return result;
	}
	
	/**
	 * KB 转 TB
	 * 
	 * @param number
	 * @return
	 */
	public static Integer kbTurnGb(Integer number){
		Integer standard = 1024*1024;
		Integer result = (int) (number/standard*0.9);
		return result;
	}
	

}


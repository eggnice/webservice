package com.shsnc.yun.ws.utils;

import java.io.Reader;
import java.util.List;
import java.util.Map;

/**
 * Json工具类
 * @author volitation
 *
 */
public class JsonUtils {

	private static Jackson jackson = new Jackson();

	static {
	}

	public static String toJSON(Object value) {
		return jackson.toJSON(value);
	}

	public static String toJSON(Object value, boolean indent) {
		return jackson.toJSON(value, indent);
	}

	public static <T> List<T> toList(String json) {
		return jackson.toList(json);
	}

	public static <T> List<T> toList(String json, Class<T> elementClass) {
		return jackson.toList(json, elementClass);
	}

	public static <K, V> Map<K, V> toMap(String json) {
		return jackson.toMap(json);
	}

	public static List<Map<String, Object>> toList(Reader reader) {
		return jackson.toList(reader);
	}

	public static List<Map<String, Object>> toList(Reader reader, boolean closed) {
		return jackson.toList(reader, closed);
	}

	public static <T> T toObject(String text, Class<T> clazz) {
		return jackson.toObject(text, clazz);
	}

}

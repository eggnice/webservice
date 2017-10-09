package com.shsnc.yun.ws.utils;

import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Json接口
 * 
 * @author volitation
 *
 */
public class Jackson {
	private static ObjectMapper objectMapper = new ObjectMapper();

	private static ObjectMapper notIndentObjectMapper = new ObjectMapper();

	static {
		objectMapper = new ObjectMapper();

		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
		objectMapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false);
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); // 允许序列化空的对象,比如Object
		objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		notIndentObjectMapper = new ObjectMapper();

		notIndentObjectMapper.configure(SerializationFeature.INDENT_OUTPUT, false); // false
		notIndentObjectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
		notIndentObjectMapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false);
		notIndentObjectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		notIndentObjectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); // 允许序列化空的对象,比如Object
		notIndentObjectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		notIndentObjectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		notIndentObjectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		notIndentObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	/**
	 * 将对象转换成json格式的字符串
	 * 
	 * @param value
	 *            需要转换的对象
	 * @return json格式的字符串
	 */
	public String toJSON(Object value) {
		try {
			return objectMapper.writeValueAsString(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public String toJSON(Object value, boolean indent) {
		try {
			if (!indent) {
				return notIndentObjectMapper.writeValueAsString(value);
			}
			return objectMapper.writeValueAsString(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将json格式的字符串转换成map类型的List集合
	 * 
	 * @param json
	 *            json格式的字符串
	 * @return List集合
	 */
	public <T> List<T> toList(String json) {
		TypeReference<List<T>> typeReference = new TypeReference<List<T>>() {
		};

		try {
			return objectMapper.readValue(json, typeReference);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将json格式的字符串转换成指定类型的List集合
	 * 
	 * @param json
	 *            json格式的字符串
	 * @param elementClass
	 *            指定类型
	 * @return List集合
	 */
	public <T> List<T> toList(String json, Class<T> elementClass) {
		JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, elementClass);

		try {
			return objectMapper.readValue(json, javaType);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将json格式的字符串转换成指定类型的List集合
	 * 
	 * @param json
	 *            json格式的字符串
	 * @param typeReference
	 *            指定类型
	 * @return List集合
	 */
	public <T> T toObject(String json, TypeReference<T> typeReference) {
		try {
			return objectMapper.readValue(json, typeReference);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将json格式的字符串转换成的Map集合
	 * 
	 * @param json
	 *            json格式的字符串
	 * @return Map集合
	 */
	@SuppressWarnings("unchecked")
	public <K, V> Map<K, V> toMap(String json) {
		try {
			return objectMapper.readValue(json, Map.class);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public List<Map<String, Object>> toList(Reader reader) {
		return toList(reader, true);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> toList(Reader reader, boolean closed) {
		try {
			List<Map<String, Object>> readValue = objectMapper.readValue(reader, List.class);
			if (closed) {
				reader.close();
			}
			return readValue;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 将将json格式的字符串转换成的指定类型的对象
	 * 
	 * @param text
	 *            json格式的字符串
	 * @param clazz
	 *            指定类型的对象
	 * @return 指定类型的数据
	 */
	public <T> T toObject(String text, Class<T> clazz) {
		try {
			return objectMapper.readValue(text, clazz);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public ObjectMapper bulid() {
		return objectMapper;
	}

	public ObjectMapper bulidNotIndent() {
		return notIndentObjectMapper;
	}
}

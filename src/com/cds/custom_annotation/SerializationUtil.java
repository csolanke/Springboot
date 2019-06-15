package com.cds.custom_annotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class SerializationUtil {

	public static String serialze(Object student) throws IllegalAccessException {
		checkIfSerializable(student);
		return returnJsonString(student);

	}

	private static String returnJsonString(Object student) throws IllegalAccessException {
		Map<String, String> jsonMap = new HashMap<>();
		for (Field field : student.getClass().getDeclaredFields()) {
			jsonMap.put(field.getName(), (String) field.get(student));
		}

		String collect = jsonMap.entrySet().stream()
				.map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
				.collect(Collectors.joining(","));
		return "{" + collect + "}";
	}

	private static void checkIfSerializable(Object o) {
		if (Objects.isNull(o)) {
			throw new JsonSerializationException("Object is not serializable");
		}
		Class<? extends Object> clazz = o.getClass();
		if (!clazz.isAnnotationPresent(JsonSerializer.class)) {
			throw new JsonSerializationException("Json Serializable annotation is not present on " + clazz.getName());
		}
	}

}

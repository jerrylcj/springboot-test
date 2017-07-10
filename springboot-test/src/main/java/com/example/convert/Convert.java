package com.example.convert;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Convert {

	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Student1 s1 = new Student1();
		s1.setAge(18);
		s1.setName("jerry");
		s1.setSex(10);
		
		Student2 s2 = new Student2();
		
		convertObject(s1, s2);
		
		s2.getAge_2();
		
	}
	
	
	public static void convertObject(Object from, Object to) throws IllegalArgumentException, IllegalAccessException{
		Map<String, Object> m = new HashMap<String, Object>();
		Method[] ms = from.getClass().getDeclaredMethods();
		for (Method method : ms) {
			
		}
		
		Field[] fs = from.getClass().getDeclaredFields();
		
		for (Field field : fs) {
			field.setAccessible(true);
			Object value = field.get(from);
			String name = field.getName();
			m.put(name, value);
		}
		
		Field[] f = to.getClass().getDeclaredFields();
		
		for (Field field : f) {
			
			if(field.isAnnotationPresent(Reflection.class)){
				Reflection reflection = field.getAnnotation(Reflection.class);
				
				String value = reflection.value();
				field.setAccessible(true);
				field.set(to, m.get(value));
				continue;
			} else {
				String name = field.getName();
				
				if(m.get(name) != null){
					field.setAccessible(true);
					field.set(to, m.get(name));
				}
				continue;
			}
			
		}
		
	}
}

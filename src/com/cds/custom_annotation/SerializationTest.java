package com.cds.custom_annotation;

public class SerializationTest {
	
	public static void main(String[] args) throws IllegalAccessException {
		
	Student student = new Student("Chandrakant", "17", "csolanke77@gmail.com", "XII");
	
	System.out.println(SerializationUtil.serialze(student));
	
		
		
		
	}

}

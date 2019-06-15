package com.baeldung.customannotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SmartPhone
{
  String os() default "MAC";
  int size() default 5;
	
}

@SmartPhone(os="Android",size=6)
public class Nokia {
	
	String modelNumber;
	int screenSize;
	
	public Nokia(String modelNumber, int screenSize) {
		super();
		this.modelNumber = modelNumber;
		this.screenSize = screenSize;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	
	public static void main(String[] args) {

		Nokia nokia = new Nokia("7210", 6);
		
		Class<? extends Nokia> clazz = nokia.getClass();
		
		Annotation annotation = clazz.getAnnotation(SmartPhone.class);
		
		SmartPhone phn =(SmartPhone) annotation;
		
		System.out.println(phn.os());
		System.out.println(phn.size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

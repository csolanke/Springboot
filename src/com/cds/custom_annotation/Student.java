package com.cds.custom_annotation;

@JsonSerializer
public class Student {
	
	@JsonElement
	String name;
	
	@JsonElement
	String studentId;
	
	@JsonElement
	String email;
	
	@JsonElement
	String className;
	
	public Student(String name, String studentId, String email, String className) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.email = email;
		this.className = className;
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	
	
	
	
	

}

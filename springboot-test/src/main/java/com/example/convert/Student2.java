package com.example.convert;

public class Student2 {
	@Reflection(value="age")
	private Integer age_2;
	@Reflection(value="name")
	private String name_2;
	//@Reflection(value="sex")
	private int sex;

	public Integer getAge_2() {
		return age_2;
	}

	public void setAge_2(Integer age_2) {
		this.age_2 = age_2;
	}

	public String getName_2() {
		return name_2;
	}

	public void setName_2(String name_2) {
		this.name_2 = name_2;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	
}

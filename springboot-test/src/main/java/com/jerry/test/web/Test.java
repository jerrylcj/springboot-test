package com.jerry.test.web;

public class Test {
	
	public static void main(String[] args) {
		
		try{
			throw new RuntimeException("1");
		}catch (Exception e) {
			System.out.println("进入catch");
			e.printStackTrace();
		}
		
		
		
		
		
	}

}

package com.demo1.onlineshopping.demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	@BeforeMethod
	public void m2(){
		System.out.println("before method");
	}
	@Test
	public void m1(){
	System.out.println("in m1 method");
	}
	
	@Test
	public void a1(){
	System.out.println("in a1 method");
	}
	@AfterMethod
	
	
	public void m3(){
		System.out.println("after method");
	}
	public void m4(){
		System.out.println("after  m41 method");

	}
	}




	

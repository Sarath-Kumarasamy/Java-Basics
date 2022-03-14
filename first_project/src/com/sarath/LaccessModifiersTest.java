package com.sarath;

public class LaccessModifiersTest
{
	int i =10;
	public int j = 20;
	private int k = 30;
	protected int l = 40;
	
	void show1()
	{
		System.out.println("default class");
		System.out.println("default method");
		System.out.println(i + " " + j + " " + k + " " + l);
	}
	
	public void show2()
	{
		System.out.println("public class");
		System.out.println(i + " " + j + " " + k + " " + l);
	}
	
	private void show3()
	{
		System.out.println("private class");
		System.out.println(i + " " + j + " " + k + " " + l);
	}
	
	protected void show4()
	{
		System.out.println("protected class");
		System.out.println(i + " " + j + " " + k + " " + l);
	}

	
}


package com.methodexamples;

public class overridingex 
{
public void show(int i)
{
		System.out.println("int value" + i);
}

}

class display extends overridingex 
{
	public void show(int i, float f) 
	
	{
		System.out.println("int value" + i + "float value " + f);

	}

	public static void main(String[] args) 
	{
		display obj = new display();
		obj.show(10,20f);
		obj.show(10);

		
	}

}

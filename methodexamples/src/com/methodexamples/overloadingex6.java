package com.methodexamples;

public class overloadingex6
{
	
	    public void display(Object obj) 
	    {
	        System.out.println("Object value");
	    }
	    public void display(String str)
	    {
	        System.out.println("String value"+str);
	    }
	    public void display(int i)
	    {
	        System.out.println("int value"+i);
	    }
	    public static void main(String[] args) 
	    {
	        overloadingex6 overloadObj = new overloadingex6();
	        overloadObj.display(10);
	        overloadObj.display( null);
	        overloadObj.display( null);
	    }
}


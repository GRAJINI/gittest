package com.methodexamples;
public class polyndrome 
{
public static void main(String[] args)
{
	
int i=454;
int sum=0,r=0;

 r =i%10;
 sum=sum*10+r;
 i=i/10;
   
 
System.out.println(i==sum);
}
}

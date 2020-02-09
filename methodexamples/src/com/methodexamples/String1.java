package com.methodexamples;

public class String1 
{
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = str1;
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}




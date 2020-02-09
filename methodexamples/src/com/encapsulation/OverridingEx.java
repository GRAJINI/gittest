package com.encapsulation;

/*class Parent 
{
    public void show(int i)
    {
        System.out.println("inside super show");
    }
}
 
class Child extends Parent 
{
    public void show (int  i)
    {
        System.out.println("inside sub show");
    }
}
 
public class OverridingEx
{
    public static void main(String[] args)
    {
        Parent parent = new Child();
        parent.show(10);
    }
}
*/
/*class Parent
{
void show(dint i)
{
    System.out.println("inside super show");
}
 
}
 
class Child extends Parent 
{
    public void show(int i)
    {
        System.out.println("inside sub show");
    }
}
 
public class OverridingEx
{
    public static void main(String[] args) 
    {
        Parent parent = new Child();
        parent.show(10);
    }
}*/
class Parent
{
 void show(String s)
{
    System.out.println("inside super show");
}
 
}
 
class Child extends Parent 
{
    public void show(int i)
    {
        System.out.println("inside sub show");
    }
}
 
public class OverridingEx
{
    public static void main(String[] args) 
    {
    	Parent p=new Parent();
    	p.show("rajini");
    	//p.show(10);
        //Child child = new Child();
       // child.show(10);
        //child .show("rajini");
    }

}
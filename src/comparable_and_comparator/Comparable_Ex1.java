package comparable_and_comparator;

import java.util.*;
public class Comparable_Ex1 
{
	public static void main(String []args)
	{
		Student s1=new Student("Abhi",21);
		Student s2=new Student("Anku",20);
		
		if(s1.compareTo(s2)>0)
		{
			System.out.println(s1.name+" is elder than "+s2.name);
		}
	}
}

class Student implements Comparable
{
	public String name;
	public int age;
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Object o)
	{
		Student a=(Student)o;
		return this.age-a.age;
	}
}
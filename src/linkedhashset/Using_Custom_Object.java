package linkedhashset;

import java.util.*;
public class Using_Custom_Object 
{
	public static void main(String []args)
	{
		LinkedHashSet<Person> p=new LinkedHashSet<>();
		p.add(new Person("Alice",30));
		p.add(new Person("Bob",25));
		p.add(new Person("Alice",30));
		System.out.println(p);
	}
}

class Person
{
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "Name : "+name+", Age : "+age;
	}
	
}

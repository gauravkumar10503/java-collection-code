package comparable_and_comparator;

import java.util.*;
public class Employee_Comparable 
{
	public static void main(String []args)
	{
		TreeSet<Employee> t=new TreeSet<>();
		t.add(new Employee("Gaurav",23,50000));
		t.add(new Employee("Anku",24,60000));
		t.add(new Employee("Tek",40,50000));
		t.add(new Employee("Ritu",22,50000));
		System.out.println(t);
	}
}

class Employee implements Comparable
{
	public String name;
	public Integer age;
	public double sal;
	public Employee(String name,int age,double sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	
	//overriding compareto method based on name
	public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		return this.name.compareTo(e.name);
	}
	
	//overriding tostring method
	public String toString()
	{
		return "Name :"+name+", Age :"+age+", Sal :"+sal;
	}
}

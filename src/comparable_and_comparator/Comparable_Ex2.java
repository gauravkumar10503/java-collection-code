package comparable_and_comparator;
import java.util.*;
public class Comparable_Ex2 
{
	public static void main(String []args)
	{
		TreeSet<Students> count=new TreeSet<>();
		count.add(new Students("B",21));
		count.add(new Students("D",23));
		count.add(new Students("A",22));
		count.add(new Students("C",22));
		System.out.println(count);
	}
}

class Students implements Comparable
{
	String name;
	int age;
	public Students(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	//override
	public int compareTo(Object o)
	{
		Students a=(Students)o;
		return a.name.compareTo(this.name);	
	}
	//overriding tostring method
	public String toString()
	{
		return "NAME :- "+name+", AGE :- "+age;
	}
}

package comparable_and_comparator;

import java.util.*;
public class Thencomparing_Method 
{
	public static void main(String []args)
	{
		List<Items> li=Arrays.asList(new Items("Apple",2.9),new Items("Banana",1.4),new Items("Apple",2.9),new Items("Orange",3.7));
		System.out.println("Before sorting :- "+li);
		
		li.sort(Comparator.comparing(Items::getname).thenComparing(Items::getprice));
		System.out.println("After sorting :- "+li);
	}
}

class Items
{
	String name;
	double price;
	public Items(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	
	//getter method
	public double getprice()
	{
		return price;
	}
	
	//getter method
	public String getname()
	{
		return name;
	}
	
	//overriding tostring method
	public String toString()
	{
		return "Name : "+name+", Price : "+price;
	}
}

package comparable_and_comparator;

import java.util.*;
public class Compairingdouble_Method 
{
	public static void main(String []args)
	{
		ArrayList<Bottle1> ab1=new ArrayList<>();
		ab1.add(new Bottle1("Red",2.3));
		ab1.add(new Bottle1("Yellow",1.5));
		ab1.add(new Bottle1("Green",3.4));
		
		//inbulit method
		Comparator cmp=Comparator.comparingDouble(Bottle1::getcap);
		Collections.sort(ab1,cmp);
		System.out.println(ab1);
		
		//first check length then go for capacity
		Comparator cmp2=Comparator.comparingInt(Bottle1::getlength).thenComparingDouble(Bottle1::getcap);
		Collections.sort(ab1,cmp2);
		System.out.println(ab1);
	}
}

class Bottle1
{
	String color1;
	double capacity1;
	public Bottle1(String color1,double capacity1)
	{
		this.color1=color1;
		this.capacity1=capacity1;
	}
	
	public String toString()
	{
		return "Color :"+color1+"["+capacity1+"]";
	}
	
	public double getcap()
	{
		return capacity1;
	}
	
	public int getlength()
	{
		return color1.length();
	}
}

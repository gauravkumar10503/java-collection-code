package comparable_and_comparator;

import java.util.*;
public class Userdefined_Class_Comparable 
{
	public static void main(String []args)
	{
		ArrayList<Bottle0> ai0=new ArrayList<>();
		ai0.add(new Bottle0("Blue",1.5));
		ai0.add(new Bottle0("Red",2.8));
		ai0.add(new Bottle0("White",3.7));
		Collections.sort(ai0);
		System.out.println(ai0);
		
	}
}

class Bottle0 implements Comparable<Bottle0>
{
	String color0;
	double capacity0;
	public Bottle0(String color0,double capacity0)
	{
		this.color0=color0;
		this.capacity0=capacity0;
	}
	public int compareTo(Bottle0 o)
	{
		return (int)(this.capacity0-o.capacity0);
	}
	public String toString()
	{
		return "Color : "+color0+"["+capacity0+"]";
	}
	
}
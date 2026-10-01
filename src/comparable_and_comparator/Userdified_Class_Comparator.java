package comparable_and_comparator;

import java.util.*;
public class Userdified_Class_Comparator 
{
	public static void main(String []args)
	{
		ArrayList<Bottle> ab=new ArrayList<>();
		ab.add(new Bottle("Red",2));
		ab.add(new Bottle("Green",2.5));
		ab.add(new Bottle("Yellow",1.5));
		Collections.sort(ab,new Bottlecomparator());
		System.out.println(ab);
		
	}
}

class Bottlecomparator implements Comparator<Bottle>
{
	public int compare(Bottle o1,Bottle o2)
	{
		return (int) (o2.capacity-o1.capacity);
	}

}

class Bottle
{
	String color;
	double capacity;
	public Bottle(String color,double capacity)
	{
		this.color=color;
		this.capacity=capacity;
	}
	public String toString()
	{
		return "Color : "+color+"[capaacity"+capacity+"]";
	}
}

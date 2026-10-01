package treeset;

import java.util.*;
public class Descending_Sorted 
{
	public static void main(String []args)
	{
		TreeSet<String> ds=new TreeSet<>();
		ds.add("apple");
		ds.add("cherry");
		ds.add("orange");
		
		for(String e : ds.descendingSet())
		{
			//descendingSet is bulit in method
			System.out.println(e);
		}
	}
}

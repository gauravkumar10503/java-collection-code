package navigableset;

import java.util.*;
public class Navigableset_Ex1 
{
	public static void main(String []args)
	{
		NavigableSet<Integer> ni=new TreeSet<>(List.of(10,20,30,40,50,60,70));
		System.out.println(ni);
		
		System.out.println("lower(25) : "+ni.lower(25));
		System.out.println("floor(59) : "+ni.floor(59));
		System.out.println("ceiling(11) : "+ni.ceiling(11));
		System.out.println("higher(42) : "+ni.higher(42));
		
	}
}

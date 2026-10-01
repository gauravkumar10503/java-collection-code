package treeset;

import java.util.*;
public class Remove_Largest_And_Smallest 
{
	public static void main(String []args)
	{
		TreeSet<Integer> ls=new TreeSet<>(Arrays.asList(4,1,5,9,2));
		popmaxmin(ls);
		System.out.println(ls);
	}
	public static void popmaxmin(TreeSet<Integer>ls)
	{
		if(!ls.isEmpty())
		{
			System.out.println("Min :- "+ls.pollFirst());
			System.out.println("Max :- "+ls.pollLast());
		}
		
	}
}

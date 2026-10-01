package treeset;

import java.util.*;
public class Successor_And_Predecessor 
{
	public static void main(String []args)
	{
		TreeSet<Integer> sp=new TreeSet<>(Arrays.asList(1,9,7,5,8));
		nextpre(sp,7);
	}
	public static void nextpre(TreeSet<Integer> sp,int key)
	{
		System.out.println("Predecessor :- "+sp.lower(key));
		System.out.println("Successor :- "+sp.higher(key));
	}
}

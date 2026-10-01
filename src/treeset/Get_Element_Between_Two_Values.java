package treeset;

import java.util.*;
public class Get_Element_Between_Two_Values 
{
	public static void main(String []args)
	{
		TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(10,20,30,40,50));
		System.out.println(between(ts,30,80));
	}
	public static SortedSet<Integer>between(TreeSet<Integer>ts,int low,int high)
	{
		return ts.subSet(low,true,high,true);
	}
	
}

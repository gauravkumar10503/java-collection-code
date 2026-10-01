package treeset;

import java.util.*;
public class Find_Next_Higher 
{
	public static void main(String []args)
	{
		TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(10,20,30,40,50));
		System.out.println(nexthigh(ts,25));
	}
	public static Integer nexthigh(TreeSet<Integer>ts,int key)
	{
		return ts.higher(key);//in bulid method
	}
}

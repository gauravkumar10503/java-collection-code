package treeset;

import java.util.*;
public class Remove_Duplicate_Sort_Array 
{
	public static void main(String []args)
	{
		int []a= {1,2,5,6,5,2,8};
		System.out.println(uniquesort(a));
	}
	public static List<Integer> uniquesort(int []a)
	{
		TreeSet<Integer> ts=new TreeSet<>();
		for(int n : a )
		{
			ts.add(n);
		}
		return new ArrayList<>(ts);
	}
}

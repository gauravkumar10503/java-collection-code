package treeset;

import java.util.*;
public class Merge_Two_Sort_Set 
{
	public static void main(String []args)
	{
		System.out.println(merge(Arrays.asList(2,3,4,5),Arrays.asList(5,6,7,8,9)));
	}
	public static TreeSet<Integer>merge(List<Integer>a,List<Integer>b)
	{
		TreeSet<Integer> mt=new TreeSet<>(a);
		mt.addAll(b);
		return mt;
	}
}

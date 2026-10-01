package hashset;

import java.util.*;
public class Intersection_Of_Two_Hashset 
{
	public static void main(String []args)
	{
		HashSet<Integer> hi=new HashSet<>(Set.of(1,2,3,4,5));
		HashSet<Integer> hi2=new HashSet<>(Set.of(4,5,7,8));
		
		hi.retainAll(hi2);//here only intersected elements came into light
		System.out.println("Intersection elements of the given two hashset is :- "+hi);
		
	}
}

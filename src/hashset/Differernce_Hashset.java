package hashset;

import java.util.*;
public class Differernce_Hashset 
{
	public static void main(String []args)
	{
		HashSet<Integer> dh=new HashSet<>(Set.of(1,2,3));
		HashSet<Integer> dh2=new HashSet<>(Set.of(2,5));
		
		HashSet<Integer> diff=new HashSet<>(dh);//here we're storing dh in diff 
		diff.removeAll(dh2);//bulit in set method
		System.out.println("Difference of dh-dh2 is :- "+diff);
	}
}

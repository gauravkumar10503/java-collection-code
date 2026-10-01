package hashset;

import java.util.*;
public class Symmetric_Difference_Hashset 
{
	public static void main(String []args)
	{
		HashSet<Integer> hu=new HashSet<>(Set.of(1,2,3));
		HashSet<Integer> hu2=new HashSet<>(Set.of(2,3,4,5));
		
		//union compute
		HashSet<Integer> union=new HashSet<>(hu);
		union.addAll(hu2);
		System.out.println("Union of hashset :- "+union);
		
		//intersection compute
		HashSet<Integer> is=new HashSet<>(hu);
		is.retainAll(hu2);
		System.out.println("Intersect elements of hashset :- "+is);
		
		//symmertric difference
		union.removeAll(is);
		System.out.println("Symmetric difference is :- "+union);
	}
}

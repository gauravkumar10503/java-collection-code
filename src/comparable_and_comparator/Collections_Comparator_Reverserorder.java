package comparable_and_comparator;

import java.util.*;
public class Collections_Comparator_Reverserorder 
{
	public static void main(String []args)
	{
		List<Integer> cc=Arrays.asList(10,2,30,44,11);
		Collections.sort(cc,Comparator.reverseOrder());
		System.out.println(cc);
		
		Collections.sort(cc,Collections.reverseOrder());
		System.out.println(cc);
	}
}

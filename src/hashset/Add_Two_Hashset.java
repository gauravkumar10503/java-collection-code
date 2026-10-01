package hashset;

import java.util.*;
public class Add_Two_Hashset 
{
	public static void main(String []args)
	{
		HashSet<Integer> ah=new HashSet<>(Set.of(1,2,3,4,5));
		HashSet<Integer> ah2=new HashSet<>(Set.of(4,7,5,8));
		
		ah.addAll(ah2);//here we're adding ah2 hashset in ah
		System.out.println("Union of two set is :-"+ah);
	}
}

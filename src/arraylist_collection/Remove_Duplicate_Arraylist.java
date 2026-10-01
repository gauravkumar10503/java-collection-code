/*Remove duplicates from an ArrayList (preserve insertion order)
Question: Given an ArrayList<Integer> (or generic ArrayList<T>), remove 
duplicate entries so that only the first occurrence of each value remains, 
and the insertion order is preserved. Return the deduplicated list.*/

package arraylist_collection;
import java.util.*;
public class Remove_Duplicate_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<>(List.of(1,10,2,2,10,3,3,3,4,5,5));
		System.out.println("Original :- "+list);
		ArrayList<Integer> unique=removeduplicate(list);
		System.out.println("without duplicates :- "+unique);
	}
	
	public static <T> ArrayList<T> removeduplicate(ArrayList<T>list)
	{
		//use linkedhashset to remove duplicates while preserving insertion order
		LinkedHashSet<T> set=new LinkedHashSet<>(list);
		
		//clear original list and add back unique elements
		list.clear();
		list.addAll(set);
		return list;
	}
}

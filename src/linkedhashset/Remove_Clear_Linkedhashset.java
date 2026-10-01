/*Description: Remove an element and then clear the set.
Input: ["Apple", "Banana", "Cherry"], remove "Banana"
Expected Output:
LinkedHashSet after removal: [Apple, Cherry]
LinkedHashSet after clearing: []*/

package linkedhashset;

import java.util.*;
public class Remove_Clear_Linkedhashset 
{
	public static void main(String []args)
	{
		LinkedHashSet<String> rch=new LinkedHashSet<>(Set.of("Apple","Banana","Cherry"));
		System.out.println("Original linkedhashset :- "+rch);
		
		//removing element from linkedhashset
		rch.remove("Apple");
		System.out.println("Before removal :- "+rch);
		
		//clear the linkedhashset
		rch.clear();
		System.out.println("Before clear the linkedhashset :- "+rch);
	}
}

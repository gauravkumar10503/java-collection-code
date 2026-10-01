/*Description: Iterate and print elements in insertion order.
Input: [1, 2, 3, 4, 5]
Output:
Element is 1
Element is 2
Element is 3
Element is 4
Element is 5*/

package linkedhashset;

import java.util.*;
public class Iterator_Insertion_Order 
{
	public static void main(String []args)
	{
		LinkedHashSet<Integer> li=new LinkedHashSet<>(List.of(1,2,3,4,5));
		for(Integer i : li)
		{
			System.out.println("Element is :- "+i);
		}
	}
}

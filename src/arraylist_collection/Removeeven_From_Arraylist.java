/*Remove all even numbers from ArrayList<Integer> safely
Question: Given an ArrayList<Integer>, remove all elements that satisfy a 
certain condition (e.g. all even numbers). Make sure to handle iteration 
properly (avoid ConcurrentModificationException).
*/

package arraylist_collection;

import java.util.ArrayList;
import java.util.List;

public class Removeeven_From_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
		System.out.println("Original data :- "+al);
		
		//only even number will be printed
		for(int element:al)
		{
			if(element%2==0)
			{
				System.out.print(element+" ");
			}
		}
	}
}

/*Remove all odd numbers from ArrayList<Integer> safely
Question: Given an ArrayList<Integer>, remove all elements that satisfy a 
certain condition (e.g. all even numbers). Make sure to handle iteration 
properly (avoid ConcurrentModificationException).
*/
package arraylist_collection;

import java.util.ArrayList;
import java.util.List;

public class Removeodd_From_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,7));
		System.out.println("Original data :- "+al2);
		
		for(Integer element:al2)
		{
			if(element%2!=0)
			{
				System.out.print(element+" ");
			}
		}
	}
}

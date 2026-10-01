/*Sort an ArrayList in descending order
Question: Given an ArrayList<String> or ArrayList<Integer>, sort its elements
in descending order.
*/

package arraylist_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sort_Arraylist
{
	public static void main(String []args)
	{
		ArrayList<String> list=new ArrayList<>(List.of("India","USA","Australia","Japan"));
		System.out.println("Before sort : "+list);
		
		//sort in descending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After descending sort :- "+list);
	}
}

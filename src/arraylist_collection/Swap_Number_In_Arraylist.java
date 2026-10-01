//Swap two elements in an ArrayList at given indices.
package arraylist_collection;
import java.util.*;
public class Swap_Number_In_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> swl=new ArrayList<>(List.of(1,2,3,4,5,6));
		Collections.swap(swl, 2, 5);
		//Collections.swap(swl, 5, 3);
		System.out.println(swl);
	}
}

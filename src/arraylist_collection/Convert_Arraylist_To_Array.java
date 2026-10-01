/*Convert an ArrayList to an Array
Question: Given an ArrayList<String> (or of any object type), convert it to a 
native array (String[] or corresponding type).
*/
package arraylist_collection;

import java.util.ArrayList;
import java.util.List;

public class Convert_Arraylist_To_Array 
{
	public static void main(String []args)
	{
		ArrayList<String> list=new ArrayList<>(List.of("Alice","Bob","King"));
		String []a=list.toArray(new String[0]);
		System.out.println("Arraylist :- "+list);
		
		System.out.println("Native array :- ");
		for(String element :a)
		{
			System.out.print(element+" ");
		}
	}
}

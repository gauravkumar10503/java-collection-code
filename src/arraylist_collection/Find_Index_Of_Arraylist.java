//Find the index of "banana" in an ArrayList of fruits.
package arraylist_collection;
import java.util.*;
public class Find_Index_Of_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<String> inl=new ArrayList<>(List.of("apple","orange","banana"));
		
		/*int index=inl.indexOf("banana");
		System.out.println(index);
		inbulid method
		*/
		
		//manual method
		for(int i=0;i<=inl.size()-1;i++)
		{
			if(inl.get(i).equals("banana"))
			{
				System.out.println(i);
				break;
			}
		}
	}
}

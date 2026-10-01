//Given an ArrayList of strings, count how many times "apple" appears.
package arraylist_collection;
import java.util.*;
public class Count_Occurence_In_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<String> ls=new ArrayList<>(List.of("apple","orange","apple"));
		int count=0;
		for(String e : ls)
		{
			if(e.equals("apple"))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}

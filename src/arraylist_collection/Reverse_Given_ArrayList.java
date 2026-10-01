//Reverse the elements of an ArrayList without using Collections.reverse().
package arraylist_collection;
import java.util.*;
public class Reverse_Given_ArrayList 
{
	public static void main(String []args)
	{
		ArrayList<Integer> rel=new ArrayList<>(List.of(1,4,5,7,8,3));
		Collections.reverse(rel);
		System.out.println("Reverse arraylist :- "+rel);
	}
}

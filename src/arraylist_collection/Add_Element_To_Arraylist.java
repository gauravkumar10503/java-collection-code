/*Write a Java program to create an ArrayList of integers, 
add numbers at 4, and print all elements.*/

package arraylist_collection;
import java.util.*;
public class Add_Element_To_Arraylist
{
	public static void main(String []args)
	{
		ArrayList<Integer> a=new ArrayList<>(List.of(1,2,3,4,5));
		a.add(4,45);
		System.out.println(a);
	}
}

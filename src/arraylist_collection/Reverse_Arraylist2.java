/*Reverse an ArrayList — with and without built-in methods

Question:Given an ArrayList<Integer> (or any type),reverse the order of its elements. 
Provide two solutions: one using built-in library methods, and another manually 
(without built-in reverse).
*/
package arraylist_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Arraylist2 
{
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6));
		System.out.println("Original :- "+list);
		
		ArrayList<Integer> copy1=new ArrayList<>(list);
		System.out.println("Reversed (bulid in): "+reversewithbulitin(copy1));
		
		ArrayList<Integer> copy2=new ArrayList<>(list);
		System.out.println("Reversed (mannual method ): "+reversemanual(copy2));
	}
	
	//Methode 1 :- using bulit in  collections.reverse()
	public static <T> ArrayList <T> reversewithbulitin(ArrayList <T> list)
	{
		Collections.reverse(list);
		return list;
	}
	
	//Methode 2 : manual reverse without extra library (using additional list)
	public static <T>ArrayList <T> reversemanual(ArrayList<T> list)
	{
		ArrayList<T> reversed=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--)
		{
			reversed.add(list.get(i));
		}
		return reversed;
	}
}

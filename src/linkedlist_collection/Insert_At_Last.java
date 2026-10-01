package linkedlist_collection;
import java.util.*;
public class Insert_At_Last 
{
	public static void main(String []args)
	{
		//here i'm creating a linkedlist
		LinkedList<Integer> le=new LinkedList<>(List.of(2,3,4,5,6));
		System.out.println("Original linkedlist :- "+le);
		
		//here i'm insert element in last 
		le.addLast(9);
		System.out.println("After inserting element in linkedlist :- "+le);
	}
}

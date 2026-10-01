package linkedlist_collection;
import java.util.*;
public class Delete_First_Element 
{
	public static void main(String []args)
	{
		//here i'm creating a linkedlist
		LinkedList<Integer> dl=new LinkedList<>(List.of(1,2,3,4,5));
		System.out.println("Original linkedlist :- "+dl);
		
		//here i'm remove the first element of the linkedlist
		dl.removeFirst();
		System.out.println("New linkedlist :- "+dl);
	}
}

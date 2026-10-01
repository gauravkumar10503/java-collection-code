package linkedlist_collection;
import java.util.*;
public class Delete_Index_By_Value 
{
	public static void main(String []args)
	{
		LinkedList<Integer> div=new LinkedList<>(List.of(1,2,3,4,5));
		System.out.println("Original linkedlist :- "+div);
		
		div.remove(2);
		System.out.println("New linkedlist :- "+div);
	}
}

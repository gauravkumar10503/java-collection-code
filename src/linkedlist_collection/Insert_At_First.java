package linkedlist_collection;
import java.util.*;
public class Insert_At_First 
{
	public static void main(String []args)
	{
		//here i'm creating a likedlist
		LinkedList<Integer> il=new LinkedList<>(List.of(5,6,7,8,9));
		System.out.println("Original linkedlist :- "+il);
		
		//here i'm adding element in existing linkedlist at first
		il.addFirst(4);
		System.out.print("Befor inset at first place :- "+il);
	}
}

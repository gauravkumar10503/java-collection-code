package linkedlist_collection;
import java.util.*;
public class Likedlist_To_Array
{
	public static void main(String []args)
	{
		//here i'm creating linkedlist
		LinkedList<Integer> la=new LinkedList<>(List.of(1,2,3,4,5));
	
		//here i'm converting linkedlist to array
		Integer[]arr=la.toArray(new Integer[0]);
		
		//the output will be a array not likedlist
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

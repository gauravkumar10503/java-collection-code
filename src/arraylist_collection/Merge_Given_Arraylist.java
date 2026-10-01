//Given two ArrayLists, merge them into a third one.
package arraylist_collection;
import java.util.*;
public class Merge_Given_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> l1=new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> l2=new ArrayList<>(List.of(6,7,5,8,9));
		ArrayList<Integer> l3=new ArrayList<>();
		l3.addAll(l1);
		l3.addAll(l2);
		System.out.println(l3);
	}
}

package arraylist_collection;
//import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList <Integer> al=new ArrayList(List.of(11,12,13,14,15));
		System.out.println(reversearraylist(al));
	}
	public static <T> ArrayList<T> reversearraylist(ArrayList<T>list)
	{
		/*Collections.reverse(list);
		return list;
		inbulid method
		*/
		
		ArrayList<T> reversed=new ArrayList<T>();
		for(int i=list.size()-1;i>=0;i--)
		{
			reversed.add(list.get(i));
		}
		return reversed;
	}
}

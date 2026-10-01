package comparable_and_comparator;

import java.util.*;
public class Convert_To_List 
{
	public static void main(String []args)
	{
		HashSet<Integer> ch=new HashSet<>(Arrays.asList(1,2,3,4,5));
		List<Integer> li=new ArrayList(ch);
		Collections.sort(li);
		System.out.println(li);
	}
}

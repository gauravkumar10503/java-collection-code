package comparable_and_comparator;

import java.util.*;
public class Sort_Method_Comparator 
{
	public static void main(String []args)
	{
		ArrayList<Integer> ai=new ArrayList<>(List.of(6,4,9,3,7));
		Collections.sort(ai,new Mycomparator5());
		System.out.println(ai);
	}
}

class Mycomparator5 implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		return o2-o1;
	}
}

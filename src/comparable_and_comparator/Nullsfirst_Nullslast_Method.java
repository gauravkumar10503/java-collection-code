package comparable_and_comparator;

import java.util.*;
public class Nullsfirst_Nullslast_Method 
{
	public static void main(String []args)
	{
		List<String> nnl=Arrays.asList("Apple","Orange","Cherry","Mango");
		System.out.println("Original list :- "+nnl);
		
        //nullsfirst in natural order
        nnl.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("Nullsfirst and naturalorder :- "+nnl);
        
        //nullslast with reversed order
        nnl.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        System.out.println("Nullslast and naturalorder :- "+nnl);
        

	}
}

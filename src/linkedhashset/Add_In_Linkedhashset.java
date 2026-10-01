/*Description: Add elements including a duplicate.
Input: ["Volvo", "BMW", "Ford", "BMW", "Mazda"]
Expected Output: [Volvo, BMW, Ford, Mazda]*/

package linkedhashset;

import java.util.*;
public class Add_In_Linkedhashset 
{
	public static void main(String []args)
	{
		LinkedHashSet<String> lh=new LinkedHashSet<>();
		lh.add("BMW");
		lh.add("Tata");
		lh.add("BMW");//duplicate will be ignored
		lh.add("Ford");
		System.out.println(lh);
	}
}

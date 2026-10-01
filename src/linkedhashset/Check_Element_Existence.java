/*Description: Use contains() to check presence of elements.
Input: ["Apple", "Banana", "Cherry"] with queries Banana, Mango
Expected Output:
true
false*/

package linkedhashset;

import java.util.*;
public class Check_Element_Existence 
{
	public static void main(String []args)
	{
		LinkedHashSet<String> le=new LinkedHashSet<>(Set.of("Banana","Apple","Cherry"));
		System.out.println(le.contains("Banana"));
		System.out.println(le.contains("Mango"));
	}
}

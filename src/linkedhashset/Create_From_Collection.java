/*Description: Construct a LinkedHashSet from a list.
Input: ["Alice", "Bob", "Alice", "David", "Bob"]
Expected Output: [Alice, Bob, David]
*/

package linkedhashset;

import java.util.*;
public class Create_From_Collection 
{
	public static void main(String []args)
	{
		List<String> n=Arrays.asList("Alice","Bob","Alice","David","Bob");
		LinkedHashSet<String> u=new LinkedHashSet<>(n);
		System.out.println("Unique name :- "+u);
	}
}

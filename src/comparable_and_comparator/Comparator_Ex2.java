/*wapt sort given strings according to length,use treeset
 * input: run,house,jump,respect,orange
 * output: run,jump,house,orange,respect
 */

package comparable_and_comparator;

import java.util.*;
public class Comparator_Ex2 
{
	public static void main(String []args)
	{
		TreeSet<String> t1=new TreeSet<>(new Mycomparator2());
		//if we don't write new mycomparator method here it will print in default order(Ascending order)
		t1.add("run");
		t1.add("house");
		t1.add("jump");
		t1.add("respect");
		t1.add("orange");
		System.out.println(t1);
	}
}

class Mycomparator2 implements Comparator<String>
{
	//overriding the compare method
	public int compare(String s1,String s2)
	{
		return s1.length()-s2.length();
	}
}

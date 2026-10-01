package stack_collections;

import java.util.Arrays;

public class Nearest_Greater
{
	public static void main(String []args)
	{
		int []a= {2,5,3,7,1,9};
		int []result=new int[a.length];
		for(int i=0;i<=a.length-2;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[j]>a[i])
				{
					result[i]=a[j];
					break;
				}
			}
		}
		result[result.length-1]=-1;
		System.out.println(Arrays.toString(result));
	}
}

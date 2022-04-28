
package Week2.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stop";
		 *Declare another String
			String text2 = "post"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		// Declaring Two string for Comparing 
		
		String a1 = "stop";
		String a2 = "post";
		
		// loop for checking then length of the sting 
		
		if (a1.length() == a2.length()) 
		{
			System.out.println("Both Length are Equal");
			char[] a1a = a1.toCharArray();
			char[] a2a = a2.toCharArray();
			System.out.println(a1a);
			System.out.println(a2a);
			Arrays.sort(a1a);
			Arrays.sort(a2a);
			System.out.println(a1a);
			System.out.println(a2a);
			for (int j = 0 ;j<a1a.length; j++) 
			{
				if(a1a[j]!=a2a[j]) 
				{
					System.out.println("Not an Anagram");
					break;
				}
				else 
				{
					System.out.println("wrong");
				}
				
			}
			
			
		}
	}

}
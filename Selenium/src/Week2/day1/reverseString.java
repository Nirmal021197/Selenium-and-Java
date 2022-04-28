
package Week2.day1;

public class reverseString {

	public static void main(String[] args)
	{
		
	// TODO Auto-generated method stub

	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		/* Pseudo Code:
				 
				 * Declare the input as Follow
			      		String test = "I am a software tester"; 
				a) split the words and have it in an array
				b) Traverse through each word (using loop)
				c) find the odd index within the loop (use mod operator)
				
				d)split the words and have it in an array
				
				e)print the even position words in reverse order using another loop (nested loop)
				f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
				
				 
			*/
		String test = "I am a software tester";
		String[] testSplit=test.split(" ");
		System.out.println(testSplit[1]);
		for(int i=0 ; i<testSplit.length; i++)
		{
			if(i%2==0)
			{		
				String test1 = testSplit[i];
				testSplit[i]=reverse(test1);
			}
		}
		System.out.println(testSplit);
	}

	private static String reverse(String test1) 
	{
		String Temp1 = test1;
		for (int i = test1.length()-1;i <=0;i-- ) 
		{
			Temp1 = Temp1 + test1.charAt(i);
		}
		return Temp1;
		// TODO Auto-generated method stub
		
	}

}
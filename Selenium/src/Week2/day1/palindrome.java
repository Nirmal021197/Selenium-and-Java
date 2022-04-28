package Week2.day1;


public class palindrome 
{

public static void main(String[] args) {
// TODO Auto-generated method stub
//Build a logic to find the given string is palindrome or not
	     
/*
* Pseudo Code
* Pseudo Code
* * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String palindromeName1=  "madamr";
		/*char[] arrayConvertionFromSting = palindromeName1.toCharArray();
		char[] arrayConvertionSaving = new char [palindromeName1.length()]  ;
		for (int i =0; i<arrayConvertionFromSting.length;i++) {
			arrayConvertionSaving[i]=arrayConvertionFromSting[i];
		}
		*/
		/*
		 * String reversedChar=arrayConvertionSaving.toString();
		
		if (reversedChar.equals(palindromeName1)||reversedChar.equalsIgnoreCase(palindromeName1)) {
			System.out.println("Given String is an Palindrome");
		}
		 */
		/*
		if (arrayConvertionSaving.equals(arrayConvertionFromSting) ){
			System.out.println(" Palindrome ");
			
		}
		*/
		String rev= "";
		char ch ;
		for (int i =0; i<palindromeName1.length();i++)
		{
			ch = palindromeName1.charAt(i);
			rev = ch+rev;
		}
		if (rev.equals(palindromeName1))
		{
			System.out.println("Given String is an Palindrome");
		}
		else 
		{
			System.out.println("Not an Palindrome");
		}
		
	}

}
			


		
		 
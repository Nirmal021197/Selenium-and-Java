package Week2.day1;

public class CharOccurence {

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
			// Check number of occurrences of a char (eg 'e') in a String
			
	String str = "welcome to chennai";

	// declare and initialize a variable count to store the number of occurrences
						
   // convert the string into char array
							
  //get the length of the array
							
// traverse from 0 till the array length 
// Check the char array has the particular char in it 
// if is has increment the count
	// print the count out of the loop
	
	int count = 0;
	char[] arrayStr = str.toCharArray();
	int lengtha = arrayStr.length;
	int Count = 0;
	for (int i = 0;i<lengtha;i++ ) {
		if(arrayStr[i]=='e') {
			Count++;							
		}
	}
	System.out.println("E occured " + Count + " Times");
	

}

}

																															
																																	
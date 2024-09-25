import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
      	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
        		 	
		String piggie = PigLatin.convertWord(str);
		System.out.println();
		System.out.println("Converted word: " + piggie);
	}
}

///// This can be put all in one file or make a separate class in BlueJ
class PigLatin
{
    public boolean isVowel(String s){

    }
	/*
	 * Precondition:  s is a String containing a single word.
	 * Postcondition: returns a word converted into Pig Latin according to the appropriate rule.
 	 * 
	 */
	public static String convertWord(String s)
	{
     	return "";      // This statement is provided to allow initial compiling.
	}  
   
}

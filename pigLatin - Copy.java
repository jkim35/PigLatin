import java.util.Scanner;

///// This can be put all in one file or make a separate class in BlueJ
class PigLatin
{
    public static boolean isVowel(String s){
		s=s.substring(0,1);
		boolean x=false;
		if((s.equals("a"))||(s.equals("A"))){
			x=true;
		}
		if((s.equals("e"))||(s.equals("E"))){
			x=true;
		}
		if((s.equals("i"))||(s.equals("I"))){
			x=true;
		}
		if((s.equals("o"))||(s.equals("O"))){
			x=true;
		}
		if((s.equals("u"))||(s.equals("U"))){
			x=true;
		}
		return x;
    }
	public static String startsVowel(String s){
		s=(s+"way");
		return s;
	}
	public static String startsConsonant(String s){
		String n=s.substring(1);
		n=(n+(s.substring(0,1))+"ay");
		return n;
	}
	/*()
	 * Precondition:  s is a String containing a single word.
	 * Postcondition: returns a word converted into Pig Latin according to the appropriate rule.
 	 * 
	 */
	public static String convertWord(String s)
	{
		String x="";
		if((isVowel(s)==true)){
			x=startsVowel(s);
		}
		if((isVowel(s)==false)){
			x=startsConsonant(s);
		}
		return x;
	}  
   
}

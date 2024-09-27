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
	public static String startsTwoConsonant(String y){
		boolean k = isVowel(y);
		String s=y.substring(1,2);
		boolean x=false;
		String n = y;
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
		if((x==false) && (k == false)){
			n=y.substring(2);
			n=(n+(y.substring(0,2))+"ay");
		}
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
			String h=startsTwoConsonant(s);
			if(h.equals(s)){
				x=startsConsonant(s);
			}
			else{
				x=startsTwoConsonant(s);
			}
			
			
		}
		return x;
	}  
	public static String convertSentence(String s){
		int i=s.indexOf(" ");
		String w=s.substring(0,i);
		w.convertWord();
		int n=s.indexOf(" ");
		String p=s.substring((i+1),n);
		p.convertWord();
		o=s.substring(n+1);
		o.convertWord();
		return w+" "+p+" "+o;
	}
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

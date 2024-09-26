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

package hangman_game;

import java.io.File;
import java.io.FileReader;
import java.util.*;
public class Main 
{
	static ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
	static String str;
	static String title;
	public ArrayList<String> ret()
	{
		ArrayList<String> pair = null;
		try
		{
			File obj = new File("C:\\Users\\PC\\eclipse-workspace\\HangMan_Game\\src\\hangman_game\\dictionary");
			Scanner input = new Scanner(obj);
			while(input.hasNextLine()==true) 
			{
				arr.add(new ArrayList<String>(Arrays.asList(input.next(),input.next())));
			}
			input.close();
			int n = arr.size();
			Random rnd = new Random();
			pair= arr.get(rnd.nextInt(n));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return pair;
	}
}

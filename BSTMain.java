import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program that reads the contents of a .txt file, stores its contents into a Binary Search Tree, 
 * then provides the user with options about what to do with this information. 
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class BSTMain {

	public static void main(String[] args) {
	
		boolean quit = false;
		do
		{
			BST nums = readFile("words.txt");
			
			displayMenu();
			int choice = checkInt(1, 3);
			
			switch(choice)
			{
				case 1:
					nums.printOrderedBST();
					System.out.println();
					break;
				case 2:
					Scanner in = new Scanner(System.in);
					System.out.println("What word are you looking for?");
					String word = in.next();
					
					Node search = nums.search(word);
					if (search == null)
					{
						System.out.println("Word was not found.\n");
					}
					else
					{
						System.out.println("That word appears " + search.getWord().getFreq() + " times.\n");
					}
					break;
				case 3:
					System.out.println("Goodbye.");
					quit = true;
					break;
					
				
			}
		} while(quit != true);

	}
	
	/**
	 * Gives the user options about what to do with the BST
	 */
	public static void displayMenu()
	{
		System.out.println("What would you like to do?");
		System.out.println("1.) Print the list");
		System.out.println("2.) Search for a word");
		System.out.println("3.) Quit");
	}
	
	/**
	 * Reads a .txt file and stores its contents into a BST
	 * 
	 * @param fileName the name of the file
	 * @return a BST containing the contents of the .txt file
	 */
	public static BST readFile(String fileName)
	{
		BST nums = new BST();
		try
		{
			Scanner read = new Scanner(new File(fileName));
			while (read.hasNextLine())
			{
				String line = read.nextLine();
				Word w = new Word(line);
				nums.add(w);
			}
			
			read.close();
			
		} catch (FileNotFoundException fnf) {
			System.out.println("File was not found.");
		}

		return nums;
	}
	
	/**
	 * Ensures that the user's input is of the correct data type and is within the correct bounds
	 * 
	 * @param low lower limit of the available options
	 * @param high upper limit of the available options
	 * @return the checked user input
	 */
	public static int checkInt(int low, int high)
	{
		Scanner in = new Scanner(System.in);
		int choice = 0;
		boolean inCheck = true;
		while (inCheck)
		{
			try
			{
				choice = in.nextInt();
				while (choice < low || choice > high)
				{
					System.out.println("Pick a number between " + low + "-" + high + ".");
					choice = in.nextInt();
				}
				inCheck = false;
			} catch ( InputMismatchException im) {
				in.next();
				System.out.println("Invalid input. Try again.");
			}
		}
		return choice;
	}

}


/******************************************************************************
 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
 *  Take a user input to search a Word in the List. If the Word is not found then add 
 *  it to the list, and if it found then remove the word from the List. 
 *  In the end save the list into a file
 *
 * @author chiragkatare
 * @version 1.0
 * @since 08-10-2018
 *
 ******************************************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import customDataStruc.UnorderedList;

public class FileReadUnordered {
	/*
	 * static void word(String s1 ,UnorderedList<String> list) {
	 * System.out.println(list.size()); if (list.search(s1)) { list.remove(s1);
	 * System.out.println(list); } }
	 */
	public static void main(String[] args) {
		/*
		 * try and catch block for checking for file related exceptions
		 */
		try {
			// creating a new file
			File f1 = new File("/home/bridgelabz/chiragCodes/akku.txt");
			UnorderedList<String> list = new UnorderedList<>();
			Scanner sf = new Scanner(f1);
			Scanner s = new Scanner(System.in);
			// addind values from file to list
			while (sf.hasNext()) {
				list.add(sf.next());
			}
			// printing list
			System.out.println(list);
			/*
			 * writing to file using file writer
			 */
			FileWriter fw = new FileWriter(f1);
			System.out.println("enter a word ");
			String s1 = s.nextLine();
			System.out.println(list.size());
			// checking if word is found and deleting it and then saving list to file
			if (list.search(s1)) {
				list.remove(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop(0) + " ");
					fw.flush();
					n++;
				}
				System.out.println("found and deleted");
				// or adding it to list and saving it to file
			} else {
				list.add(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop(0) + " ");
					fw.flush();
					n++;
				}
				System.out.println("added and saved");
				fw.close();
				s.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io excep");
		}
	}
}

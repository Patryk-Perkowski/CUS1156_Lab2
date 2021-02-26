/*Project: Lab 2
 * Class:  UniqueWords.java
 * Author: Patryk Perkowski
 * Date:   February 25, 2021
 * This class contains a method that will return the count of
 * unique words in a given ArrayList
 */

import java.util.ArrayList;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */

	// ----------------------------------------------------------
	// This method returns the count of unique words
	public static int countUnique(ArrayList<String> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			String ignoreWords = "";
			for (int j = 0; j < list.size(); j++) {
				if (i == j) {
					// keep traversing
				} else if (list.get(i).equals(list.get(j))) {
					ignoreWords = "ignore"; // these are not unique
				}
			}
			if (ignoreWords != "ignore") {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}

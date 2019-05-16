package pirate_speak;

import java.util.ArrayList;

/**
 * A solution to the pirate-speak problem
 * @author Jonathan Moyers
 *
 */
public class Pirate {
	
	/**
	 * Takes a jumble of letters and a list of words and outputs words containing all letters of the jumble
	 * This wasn't specified, but it will work regardless of case
	 * 
	 * @param word: what the pirate actually says
	 * @param list: the list of potential words
	 * @return a list of matching possible strings
	 */
	public static String[] pirate(String word, String[] list) {
		//Use an ArrayList so it can grow as we find matches
		ArrayList<Integer> indexes = new ArrayList<>();
		
		//Alphabetically sort the pirate's word
		String alphaWord = alphaSort(word.toLowerCase());
		
		//Loop through the given list of potential words to find all matches
		for (int i = 0; i < list.length; i++) {
			if (alphaSort(list[i].toLowerCase()).equals(alphaWord)) {
				//Add a match to the ArrayList of Indexes
				indexes.add(i);
			}
		}
		
		//Build the output list of potential words
		String[] output = new String[indexes.size()];
		for(int k = 0; k < indexes.size(); k++) {
			output[k] = list[indexes.get(k)];
		}
		
		return output;
	}
	
	/**
	 * Sorts any given string in alphabetical order.
	 * Helper function for pirate function
	 * 
	 * Uses recursion for efficiency
	 * 
	 * @param word: an alphanumeric string
	 * @return the alphabetized string
	 */
	public static String alphaSort(String word) {
		//If the word is only one character or less, do not recurse
		if(word.length() < 2) {
			return word;
		}
		
		//Assume the first character is the smallest, prove it otherwise
		char smallest = word.charAt(0);
		for(char c : word.toCharArray()) {
			if(c < smallest) {
				//If there is a lower character than the first one, it becomes the lowest
				smallest = c;
			}
		}
		
		//Find the smallest index and remove that letter from the string
		int i = word.indexOf(smallest);
		String subs = word.substring(0,  i) + word.substring(i+1);
		
		//Recurses and sorts the rest of the string
		return smallest + alphaSort(subs);
	}

}

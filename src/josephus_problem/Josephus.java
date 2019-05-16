package josephus_problem;

import java.util.ArrayList;
/**
 * A solution to the Josephus problem
 * @author Jonathan Moyers
 *
 */
public class Josephus {

	/**
	 * This takes a given amount of people and an interval
	 * and runs through the people, 'killing' them on the interval
	 * 
	 * @param numberOfPeople: the number of people gathered
	 * @param killingInterval: the interval that the people are 'killed'
	 * @return the index of the last person standing
	 */
	public static int lastPersonStanding(int numberOfPeople, int killingInterval) {
		
		//Use an ArrayList to actually remove the selected people
		ArrayList<Integer> array = new ArrayList<>();
		
		//Populate a list to run through the problem
		for(int i = 1; i <= numberOfPeople; i++) {
			array.add(i);
		}
		
		//Set a value for the starting index
		int k = 0;
		
		//Literally run through the problem until one value is left
		while(array.size() > 1) {
			//Because the indexes will literally be removed, the killing interval must decrease
			k += killingInterval-1;
			
			//Whenever k gets too large, subtract until it's not.
			while(k >= array.size()) {
				k -= array.size();
			}
			
			//Remove the person to be killed
			array.remove(k);
		}
		
		//return the only one left
		return array.get(0);
	}
}

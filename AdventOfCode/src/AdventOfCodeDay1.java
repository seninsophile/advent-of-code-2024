import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AdventOfCodeDay1 {

	public static void main(String[] args) {
		
		/*
		 * Create a function that will read Adv1
		 * Sort through Adv1 to get smallest numbers of each list and sort them from
		 * smallest to largest.
		 * Then find distance (2 - 1 = 1) or (4 - 1 = 3)
		 * Make sure distance is not negative
		 */
		
		File file = new File("inputs/Adv1");
		
		try {
			
			Scanner scan = new Scanner(file);
			
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			
			while(scan.hasNext()) {
				
//				System.out.println(scan.next());
				
				// Will read in two ints per iteration
				
				int first = scan.nextInt();
				int second = scan.nextInt();
				
				// Add to list
				
				list1.add(first);
				list2.add(second);
				
				// Sort each element by smallest to largest
				
				
				
			}
			
			// for testing only
			
			// #1) perform a sequential search in list1, look for smallest element
			
			int sum = 0;
			while(list1.size() > 0){
				int smallestL = list1.get(0); // assume index 0 = smallest
				int smallestLIndex = 0;
				
				for(int i = 0; i < list1.size(); i++) { // loop to find smallest number
					
					if(list1.get(i)<smallestL) {
						
						smallestL = list1.get(i);
						smallestLIndex = i;
						
					}
					
				}

				// remove smallest value found
				list1.remove(smallestLIndex);

				int smallestR = list2.get(0); // assume index 0 = smallest
				int smallestRIndex = 0;
				
				for(int i = 0; i < list2.size(); i++) { // loop to find smallest number
					
					if(list2.get(i)<smallestR) {
						
						smallestR = list2.get(i);
						smallestRIndex = i;
						
					}
					
				}

				// remove smallest value found
				list2.remove(smallestRIndex);
				
				// #2) find absolute value difference between both smallests
				
//				System.out.println(Math.abs(smallestR - smallestL));

				sum += Math.abs(smallestR - smallestL);
				
			}
			
			System.out.println(sum);
			
			scan.close();
			
		} catch (FileNotFoundException e) { // catch both errors

			e.printStackTrace();
			
		} catch (NoSuchElementException e) {
			
//			e.printStackTrace();
			
		}
		
	}

}

package day2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AdventOfCodeDay2 {
	
	public static boolean increasing(String[] list) { // helper method
		
		for(int i = 1; i < list.length; i++) {
			
			// check if does not meet reqs: will exit
			
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);
			if(el1 <= el0) {
				
				return false;
				
			} else if((Math.abs(el1 - el0) > 3)) { // diff < 3, diff >= 1
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static boolean decreasing(String[] list) { // helper method
		
		for(int i = 1; i < list.length; i++) {
			
			// check if does not meet reqs: will exit
			
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);		
			if(el0 <= el1) {
				
				return false;
				
			} else if(Math.abs(el0 - el1) > 3) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}


	public static void main(String[] args) {

		File file = new File("inputs/Adv2");
		
		try {
			
			int count = 0;
			
			Scanner scan = new Scanner(file);
			
			ArrayList<Integer> listOfFive = new ArrayList<Integer>();
			
			String splitFive = "";
			
			while(scan.hasNext()) {
				
//				System.out.println(scan.nextLine());
				
				String line = scan.nextLine();
				
				// Split into String array
				
				String[] elements = line.split(" ");
				
				System.out.println(Arrays.toString(elements));
				
				if(increasing(elements) || decreasing(elements)) {
					count++;
				}else {
					System.out.println(Arrays.toString(elements));
				}
				
			}
			
			System.out.println(count);
			
//			System.out.println(listOfFive);
			
			
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (NoSuchElementException e) {
			
//			e.printStackTrace();

		}
	}
}
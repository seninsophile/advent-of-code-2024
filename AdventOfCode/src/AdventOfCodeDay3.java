import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AdventOfCodeDay3 {
	



	public static void main(String[] args) {

		File file = new File("example3");
		
		try {
			
			Scanner scan = new Scanner(file);
			
			ArrayList<String> mul = new ArrayList<String>();
			
			while(scan.hasNext()) {
				
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (NoSuchElementException e) {
			
//			e.printStackTrace();

		}
	}
}
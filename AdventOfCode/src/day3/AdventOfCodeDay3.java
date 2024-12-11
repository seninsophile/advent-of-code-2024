package day3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdventOfCodeDay3 {
	
	/*
	 * EXtract next multiplication command from the given line
	 *
	 * Helper method; returns an empty string if none exists.
	 */
	
	public static String extractMul(String line) {
		return "";
//		if(line.indexOf("mul(") == -1) {
//			return ""; // not valid command found in line
//		} else {
//			
//			int start = line.indexOf("mul(");
//			int end = line.indexOf(")", start);
//			
//			// If there is no closing ")", then
//			// this is not the example we want
//			
//			return line.substring(start, end);	
//			
//		}
//		
//		
		
	}

	// chat gpt

	public static void main(String[] args) {

		File file = new File("inputs/example3");
		
		try {
			
			Scanner scan = new Scanner(file);
			int count = 0;
			while(scan.hasNext()) {
				
				String line = scan.next();
				String regex = "mul\\((\\d+),(\\d+)\\)";
				
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(line);
				
				List<String> validCalls = new ArrayList<>();
				
				while(matcher.find()) {
					validCalls.add(matcher.group());
				}
				
				System.out.println("'mul(' calls:");
				for(String call : validCalls) {
					System.out.println(call);
				}
				
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (NoSuchElementException e) {
			
//			e.printStackTrace();

		}
	}
}
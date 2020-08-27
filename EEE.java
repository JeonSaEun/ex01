package Chap10;

import java.util.Scanner;

public class EEE {

	// try-with-resources
	public static void main(String...args) {
				
		try (
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
		) {
			;;
		
		} catch(NullPointerException | NumberFormatException e) {
			;;
		} catch(Exception e) {
			;;
		} finally {
			
		}
		
	} // main
	
} // end class

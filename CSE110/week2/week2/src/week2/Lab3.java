//***********************************************************
// Name: Justin Lulejian
// Title: CSE 110 - Lab3.java
// Description: Lab3 - Strings and if/else statements.
// Time spent: 30 minutes
// Date: 3/19/2017
//***********************************************************

package week2;

import javax.swing.JOptionPane;

public class Lab3 {

	public static void main(String[] args) {
		// Gather two strings from the user.
		String stringInputOne = JOptionPane.showInputDialog(
				"Input the first string for comparison: ");
		String stringInputTwo = JOptionPane.showInputDialog(
				"Input the second string for comparison: ");
		
		// Compare the two strings for equality and display to user.
		// "==" cannot be used since it checks if they occupy the same memory
		// location.
		if (stringInputOne.equals(stringInputTwo)) {
			JOptionPane.showMessageDialog(
					null, "The strings provided are the same.");
		} else if (stringInputOne.equalsIgnoreCase(stringInputTwo)) {
			JOptionPane.showMessageDialog(
					null,
					"The strings provided the same, but with different case.");
		}else {
			JOptionPane.showMessageDialog(
					null, "The strings provided are not the same.");
		}
		
		// Compare the two strings for length and display result to user.
		if (stringInputOne.length() > stringInputTwo.length()) {
			JOptionPane.showMessageDialog(
					null, "\"" + stringInputOne + "\"" + " is longer than " + 
					"\"" + stringInputTwo + "\"");
		} else if (stringInputOne.length() < stringInputTwo.length()) {
			JOptionPane.showMessageDialog(
					null, "\"" + stringInputTwo + "\"" + " is longer than " + 
					"\"" + stringInputOne + "\"");
		} else {
			JOptionPane.showMessageDialog(
					null, "The strings are equal length.");
		}
	}
}

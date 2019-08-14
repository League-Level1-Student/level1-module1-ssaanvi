package _07_binary_converter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Binary_Converter {
	
	
	String convert(String input) {
	  JFrame JF = new JFrame () ;
	  JPanel JP = new JPanel() ;
	JLabel JL = new JLabel () ;
	JL.setText("convert");
	  JButton JB = new JButton () ;
	  JB.addMouseListener(null);
	  JB.add(JL) ;
		
		if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

	public void asciiValue() {
		// TODO Auto-generated method stub
		
	}

	public void binary() {
		// TODO Auto-generated method stub
		
	}
}

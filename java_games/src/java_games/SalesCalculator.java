
package java_games;

import javax.swing.JOptionPane;

public class SalesCalculator extends JOptionPane {
	
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter the price of the product");
		double newPrice = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null,"You typed in "+ newPrice );
		JOptionPane.showMessageDialog(null, "The new price after the discount is " + newPrice*.7);
		
		JOptionPane.showMessageDialog(null, "IT IS SO WONDERFUL TO BE A PART OF THIS");
	}

}

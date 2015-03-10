
import java.util.Scanner;
import javax.swing.JOptionPane;


public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String number;
		int number1, groupsize;
		number = JOptionPane.showInputDialog("Enter number of People ");
		number1 = Integer.parseInt(number);
		if (number1>10);
			groupsize = number1/2;
		if  (number1>=3)
			groupsize = number1/3;
		else {
			JOptionPane.showMessageDialog(null, "The number of people has to be atleast 3 ");
			return;
		}
		
		JOptionPane.showMessageDialog(null, "The number of people on the trip is " + number1 + " and the group size is " + groupsize);

	}

}


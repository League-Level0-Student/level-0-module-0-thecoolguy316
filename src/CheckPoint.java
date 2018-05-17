import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class CheckPoint {
	public static void main(String[] args) throws Exception {
		 JOptionPane.showMessageDialog(null,"Hello, I am siri.");
		 JOptionPane.showMessageDialog(null,"What is your favorite color?");
		 String answer = JOptionPane.showInputDialog("YOUR COLOR");
		 JOptionPane.showMessageDialog(null, answer + " ,That is my favorite color tooo!!!");
		 String cool = JOptionPane.showInputDialog("Any other comments?");
		 JOptionPane.showMessageDialog(null, cool + " ,thats very cool.");
		 Robot Siri = new Robot();
		 Siri.penDown();
		 
		 
	}
}

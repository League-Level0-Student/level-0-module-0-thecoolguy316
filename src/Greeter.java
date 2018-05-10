import javax.swing.JOptionPane;

public class Greeter {


		public static void main(String[] args) throws Exception {
			String answer = JOptionPane.showInputDialog("Hello, my name is thecoolguy316, what is your name?");
			JOptionPane.showMessageDialog(null,answer + ", Thats a cool name");
			
		}
}

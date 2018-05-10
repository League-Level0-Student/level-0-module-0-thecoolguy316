package extra;

import javax.swing.JOptionPane;
public class KnockKnock {
	public static void main(String[] args) throws Exception {
		JOptionPane.showMessageDialog(null, "Knock knock");
		String answer = JOptionPane.showInputDialog("Who's there?");
		String who = JOptionPane.showInputDialog(answer + " who");
	}
}

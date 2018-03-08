package recursion;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Popup
{
	private ImageIcon icon;
	private String windowTitle;
	
	public Popup()
	{
		icon = new ImageIcon(getClass().getResource("images/hal.png"));
		windowTitle = "Chatbot says";
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
//this creates the collectResponse method for the controller
	public String collectResponse(String question)
	{
		String answer = "";
		answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
		return answer;
	}
}

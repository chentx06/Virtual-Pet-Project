package PetProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SharkUserInput extends JFrame{

	private JLabel nameQuestion;
	private JTextField inputField;
	private JButton submitButton;
	public static String sharkName;
	
	public SharkUserInput() {
		
		
		setTitle("Welcome!");
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		nameQuestion = new JLabel("Welcome to the Shark Pet Simulator! Please choose a name for your pet shark.");
		inputField = new JTextField(20);
		submitButton = new JButton("Start!");
		
		add(nameQuestion);
		add(inputField);
		add(submitButton);
		submitButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sharkName = inputField.getText();
				SharkView2 newView = new SharkView2();
			}
			
		});
		
		//Allows the JFrame to appear in middle!
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static String getSharkName() {
		return sharkName;
	}
	
}

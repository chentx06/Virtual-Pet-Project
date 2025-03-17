package PetProject;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SharkView2 extends JFrame implements ActionListener{
	
	//textfield created 
	private static JTextArea displayNotification;

	//creating all labels
	private static JLabel nameLabelled;
	private static JLabel levelLabel;
	private static JLabel hungerLabel;
	private static JLabel tirednessLabel;
	private static JLabel healthLabel;
	private static JLabel happinessLabel;

	//I'm using JLabel to store all the images to put on the panel
	private static JLabel pictureShown;
	private static ImageIcon normalPic;
	private static ImageIcon eatPic;
	private static ImageIcon sleepPic;
	private static ImageIcon playPic;
	private static ImageIcon petPic;
	
	private static ImageIcon veryHappy;
	private static ImageIcon dead;
	private static ImageIcon verySad;

	//creating the buttons for clicking

	private static JButton nextDay;

	private static JButton feedIt;
	private static JButton goToBedIt;
	private static JButton playIt;
	private static JButton petIt;


	//these labels need to be later adjusted all the time in the program
	//private static JTextField textField;

	private static JLabel nameIs;
	private static JLabel levelIs;
	private static JLabel hungerIs;
	private static JLabel tirednessIs;
	private static JLabel healthIs;
	private static JLabel happinessIs;


	//create a shark object 
	private Shark sharkCreated;
	
	
	public SharkView2(){
		
		sharkCreated = new Shark();
		
		JFrame frame1 = new JFrame();
		JPanel panel1 = new JPanel();

		frame1.setLayout(null);
		panel1.setLayout(null);

		frame1.setSize(1300,800);
		frame1.setResizable(false);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame1.setTitle("Your Pet Shark");
		panel1.setBounds(0,0,1300,800);
		panel1.setBackground(new Color(153,240,248));
		panel1.setVisible(true);

		frame1.add(panel1);

		normalPic = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\AdobeStock_96520936_541522_reduced.jpg");
		eatPic = new ImageIcon("C:\\Users\\chentx06\\Downloads\\shark-eating (1).jpg");
		sleepPic = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\0e.jpg");
		playPic = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\playwithit.jpg");
		petPic = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\18067273_905.jpg");
		veryHappy = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\shark 21.jpg");
		dead = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\deadshark.jpg");
		verySad = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\images.jpg");
		pictureShown = new JLabel(normalPic);
	    pictureShown.setBounds(30,80,1000,400);
	    panel1.add(pictureShown);
	    
		frame1.setVisible(true);

		//now we created the panel and added it on the frame, next when we create other stuff we just need to add them on the panel.
		//lots of labeling
		nameLabelled = new JLabel("Name:");
		nameLabelled.setBounds(50,20,80,30);
		nameLabelled.setFont(new Font("Serif", Font.BOLD, 20));
		panel1.add(nameLabelled);
		
		nameIs = new JLabel(SharkUserInput.getSharkName());
		nameIs.setBounds(130,20,300,30);
		nameIs.setFont(new Font("Serif", Font.BOLD, 20));
		panel1.add(nameIs);

		
		//labeling level
		levelLabel = new JLabel("Level:");
		levelLabel.setBounds(500,20,80,30);
		levelLabel.setFont(new Font("Serif", Font.CENTER_BASELINE, 20));
		panel1.add(levelLabel);
		
		//CHANGES level based on user action
		levelIs = new JLabel(String.valueOf(sharkCreated.getLevel()));
		levelIs.setBounds(600,20,80,30);
		levelIs.setFont(new Font("Serif", Font.BOLD, 30));
		panel1.add(levelIs);
		
		
		//labeling hunger
		hungerLabel = new JLabel("Hunger:");
		hungerLabel.setBounds(1050,80,80,30);
		hungerLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(hungerLabel);

		//CHANGES hunger based on user action
		hungerIs = new JLabel(String.valueOf(sharkCreated.getHunger()));
		hungerIs.setBounds(1150,80,80,30);
		hungerIs.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(hungerIs);
		
		
		//labeling tiredness
		tirednessLabel = new JLabel("Tiredness:");
		tirednessLabel.setBounds(1050,150,100,30);
		tirednessLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(tirednessLabel);
		
		//CHANGES tiredness based on user action
		tirednessIs = new JLabel(String.valueOf(sharkCreated.getTiredness()));
		tirednessIs.setBounds(1150,150,100,30);
		tirednessIs.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(tirednessIs);

		//same stuff
		happinessLabel = new JLabel("Happiness:");
		happinessLabel.setBounds(1050,220,100,30);
		happinessLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(happinessLabel);
		
		happinessIs = new JLabel(String.valueOf(sharkCreated.getHappiness()));
		happinessIs.setBounds(1150,220,100,30);
		happinessIs.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(happinessIs);
		
		healthLabel = new JLabel("Health:");
		healthLabel.setBounds(1050,290,100,30);
		healthLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(healthLabel);
		
		healthIs = new JLabel(String.valueOf(sharkCreated.getHealth()));
		healthIs.setBounds(1150,290,100,30);
		healthIs.setFont(new Font("Serif", Font.PLAIN, 20));
		panel1.add(healthIs);
		
		//this is the next day button changing 5 variables at the same time
		nextDay = new JButton();
		nextDay.setBounds(100,550,250,100);
		nextDay.setText("Next Day");
		//nextDay.setVisible(true);
		nextDay.setFont(new Font("Sefif",Font.PLAIN,40));
		panel1.add(nextDay);
		nextDay.addActionListener(this);

		feedIt = new JButton();
		feedIt.setBounds(500,550,130,70);
		feedIt.setText("Feed");
		feedIt.setFont(new Font("Sefif",Font.PLAIN,30));
		//feedIt.setVisible(true);
		panel1.add(feedIt);
		feedIt.addActionListener(this);

		goToBedIt = new JButton();
		goToBedIt.setBounds(700,550,150,70);
		goToBedIt.setText("Bedtime");
		goToBedIt.setFont(new Font("Sefif",Font.PLAIN,30));
		//goToBedIt.setVisible(true);
		panel1.add(goToBedIt);
		goToBedIt.addActionListener(this);

		playIt = new JButton();
		playIt.setBounds(500,650,130,70);
		playIt.setText("Play");
		playIt.setFont(new Font("Sefif",Font.PLAIN,30));
		//playIt.setVisible(true);
		panel1.add(playIt);
		playIt.addActionListener(this);

		petIt = new JButton();
		petIt.setBounds(700,650,150,70);
		petIt.setText("Pet");
		petIt.setFont(new Font("Sefif",Font.PLAIN,30));
		//petIt.setVisible(true);
		panel1.add(petIt);
		petIt.addActionListener(this);
	
		
		//user doesn't get access to this text field
		displayNotification = new JTextArea();
		displayNotification.setBounds(900,500,350,220);
		displayNotification.setVisible(true);
		displayNotification.setBackground(new Color(25,25,2));
		displayNotification.setForeground(new Color(255,255,255));
		displayNotification.setFont(new Font("Serif",Font.ITALIC,30)); //font type, style, size
		displayNotification.setBorder(BorderFactory.createBevelBorder(1));
		displayNotification.setEditable(false); 
		displayNotification.setLineWrap(true);
		displayNotification.setWrapStyleWord(true);
		displayNotification.setText("Here's your shark. Take good care of it!");
		panel1.add(displayNotification);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Random random = new Random();
		
		//if next action is nextDay button being pressed:
		if (e.getSource() == nextDay) {
			
			displayNotification.setText("It is now the next day.");
			
			
			//add 1 to the level
			sharkCreated.setLevel(sharkCreated.getLevel()+1);
			//System.out.println(sharkCreated.getLevel());
			//this is so IMPORTANT to make the text able to be an integer that was just changed
			levelIs.setText(String.valueOf(sharkCreated.getLevel()));
			
			//change the hunger if it is no more than 100
			int hungerChange = random.nextInt(20)+1;
			//if the randomized number plus shark current hunger is no more than 100, immediately add it
			if (sharkCreated.getHunger() + hungerChange < 100) {
			sharkCreated.setHunger(sharkCreated.getHunger() + hungerChange);
			} 
			//however if them added is greater than 100, set it to 100 immediately
			if (sharkCreated.getHunger() + hungerChange > 100) {
				sharkCreated.setHunger(100);
			}
			hungerIs.setText(String.valueOf(sharkCreated.getHunger()));
			
			//the same thing with tiredness
			int tirednessChange = random.nextInt(20)+1;
			if (sharkCreated.getTiredness() + tirednessChange < 100) {
			sharkCreated.setTiredness(sharkCreated.getTiredness() + tirednessChange);
			} 
			if (sharkCreated.getTiredness() + tirednessChange > 100) {
				sharkCreated.setTiredness(100);
			}
			tirednessIs.setText(String.valueOf(sharkCreated.getTiredness()));
			
			//with happiness it's decreasing instead of increasing
			int happinessChange = random.nextInt(15)+1;
			if (sharkCreated.getHappiness() - happinessChange > 0) {
			sharkCreated.setHappiness(sharkCreated.getHappiness() - happinessChange);
			} 
			if (sharkCreated.getHappiness() - happinessChange < 0) {
				sharkCreated.setHappiness(0);
				pictureShown.setIcon(verySad);
				displayNotification.setText("The shark is now very sad. It is also less healthy.");
			}
			happinessIs.setText(String.valueOf(sharkCreated.getHappiness()));
			
			int healthChange = random.nextInt(30)+1;
			//if any of the stats reaches a bad situation for the shark, decrease its health
			
			if (sharkCreated.getHunger() == 100 || sharkCreated.getTiredness() == 100 || sharkCreated.getHappiness() == 100 ) {
				
				if(sharkCreated.getHunger() - healthChange >= 0 )
				sharkCreated.setHealth(sharkCreated.getHealth() - healthChange);
				
				//if after the change the shark's health reaches 0 or is smaller after subtraction, do this
				if (sharkCreated.getHealth() <= 0 ) {
					sharkCreated.sharkDie();
					hungerIs.setText("0");
					tirednessIs.setText("0");
					happinessIs.setText("0");
					pictureShown.setIcon(dead);
					
					//also you cannot go to the next day because the shark has died
					nextDay.setVisible(false);
					displayNotification.setText("The shark has now died. You were one of the few attending its funeral.");
				}
				healthIs.setText(String.valueOf(sharkCreated.getHealth()));
			}
		}
	
			//if the button pressed is feed
			if (e.getSource() == feedIt) {
				
				displayNotification.setText("You fed the shark. The shark is now less hungry!");
				
				int feedChange = random.nextInt(10)+5;
				//decrease the hungry level by 5-10 every time as long as its above 0
				if(sharkCreated.getHunger()-feedChange > 0) {
				sharkCreated.setHunger(sharkCreated.getHunger()-feedChange);
				} else {
					sharkCreated.setHunger(0);
				}
			hungerIs.setText(String.valueOf(sharkCreated.getHunger()));
			
			//change the PICTURE
			pictureShown.setIcon(eatPic);
			}
			
			//when user presses bed button
			if (e.getSource() == goToBedIt) {
				displayNotification.setText("You let the shark sleep. The shark rests.");
				
				int bedChange = random.nextInt(10)+5;
				if (sharkCreated.getTiredness()-bedChange > 0) {
					sharkCreated.setTiredness(sharkCreated.getTiredness()-bedChange);
				}else {
					sharkCreated.setTiredness(0);
					displayNotification.setText("You let the shark rest properly. It is now not sleepy at all.");
				}
				pictureShown.setIcon(sleepPic);
			}
			tirednessIs.setText(String.valueOf(sharkCreated.getTiredness()));
	
			//when user presses play button
			if (e.getSource() == playIt) {
				displayNotification.setText("You play with the shark. It plays with you happily.");
				
				pictureShown.setIcon(playPic);
				int happinessChange = random.nextInt(10)+5;
				if(sharkCreated.getHappiness()+happinessChange < 100) {
				sharkCreated.setHappiness(sharkCreated.getHappiness()+happinessChange);
				} else {
					sharkCreated.setHappiness(100);
					pictureShown.setIcon(veryHappy);
					displayNotification.setText("The shark is now very very very very very very very very very very very very very very very very very very happy.");
				}
			happinessIs.setText(String.valueOf(sharkCreated.getHappiness()));
			
			}
			
			//if the pet button is pressed
			if (e.getSource() == petIt) {
				displayNotification.setText("You pet the shark! The shark is confused but lets you pet it.");
				//happiness goes us and sleepiness goes down
				
				int moreHappy = random.nextInt(30)+1;
				if(sharkCreated.getHappiness()+ moreHappy < 100) {
					sharkCreated.setHappiness(sharkCreated.getHappiness()+ moreHappy);
				} else {
						sharkCreated.setHappiness(100);
						pictureShown.setIcon(veryHappy);
						displayNotification.setText("The shark plays with you very happily.");
				}
				happinessIs.setText(String.valueOf(sharkCreated.getHappiness()));
				
				int lessTired = random.nextInt(30)+1;
				if (sharkCreated.getTiredness() - lessTired > 0) {
				sharkCreated.setTiredness(sharkCreated.getTiredness() - lessTired);
				} 
				if (sharkCreated.getTiredness() - lessTired < 0) {
					sharkCreated.setTiredness(0);
				}
				tirednessIs.setText(String.valueOf(sharkCreated.getTiredness()));
				pictureShown.setIcon(petPic);
			}
			
	}
	
}


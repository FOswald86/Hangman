package at.FOswald;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import at.htlklu.util.NameGenerator;
import at.htlklu.util.data.HTLUtilities;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;

@SuppressWarnings("serial")
public class Hangman extends JFrame {
	
	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtMaskedName;
	private JTextField txtGuess;
	private JTextField txtGuessTrysAll;
	private JTextField txtGuessTrysFails;
	public int trysFailsInt;
	    
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hangman frame = new Hangman();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	Hangman() {
		setTitle("Hangman - Name rates");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 10, 160, 40);
		lblFirstName.setToolTipText("L\u00F6sung");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblFirstName);

		JLabel lblMaskedName = new JLabel("Masked Name");
		lblMaskedName.setBounds(10, 70, 160, 40);
		lblMaskedName.setToolTipText("Ratename");
		lblMaskedName.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaskedName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblMaskedName);

		JLabel lblGuess = new JLabel("Guess letters / name");
		lblGuess.setBounds(10, 140, 160, 40);
		lblGuess.setToolTipText("Buchstabe oder Name eingeben");
		lblGuess.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuess.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblGuess);

		JLabel lblGuessAttempts = new JLabel("Guessing attempts");
		lblGuessAttempts.setBounds(10, 210, 160, 40);
		lblGuessAttempts.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessAttempts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblGuessAttempts);

		txtFirstName = new JTextField();
		txtFirstName.setToolTipText("male or female firstname");
		txtFirstName.setBounds(200, 10, 320, 40);
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setBackground(Color.LIGHT_GRAY);
		txtFirstName.setEditable(false);
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);

		txtMaskedName = new JTextField();
		txtMaskedName.setToolTipText("male or female firstname");
		txtMaskedName.setBounds(200, 70, 320, 40);
		txtMaskedName.setHorizontalAlignment(SwingConstants.CENTER);
		txtMaskedName.setBackground(Color.LIGHT_GRAY);
		txtMaskedName.setEditable(false);
		txtMaskedName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtMaskedName.setColumns(10);
		contentPane.add(txtMaskedName);

		txtGuessTrysAll = new JTextField();
		txtGuessTrysAll.setToolTipText("Over all Trys");
		txtGuessTrysAll.setBounds(274, 211, 40, 40);
		txtGuessTrysAll.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuessTrysAll.setBackground(Color.LIGHT_GRAY);
		txtGuessTrysAll.setEditable(false);
		txtGuessTrysAll.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtGuessTrysAll.setColumns(10);
		contentPane.add(txtGuessTrysAll);

		txtGuessTrysFails = new JTextField();
		txtGuessTrysFails.setToolTipText("Fail Trys");
		txtGuessTrysFails.setBounds(435, 211, 40, 40);
		txtGuessTrysFails.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuessTrysFails.setBackground(Color.LIGHT_GRAY);
		txtGuessTrysFails.setEditable(false);
		txtGuessTrysFails.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtGuessTrysFails.setColumns(10);
		contentPane.add(txtGuessTrysFails);

		JLabel lblAll = new JLabel("All");
		lblAll.setBounds(200, 210, 105, 40);
		lblAll.setHorizontalAlignment(SwingConstants.CENTER);
		lblAll.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblAll);

		JLabel lblFails = new JLabel("Fails");
		lblFails.setBounds(356, 210, 105, 40);
		lblFails.setHorizontalAlignment(SwingConstants.CENTER);
		lblFails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblFails);
		
		JButton btnGenerate = new JButton("Generate Name");
		btnGenerate.setBounds(75, 280, 190, 40);
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				handleBtnGenerate();

			}
		});
		btnGenerate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnGenerate);
		
		

		JButton btnGuess = new JButton("Guess . . . ");
		btnGuess.setBounds(290, 280, 190, 40);
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					handleBtnGuess();
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Generate Name first", "Fail", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnGuess.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnGuess);
		
		HangmanDraw draw = new HangmanDraw();
		draw.setBounds(530, 10, 335, 312);
		
		txtGuess = new JTextField();
		txtGuess.setToolTipText("type in letter or name and press Guess...");
		txtGuess.setBounds(200, 140, 320, 40);
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtGuess.setColumns(10);
		contentPane.add(txtGuess);
		txtGuess.addKeyListener(new KeyAdapter() {	
			@Override
			public void keyPressed(KeyEvent e) {
				
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER) {
					
					btnGuess.doClick();
					
				}
			}
		});
	}
	
	
	

	protected void handleBtnGenerate() {

		// Generate random first name with minimum 7 letters length
		String maleFirstName;
		String femaleFirstName;
		String firstName;

		do {
			maleFirstName = NameGenerator.getRandomMaleFirstName();
		} while (maleFirstName.length() <= 7);

		do {
			femaleFirstName = NameGenerator.getRandomFemaleFirstName();
		} while (femaleFirstName.length() <= 7);

		// Choose male or female first name + output
		if (HTLUtilities.getRandomBoolean()) {

			firstName = maleFirstName;

		} else {

			firstName = femaleFirstName;

		}

		this.txtFirstName.setText(firstName);

		// mask the name + output
		String maskedName = "";

		for (int i = 0; i < firstName.length(); i++) {
			maskedName += '-';
		}

		this.txtMaskedName.setText(maskedName);

		// prepare other fields
		this.txtFirstName.setForeground(Color.LIGHT_GRAY);
		this.txtGuessTrysAll.setText("0");
		this.txtGuessTrysFails.setText("0");
		this.txtGuess.setText("");
		this.txtMaskedName.setBackground(Color.LIGHT_GRAY);
		new HangmanDraw().cleanDraw(getGraphics());
		// cursor into txtGuess text field
		txtGuess.requestFocusInWindow();

	}

	protected void handleBtnGuess() {
		
			// get needed Stuff in this Class
			String name = this.txtFirstName.getText();
			String guess = this.txtGuess.getText();
			String nameMasked = this.txtMaskedName.getText();
			String trysAll = this.txtGuessTrysAll.getText();
			int trysAllInt = Integer.parseInt(trysAll);
			String trysFails = this.txtGuessTrysFails.getText();
			int trysFailsInt = Integer.parseInt(trysFails);
			String nameMaskedNow = "";
			int fails = 0;
			
			// only count if not empty
			if (!(guess.equals(""))
					&& trysFailsInt <= 12) {

				trysAllInt++;

			}

			// looking for matches
			if (guess.length() == 1
					&& trysFailsInt <= 12) {

				char guessChar = guess.charAt(0);

				// match guessChar with every char from the name
				for (int i = 0; i < name.length(); i++) {

					char c = name.charAt(i);

					// compare UpperCases
					
					if (Character.toUpperCase(c) == Character.toUpperCase(guessChar)) {

						nameMaskedNow += c;

					} else {

						nameMaskedNow += nameMasked.charAt(i);

						fails++;
						trysFailsInt += fails / name.length();

					}
				}

				this.txtMaskedName.setText(nameMaskedNow);

				if (nameMaskedNow.equalsIgnoreCase(name)) {

					this.txtMaskedName.setBackground(Color.GREEN);
					this.txtFirstName.setForeground(Color.GREEN);
					this.txtMaskedName.setText(name);
					this.txtGuess.setText("Generate new Word");
					winPopup();
				}
			} else {

				// whole name rate try
				if (guess.equalsIgnoreCase(name)) {

					this.txtMaskedName.setBackground(Color.GREEN);
					this.txtFirstName.setForeground(Color.GREEN);
					this.txtMaskedName.setText(name);
					this.txtGuess.setText("Generate new Word");
					winPopup();

				} else {

					if (!(guess.equals(""))
							&& trysFailsInt <= 12) {

						trysFailsInt += 3;
						
					}
				}
			}
			
			// reset guess field + outputs
			this.txtGuess.setText("");
			this.txtGuessTrysAll.setText(Integer.toString(trysAllInt));
			this.txtGuessTrysFails.setText(Integer.toString(trysFailsInt));

			// cursor into txtGuess text field
			txtGuess.requestFocusInWindow();
			
			if (trysFailsInt == 1) {
				new HangmanDraw().fail1(getGraphics());
			}
			if (trysFailsInt == 2) {
				new HangmanDraw().fail2(getGraphics());
			}
			if (trysFailsInt == 3) {
				new HangmanDraw().fail3(getGraphics());
			}
			if (trysFailsInt == 4) {
				new HangmanDraw().fail4(getGraphics());
			}
			if (trysFailsInt == 5) {
				new HangmanDraw().fail5(getGraphics());
			}
			if (trysFailsInt == 6) {
				new HangmanDraw().fail6(getGraphics());
			}
			if (trysFailsInt == 7) {
				new HangmanDraw().fail7(getGraphics());
			}
			if (trysFailsInt == 8) {
				new HangmanDraw().fail8(getGraphics());
			}
			if (trysFailsInt == 9) {
				new HangmanDraw().fail9(getGraphics());
			}
			if (trysFailsInt == 10) {
				new HangmanDraw().fail10(getGraphics());
			}
			if (trysFailsInt == 11) {
				new HangmanDraw().fail11(getGraphics());
			}
			if (trysFailsInt == 12) {
				new HangmanDraw().fail12(getGraphics());
			}
			if (trysFailsInt == 12) {
				this.txtFirstName.setForeground(Color.RED);
				losePopup();
			}
	}
	
	protected static void winPopup() {
		
		JOptionPane.showMessageDialog(null, "congrats you won, generate new Name to restart", "Win", JOptionPane.INFORMATION_MESSAGE);

	}
	
	protected static void losePopup() {

		JOptionPane.showMessageDialog(null, "you are dead, generate new Name to restart", "Lose", JOptionPane.INFORMATION_MESSAGE);

	}
}
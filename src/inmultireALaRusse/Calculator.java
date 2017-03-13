package inmultireALaRusse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 45, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 45, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblInmultireALa = new JLabel("Inmultire A la Russe");
		lblInmultireALa.setBounds(84, 11, 158, 14);
		frame.getContentPane().add(lblInmultireALa);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(106, 48, 46, 14);
		frame.getContentPane().add(lblX);
		
		JLabel label = new JLabel("=");
		label.setBounds(212, 48, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  a = Integer.parseInt(textField.getText());
				int  b = Integer.parseInt(textField_1.getText());
				int c=0;
				while(a>0)
				{
					if(a%2==1)
						c = c+b;
					b = b+b;
					a = a/2;
				}
				
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton.setBounds(106, 81, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 45, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
	
	}
}

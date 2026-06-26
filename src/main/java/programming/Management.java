package programming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.DropMode;

public class Management {

	private JFrame frame;
	private JTextField textField;
	private JTextArea txtrCustomerData;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Management window = new Management();
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
	public Management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.setBounds(100, 100, 535, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOTEL RESERVATION SYSTEM");
		lblNewLabel.setBackground(new Color(102, 204, 102));
		lblNewLabel.setForeground(new Color(255, 255, 153));
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		lblNewLabel.setBounds(122, 28, 312, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CUSTOMER NAME :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(50, 76, 158, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 255, 240));
		textField.setBounds(247, 79, 198, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		 
		
		JLabel lblNewLabel_2 = new JLabel("ROOM TYPE:");
		lblNewLabel_2.setFont(new Font("Calisto MT", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(198, 175, 104, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton s1 = new JRadioButton("STANDARD");
		s1.setBackground(new Color(153, 204, 153));
		s1.setForeground(new Color(0, 0, 0));
		s1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		s1.setBounds(50, 229, 103, 21);
		frame.getContentPane().add(s1);
		
		JRadioButton d1 = new JRadioButton("DELUXE");
		d1.setBackground(new Color(153, 204, 153));
		d1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		d1.setBounds(199, 229, 103, 21);
		frame.getContentPane().add(d1);
		
		JRadioButton s2 = new JRadioButton("SUITE");
		s2.setBackground(new Color(153, 204, 153));
		s2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		s2.setBounds(354, 229, 103, 21);
		frame.getContentPane().add(s2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(s1);
		bg.add(d1);
		bg.add(s2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("PAYMENT COMPLETED");
		chckbxNewCheckBox.setBackground(new Color(153, 204, 153));
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(149, 280, 212, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		
		JButton btnNewButton = new JButton("Book Room");
				
				btnNewButton.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {

				        String name = textField.getText();
				        String room = "";
				        int price = 0;
				        
				        if(textField.getText().isEmpty()) {
				            txtrCustomerData.setText("Please enter customer name!");
				            return;
				        }
				        
				       

				        if (s1.isSelected()) {
				            room = "STANDARD";
				            price = 2000;
				            
				        } else if (d1.isSelected()) {
				            room = "DELUXE";
				            price = 4000;
				            
				        } else if (s2.isSelected()) {
				            room = "SUITE";
				            price = 7000;
				        }
                            
				        if(!s1.isSelected() && !d1.isSelected() && !s2.isSelected()) {
				            txtrCustomerData.setText("Please select a room type!");
				            return;
				        }
				        String payment;

				        if (chckbxNewCheckBox.isSelected()) {
				            payment = "COMPLETED";
				        } else {
				            payment = "PENDING";
				        }

				        txtrCustomerData.setText(
				        		"\n"+
				            "HOTEL BOOKING CONFIRMED\n\n" +
				            "Customer Name : " + name +
				            "\nRoom Type : " + room +
				            "\nRoom Price : Rs." + price +
				            "\nPayment Status : " + payment
				        );
				    }
				});
		
		
		btnNewButton.setBackground(new Color(153, 204, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(51, 340, 109, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel Booking");
		btnNewButton_1.setBackground(new Color(153, 204, 153));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(185, 340, 133, 31);
		
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		        textField.setText("");
		        bg.clearSelection();
		        chckbxNewCheckBox.setSelected(false);
		        txtrCustomerData.setText("\n");
		        txtrCustomerData.setText("Booking Cancelled!");
		     
		       
		    }
		});
		
		JButton btnNewButton_2 = new JButton("View Details");
		btnNewButton_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {

		        String room = "";

		        if (s1.isSelected()) {
		            room = "STANDARD";
		        } else if (d1.isSelected()) {
		            room = "DELUXE";
		        } else if (s2.isSelected()) {
		            room = "SUITE";
		        }

		        txtrCustomerData.setText(
		        		"\n"+
		            "BOOKING DETAILS\n\n" +
		            "Customer Name : " + textField.getText() +
		            "\nRoom Type : " + room +
		            "\nPayment Completed : " +
		            chckbxNewCheckBox.isSelected()
		        );
		    }
		});
		
		btnNewButton_2.setBackground(new Color(153, 204, 153));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(354, 340, 116, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		txtrCustomerData = new JTextArea();
		txtrCustomerData.setLineWrap(true);
		txtrCustomerData.setWrapStyleWord(true);
		txtrCustomerData.setText(" ! CUSTOMER DATA !");
		txtrCustomerData.setToolTipText("");
		txtrCustomerData.setFont(new Font("MS UI Gothic", Font.BOLD, 14));
		txtrCustomerData.setForeground(new Color(102, 153, 102));
		txtrCustomerData.setBackground(new Color(240, 255, 240));
		txtrCustomerData.setBounds(51, 392, 419, 146);
		frame.getContentPane().add(txtrCustomerData);
		
		JLabel lblNewLabel_3 = new JLabel("MOBILE NUMBER :");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(50, 124, 139, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(240, 255, 240));
		textField_1.setColumns(10);
		textField_1.setBounds(247, 127, 198, 26);
		frame.getContentPane().add(textField_1);
		
	}
}

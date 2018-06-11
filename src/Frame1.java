import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Frame1 {

	private JFrame frame;
	private JTextField custName;
	private JTextField custPhone;
	private JButton btnNewButton;
	Map<String,String> contacts = new LinkedHashMap<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
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
		
		custName = new JTextField();
		custName.setBounds(42, 49, 121, 20);
		frame.getContentPane().add(custName);
		custName.setColumns(10);
		
		custPhone = new JTextField();
		custPhone.setBounds(243, 49, 95, 20);
		frame.getContentPane().add(custPhone);
		custPhone.setColumns(10);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					contacts.put(custName.getText(), custPhone.getText());
					custName.setText(null);custPhone.setText(null);
					System.out.println(contacts.values());
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Please fill all fields" );
				}
			}
		});
		btnNewButton.setBounds(156, 125, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(79, 22, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhXxxxxxxxxx = new JLabel("PH: XXX-XXX-XXXX");
		lblPhXxxxxxxxxx.setBounds(243, 22, 95, 14);
		frame.getContentPane().add(lblPhXxxxxxxxxx);
	}
}

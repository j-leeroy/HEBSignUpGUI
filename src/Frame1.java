import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame1 {

	private JFrame frmHebDigitalApp;
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
					window.frmHebDigitalApp.setVisible(true);
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
		frmHebDigitalApp = new JFrame();
		frmHebDigitalApp.setTitle("HEB Digital App Signup");
		frmHebDigitalApp.setBounds(100, 100, 450, 300);
		frmHebDigitalApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHebDigitalApp.getContentPane().setLayout(null);
		
		custName = new JTextField();
		custName.setBounds(42, 49, 121, 20);
		frmHebDigitalApp.getContentPane().add(custName);
		custName.setColumns(10);
		
		custPhone = new JTextField();
		custPhone.setBounds(243, 49, 95, 20);
		frmHebDigitalApp.getContentPane().add(custPhone);
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
		btnNewButton.setBounds(164, 92, 89, 23);
		frmHebDigitalApp.getContentPane().add(btnNewButton);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(79, 22, 46, 14);
		frmHebDigitalApp.getContentPane().add(lblName);
		
		JLabel lblPh = new JLabel("PH: XXX-XXX-XXXX");
		lblPh.setBounds(243, 22, 95, 14);
		frmHebDigitalApp.getContentPane().add(lblPh);
		
		JLabel label = new JLabel(new ImageIcon("C:/Users/jlgar/Desktop/heb_project/HEBpic.png"));
		label.setSize(192, 100);
		label.setLocation(111, 150);
		frmHebDigitalApp.getContentPane().add(label);
		
	}
}

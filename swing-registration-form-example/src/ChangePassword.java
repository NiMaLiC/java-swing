import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChangePassword extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField2;
	private JLabel lblEnterNewPassword;
	


	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
					
					public void run() {

			
					}
				});
			}

	public ChangePassword(String userSes) {
		setBounds(450,190,1014,597);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	

		 textField = new JTextField();
		 textField.setFont(new Font("Tahoma",Font.PLAIN,34));
		 textField.setBounds(400, 286, 281, 68);
		 contentPane.add(textField);
		 textField.setColumns(10);
		 
		 
		 
		 textField2 = new JTextField();
		 textField2.setFont(new Font("Tahoma",Font.PLAIN,32));
		 textField2.setBounds(400, 166, 281, 68);
		 contentPane.add(textField2);
		 textField2.setColumns(10);
		 
		 
		 JLabel lblPassword = new JLabel("Password");
			lblPassword.setBackground(Color.BLACK);
			lblPassword.setForeground(Color.BLACK);
			lblPassword.setFont(new Font("Tahoma",Font.PLAIN,31));
			lblPassword.setBounds(250, 286, 281, 68);
			contentPane.add(lblPassword);
			
			JLabel lblUsername = new JLabel("Username");
			lblUsername.setBackground(Color.CYAN);
			lblUsername.setForeground(Color.BLACK);
			lblUsername.setFont(new Font("Tahoma",Font.PLAIN,31));
			lblUsername.setBounds(250, 166, 281, 68);
			contentPane.add(lblUsername);
		 
		 JButton btnSearch = new JButton("Enter");
btnSearch.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
String pstr = textField.getText();
String uname = textField2.getText();
System.out.println("update name");
System.out.println("update password");


try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://loalhost:3306/swing_demo","root","12345678Selva");
	PreparedStatement st = connection .prepareStatement("update student set password = ? where name = ?");
	st.setString(1, pstr);
	st.setString(2, uname);
	st.executeUpdate();
	JOptionPane.showMessageDialog(btnSearch, "Password has been successfully changed");
} catch (SQLException | ClassNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}


	}
});	



btnSearch.setFont(new Font("Tahoma",Font.PLAIN,39));
btnSearch.setBackground(new Color(240,240,240));
btnSearch.setBounds(400,400,170,59);
contentPane.add(btnSearch);


lblEnterNewPassword = new JLabel("Enter new password");
lblEnterNewPassword.setFont(new Font("Tahoma",Font.PLAIN,30));
lblEnterNewPassword.setBounds(45, 37, 326, 67);
contentPane.add(lblEnterNewPassword);
	
	}

	public ChangePassword() {
		// TODO Auto-generated constructor stub
	}

}

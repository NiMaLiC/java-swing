import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class UserHome extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	public static void main(String args[]) {
EventQueue.invokeLater(new Runnable() {
			
			public void run() {

				UserHome frame = new UserHome();
	frame.setVisible(true);
				
			}
		});
	}
	
	public UserHome() {
		// TODO Auto-generated constructor stub
	}

	public UserHome(String userSes) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,190,1014,597);
		setResizable(false);
		 contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0,0,0));
		btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnNewButton.setFont(new Font("Tahoma",Font.PLAIN,39));
		//btnNewButton.setBounds(545, 392, 162, 73);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");	
if (a == JOptionPane.YES_OPTION) {
	dispose();
	UserLogin obj = new UserLogin();
	obj.setTitle("Student-Login");
	obj.setVisible(true);
}





			}
		});
		
		btnNewButton.setBounds(545, 392, 162, 73);
		contentPane.add(btnNewButton);
		JButton button = new JButton("Change Password\r\n");
		button.setBackground(UIManager.getColor("Button.disabledForeground"));
		button.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
ChangePassword cp = new ChangePassword(userSes);	
cp.setTitle("Change Password");
cp.setVisible(true);
			}
		});
		
		button.setFont(new Font("Tahoma",Font.PLAIN,35));
		button.setBounds(545,200,491,114);
		contentPane.add(button);
		
	}

	

}

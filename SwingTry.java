import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import src.Login;
import src.Signup;
class SwingTry implements ActionListener{

	JLabel about, secondline;
	JButton login;
	JButton signup;
	JButton help;

	public SwingTry( String title ){
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(1000,1000);
		jf.setTitle(title);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.getContentPane().setBackground(new Color(0x222222));
		String str = "Welcome to Teacher Guardian and Student Management System";
		about = new JLabel();
		about.setText(str);
		about.setForeground(new Color(0xeeeeee));
		about.setBounds(100, 50, 500, 500);
		jf.add(about);
		login = new JButton("Login/Signup");
		login.setForeground(new Color(0x444444));
		login.setBackground(new Color(0xdddddd));
		login.addActionListener(this);
		login.setBounds(100, 560, 200, 50);
		jf.add(login);


	}

	public void actionPerformed( ActionEvent ae){
		if ( ae.getSource() == login)
			new Login("Login");
		else
			new Signup("Signup");
	}

	public static void main(String args[]){
		System.out.println("entered");
		new SwingTry("Teacher Gurdian and Student Management System");
	}
}


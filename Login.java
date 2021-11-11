package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	
public class Login implements ActionListener{
	JFrame lf = new JFrame();
	JLabel email, password, label;
	JButton loginB, cancelB,stud, teacher, signupB;
	JTextField emailT, passT;
	public Login(String login){
		lf.setTitle(login);
		lf.setSize(510,500);
		lf.setVisible(true);
		lf.getContentPane().setBackground(new Color(0x222222));	
		lf.setLayout(null);
		JLabel loginl = new JLabel("Login");
		loginl.setForeground(new Color(0xeeeeee));
		loginl.setBounds(200, 50, 100, 30);
		lf.add(loginl);
		stud = new JButton("Student");
		stud.setForeground(new Color(0xeeeeee));
		stud.setBackground(new Color(0x111111));
		stud.addActionListener(this);
		stud.setBounds(10, 120, 250, 40);
		lf.add(stud);
		teacher = new JButton("Teacher");
		teacher.setForeground(new Color(0xbbbbbb));
		teacher.setBackground(new Color(0x111111));
		teacher.addActionListener(this);
		teacher.setBounds(260, 120, 250, 40);
		lf.add(teacher);
		addLoginStud();
	}
	void addLoginStud(){
		email = new JLabel("Email Id");
		email.setForeground(new Color(0xeeeeee));
		email.setBounds(10, 180, 250, 40);
		lf.add(email);
		emailT = new JTextField();
		emailT.setBounds(260, 180, 250, 40);
		lf.add(emailT);
		password = new JLabel("Password");
		password.setForeground(new Color(0xeeeeee));
		password.setBounds(10, 220, 250, 40);
		lf.add(password);
		passT = new JTextField();
		passT.setBounds(260, 220, 250, 40);
		lf.add(passT);
		System.out.println("In login");
		loginB = new JButton("Login");
		loginB.setBackground(new Color(0x444444));
		loginB.setForeground(new Color(0xdddddd));
		loginB.setBounds(10, 260, 250, 40);
		loginB.addActionListener(this);
		lf.add(loginB);
		cancelB = new JButton("Cancel");
		cancelB.setBounds(260, 260, 250, 40);
		cancelB.setBackground(new Color(0x444444));
		cancelB.setForeground(new Color(0xdddddd));
		lf.add(cancelB);
		label = new JLabel("New User ?");
		label.setBounds(20, 310, 200, 40);
		label.setBackground(new Color(0x222222));
		label.setForeground(new Color(0xdddddd));
		lf.add(label);
		signupB = new JButton("SignUp");
		signupB.setBounds(220, 310, 200, 40);
		signupB.setBackground(new Color(0x222222));
		signupB.setForeground(new Color(0xdddddd));
		signupB.addActionListener(this);
		lf.add(signupB);
	}
	public void actionPerformed(ActionEvent ae){
		System.out.println("In event");

		if(ae.getSource() == stud){
			System.out.println("Student");
		}
		else if(ae.getSource() == teacher){
			System.out.println("Teacher");
		}
		else if(ae.getSource() == loginB){
			System.out.println("Login");
		}
		else if(ae.getSource() == signupB){
			new Signup("SignUp");
		}
		else{
			System.out.println("Cancel");
		}
	}
}
package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signup implements ActionListener {
	JFrame sf = new JFrame();
	JLabel signs, email, password, repass, name, prn, classs, rollno, contact, loginl;
	JTextField emailT, passT,  repassT, nameT, prnT, classT, rollnoT, contactT;
	JButton signupB, cancelB, stud, teacher, loginB;
	JPanel jp = new JPanel();
	JPanel jpT = new JPanel();
	public Signup(String su){
		sf.setTitle(su);
		sf.setSize(1000,1000);
		sf.setVisible(true);
		sf.setLayout(null);
		sf.getContentPane().setBackground(new Color(0x222222));
		signs = new JLabel("Signup");
		signs.setBounds(200, 50, 100, 30);
		signs.setForeground(new Color(0xeeeeee));
		signs.setBackground(new Color(0x221112));
		sf.add(signs);
		stud = new JButton("Student");
		stud.setForeground(new Color(0xeeeeee));
		stud.setBackground(new Color(0x111111));
		stud.addActionListener(this);
		stud.setBounds(10, 120, 250, 40);
		sf.add(stud);
		teacher = new JButton("Teacher");
		teacher.setForeground(new Color(0xbbbbbb));
		teacher.setBackground(new Color(0x111111));
		teacher.addActionListener(this);
		teacher.setBounds(260, 120, 250, 40);
		sf.add(teacher);
		addElementsStud();
		loginl = new JLabel("Have account?");
		loginl.setForeground(new Color(0xeeeeee));
		loginl.setBackground(new Color(0x222222));
		loginl.setBounds(20, 600, 200, 40);
		sf.add(loginl);
		loginB = new JButton("Login");
		loginB.setForeground(new Color(0xeeeeee));
		loginB.setBackground(new Color(0x222222));
		loginB.addActionListener(this);
		loginB.setBounds(210, 600, 100, 40);
		sf.add(loginB);
	}
	void addElementsStud(){
		jp.setLayout(new GridLayout(9, 2));
		jp.setBackground(new Color(0x222222));
		email = new JLabel("Email Id");
		email.setForeground(new Color(0xeeeeee));
		jp.add(email);
		emailT = new JTextField();
		jp.add(emailT);
		password = new JLabel("Password");
		password.setForeground(new Color(0xeeeeee));
		jp.add(password);
		passT = new JTextField();
		jp.add(passT);
		repass = new JLabel("Re-enter Password");
		repass.setForeground(new Color(0xeeeeee));
		jp.add(repass);
		repassT = new JTextField();
		jp.add(repassT);
		name = new JLabel("Name");
		name.setForeground(new Color(0xeeeeee));
		jp.add(name);
		nameT = new JTextField();
		jp.add(nameT);
		prn = new JLabel("PRN");
		prn.setForeground(new Color(0xeeeeee));
		jp.add(prn);
		prnT = new JTextField();
		jp.add(prnT);
		classs = new JLabel("Class");
		classs.setForeground(new Color(0xeeeeee));
		jp.add(classs);
		classT = new JTextField();
		jp.add(classT);
		rollno = new JLabel("Roll No");
		rollno.setForeground(new Color(0xeeeeee));
		jp.add(rollno);
		rollnoT = new JTextField();
		jp.add(rollnoT);
		contact = new JLabel("Contact No");
		contact.setForeground(new Color(0xeeeeee));
		jp.add(contact);
		contactT = new JTextField();
		jp.add(contactT);
		signupB = new JButton("SignUp");
		signupB.setBackground(new Color(0x444444));
		signupB.setForeground(new Color(0xdddddd));
		signupB.addActionListener(this);
		jp.add(signupB);
		cancelB = new JButton("Cancel");
		cancelB.setBackground(new Color(0x444444));
		cancelB.setForeground(new Color(0xdddddd));
		cancelB.addActionListener(this);
		jp.add(cancelB);
		jp.setBounds(10,180, 500, 400);
		sf.add(jp);
	}
	void addElementsTeacher(){
		jpT.setLayout(new GridLayout(6, 2));
		jpT.setBackground(new Color(0x222222));
		email = new JLabel("Email Id");
		email.setForeground(new Color(0xeeeeee));
		jpT.add(email);
		emailT = new JTextField();
		jpT.add(emailT);
		password = new JLabel("Password");
		password.setForeground(new Color(0xeeeeee));
		jpT.add(password);
		passT = new JTextField();
		jpT.add(passT);
		repass = new JLabel("Re-enter Password");
		repass.setForeground(new Color(0xeeeeee));
		jpT.add(repass);
		repassT = new JTextField();
		jpT.add(repassT);
		name = new JLabel("Name");
		name.setForeground(new Color(0xeeeeee));
		jpT.add(name);
		nameT = new JTextField();
		jpT.add(nameT);
		contact = new JLabel("Contact No");
		contact.setForeground(new Color(0xeeeeee));
		jpT.add(contact);
		contactT = new JTextField();
		jpT.add(contactT);
		signupB = new JButton("SignUp");
		signupB.setBackground(new Color(0x444444));
		signupB.setForeground(new Color(0xdddddd));
		signupB.addActionListener(this);
		jpT.add(signupB);
		cancelB = new JButton("Cancel");
		cancelB.setBackground(new Color(0x444444));
		cancelB.setForeground(new Color(0xdddddd));
		cancelB.addActionListener(this);
		jpT.add(cancelB);
		jpT.setBounds(10,180, 500, 400);
		sf.add(jpT);
	}

	public void actionPerformed( ActionEvent ae ){
		if( ae.getSource() == signupB){
			System.out.println(emailT.getText()+"\n"+passT.getText()+"\n"+repassT.getText()+"\n"+nameT.getText()+"\n"+rollnoT.getText());
			if(emailT.getText().indexOf('@') == -1){
				System.out.println("Enter valid email");
			}
			else if( passT.getText().length() < 6 ){
				System.out.println("password length must be > 6");
			}
			else if(!(passT.getText().equals(repassT.getText()))){
				System.out.println("Please reenter same password ");
			}
			else if( contactT.getText().length() < 10){
				System.out.println("Contact no is not valid");
			}
			else{
				new Student(emailT.getText(), passT.getText(), nameT.getText(), prnT.getText(), rollnoT.getText(), classT.getText(), contactT.getText());
			}
			//System.out.println(eid);
		}
		else if(ae.getSource() == stud){
			jpT.removeAll();
			sf.getContentPane().remove(jpT);
			System.out.println("stu");
			addElementsStud();
			sf.revalidate();
			sf.repaint();
		}
		else if(ae.getSource() == teacher){
			jp.removeAll();
			sf.getContentPane().remove(jp);
			System.out.println("teacher");
			addElementsTeacher();
			sf.revalidate();
			sf.repaint();
		}
		else if(ae.getSource() == loginB){
			new Login("Login");
		}
		else{
			System.out.println("cancel");
			emailT.setText("");
		}
	}
}
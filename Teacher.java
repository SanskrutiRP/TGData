package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	
//import com.mongodb.*;
public class Teacher extends JFrame{	//} implements ActionListener{
	JLabel lname, prn, attendance, gpa;
	JTextField nameS, prnT, attendanceT, gpaT;
	JButton enter, cancel;
	public Teacher(String email, String password){
		generateFrame();
		//Connect to db and check the credentials and login
		//display options to enter students data
		enterData();
	}
	public Teacher(String email, String pass,String name, String prn, String rollno, String classs, String contact){
		generateFrame();
		System.out.println(email);
		System.out.println(pass);
		System.out.println(name);
		System.out.println(prn);
		System.out.println(rollno);
		System.out.println(classs);
		System.out.println(contact);
		enterData();
	}
	void enterData(){
		lname = new JLabel("Student Name");
		add(lname);
		nameS = new JTextField();
		add(nameS);
		attendance = new JLabel("Attendance");
		add(attendance);
		attendanceT = new JTextField();
		add(attendanceT);
		gpa = new JLabel(" GPA ");
		add(gpa);
		gpaT = new JTextField();
		add(attendanceT);
		enter = new JButton("Enter");
		enter.addActionListener(this);
		add(enter);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		add(cancel);
	}
	void generateFrame(){
		setTitle("Student");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 2));
	}
}

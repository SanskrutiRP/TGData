package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	
//import com.mongodb.*;
public class Student extends JFrame{	//} implements ActionListener{
	JLabel lname, attendance, gpa;
	public Student(String email, String password){
		generateFrame();
		//Connect to db and check the credentials and login
		//display name attendance and gpa
		display();
	}
	public Student(String email, String pass,String name, String prn, String rollno, String classs, String contact){
		generateFrame();
		System.out.println(email);
		System.out.println(pass);
		System.out.println(name);
		System.out.println(prn);
		System.out.println(rollno);
		System.out.println(classs);
		System.out.println(contact);

		//Connect to db and insert into db details
		//use find to get the data of the student 
		display();
	}
	void display(){
		//display name attendance and gpa
		//static ex given below
		lname = new JLabel(name);
		lname.setBounds(100, 100, 100, 40);
		add(lname);
		attendance = new JLabel("Attendance : 75%");
		attendance.setBounds(100, 150, 300, 40);
		add(attendance);
		gpa = new JLabel(" GPA : 9.0");
		gpa.setBounds(200, 150, 100, 40);
		add(gpa);
	}
	void generateFrame(){
		setTitle("Student");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

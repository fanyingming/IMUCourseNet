package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

public class Student 
	extends User
	implements Serializable 
{
	private static final long serialVersionUID = 48L;
	private Specialty specialty;
	private Set<CourseWork> courseWorks=new HashSet<CourseWork>();
	private Set<CourseTaking> courseTakings=new HashSet<CourseTaking>();
	private Set<Letter> letters = new HashSet<Letter>();
	
	public Student(){
		
	}
	public Student(String userAccount,String userPass,String userName,String userMail){
		this.userAccount=userAccount;
		this.userPass=userPass;
		this.userName=userName;
		this.userMail=userMail;
	
	}
	
	
	public Set<Letter> getLetters() {
		return letters;
	}
	public void setLetters(Set<Letter> letters) {
		this.letters = letters;
	}
	public Set<CourseTaking> getCourseTakings() {
		return courseTakings;
	}
	public void setCourseTakings(Set<CourseTaking> courseTakings) {
		this.courseTakings = courseTakings;
	}
	public Set<CourseWork> getCourseWorks() {
		return courseWorks;
	}
	public void setCourseWorks(Set<CourseWork> courseWorks) {
		this.courseWorks = courseWorks;
	}
	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
}

package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.imu.coursenet.domain.*;

public class Teacher extends User implements Serializable {
	private static final long serialVersionUID = 48L;
	private Set<CourseDetail> courseDetails = new HashSet<CourseDetail>();
	private Set<Letter> letters = new HashSet<Letter>();

	public Teacher() {

	}

	public Teacher(String userAccount, String userPass, String userName,
			String userMail) {
		this.userAccount = userAccount;
		this.userPass = userPass;
		this.userName = userName;
		this.userMail = userMail;

	}

	public Set<Letter> getLetters() {
		return letters;
	}

	public void setLetters(Set<Letter> letters) {
		this.letters = letters;
	}

	public Set<CourseDetail> getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(Set<CourseDetail> courseDetails) {
		this.courseDetails = courseDetails;
	}

}

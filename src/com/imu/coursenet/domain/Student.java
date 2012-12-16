package com.imu.coursenet.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student extends User implements Serializable {
	private static final long serialVersionUID = 48L;
	private Specialty specialty;
	private Set<Letter> letters = new HashSet<Letter>();
	public Student() {

	}

	public Student(Specialty specialty, Department department,
			String userAccount, String userPass, String userName,
			String userMail) {
		this.specialty = specialty;
		this.department = department;
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

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
}

package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface LetterManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Letter> listAllLetter();
	
	List<Letter> listLetterByReceiverId(Integer userId);
	
	int addLetter(Teacher teacher,Student student,String title,String content);

	int deleteLetter(int letterId);

	int updateLetter(Letter letter);

	Letter getLetter(int letterId);
}

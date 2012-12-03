package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface LetterManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Letter> listAllLetter();

	int addLetter(Letter letter, int senderId, int receiverId);

	int deleteLetter(int letterId);

	int updateLetter(Letter letter);

	Course getLetter(int letterId);
}

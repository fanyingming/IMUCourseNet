package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface LetterDao {
	Letter get(Integer letterId);

	Integer save(Letter letter);

	void update(Letter letter);

	void delete(Letter letter);

	void delete(Integer letterId);

	List<Letter> findAll();
	
	List<Letter> findByReceiverId( Integer userId);
}

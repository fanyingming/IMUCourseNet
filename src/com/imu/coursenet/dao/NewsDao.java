package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface NewsDao {
	News get(Integer newsId);

	Integer save(News news);

	void update(News news);

	void delete(News news);

	void delete(Integer newsId);

	List<News> findAll();
}

package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface NewsManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<News> listAllNews();

	int addNews(News news);

	int deleteNews(int newsId);

	News getNews(int newsId);

	int updateNews(News news);
}

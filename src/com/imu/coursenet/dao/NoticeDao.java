package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface NoticeDao {
	Notice get(Integer noticeId);

	Integer save(Notice notice);

	void update(Notice notice);

	void delete(Notice notice);

	void delete(Integer noticeId);

	List<Notice> findAll();
}

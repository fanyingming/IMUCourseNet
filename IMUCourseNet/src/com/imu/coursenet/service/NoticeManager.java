package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface NoticeManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Notice> listAllNotice();

	int addNotice(Notice notice);

	int deleteNotice(int noticeId);

	Notice getNotice(int noticeId);
	int updateNotice(Notice notice);
}

package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface PostReplyDao {
	PostReply get(Integer postReplyId);

	Integer save(PostReply postReply);

	void update(PostReply postReply);

	void delete(PostReply postReply);

	void delete(Integer postReplyId);

	List<PostReply> findAll();
	List<PostReply> findbyPostId(Integer postId);
}

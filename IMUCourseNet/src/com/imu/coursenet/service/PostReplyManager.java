package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface PostReplyManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	// List<PostReply> listAllPostReply();
	int addPostReply(String content, int postId, int userId);

	int deletePostReply(int postReplyId);

	int updatePostReply(PostReply postReply);

	PostReply getPostReply(int postReplyId);

	List<PostReply> findbyPostId(Integer postId);
	
	int getPostReplyCountsByPostId(Integer postId);
}

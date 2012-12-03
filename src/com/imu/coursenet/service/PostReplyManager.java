package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface PostReplyManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	// List<PostReply> listAllPostReply();
	int addPostReply(PostReply postReply, int postId, int userId);

	int deletePostReply(int postReplyId);

	int updatePostReply(PostReply postReply);

	PostReply getPostReply(int postReplyId);
}

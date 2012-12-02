package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface PostManager {
	public static final int OP_SUCC=1;
	public static final int OP_FAIL=-1;
	
	List<Post> listAllPost();
	int addPost(Post post,int courseDetailId,int userId);
	int deletePost(int postId);
	int updatePost(Post post);
	Course getPost(int postId);
}

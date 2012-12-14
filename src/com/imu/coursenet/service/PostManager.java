package com.imu.coursenet.service;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface PostManager {
	public static final int OP_SUCC = 1;
	public static final int OP_FAIL = -1;

	List<Post> listAllPost();

	int addPost( int courseDetailId, int userId,String title,String content);

	int deletePost(int postId);

	int updatePost(Post post);

	Post getPost(int postId);
	
	List<Post> findAllByCourseDetailId(Integer courseDetailId);
	
	
}

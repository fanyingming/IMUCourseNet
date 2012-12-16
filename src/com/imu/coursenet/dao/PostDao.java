package com.imu.coursenet.dao;

import java.util.List;

import com.imu.coursenet.domain.*;

public interface PostDao {
	Post get(Integer postId);

	Integer save(Post post);

	void update(Post post);

	void delete(Post post);

	void delete(Integer postId);

	List<Post> findAllByCourseId(Integer courseId);
}

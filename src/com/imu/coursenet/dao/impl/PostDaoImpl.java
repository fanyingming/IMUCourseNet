package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.Post;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class PostDaoImpl 
	extends YeekuHibernateDaoSupport 
	implements PostDao
{

	@Override
	public Post get(Integer postId) {
		return getHibernateTemplate()
				.get(Post.class , postId);
	}

	@Override
	public Integer save(Post post) {
		return (Integer)getHibernateTemplate()
				.save(post);
	}

	@Override
	public void update(Post post) {
		getHibernateTemplate()
		.update(post);
		
	}

	@Override
	public void delete(Post post) {
		getHibernateTemplate()
		.delete(post);
		
	}

	@Override
	public void delete(Integer postId) {
		getHibernateTemplate()
		.delete(get(postId));
		
	}

	@Override
	public List<Post> findAll() {
		return (List<Post>)getHibernateTemplate()
				.find("from Post ");
	}

}

package com.imu.coursenet.dao.impl;

import java.util.List;

import com.imu.coursenet.dao.*;
import com.imu.coursenet.domain.CourseDetail;
import com.imu.coursenet.domain.Post;
import com.imu.coursenet.domain.PostReply;
import com.imu.coursenet.support.YeekuHibernateDaoSupport;

public class PostReplyDaoImpl extends YeekuHibernateDaoSupport implements
		PostReplyDao {

	@Override
	public PostReply get(Integer postReplyId) {
		return getHibernateTemplate().get(PostReply.class, postReplyId);
	}

	@Override
	public Integer save(PostReply postReply) {
		return (Integer) getHibernateTemplate().save(postReply);
	}

	@Override
	public void update(PostReply postReply) {
		getHibernateTemplate().update(postReply);

	}

	@Override
	public void delete(PostReply postReply) {
		getHibernateTemplate().delete(postReply);

	}

	@Override
	public void delete(Integer postReplyId) {
		getHibernateTemplate().delete(get(postReplyId));

	}

	@Override
	public List<PostReply> findAll() {
		return (List<PostReply>) getHibernateTemplate().find("from PostReply ");
	}

	@Override
	public List<PostReply> findbyPostId(Integer postId) {
		// TODO Auto-generated method stub
		return (List<PostReply>) getHibernateTemplate().find("from PostReply a where a.post.postId = ? ",postId);
	}

	@Override
	public int getPostReplyCountsByPostId(Integer postId) {
		return findbyPostId(postId).size();
	}

}

package com.telusko.task.feedbackDao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telusko.task.entity.Feedback;

@Component
public class FeedBackDao {
	
	@Autowired
	SessionFactory sessionfactory;
	
	@Transactional
	public void addFeedback(Feedback fb) {
		
		System.out.println("data in the dao class");
		Session session=sessionfactory.getCurrentSession();
		session.save(fb);
		
	}
	@Transactional
	public List<Feedback> getFeedbacks()
	{
		System.out.println("n vhvbn");
		Session session=sessionfactory.getCurrentSession();
		Query q=session.createQuery("from Feedback");
		List<Feedback> l=q.list();
		System.out.println("thisi is afetr methis"+l);
		return l;
		
	}
	
	@Transactional
	public void deleteFeedback(int id)
	{
		//int i=feedback.getId();
		//Feedback feedback1=(Feedback)sessionfactory.getCurrentSession().load(Feedback.class,i);
System.out.println("in delete methos ");
Session session=sessionfactory.getCurrentSession();
//if (null != feedback1) {
	//this.sessionfactory.getCurrentSession().delete(feedback1);
Feedback feb=session.byId(Feedback.class).load(id);
session.delete(feb);
System.out.println("after deete");
	}
	
	@Transactional
	public void updateFeedback(int id,Feedback feedback)
	{
		Session session=sessionfactory.getCurrentSession();
		Feedback feb=session.byId(Feedback.class).load(id);
		session.update(feedback);
		System.out.println("after updated");
		
	}

}

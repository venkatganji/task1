package com.telusko.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.task.entity.Feedback;
import com.telusko.task.feedbackDao.FeedBackDao;

@Controller
public class IndexController {
	
	@Autowired
	FeedBackDao fbd;
	
	
	Feedback feedback;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	
	@RequestMapping("/feedback")
	public String feedback()
	{ 
		System.out.println("hiii this is html page of feed back");
		return "feedback";
	}
	
	@RequestMapping("/addFeedback")
//	public String addFeedback(
//			@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("reg")String reg,@RequestParam("code")String code,@RequestParam("msg")String msg)
	public String addFeedback(@ModelAttribute Feedback feedback)
	{
		System.out.println("hiii this is html page of feed back");
		//feedback=new Feedback(name,email,reg,code,msg);
		fbd.addFeedback(feedback);
		return "index";
	}
	
	@RequestMapping("/getFeedbacks")
	public ModelAndView getFeedbacks()
	{ 
		System.out.println("hello this is feedbacks page");
		List<Feedback> l=fbd.getFeedbacks();
		System.out.println("this is after object creation");
		return new ModelAndView("Feedbacks","feedbacks",l) ;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteFeedback(@PathVariable("id") int id)
	{	
		System.out.println("this is delete method");
		fbd.deleteFeedback(id);
		return "redirect:/getFeedbacks";
		
	}
	
	@RequestMapping("/update/{id}")
	public String updateFeedback(@PathVariable("id") int id,Feedback book)
	{
		System.out.println("this is an update method");
		fbd.updateFeedback(id,book);
		return "redirect:getFeedbacks";
	}

}

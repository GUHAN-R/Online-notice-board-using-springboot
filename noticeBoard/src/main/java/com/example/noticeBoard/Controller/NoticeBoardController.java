package com.example.noticeBoard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.noticeBoard.Entity.NoticeDetails;
import com.example.noticeBoard.Entity.UserDetails;
import com.example.noticeBoard.Service.NoticeService;
import com.example.noticeBoard.Service.UserService;

@Controller

public class NoticeBoardController {
	
	private long userid;
	private String user;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private NoticeService noticeService;
	
	
	@GetMapping()
	public String Login() {
		return "login";
	}
	
	@GetMapping("/login")
	public String check(@RequestParam("Email") String mailid,@RequestParam("passwd")String pwd, Model model) {
		UserDetails userDetails = userService.findUser(mailid);
		if(userDetails != null && pwd.equals(userDetails.getPassword())) {
			userid = userDetails.getId();
			user = userDetails.getUserName();
			model.addAttribute("status","Ok");
			model.addAttribute("user",user);
			List<NoticeDetails> entries = noticeService.getall();
			model.addAttribute("entries",entries);
			return "home";
		}
		else {
			model.addAttribute("status","Incorect Email or Password");
			return "login";
		}
	}
	
	
	@GetMapping("/signin")
	public String signin() {
		return "signin";
	}
	
	@GetMapping("/UserSave")
	
	public String usersave(UserDetails userdetails, Model model) {
		UserDetails user = userService.findUser(userdetails.getUserEmail());
		if(user == null) {
			userService.save(userdetails);
			return "login";
		}
		else {
			model.addAttribute("userstat","Mail Id is already registered");
			return "signin";
		}
		
		
	}
	
	@GetMapping("/post")
	public String post() {
		return "post";
	}
	
	@GetMapping("/noticesave")
	public String noticesave(NoticeDetails noticeDetails) {
		noticeDetails.setUserId(userid);
		noticeService.save(noticeDetails);
		return "home";	
		
	}

}

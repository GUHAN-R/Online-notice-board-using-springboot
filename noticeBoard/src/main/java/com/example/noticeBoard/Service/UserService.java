package com.example.noticeBoard.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.noticeBoard.Entity.UserDetails;
import com.example.noticeBoard.Repo.UserDetailRepo;

@Service

public class UserService {
	
	@Autowired
	private UserDetailRepo userDetailRepo;
	
	public void save(UserDetails ud) {
		userDetailRepo.save(ud);
	}
	
	public UserDetails findUser(String mailid) {
		return userDetailRepo.findByUserEmail(mailid);
	}
	
	
}

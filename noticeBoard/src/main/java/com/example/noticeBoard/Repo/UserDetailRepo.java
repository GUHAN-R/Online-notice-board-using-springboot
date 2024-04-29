package com.example.noticeBoard.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.noticeBoard.Entity.UserDetails;



public interface UserDetailRepo extends JpaRepository<UserDetails, Long>{
	
	UserDetails findByUserEmail(String mailid);

}

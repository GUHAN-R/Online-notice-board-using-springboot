package com.example.noticeBoard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.noticeBoard.Entity.NoticeDetails;
import com.example.noticeBoard.Repo.NoticeBoardRepo;

@Service

public class NoticeService {
	
	@Autowired
	private NoticeBoardRepo noticeBoardRepo;
	
	public List<NoticeDetails> getall(){
		return noticeBoardRepo.findAll();
	}
	
	public void save(NoticeDetails nd) {
		noticeBoardRepo.save(nd);
	}

}

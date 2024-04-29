package com.example.noticeBoard.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.noticeBoard.Entity.NoticeDetails;


public interface NoticeBoardRepo extends JpaRepository<NoticeDetails, Long>{

}

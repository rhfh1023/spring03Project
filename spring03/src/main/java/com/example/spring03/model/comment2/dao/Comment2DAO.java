package com.example.spring03.model.comment2.dao;

import java.util.List;

import com.example.spring03.model.comment2.dto.Comment2DTO;

public interface Comment2DAO {
	
	List<Comment2DTO> getCommentList();    //목록보기
	void commentInsert(Comment2DTO dto);    //글쓰기
	Comment2DTO commentDetail(String _id);    //상세화면
	void commentUpdate(Comment2DTO dto);    //글수정
	void commentDelete(String _id);    //글삭제

}

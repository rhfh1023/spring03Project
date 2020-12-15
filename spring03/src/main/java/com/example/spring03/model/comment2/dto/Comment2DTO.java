package com.example.spring03.model.comment2.dto;

import java.util.Date;

public class Comment2DTO {
	
	int idx;
	int product_num;
	String writer;
	String memo;
	Date post_date;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getProduct_num() {
		return product_num;
	}
	public void setProduct_num(int product_num) {
		this.product_num = product_num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	@Override
	public String toString() {
		return "Comment2DTO [idx=" + idx + ", product_num=" + product_num + ", writer=" + writer + ", memo=" + memo
				+ ", post_date=" + post_date + "]";
	}
	
	


}

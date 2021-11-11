package com.fastcampus.biz.board;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

// 1. VO(Value Object) 클래스
@Data
public class BoardVO {
	// BOARD 테이블의 컬럼을 참조한 멤버변수 선언
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	
}












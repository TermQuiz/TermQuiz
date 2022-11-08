package com.termquiz.team.vo;

import java.util.Date;

import lombok.Data;

@Data
public class QnaVO {
	private int qnaNo;
	private String qnaId;
	private String qnaTitle;
	private String qnaContent;
	private String qnAanswer;
	private Date qnaTime;
	
	
}

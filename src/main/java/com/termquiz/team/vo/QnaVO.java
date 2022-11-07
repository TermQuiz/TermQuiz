package com.termquiz.team.vo;

import java.util.Date;

import lombok.Data;

@Data
public class QnaVO {
	private int qnano;
	private String qnaid;
	private String qnatitle;
	private String qnacontent;
	private String qnaanswer;
	private Date qnatime;
	
	
}

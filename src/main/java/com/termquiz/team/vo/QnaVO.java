package com.termquiz.team.vo;

import lombok.Data;

@Data
public class QnaVO {
	private int qnaNo;
	private String qnaId;
	private String qnaTitle;
	private String qnaContent;
	private String qnaAnswer;
	private String qnaTime;
	private int mlevel;
	private int currPage;
	private boolean adminRight;
}

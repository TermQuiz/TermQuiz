package com.termquiz.team.service;


import java.util.List;

import com.termquiz.team.common.PageNation;
import com.termquiz.team.vo.MemberVO;

public interface MemberService {

	int insert(MemberVO vo);

	MemberVO selectOne(MemberVO vo);

	int update(MemberVO vo);
	
	int emailCheck(MemberVO vo);

	int nicknameCheck(MemberVO vo);
	
	List<MemberVO> selectList();
	
	void scoreUpdate();
	
	List<MemberVO> rankingSort(PageNation maker);
	
	int rankingCount(PageNation maker);
	
	int addAdmin(MemberVO vo);

	int removeAdmin(MemberVO vo);
	
	int changePW(MemberVO vo);
	
	int deleteMember(MemberVO vo);
	
	int mdeletea(MemberVO vo);
	
	int levelCheck(MemberVO vo);
	
}
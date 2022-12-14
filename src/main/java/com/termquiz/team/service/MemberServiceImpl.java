package com.termquiz.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.termquiz.team.common.PageNation;
import com.termquiz.team.mapperInterface.MemberMapper;
import com.termquiz.team.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberMapper dao;
	
	@Override
	public int insert(MemberVO vo) {
		return dao.insert(vo);
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
	
		return dao.selectOne(vo);
	}

	@Override
	public int update(MemberVO vo) {
	
		return dao.update(vo);
	}
	
	@Override
	public int emailCheck(MemberVO vo) {

		return dao.emailCheck(vo);
	}
	
	@Override
	public int nicknameCheck(MemberVO vo) {
		return dao.nicknameCheck(vo);
	}
	
	@Override
	public List<MemberVO> selectList() {
		return dao.selectList();
	}
	
	@Override
	public void scoreUpdate() {
		dao.movieScoreUpdate();
		dao.musicScoreUpdate();
		dao.totalScoreUpdate();
	}
	
	@Override
	public List<MemberVO> rankingSort(PageNation maker) {
		return dao.rankingSort(maker);
	}
	
	@Override
	public int rankingCount(PageNation maker) {
		return dao.rankingCount(maker);
	}
	
	@Override
	public int addAdmin(MemberVO vo) {
		return dao.addAdmin(vo);
	}
	
	@Override
	public int removeAdmin(MemberVO vo) {
		return dao.removeAdmin(vo);
	}

	@Override
	public int changePW(MemberVO vo) {
		return dao.changePW(vo);
	}
	
	@Override
	public int deleteMember(MemberVO vo) {
		return dao.deleteMember(vo);
	}
	@Override
	public int mdeletea(MemberVO vo) {
		return dao.deleteMember(vo);
	}
	
	@Override
	public int levelCheck(MemberVO vo) {
		return dao.levelCheck(vo);
	}
	
}

package com.termquiz.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.termquiz.team.mapperInterface.QnaMapper;

import com.termquiz.team.vo.QnaVO;

@Service
public abstract class QnaServiceImpl implements QnaService {
	
	@Autowired
	QnaMapper dao;
	
	@Override
	public List<QnaVO> selectList() {
		
	return dao.selectList();
	}

    @Override
    public QnaVO selectOne(QnaVO VO) {
	
	return dao.selectOne(VO);
    }


}

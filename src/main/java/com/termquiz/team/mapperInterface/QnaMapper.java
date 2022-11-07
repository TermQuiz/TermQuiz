package com.termquiz.team.mapperInterface;

import java.util.List;

import com.termquiz.team.vo.QnaVO;

public interface QnaMapper {

	List<QnaVO> selectList();

	QnaVO selectOne(QnaVO VO);

}

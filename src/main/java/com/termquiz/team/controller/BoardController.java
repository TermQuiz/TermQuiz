package com.termquiz.team.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.termquiz.team.service.QnaService;
import com.termquiz.team.vo.QnaVO;



@Controller
public class BoardController {
	
	@Autowired
	QnaService service; 
	
	
	@RequestMapping(value = "/boardlist")
	public ModelAndView boardlist(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {

    	mv.setViewName("/board/boardList");
    	return mv;
	}
	
	@RequestMapping(value = "/qnaboardlist")
	public ModelAndView qnaboardlist(HttpServletRequest request, HttpServletResponse response, ModelAndView mv,QnaVO vo) {
         
		

		
			List<QnaVO > list = new ArrayList<QnaVO >();
	    	list = service.selectList();
	    	if ( list!=null ) {
	    		mv.addObject("user", list);  
	    	}else {
	    		mv.addObject("message", "~~ 출력 자료가 없습니다 ~~");
	    	}
	    	mv.setViewName("/board/qnaBoardList");
	    	return mv;
		
			}//qnaboardlist
         
	

	@RequestMapping(value = "/qnadetail")
	public ModelAndView qnadetail(HttpServletRequest request, HttpServletResponse response, ModelAndView mv,QnaVO vo) {
           
		 String uri = "/board/qnaDetail";
		
		// 2. Service 처리
		vo = service.selectOne(vo);
		if ( vo != null ) {
			
			
			
			
			if ( "U".equals(request.getParameter("jCode")))
				uri = "/board/qnaupdate";
			
				
			mv.addObject("user", vo);
		}else mv.addObject("message", "~~ 글번호에 해당하는 자료가 없습니다. ~~");
		
		mv.setViewName(uri);
		return mv;


	        }//qnadetail
		
   }//BoardController 




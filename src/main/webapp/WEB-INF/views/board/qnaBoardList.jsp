<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>QnA</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon"
	href="resources/home/assets/favicon.ico" />
<!-- Bootstrap Icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<!-- Google fonts-->
<link
	href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic"
	rel="stylesheet" type="text/css" />
<!-- SimpleLightbox plugin CSS-->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/SimpleLightbox/2.1.0/simpleLightbox.min.css"
	rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="resources/home/css/styles.css" rel="stylesheet" />
<link href="resources/home/css/main.css" rel="stylesheet" />
<link href="resources/qna/css/main.css" rel="stylesheet" />
</head>
<body id="page-top">
	<div id="mainlogin" class="mlhidden mlcheck"></div>
	<div id="mainlogin2" class="mlhidden"></div>
	<!-- Navigation-->
	<nav
		class="navbar navbar-expand-lg navbar-light fixed-top py-3 mlcheck"
		id="mainNav">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand " href="home">Term Quiz on a Bus</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto my-2 my-lg-0">
					<li class="nav-item"><a class="nav-link" href="home#about">Quiz</a></li>
					<li class="nav-item"><a class="nav-link" href="boardlist">Board</a></li>
					<li class="nav-item"><a class="nav-link" href="qnaboardlist">QnA</a></li>

					<c:if test="${empty loginID}">
						<li class="nav-item"><a class="nav-link" href="javascript:;"
							id="loginB">LogIn</a></li>
					</c:if>

					<c:if test="${not empty loginID}">
						<li class="nav-item"><a class="nav-link" href="mdetail">My
								Info</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</nav>

<!-- 1차 수정 -->
	<article class="articleA">
		<section class="main_content">
			<div class="qna_section1_div">
				<h4 class="qna_section1_intro">QnA</h4>
				<p class="qna_section1_p">
					궁금한 부분이 있으면 글을 남겨주세요!
				</p>
			</div>
		</section>

		<div class="desc_intro">
			<span class="txt_cno">번호</span>
			<span class="txt_id">작성자</span> 
			<span class="txt_title">제목</span>
			<span class="txt_date">작성 일시</span>
			<span class="txt_ico"></span>
		</div>

		<section>
			<div class="wrap_info">
				<ul class="list_invest">
					<li>
					<a href="" class="link_invest" id="qnalistA">
					<span class="list_cno">1</span>
					<span class="list_name">텀퀴즈</span> 
					<strong class="list_title">test</strong>
					<span class="list-date">현재 시간</span>
					<span class="ico_arr"> 
						<span class="ico_disclosure"></span>
						<!--디테일로 이동  -->
					</a>
					</li>
				</ul>
				<div class="wrap_paging">
					<a href="js참고" class="paging_num_on"> 
					<span class="screen_out">현재 페이지</span> 
					1
					</a>
				</div>
			</div>
		</section>
	</article>
	<div class="btn_container">
		<div class="btn_right">
    		<button type="button" class="btn black" onclick="location.href='home'">[글 등록]</button>
		</div>
    </div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/SimpleLightbox/2.1.0/simpleLightbox.min.js"></script>
	<script src="resources/home/js/jquery-3.2.1.min.js"></script>
	<script src="resources/home/js/scripts.js"></script>
	<script src="resources/home/js/main.js"></script>
</body>
</html>

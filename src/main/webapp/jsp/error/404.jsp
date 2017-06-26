<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/jsp/phone/public/taglibs.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
   
    <title>啊哦！404</title>
   
</head>
<style type="text/css">
			*{
				margin: 0 ;
				padding: 0;
			}
			body,html{
				width: 100%;
				height: 100%;
				position:relative;
				overflow: hidden;
			}
			.bg{
				background: #b0e2fb;

			}
			.one{
				position: absolute;
				width: 410px;
				height: 350px;
				left: 50%;
				top: 50%;
				margin-top: -175px;
				margin-left: -450px;
				background: url(../../images/404-64.png);
				
			}
			.two{
				position: absolute;
				width: 586px;
				height: 181px;
				left: 50%;
				top: 50%;
				margin-top: -170px;
			    margin-left: -50px;
				background: url(../../images/404-65.png);
			}
			.three{
				position: absolute;
				width: 287px;
				height: 28px;
				left: 50%;
				top: 50%;
				margin-top: 45px;
			    margin-left: -50px;
				background: url(../../images/404-66.png);
				cursor: pointer;
				display: block;
			}
			.four{
				position: absolute;
				width: 253px;
				height: 28px;
				left: 50%;
				top: 50%;
				margin-top: 100px;
			    margin-left: -50px;
				background: url(../../images/404-67.png);
				cursor: pointer;
				display: block;
			}
		</style>

<body>
    <body>
	<div class="bg">
			<div class="one">
				
			</div>
			<div class="two">
				
			</div>
			<a class="three" href="javascript:history.go(-1);">
				
			</a>
			<a class="four" href="javascript:location.href='/registerController/skipList.do';">
			</a>
		</div>
</body>
</body>
<script type="text/javascript">
$(function(){
	var height=$(window).height();
	$('.bg').css('height',height);
})
</script>

</html>

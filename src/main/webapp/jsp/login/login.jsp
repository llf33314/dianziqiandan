<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/jsp/admin/public/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
</head>
<body id="login">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h1 class="panel-title">多粉后台在线营销系统</h1>
                    </div>
                    <div class="panel-body loginTime">
                        <div class="form-group">
                            <input class="form-control" id="tAccount" placeholder="请输入登录的账号" type="text">
                        </div>
                        <div class="form-group">
                            <input class="form-control" id="tPassword" placeholder="请输入登录的密码" type="password">
                        </div>
                        <button class="btn btn-lg btn-success btn-block" type="submit" onclick="login();">登录</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
var lock = false;
function login() {	
	if(!lock){
	lock = true;
    var tAccount = $("#tAccount").val();
    var tPassword = $("#tPassword").val();
    var res = /^((0\d{2,3}-\d{7,8})|(1[3584]\d{9}))$/;
    if (tAccount == null || tAccount == "") {
        layer.msg('账号不能为空', {
            offset: '200px'
        }, {
            icon: 5
        });
        lock = false;
        return false;
    }
    if (tPassword == null || tPassword == "") {
        layer.msg('密码不能为空', {
            offset: '200px'
        }, {
            icon: 5
        });
        lock = false;
        return false;
    }
    var data = {
        tAccount: tAccount,
        tPassword: tPassword
    };
    $('.loginTime button').text('正在登录中...');
	    $.ajax({
	        type: 'post',
	        url: "/registerController/selectLogin.do",
	        data: data,
	        dataType: 'json',
	        success: function(data) {
	            if (data.userInfo == 1) {
	                // 失败                
	                lock = false;
	                layer.msg('用户名或密码错误', {
	                    offset: '200px'
	                }, {
	                    icon: 5
	                });
	                $('.loginTime button').text('登录');
	                return false;
	            } else if (data.userInfo == 9) {                	            	
	                setTimeout(" window.location.href = '/registerController/skipList.do'",1000)                
	            }
	        }
	    });
    }
};
$(document).keydown(function(event){
		if(event.keyCode==13){   
			login();
		} 
});
</script>

</html>

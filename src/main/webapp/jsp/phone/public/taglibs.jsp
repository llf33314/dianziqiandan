<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!-- meta -->
<meta charset="utf-8">
<meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no" name="viewport">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet" type="text/css" href="/css/phone/public/weui.min.css" />
<link rel="stylesheet" type="text/css" href="/css/phone/public/example.css" />
<link href="/css/admin/public/font-awesome-4.4.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!--[if lt IE 9]>
    <script type="text/javascript" src="/js/phone/flashcanvas.js"></script>
    <![endif]-->
<script src="/js/phone/jquery-2.2.2.js"></script>
<script src="/js/admin/vue-2.1.10.min.js"></script>
<script src="/js/phone/weui.min.js"></script>
<script src="/js/phone/jSignature.min.js"></script>
<script src="/js/admin/public/layer/layer.js"></script>
<script type="text/javascript " src="/js/phone/lrz.all.bundle.js "></script>
<script type="text/javascript " src="/js/phone/index.js "></script>

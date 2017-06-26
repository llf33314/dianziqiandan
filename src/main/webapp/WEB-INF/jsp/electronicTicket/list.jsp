<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/jsp/admin/public/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
   
</head>
<body>
<jsp:include page="/jsp/admin/electronicTicket/showWxView.jsp" />
    <div id="wrapper">
        <jsp:include page="/jsp/admin/electronicTicket/header.jsp" />
        <div id="page-wrapper" style="min-height: 999px;">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header"></h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                                                                                         列表
                        </div>
                            <div id="electronic" class="panel-body">
                                <div class="row table-toolbar">
                                    <div class="col-md-8 col-sm-8">
                                        <div class="btn-group">
                                            <button type="button" v-on:click="add()" class="btn btn-primary">
                                                                                                                                          新增
                                            </button>
                                        </div>
                                    </div>
                                    <div class="col-md-4 col-sm-4">
                                        <div class="btn-group">
                                        </div>
                                    </div>
                                </div>
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered table-hover">
                                        <thead>
                                            <tr>
                                                <th>公司名称</th>
                                                <th>客户联系号码</th>
                                                <th>办理项目</th>
                                                <th>状态</th>
                                                <th>操作</th>
                                            </tr>
                                        </thead>
                                        <tbody v-if="subList.length > 0">
                                                <tr v-for="(item,index) in subList">
                                                    <td>{{item.tName}}</td>
                                                    <td>{{item.tBusinessNumber}}</td>
                                                    <td>{{item.tProject}}</td>
                                                    <td>
                                                    	<template v-if="item.tAgreement == 1">已办理</template>
                                                    	<template v-if="item.tAgreement == 2">未办理</template>
                                                    	<template v-if="item.tAgreement == 9">已完成</template>
                                                    </td>
                                                    <td>
                                                        <template v-if="item.tAgreement == 1 || item.tAgreement == 9">
	                                                        <a class="btn btn-warning" v-on:click="editDetails(item)">
	                                                                <i aria-hidden="true" class="fa fa-tasks" title="详情">
		                                                            </i>                                                                                                                                                                                                   
	                                                        </a>&nbsp;
                                                        </template>
                                                        <template v-if="item.tAgreement == 2">
                                                        	<a class="btn btn-success" v-on:click="editOpen(item)">
	                                                            <i aria-hidden="true" class="fa fa-pencil" title="编辑">
	                                                            </i>
	                                                        </a>&nbsp;
	                                                        <a class="btn btn-danger" v-on:click="deleteConfirm(item.tId)" >
	                                                            <i aria-hidden="true" class="glyphicon glyphicon-trash" title="删除">
	                                                            </i>
	                                                        </a>&nbsp;
                                                        </template>
                                                        <template v-if="item.tAgreement == 2">
	                                                        <a class="btn btn-default" v-on:click="showView(item.tId)">
	                                                            <i aria-hidden="true" class="fa fa-link" title="链接"> 
	                                                            </i>
	                                                        </a>
	                                                    </template>
                                                    </td>
                                                </tr>
                                            
                                        </tbody>
                                        <tbody v-else>
                                                 <tr><td colspan="5">没有数据哦！</td></tr>
                                        </tbody>
                                    </table>
                                     <ul class="pagination" style="float: right;">
                                        <li><a href="javascript:;" v-on:click="first(1)" title="首页">«</a></li>
                                        <li>
                                            <a href="javascript:;" v-on:click="before()" title="上一页"> < </a>
                                        </li>
                                        <li class="active"><a href="javascript:;" title="当前页">{{curPage}}</a></li>
                                        <li><a href="javascript:;" v-on:click="next()" title="下一页">></a></li>
                                        <li><a href="javascript:;" v-on:click="last()" title="最后一页">»</a></li>
                                        <li><a href="javascript:;" title="">共{{pageCount}}页</a></li>                            
                                     </ul>
                                </div>
                            </div>
                            <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
        </div>
    </div>
    <!-- /#wrapper -->
</body>
<script src="/js/admin/electronicTicket/list.js"></script>
<script>
    
</script>
</html>

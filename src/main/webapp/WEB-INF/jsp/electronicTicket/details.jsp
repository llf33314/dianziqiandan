<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/jsp/admin/public/taglibs.jsp" %>
<!DOCTYPE html>
<html>

<head>
    
    
</head>
<style type="text/css">
.gt-size{
    width:130px;
    height:120px;
}
.form-control {    
    height: auto;   
}
</style>

<body>
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
                    <div id="electronic" class="panel panel-default">
                        <div class="panel-heading">
                                                                                       订单
                        </div>
                        <div class="panel-body">
                            <form role="form" class="form-horizontal">
                                <div class="form-group">
                                    <label for="name" class="col-sm-2 control-label">公司名称</label>
                                    <div class="col-sm-6">                                        
                                        <span class="form-control" id="tName" :value="tName" v-model="tName" v-cloak v-text="tName"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">缴费号码</label>
                                    <div class="col-sm-6">                                       
                                        <span class="form-control" id="tNumber" :value="tNumber" v-model="tNumber" v-text="tNumber"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客户联系号码</label>
                                    <div class="col-sm-6">                                        
                                        <span class="form-control" id="tBusinessNumber" :value="tBusinessNumber" v-model="tBusinessNumber" v-text="tBusinessNumber"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客户联系地址</label>
                                    <div class="col-sm-6">                                        
                                        <span class="form-control" id="tSite" :value="tSite" v-model="tSite" v-text="tSite"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">办理项目</label>
                                    <div class="col-sm-6">                                        
                                        <span class="form-control" id="tProject" :value="tProject" v-model="tProject" v-text="tProject"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">套餐内容</label>
                                    <div class="col-sm-6">
                                        <span class="form-control" id="tContent" :value="tContent" v-model="tContent" v-text="tContent"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客户经理</label>
                                    <div class="col-sm-6">
                                        <span class="form-control" id="tManager" :value="tManager" v-model="tManager" v-text="tManager"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">联系方式</label>
                                    <div class="col-sm-6">
                                        <span class="form-control" id="tPhone" :value="tPhone" v-model="tPhone" v-text="tPhone"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客服电话</label>
                                    <div class="col-sm-6">
                                        <span class="form-control" id="tService" :value="tService" v-model="tService" v-text="tService"></span>
                                    </div>
                                </div>                                
                                <div id="showDown" v-show="showFlag">
                                    <template  v-if="tShow == 3 || tShow == 4 ">
		                                <div class="form-group">
		                                    <label for="" class="col-sm-2 control-label">身份证照片</label>
		                                    <div class="col-sm-2">
		                                        <img v-bind:src="resourceurl + tIdentityCard" alt="" class="thumbnail gt-size">
		                                        <template  v-if="tAgreement != 2 || tAgreement != 9">
		                                        <a class="btn btn-default download" v-bind:href="resourceurl + tIdentityCard" download="" target="_blank"  title="下载图片">
	                                                <i aria-hidden="true" class="fa fa-cloud-download"> 
	                                                </i>
	                                            </a>&nbsp;
	                                            </template>
		                                    </div>
		                                    <div class="col-sm-2">
		                                        <img v-bind:src="resourceurl + tIdentityCard2" alt="" class="thumbnail gt-size">
		                                        <template  v-if="tAgreement != 2 || tAgreement != 9">
		                                        <a class="btn btn-default download" v-bind:href="resourceurl + tIdentityCard2" download="" target="_blank"  title="下载图片">
	                                                <i aria-hidden="true" class="fa fa-cloud-download"> 
	                                                </i>
	                                            </a>&nbsp;
	                                            </template>
		                                    </div>
		                                </div>
	                                </template>
	                                <template  v-if="tShow == 2 || tShow == 4 ">
		                                <div class="form-group">
		                                    <label for="" class="col-sm-2 control-label">营业执照</label>
		                                    <div class="col-sm-6">
		                                        <img v-bind:src="resourceurl + tBusiness" alt="" class="thumbnail gt-size">
		                                        <template  v-if="tAgreement != 2 || tAgreement != 9">
		                                        <a class="btn btn-default download" v-bind:href="resourceurl + tBusiness" download=""  target="_blank"  title="下载图片">
	                                                <i aria-hidden="true" class="fa fa-cloud-download"> 
	                                                </i>
	                                            </a>&nbsp;
	                                            </template>
		                                    </div>
		                                </div>
	                                </template>
	                                <template  v-if="tShow >= 1 || tShow <= 4 ">
		                                <div class="form-group">
		                                    <label for="" class="col-sm-2 control-label">签名照片</label>
		                                    <div class="col-sm-6">
		                                        <img v-bind:src="resourceurl + tSign" alt="" class="thumbnail gt-size">
		                                        <template  v-if="tAgreement != 2 || tAgreement != 9">
			                                        <a class="btn btn-default download" v-bind:href="resourceurl + tSign" download="" target="_blank"  title="下载图片">
		                                                <i aria-hidden="true" class="fa fa-cloud-download"> 
		                                                </i>
		                                            </a>&nbsp;
	                                            </template>
		                                    </div>
		                                </div>
	                                </template>
                                </div>                               
                                <div class="form-group" style="text-align: center;">
                                    <div class="col-md-12">
                                    <template v-if="tAgreement == 1">
                                        <button type="button" @click="passOn" class="btn btn-primary">审核通过</button>
                                        <button type="button" @click="reset" class="btn btn-danger">客户重填</button>
                                    </template>    
                                        <button type="reset" class="btn btn-default" @click="close">返回</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
        </div>
    </div>
    <!-- /#wrapper -->
    <script src="/js/admin/electronicTicket/details.js"></script>
</body>
<script type="text/javascript">

</script>

</html>

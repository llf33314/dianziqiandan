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
                                        <input type="text" id="tName" :value="tName" v-model="tName"  placeholder="请输入公司名称" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">缴费号码</label>
                                    <div class="col-sm-6">
                                        <input type="text" id="tNumber" :value="tNumber" v-model="tNumber" placeholder="请输入缴费号码" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客户联系号码</label>
                                    <div class="col-sm-6">
                                        <input type="text" id="tBusinessNumber" :value="tBusinessNumber" v-model="tBusinessNumber" placeholder="请输入办理业务号码" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客户联系地址</label>
                                    <div class="col-sm-6">
                                        <textarea class="form-control" :value="tSite" v-model="tSite" placeholder="请输入地址" id="tSite" rows="2"></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">办理项目</label>
                                    <div class="col-sm-6">
                                        <input type="text" id="tProject" :value="tProject" v-model="tProject" placeholder="请输入办理项目" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">套餐内容</label>
                                    <div class="col-sm-6">
                                        <textarea class="form-control" id="tContent" :value="tContent" v-model="tContent" placeholder="请输入业务内容" rows="2"></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客户经理</label>
                                    <div class="col-sm-6">
                                        <input type="text" id="tManager" :value="tManager" v-model="tManager" placeholder="请输入客户经理" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">联系方式</label>
                                    <div class="col-sm-6">
                                        <input type="text" id="tPhone" :value="tPhone" v-model="tPhone" placeholder="请输入联系方式" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="" class="col-sm-2 control-label">客服电话</label>
                                    <div class="col-sm-6">
                                        <input type="text" id="tService" :value="tService" v-model="tService" placeholder="请输入客服电话" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                     <label for="" class="col-sm-2 control-label">客户需要上传的资料</label>
                                     <div class="col-sm-6">
                                      <select class="form-control" v-model="tShow">		                                                                                         
                                          <option :value="1">仅上传签名</option>
                                          <option :value="2">签名和营业执照</option>
                                          <option :value="3">签名和身份证照片</option>
                                          <option :value="4">签名和营业执照和身份证照片</option>                                                
                                      </select>	                                           
                                     </div>
                                </div>
                                <div class="form-group" style="text-align: center;">
                                    <div class="col-md-12">
                                        <button type="button" @click="save" class="btn btn-primary">保存</button>
                                        <button type="reset" class="btn btn-default" @click="close">取消</button>
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
    <script src="/js/admin/electronicTicket/edit.js"></script>
</body>
<script type="text/javascript">

</script>

</html>

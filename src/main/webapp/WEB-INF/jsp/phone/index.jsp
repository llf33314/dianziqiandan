<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ include file="/jsp/phone/public/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
    <meta name="format-detection" content="telephone=no" />
    
    <title>在线电子受理单</title>
    <script type="text/javascript">
    var data = '${electronList.tId }';
    var data = {
        	"subList": [],
            "tId": '${electronList.tId }',            //Id
            "tName": '${electronList.tName }',        //公司名称
            "tNumber": '${electronList.tNumber }',    //缴费号码
            "tBusinessNumber": '${electronList.tBusinessNumber }', //客户联系号码
            "tSite": '${electronList.tSite }',        //客户联系地址
            "tProject": '${electronList.tProject }',  //办理项目
            "moniter": false,   
            "tContent": '${electronList.tContent }',  //套餐内容
            "tManager": '${electronList.tManager }',  //客户经理
            "tPhone":'${electronList.tPhone }',       //联系方式
            "tAgreement":'${electronList.tAgreement }', //协议1已办理 ，2未办理，9已完成
            "tService":'${electronList.tService }',      //客服电话
            "tShow":'${electronList.tShow }',          //客户需要上传的资料 （1仅上传签名；2签名和营业执照；3签名和身份证照片； 4签名和营业执照和身份证照片 ）
            "addImgBase_1":'',  //身份证照片
            "addImgBase_2":'',  //身份证照片2
            "addImgBase_3":'',  //营业执照
            "addImgBase_4":''   //签名照
        }   
    </script>
</head>
<style type="text/css">
#electronic{
    padding-bottom: 1.3em;
}
.weui-agree {
    text-align: center;
}

.weui-btn-area {
    margin: 1.17647059em 15px 1.3em;
    margin-bottom: 0px;
}

.id_item img {
    height: 79px;
    width: 79px;
    position: relative;
    left: -1px;
    top: -1px;
    z-index: 2;
}
#someelement{
        width:90%;
        margin:0 auto;
    }
.weui-btn_mini {
    padding: 0px 1.0em;
    line-height: 2.3;
    font-size: 13px;
}
.reset-b {
    margin-top: 10px;
}
.scroll-wrapper {  
    -webkit-overflow-scrolling: touch;  
    overflow-y: scroll;  
} 
.addImgBase_1{
    cursor: pointer 
}
.addImgBase_2{
    cursor: pointer
}
.addImgBase_3{
    cursor: pointer 
}
.pt_img_box_2 {
    margin-left:10px;
}
.pt_img_box_3 {
    margin-top:10px;
}
.weui-icon-clear {
    position: absolute;
    right: -16px;
    top: -10px;
    z-index: 999;
    cursor: pointer;
    font-size: 16px;
}
</style>

<body>
<%-- <c:forEach items="${identityCardLit }" var="identityCard">
<p>${identityCard }</p>
</c:forEach> --%>
<input id="tId" value="${electronList.tId }" type="hidden" />
<input id="tShow" value="${electronList.tShow }" type="hidden" />
<div id="electronic">
    <div class="weui-cells__title">受理信息</div>
    <div class="weui-cells weui-cells_form">
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">公司名称</label>
            </div>
            <div class="weui-cell__bd">               
                <span id="tName" :value="tName" v-model="tName" v-text="tName"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">缴费号码</label>
            </div>
            <div class="weui-cell__bd">                
                <span id="tNumber" :value="tNumber" v-model="tNumber" v-text="tNumber"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">客户联系号码</label>
            </div>
            <div class="weui-cell__bd">                
                <span id="tBusinessNumber" :value="tBusinessNumber" v-model="tBusinessNumber" v-text="tBusinessNumber"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">客户联系地址</label>
            </div>
            <div class="weui-cell__bd">               
                <span id="tSite" :value="tSite" v-model="tSite" v-text="tSite"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">办理项目</label>
            </div>
            <div class="weui-cell__bd">                
                <span id="tProject" :value="tProject" v-model="tProject" v-text="tProject"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">套餐内容</label>
            </div>
            <div class="weui-cell__bd">                
                <span id="tContent" :value="tContent" v-model="tContent" v-text="tContent"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">客户经理</label>
            </div>
            <div class="weui-cell__bd">                
                <span id="tManager" :value="tManager" v-model="tManager" v-text="tManager"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">联系方式</label>
            </div>
            <div class="weui-cell__bd">                
                <span id="tPhone" :value="tPhone" v-model="tPhone" v-text="tPhone"></span>
            </div>
        </div>
        <div class="weui-cell">
            <div class="weui-cell__hd">
                <label class="weui-label">客服电话</label>
            </div>
            <div class="weui-cell__bd">                
                <span id="tService" :value="tService" v-model="tService" v-text="tService"></span>
            </div>
        </div>
    </div>
    <template  v-if="tShow == 3 || tShow == 4 ">
	    <div class="weui-cells__title">上传相关图片</div>
	    <div class="weui-cells weui-cells_form">
	        <div class="weui-cell">
	            <div class="weui-cell__bd">
	                <div class="weui-uploader">
	                    <div class="weui-uploader__hd">
	                        <p class="weui-uploader__title">身份证照片上传</p>
	                    </div>
	                    <div class="">
	                        <section class="gt_flex id_box" id="id_box">
	                            <section class="id_item pt_img_box_1 weui-uploader__input-box weui-uploader__input-boxes">
	                                <section class="id_bg gt_flex gt_vertical_center gt_pack_center"></section>
	                                <section class="id_file">
	                                    <input type="file" accept="image/*" class="inputfile weui-uploader__input" data-id="1" id="addImgBase_1" :value="addImgBase_1" v-model="addImgBase_1" />
	                                </section>
	                            </section>
	                            <section class="id_item pt_img_box_2 weui-uploader__input-box weui-uploader__input-boxes">
					                <section class="id_bg gt_flex gt_vertical_center gt_pack_center"></section>
					                <section class="id_file">
					                    <input type="file" accept="image/*" class="inputfile weui-uploader__input" data-id="2" id="addImgBase_2" :value="addImgBase_2" v-model="addImgBase_2" />
					                </section>
					            </section>
                            </section>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
    </template>
    <template  v-if="tShow == 2 || tShow == 4 ">
	    <div class="weui-cells__title"></div>
	    <div class="weui-cells weui-cells_form">
	        <div class="weui-cell">
	            <div class="weui-cell__bd">
	                <div class="weui-uploader">
	                    <div class="">
	                        <p class="weui-uploader__title">营业执照复印件上传</p>
	                    </div>
	                    <div class="weui-uploader__bd">
		                    <section class="gt_flex id_box" id="id_box1">
		                            <section class="id_item pt_img_box_3 weui-uploader__input-box weui-uploader__input-boxes">
		                                <section class="id_bg gt_flex gt_vertical_center gt_pack_center"></section>
		                                <section class="id_file">
		                                    <input type="file" accept="image/*" class="inputfile weui-uploader__input" data-id="3" id="addImgBase_3" :value="addImgBase_3" v-model="addImgBase_3" />
		                                </section>
		                            </section>
                            </section>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</template>
	<template  v-if="tShow >= 1 || tShow <= 4 ">
	    <p class="weui-cells__title"></p>
	    <div class="weui-cells weui-cells_form">
	        <div class="weui-cell">
	            <div class="weui-cell__bd">
	                <div class="weui-uploader">
	                    <div class="weui-uploader__title">手写签名处
	                    </div>
	                    <div class="weui-uploader__hd">
	                        <div id='signature' style="width: 100%; height: 139px;border:1px dashed #999;margin-top: 12px;"></div>
	                        <div id="addImgBase_4" :value="addImgBase_4" v-model="addImgBase_4"></div>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	<button type="button" onclick="reset()" class="weui-btn weui-btn_mini weui-btn_default reset-b">
              重签
    </button>    
    </template>	    
    
    <label for="weuiAgree" class="weui-agree">
        <input id="tAgreement" type="checkbox" checked="checked" class="weui-agree__checkbox">
        <span class="weui-agree__text">
                              已阅读并同意<a  id="agreement" >《在线电子受理单协议》</a>
        </span>
    </label>
    <div class="weui-btn-area submi">
        <button type="button"  id="showResult" class="weui-btn weui-btn_primary">提交</button>
    </div>
</div>
</body>
<script src="/js/phone/editTel.js"></script>
<script type="text/javascript">
$(function() {
    $("#signature").jSignature()
})
//输出签名图片
    function jSignatureTest(){
        var $sigdiv = $("#signature"); 
        var datapair = $sigdiv.jSignature("getData", "image") 
        var i = new Image();
        i.src = "data:" + datapair[0] + "," + datapair[1] 
        return $(i)[0].src;
        $(i).appendTo($("#addImgBase_4")) // append the image (SVG) to DOM.
    }
    function reset(){
        var $sigdiv = $("#signature");
        $sigdiv.jSignature("reset");
    }
</script>
<script type="text/javascript">
$(function() {
	var lock = false;	
	var addImgBase_4_4 = jSignatureTest();
     $('#showResult').on('click', function() { 
    if(!lock){
    	lock = true;
    	var addImgBase_4 = jSignatureTest();
    	var tId = $("#tId").val();
        var tName = $("#tName").val();
        var tNumber = $("#tNumber").val();
        var tBusinessNumber = $("#tBusinessNumber").val();
        var tSite = $("#tSite").val();
        var tProject = $("#tProject").val();
        var tContent = $("#tContent").val();
        var tManager = $("#tManager").val();
        var tPhone = $("#tPhone").val();
        var tService = $("#tService").val();
        var tIdentityCard = $("#tIdentityCard").val();
        var tBusiness = $("#tBusiness").val();
        var addImgBase_1 = $("#addImgBase_1").val();
        var addImgBase_2 = $("#addImgBase_2").val();
        var addImgBase_3 = $("#addImgBase_3").val();
        var tShow = $("#tShow").val();
        var tAgreement = $("#tAgreement").val();
        var res = /^((0\d{2,3}-\d{7,8})|(1[3584]\d{9}))$/;    
        if (addImgBase_1 === '') {
            weui.topTips('请选择身份证照片');
            flag = 1;
            lock = false;
            return false;
        }
        var flag = 0;
        var addImgBase_1 = $('.addImgBase_1').attr('src'); 
        if (addImgBase_2 === '') {
            weui.topTips('请选择身份证照片');
            flag = 1;
            lock = false;
            return false;
        }
        var addImgBase_2 = $('.addImgBase_2').attr('src');  
        if (addImgBase_3 === '') {
            weui.topTips('请选择营业执照复印件');
            flag = 1;
            lock = false;
            return false;
        }
        var addImgBase_3 = $('.addImgBase_3').attr('src'); 
        
         if (addImgBase_4 === addImgBase_4_4){
            weui.topTips('请在签名处签名')
            lock = false;
            return false;
        } 
         
        if ($('#tAgreement').is(':checked')) {
            var tAgreement = '1'
        } else {
            weui.topTips('请选择已阅读并同意');
            lock = false;
            return false;
        }
        var data = {
        	tId: tId,	
            tName: tName,
            tNumber: tNumber,
            tBusinessNumber: tBusinessNumber,
            tSite: tSite,
            tProject: tProject,
            tContent: tContent,
            tManager: tManager,
            tPhone: tPhone,
            tService: tService,
            addImgBase_1: addImgBase_1,
            addImgBase_2: addImgBase_2,
            addImgBase_3: addImgBase_3,
            addImgBase_4: addImgBase_4,
            tShow: tShow,
            tAgreement: tAgreement
        };        
        $('.submi button').text('正在提交中...');
	       $.ajax({
	           url: "/electronController/updateElectron.do",
	           data: data,
	           dataType: "json",
	           type: "post",
	           success: function(data) {
	               if (data.success == 9 ) {	               		               	
	                    setTimeout(" location.href = '/cellphoneController/79B4DE7C/succeedSkip.do'",1000);
	               }else{	            	   
	                   weui.topTips('系统错误！');
	               }                
	            }
	        });
        }
    }); 
});
$(function() {
    $('#agreement').on('click', function() {
    	layer.open({
    		  type: 2,
    		  title: '  ',
    		  shadeClose: true,
    		  shade: 0.8,
    		  area: ['90%', '90%'],
    		  content: '/cellphoneController/79B4DE7C/agreementSkip.do', //iframe的url
   			  success: function(layero){
   	               $(layero).addClass("scroll-wrapper");//苹果 iframe 滚动条失效解决方式
   	            }
    		}); 
    });
});
</script>
<script src="/js/phone/phone.js"></script>
</html>


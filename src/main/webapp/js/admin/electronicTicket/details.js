
var vm = new Vue({
    el: '#electronic',
    data: {
    	"subList": [],
        "tId": '',          //Id
        "tName": '',        //公司名称
        "tNumber": '',      //缴费号码
        "tBusinessNumber": '', //客户联系号码
        "tSite": '',        //客户联系地址
        "tProject": '',     //办理项目
        "moniter": false,
        "tContent": '',     //套餐内容
        "tManager": '',     //客户经理
        "tPhone":'',        //联系方式
        "tService":'',      //客服电话
        "tShow":'',         //客户需要上传的资料 （1仅上传签名；2签名和营业执照；3签名和身份证照片； 4签名和营业执照和身份证照片 ）
        "addImgBase_1":'',  //身份证照片
        "addImgBase_2":'',  //身份证照片2
        "addImgBase_3":'',  //营业执照
        "addImgBase_4":'',  //签名照
        "tIdentityCard":'', //身份证照片
        "tIdentityCard2":'', //身份证照片2
        "tBusiness":'',     //营业执照
        "tSign":'',         //签名照
        "resourceurl":'',   //图片前缀
        "tAgreement":'',    //协议1已办理 ，2未办理，9已完成
        "pass": 9,          //审核
        "showFlag":false
        },
        mounted:function(){
    	this.onLoad();
    },
    watch:{
    	'tAgreement':function(){
    		
    	}
    },
    methods:{
    	onLoad:function(){
    		var cur = localStorage.str;
    			var str1 = JSON.parse(cur)
        		this.tId = str1.tId;
        		this.tName = str1.tName;
        		this.tNumber = str1.tNumber;
        		this.tBusinessNumber = str1.tBusinessNumber;
        		this.tSite = str1.tSite;
        		this.tProject = str1.tProject;
        		this.tContent = str1.tContent;
        		this.tManager = str1.tManager;
        		this.tPhone = str1.tPhone;
        		this.tService = str1.tService;
        		this.tShow = str1.tShow;
        		this.addImgBase_1 = str1.addImgBase_1;
        		this.addImgBase_2 = str1.addImgBase_2;
        		this.addImgBase_3 = str1.addImgBase_3;
        		this.tIdentityCard = str1.tIdentityCard;
        		this.tIdentityCard2 = str1.tIdentityCard2;
        		this.tBusiness = str1.tBusiness;
        		this.tSign = str1.tSign;        		
        		this.tAgreement = str1.tAgreement || 0;
        		this.resourceurl = localStorage.resourceurl;
        		if(this.tAgreement == 1 || this.tAgreement == 9){
        			this.showFlag = true;
        		}else{
        			this.showFlag = false;
        		}
    	},
        passOn: function(tId,index) { //审核弹出框		
            var that = this;
            if (tId != 1) {
                parent.layer.confirm("确定审核通过吗？", { offset: '200px' }, function() {
                    that.passConfirm(tId, index);
                })
            } else{
                
            }
        },
        passConfirm: function() {
    		var that = this;    	
    		var options = {
				url:'/electronController/auditPass.do',
				type:'get',
				data:{tId:that.tId},
				success:function(data){
					if(data.success == 9){
						layer.msg('审核通过',{offset:'200px'},{icon:5});
						setTimeout(" location.href = '/registerController/skipList.do'",1000)
					}else{
						layer.msg('审核不通过',{offset:'200px'},{icon:5});
					}
				}
			}
			$.ajax(options)
    	},
    	reset: function(tId,index) { //重填询问框
    		if(this.tAgreement == 9){
	   			 layer.msg('已完成,信息不可重填',{offset:'200px'},{icon:5});
	                return;
	   		}
            var that = this;
            if (tId != 1) {
                parent.layer.confirm("确定要重填么？", { offset: '200px' }, function() {
                    that.resetConfirm(tId, index);
                })
            } else{
                
            }
        },
    	resetConfirm: function() {
    		var that = this;    	
    		var options = {
				url:'/electronController/deletePicture.do',
				type:'post',
				data:{tId:that.tId},
				success:function(data){
					if(data.success == 9){
						layer.msg('重置成功',{offset:'200px'},{icon:6});
						setTimeout(function(){
							window.history.go(-1);
						},2000)
						$('#showDown').hide();
					}else{
						$('#showDown').show();
					}
				}
			}
			$.ajax(options)
    		return;                        
		},
		close: function() { //返回上一页
			window.history.go(-1);
        },
		
    }

});



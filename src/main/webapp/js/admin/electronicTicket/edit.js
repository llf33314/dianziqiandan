
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
        "tAgreement":'',    //协议1已办理 ，2未办理，9已完成
        "tShow":1,         //客户需要上传的资料 （1仅上传签名；2签名和营业执照；3签名和身份证照片； 4签名和营业执照和身份证照片 ）
        "lock" : false
        },
        mounted:function(){
    	this.onLoad();
    },
    methods:{
    	onLoad:function(){
    		var cur = localStorage.str;
    		if(cur != ''){
    			var str1 = JSON.parse(cur);  
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
        		this.tAgreement = str1.tAgreement;
    		}
    	},
    	save: function() {
		if(!this.lock){
        	this.lock = true;
            var that = this;
            var reg = /^([hH][tT]{2}[pP]:\/\/|[hH][tT]{2}[pP][sS]:\/\/)(([A-Za-z0-9-~]+)\.)+([A-Za-z0-9-~\/])+$/;
            var reg1 = /^\s*|\s*$/g;
            var str = "                           yexj00 ";
            var newstr = str.replace(reg1, '');
            var data = {
                tId: this.tId,
                tName: this.tName.replace(/^\s*|\s*$/g, ''),
                tNumber: this.tNumber.replace(/^\s*|\s*$/g, ''),
                tBusinessNumber: this.tBusinessNumber.replace(/^\s*|\s*$/g, ''),
                tSite: this.tSite.replace(/^\s*|\s*$/g, '').replace(/[\r\n]/g,""),
                tProject: this.tProject.replace(/^\s*|\s*$/g, ''),
                tContent: this.tContent.replace(/^\s*|\s*$/g, '').replace(/[\r\n]/g,""),
                tManager: this.tManager.replace(/^\s*|\s*$/g, ''),
                tPhone: this.tPhone.replace(/^\s*|\s*$/g, ''),
                tService: this.tService.replace(/^\s*|\s*$/g, ''),
                tAgreement: this.tAgreement,
                tShow: this.tShow
            }
            if (data.tName.length == '') {
                layer.msg('公司名称不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tName.length > '50'){
            	layer.msg('输入的公司名称不能超过50个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tNumber.length == '') {
                layer.msg('缴费号码不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tNumber.length > '20'){
            	layer.msg('输入缴费号码不能超过20个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tBusinessNumber.length == '') {
                layer.msg('客户联系号码不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tBusinessNumber.length > '11'){
            	layer.msg('输入客户联系号码不能超过11个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tSite.length == '') {
                layer.msg('客户联系地址不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tSite.length > '50'){
            	layer.msg('输入客户联系地址不能超过50个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tProject.length == '') {
                layer.msg('办理项目不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tProject.length > '25'){
            	layer.msg('输入办理项目不能超过25个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tContent.length == '') {
                layer.msg('套餐内容不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tContent.length > '25'){
            	layer.msg('输入套餐内容不能超过25个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tManager.length == '') {
                layer.msg('客户经理不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tManager.length > '10'){
            	layer.msg('输入客户经理不能超过25个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tPhone.length == '') {
                layer.msg('联系方式不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return;
            }else if(data.tPhone.length > '11'){
            	layer.msg('输入联系方式不能超过11个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if (data.tService.length == '') {
                layer.msg('客服电话不能为空',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }else if(data.tService.length > '15'){
            	layer.msg('输入客服电话不能超过15个字符',{offset:'200px'},{icon:5});
                this.lock = false;
                return false;
            }
            if(localStorage.str == ''){ //新增
            	var url = '/electronController/insertElectron.do'
            }else{ //编辑
            	var url = '/electronController/updateElectron.do'
            }
            //console.log(typeof(JSON.stringify(data)),1);                           
            	var options = {
                		url: url,
                        data: data,
                        dataType: "json",
                        async:"false",
                        type: "post",                        
                        success: function(data) {    
                            if (data.success == 9) {
                                layer.msg('保存成功');
                              setTimeout(" location.href = '/registerController/skipList.do'",1000)
                            }else{
    							layer.msg("保存失败",{offset:'200px'},{icon:6})
    						}
                        }
    			}
    			$.ajax(options);
            	}            
		},
		close: function() { //返回上一页
			window.history.go(-1);
        },
		
    }

});



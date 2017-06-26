
var vm = new Vue({
    el: '#electronic',
    data: {
    	"subList": [],
        "tId": '',             //Id
        "tName": '',           //公司名称
        "tNumber": '',         //缴费号码
        "tBusinessNumber": '', //办理业务号码
        "tSite": '',           //地址
        "tProject": '',        //办理项目
        "moniter": false,
        "tContent": '',        //业务内容
        "tManager": '',        //客户经理
        "tPhone":'',           //联系方式
        "tService":'',         //客服电话
        "tAgreement": '',      //协议=== 1 , 2 , 9
        "tShow": '',           //显示添加那些图片 （1签字照片；2签字照片和营业执照；3签字照片和身份证照片； 4签字照片和营业执照和身份证照片 ）
        "curPage": 1,          //当前页数
        "lastPage":'',         //最后页数
        "isNextPage": false,
        "isPrePage": false,
        "nextPageAvailable": false,
        "previousPageAvalable": false,
        "pageCount": 1
    },
    mounted: function() //首次加载list数据
    {
		    this.onLoad();
	},
    watch: {
        "moniter": function() { //监听子页面改变父页面的状态
            this.onLoad();
        }
    },
    ready: function() {
        alert("加载完成");
    },
    methods:{
		onLoad:function(state){  //请求数据
			var that = this;
			var options = {
				url:'/electronController/selectElectronList.do',
				type:'post',
				data:{page:that.page},				
				success:function(data){
					if(data.success == 9){
						that.getList(data.page.subList);
						that.pageCount =data.page.pageCount;
						that.lastPage = data.page.lastPage;
						localStorage.resourceurl=data.resourceurl;
					}else{
						parent.layer.msg(data.desc,{offset:'200px'},{icon:5});
					}
				}
			}
			$.ajax(options)
		},
		getList:function(data){ //渲染list
			this.subList =data;
		},
		add:function(){ //打开新增	
			localStorage.str = '';			
			location.href = "/electronController/insertSkip.do";
			
		},
		editOpen:function(item){ //打开修改				
			var str = JSON.stringify(item);  
			localStorage.str=str;			
			location.href = '/electronController/updateSkip.do';
		},
		editDetails:function(item){ //打开详情	
			var str = JSON.stringify(item);  
			localStorage.str=str;
			location.href = '/electronController/detailsSkip.do';
		},        
        showView: function(tId){   //提取链接
        	var options = {
    				url:'/electronController/getLink.do',
    				type:'post',
    				data:{tId:tId},
    				success:function(data){
    					if(data.url){
    						$("#zeroUrl").val(data.url);
    						$("#viewDiv").show();
    						$('body').find("#wxRcode")[0].src = '/electronController/getElectronQRcode.do?tId='+tId;
    					}else{
    						parent.layer.msg(data.desc,{offset:'200px'},{icon:5});
    					}
    				}
    			}
    			$.ajax(options)
        },        
        deleteConfirm: function(tId, index) { //删除询问框
            var that = this;
            if (tId != undefined) {
                parent.layer.confirm("确定要删除么？", { offset: '200px' }, function() {
                    that.deleteSubmit(tId, index);
                })
            } else{

            }
        },
        deleteSubmit:function(tId,index){ //删除
            var that = this;
            var options = {
                url:'/electronController/deleteElectronByIDl.do',
                type:'post',
                data: {tId:tId} ,
                success:function(data){
                    if(data.success == 9){
                        parent.layer.msg("删除成功",{offset:'200px'},{icon:6})
                       setTimeout("window.location.reload()",1000)
                    }else{
                        parent.layer.msg("删除失败",{offset:'200px'},{icon:5})
                    }
                }
            }
            $.ajax(options)
        }, 
        first:function(page){
        	var that = this;
			var options = {
				url:'/electronController/selectElectronList.do',
				type:'post',
				data:{page:1},
				success:function(data){
					if(data.success == 9){
						that.getList(data.page.subList);
						that.pageCount =data.page.pageCount;
						that.curPage = 1;
						that.lastPage = data.page.lastPage;
						parent.layer.msg('已经是首页',{offset:'500px'});						
					}else{
						parent.layer.msg(data.desc,{offset:'200px'},{icon:5});
					}
				}
			}
			$.ajax(options)
		},
		last:function(){
			var that = this;
			var options = {
				url:'/electronController/selectElectronList.do',
				type:'post',
				data:{pageNum:that.lastPage},
				success:function(data){
					if(data.success == 9){
						that.getList(data.page.subList);
						that.pageCount =data.page.pageCount;
						that.curPage = data.page.lastPage;
						that.lastPage = data.page.lastPage;
						parent.layer.msg('已经是最后一页',{offset:'500px'}); 
					}else{
						parent.layer.msg(data.desc,{offset:'200px'},{icon:5});
					}
				}
			}
			$.ajax(options)
		},
		before:function(){
			var that =this;
			that.curPage = that.curPage - 1;
			if(that.curPage <= 1){
				that.curPage = 1;				
			}			
			var options = {
				url:'/electronController/selectElectronList.do',
				type:'post',
				data:{pageNum:that.curPage},
				success:function(data){
					if(data.success == 9){
						that.getList(data.page.subList);
						that.pageCount =data.page.pageCount;	
						that.lastPage = data.page.lastPage;
					}else{
						parent.layer.msg('已经是第一页了',{offset:'200px'},{icon:5});
					}
				}
			}
			$.ajax(options)
		},
		next:function(){
			var that =this;
			that.curPage = that.curPage + 1;
			if(that.curPage > that.pageCount){
				that.curPage = that.pageCount;
			}
			var options = {
				url:'/electronController/selectElectronList.do',
				type:'post',
				data:{pageNum:that.curPage},
				success:function(data){
					if(data.success == 9){
						//that.getList(data.page.subList);//
						that.subList = data.page.subList;
						that.pageCount =data.page.pageCount;
						that.lastPage = data.page.lastPage;
						/*parent.layer.msg('第'+that.pageCount+'页',{offset:'500px'},{icon:5});*/
					}else{
						parent.layer.msg(data.desc,{offset:'200px'},{icon:5});
					}
				}
			}
			$.ajax(options)
		}
    }

});



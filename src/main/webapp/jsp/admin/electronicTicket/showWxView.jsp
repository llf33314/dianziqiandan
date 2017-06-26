<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link href="/css/admin/public/showWxView.css" rel="stylesheet">
<script type="text/javascript" src="/js/copy/clipboard.min.js"></script>
<script type="text/javascript" src="/js/copy/copypublic.js"></script>
<div id="viewDiv">
    <span onclick="closeThePreview()" style="position:absolute;font-size: 27px;cursor:pointer;right: 10px;top:0" id="closeThePreview">
        <img class="img-close" src="/images/close.png" alt="点击关闭"></span>
    <div class="previewErWeiMa" style="border: 1px solid #dedede;width: 450px;display:inline-block;background-color:#fff;padding:40px 30px 30px 30px;">
        <div style="width: 450px;margin-top:20px;height:29px">
            <img id="wxRcode" style="margin-left: -75px;margin-bottom: 40px; width:220px;height:220px;border:1px solid #ddd" src="">
            <input type="text" id="zeroUrl" style="float: left;width: 335px;height: 25px;overflow: hidden" value=""/>
            <button data-clipboard-target="#zeroUrl" aria-label="复制成功！"
                    style="float: left;color: #fff;font-size: 15px;height: 25px;border: none;background: #8FC41A;border-left: none;
                    padding: 0;cursor: pointer" id="ZeroCopyUrl">复制链接</button>
        </div>
    </div>
</div>
<script>
    function showView(tId) {
        var options = {
				url:'/electronController/getLink.do',
				type:'post',
				data:{page:that.page},				
				success:function(data){
					if(data.url){
						$("#zeroUrl").val(data.url);
					}else{
						parent.layer.msg(data.desc,{offset:'200px'},{icon:5});
					}
				}
			}
			$.ajax(options)
			/* $("#wxRcode").attr("src","/common/getWxQRcode.do?url="+wxUrl);  */			
		    //$("#wxRcode").attr("src","/electronController/getElectronQRcode.do");
			$('body').find("#wxRcode")[0].src = '/images/404-64.png';
            $("#viewDiv").show();
        }
        $("#ZeroCopyUrl").click(function(){
            var clipboard = new Clipboard("#ZeroCopyUrl");
            clipboard.on('success', function(e) {
                parent.layer.msg("复制成功",{offset:'200px'},{icon:6})
                e.clearSelection();
            });
        })
        function closeThePreview() {
            $('#viewDiv').hide();
        }
</script>
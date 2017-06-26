<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/jsp/phone/public/taglibs.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
   
    <title>在线电子受理单</title>
   
</head>
<style type="text/css">
.weui-article {
    padding: 5px 15px 0px 15px;
}

.weui-article h1 {
    font-weight: bold;
    margin-bottom: 5px;
}

.center {
    text-align: center;
}
.weui-btn-area {
    margin: 1.17647059em 15px 1.7em;
    margin-bottom: 0px;
    padding-bottom: 15px;
}
.padd-0{
    margin-left: 14px;
}
.subtitle{
    font-size: 14px;
    font-weight: bold;
}
</style>

<body>
    <div class="weui-panel">
        <article class="weui-article">
            <h1 class="center">电子合同服务协议</h1>
            <section>
                <p><span class="padd-0">客户（以下简称甲方）与中国电信股份有限公司广东分公司代理服务商（以下简称乙方），经过友好协商，双方就电子合同相关产品服务及资费达成以下协议。</span>
                    <br><span class="subtitle">一、甲方的权利与义务</span>
                    <br><span class="padd-0">1.甲方同意电子合同所记载的业务及相关资费，并给予在《在线电子受理单》签名确认。</span>
                    <br><span class="padd-0">2.甲方须提供被捆绑电话机主的相关证明材料，例如私人机主签名、单位机主盖公章的材料。</span>
                    <br><span class="padd-0">3.甲方提供签名及证件要确保真实性，如虚假行为，造成的一切法律后果，由甲方承担。</span>
                    <br><span class="padd-0">4.甲方如对业务及资费不清楚，可直接电话咨询在线电子受理单所记录的服务电话。</span>
                    <br><span class="subtitle">二、乙方的权利与义务</span>
                    <br><span class="padd-0">1.乙方承诺向甲方提供电子合同所记载业务给予甲方使用。</span>
                    <br><span class="padd-0">2.由于以下原因（包括但不限于），乙方有权拒绝受理或停止相关业务服务，并且已交的费用不予退还。
                          1) 甲方填写内容不真实，提供的材料不合法。</span>
                    <br><span class="padd-0">3.乙方对甲方填写本表的内容以及相关附件进行审查核对，如不符合办理条件时将作退单处理。</span>
                    <br><span class="padd-0">4.甲乙双方不得向第三方透露本协议内容。本受理表所有内容及说明解释权属乙方所有。</span>
                    <br><span class="subtitle">三、业务结算</span>
                    <br><span class="padd-0">乙方以合单收费的方式，向甲方收取商务七彩铃音制作费，并与甲方申请开通的电话合单收取。</span>
                    <br><span class="subtitle">四、协议变更</span>
                    <br><span class="padd-0">本协议若遇国家电信资费或收费政策调整导致履行情况发生重大变化，则乙方可根据国家电信资费政策规定进行相应资费调整。</span>
                    <br><span class="subtitle">五、附则</span>
                    <br><span class="padd-0">1.中国电信股份有限公司广东分公司代理服务商与客户确认的《在线电子受理单》是本协议不可分割的一部分。</span>
                    <br><span class="padd-0">2.在协议有效期内，未经乙方同意，甲方不得向第三方转让本合同中所规定的任何权利和义务。 </span>
                    <br><span class="padd-0">3.本在线电子受理单协议自甲方签字盖章之日起生效。</span>
                </p>
            </section>
        </article>
    </div>
    <div class="weui-btn-area"> <input id="tAgreement" onclick='back()' class="weui-btn weui-btn_primary" value="我已阅读并同意"> </div>
   
</body>
<script type="text/javascript">
function back() {
	var tAgreement = $("#tAgreement").val();
	var index = parent.layer.getFrameIndex(window.name);
	   parent.layer.close(index);
}
</script>

</html>

window.onerror = function (errMsg, scriptURI, lineNumber, columnNumber, errorObj) {
    setTimeout(function () {
        var rst = {
            "错误信息：": errMsg,
            "出错文件：": scriptURI,
            "出错行号：": lineNumber,
            "出错列号：": columnNumber,
            "错误详情：": errorObj
        };
        $("#postloadImg").hide();
        //alert('出错了，下一步将显示错误信息');
        //alert(JSON.stringify(rst, null, 10));
    });
};

[].forEach.call(document.querySelectorAll('[data-src]'), function (el) {
    (function (el) {
        el.addEventListener('click', function () {
            el.src = 'img/loading.gif';

            lrz(el.dataset.src)
                .then(function (rst) {
                    el.src = rst.base64;


                    return rst;
                });
        });

        fireEvent(el, 'click');
    })(el);
});
//document.querySelector('.inputfile').addEventListener('change', function () {
//  
//    var that = this;
//    lrz(that.files[0], {
//        width: 800
//    })
//    .then(function (rst) {
//        var img = new Image(),
//            div = document.createElement('div'),
//            p = document.createElement('p'),
//            aDelete = document.createElement('a'),
//            input = document.createElement('input'),
//            sourceSize = toFixed2(that.files[0].size / 1024),
//            resultSize = toFixed2(rst.fileLen / 1024),
//            scale = parseInt(100 - (resultSize / sourceSize * 100));
//
//        p.style.fontSize = 13 + 'px';
//        p.innerHTML      = '源文件：<span class="text-danger">' +
//            sourceSize + 'KB' +
//            '</span> <br />' +
//            '压缩后传输大小：<span class="text-success">' +
//            resultSize + 'KB (省' + scale + '%)' +
//            '</span> ';
//        console.log('KB (省' + scale + '%)')
//        img.src = rst.base64;
//        img.onload = function () {
//          console.log(img)
//          $(img).addClass('addImgBase');
//          $('.pt_img_box').html('').append(img);
//          $(img).siblings('.id_bg').hide();
//            $('img[name="pt_img"]').attr('src',rst.base64)
//        };
//        
//        return rst;
//    });
//});


function toFixed2 (num) {
    return parseFloat(+num.toFixed(2));
}

/**
 * 替换字符串 !{}
 * @param obj
 * @returns {String}
 * @example
 * '我是!{str}'.render({str: '测试'});
 */
String.prototype.render = function (obj) {
    var str = this, reg;

    Object.keys(obj).forEach(function (v) {
        reg = new RegExp('\\!\\{' + v + '\\}', 'g');
        str = str.replace(reg, obj[v]);
    });

    return str;
};

/**
 * 触发事件 - 只是为了兼容演示demo而已
 * @param element
 * @param event
 * @returns {boolean}
 */
function fireEvent (element, event) {
    var evt;

    if (document.createEventObject) {
        // IE浏览器支持fireEvent方法
        evt = document.createEventObject();
        return element.fireEvent('on' + event, evt)
    }
    else {
        // 其他标准浏览器使用dispatchEvent方法
        evt = document.createEvent('HTMLEvents');
        // initEvent接受3个参数：
        // 事件类型，是否冒泡，是否阻止浏览器的默认行为
        evt.initEvent(event, true, true);
        return !element.dispatchEvent(evt);
    }
}



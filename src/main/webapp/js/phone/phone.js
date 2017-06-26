function imgBase(t, ids) {
    var that = t;
    lrz(that.files[0], {
            width: 800
        })
        .then(function(rst) {
            var img = new Image(),
                div = document.createElement('div'),
                p = document.createElement('p'),
                sourceSize = toFixed2(that.files[0].size / 1024),
                resultSize = toFixed2(rst.fileLen / 1024),
                scale = parseInt(100 - (resultSize / sourceSize * 100));
            /*console.log('KB (省' + scale + '%)')*/
            img.src = rst.base64;
            img.onload = function() {
                $(img).addClass('addImgBase_' + ids);
                $('.pt_img_box_' + ids + '').html('').append('<i class="weui-icon-clear"></i>',img);
                $(img).siblings('.id_bg').hide();
                $('img[name="pt_img "]').attr('src', rst.base64);
                //$("#id_box .weui-uploader__input-box").removeClass("weui-uploader__input-box:before");
            };
            return rst;
        });
};
$(function() {
    var imgFlag = 1;
    $(document).on('click', '.pt_img_box_1 .weui-icon-clear', function() {
        var _this = $(this);
        var id_item = _this.parents('.id_item');
        var h = '<div class="id_bg gt_flex gt_vertical_center gt_pack_center"></div><div class="id_file "><input type="file" accept="image/*" class="inputfile weui-uploader__input" data-id="1" id="addImgBase_1"></div>';
        id_item.html('').append(h);
    }).on('click', '.pt_img_box_2 .weui-icon-clear', function() {
        var _this = $(this);
        var id_item = _this.parents('.id_item');
        var h = '<div class="id_bg gt_flex gt_vertical_center gt_pack_center"></div><div class="id_file "><input type="file" accept="image/*" class="inputfile weui-uploader__input" data-id="2" id="addImgBase_2"></div>';
        id_item.html('').append(h);
    }).on('click', '.pt_img_box_3 .weui-icon-clear', function() {
        var _this = $(this);
        var id_item = _this.parents('.id_item');
        var h = '<div class="id_bg gt_flex gt_vertical_center gt_pack_center"></div><div class="id_file "><input type="file" accept="image/*" class="inputfile weui-uploader__input" data-id="3" id="addImgBase_3"></div>';
        id_item.html('').append(h);
    })
    .on('change', '.inputfile', function() {
        var that = this;
        var ids = $(this)[0].dataset.id;
        imgBase(that, ids)
    })
    function initp() {
        var pl = 5.4 / 9;
        var pw = $(".id_box ").find("div ").eq(0).width();
        var ph = pw * pl;
        $(".id_box ").find("div ").css("height ", ph);
    }
    initp();
});
//监听选择文件事件 检查文件类型和大小
function changeFile(obj) {
    //遮罩层
    var fileId = $(obj).attr("id ");
    var uploadFile = document.getElementById(fileId);
    var fileName = uploadFile.value;
    fileName = fileName.toUpperCase();
    if (uploadFile.files[0].size > (2 * 1024 * 1024)) {
        layerMsg("上传文件不能大于2M！ ");
        return false;
    }
    var index = fileName.lastIndexOf(". ");
    fileName = fileName.substring(index + 1);
    if ("JPG " == fileName || "JPEG " == fileName || fileName == "PNG ") {
        return true;
    } else {
        layerMsg("照片格式限于jpg,jpeg,png格式！ ");
        return false;
    }
}
//信息提示
function layerMsg(msg) {
    layer.open({
        content: msg,
        skin: 'msg',
        time: 2 //2秒后自动关闭
    });
}
//获取图片
function getImgs() {
    var array = [];
    $("#id_box img ").each(function(index) {
        if ($(this).attr("src ") != " ") {
            var obj = {};
            obj["imgUrl "] = $(this).attr("src ");
            array.push(obj);
        }
    });
    return array;
}
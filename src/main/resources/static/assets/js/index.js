// var send = false
document.write("<script type='text/javascript' src='rolldate.min.js'></script>");





var send2 = false
/*发送数据*/
var submittimes = 0;
function put() {
    var data = $("#data").serialize();
    console.log(data)
    debugger
    if(confirm("是否确认提交？")){
        if (submittimes>=1){
            // if (submittimes>=999){
            alert("请勿重复提交!")
        }
        /*        else if (send2 ==false){
                    checkInput()
                }*/else{
            checkInput();
            $.ajax({
                url:"/inform/save",
                data: data,
                type: "post",
                beforeSend:function(){
                    /*$("#loading").html("<img src='../assets/img/loading.gif' /><br>数据提交中，请勿操作...");*/
                    $("#bg,.loading").show();
                },
                success:function (res) {
                    console.log(res)

                    if("ok"==res){
                        $("#loading").remove();
                        alert("提交成功!")
                        $("#bg,.loading").remove();
                        submittimes++;
                    }else{
                        $("#loading").remove();
                        alert("提交失败!")
                    }
                },
                complete:function(){
                    //$("#loading").remove();
                    $("#bg,.loading").remove();
                },
                error:function (err) {
                    console.log(err)
                    alert("提交失败!")
                },
            })
        }
    }
}

function inputValue(obj){
  //console.log(obj)
    //获取数据类型
    var type = obj.parentElement.getAttribute("name");
    var content = prompt("请输入")
    if (content==null){
        content = ""
    }
    obj.innerHTML=content+'<input name ="'+type+'" type=hidden value="'+content+'">';
}
var friend = 2 ;
var family = 3;
function addMember(size) {
        if(size == 3){ //家庭
            var count = document.getElementById("family").getElementsByTagName("tr").length;
            if(count>=size){
                alert("最多填写三名.")
            }else {
                document.getElementById("family").insertAdjacentHTML("beforeend", '<tr name="family'+family+'">\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="family'+family+'" type="hidden" value=""></td>\n' +
                    '                                                </tr>');
                family++;
            }
        }
        if(size == 2) { //盆友
            count = document.getElementById("friend").getElementsByTagName("tr").length;
            if (count >= size) {
                alert("最多填写两名.")
            } else {
                document.getElementById("friend").insertAdjacentHTML("beforeend", '<tr name="friend'+friend+'">\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                    <td onclick="inputValue(this)">请点击<input name="friend'+friend+'" type="hidden" value=""></td>\n' +
                    '                                                </tr>');
                friend++;
            }
        }
}
var studytimes = 2;
var traintimes = 2;
var trainDate = 3;
var traincertificate = 6;

function addStudy(size,type) {
    if(type==1){  //学校
        var count = document.getElementById("study").getElementsByTagName("block").length;
        if(count>=size){
            alert("最多填写三个.")
        }else {
            document.getElementById("study").insertAdjacentHTML("beforeend", '<hr /><block>\n' +
                '                                                学校名称 <input name="school'+studytimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                    <div class="col-xs-6 mydate " >\n' +
                '                                                由 <input name="scdate'+studytimes+'1" type="date" class="form-control" placeholder="">\n' +
                '                                                    </div>\n' +
                '                                                    <div class="col-xs-6 mydate">\n' +
                '                                                至 <input name="scdate'+studytimes+'2" type="date" class="form-control" placeholder="">\n' +
                '                                                    </div>\n' +
                '                                                专业 <input name="major'+studytimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                学历 <input name="education'+studytimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                学位 <input name="aDegree'+studytimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                </block>')
            studytimes ++;
        }
    }
    if(type==2){  //培训
        var count = document.getElementById("train").getElementsByTagName("block").length;
        if(count>=size){
            alert("最多填写三个.")
        }else {
            document.getElementById("train").insertAdjacentHTML("beforeend",
                                                                '<hr /> <block>\n' +
                '                                                    培训机构 <input name="train'+traintimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                    <div class="col-xs-6 mydate " >' +
                '                                                        由 <input name="tdate'+ trainDate++ +'" type="date" class="form-control" placeholder="">' +
                '                                                    </div>' +
                '                                                    <div class="col-xs-6 mydate">' +
                '                                                        至 <input name="tdate'+ trainDate++ +'" type="date" class="form-control" placeholder="">' +
                '                                                    </div>' +
                '                                                    培训内容 <input name="content'+traintimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                    培训结果/证书 <input name="course'+traintimes+'" type="text" class="form-control" placeholder="">\n' +
                '                                                </block>');
            traintimes ++;
            traincertificate ++;
        }
    }
}

/*var exp = 2;
var stime = 9;
var etime = 10;
function addExp(size){  //添加工作经历
    var count = document.getElementById("experience").getElementsByTagName("block").length;
    if(count>=size){
        alert("最多填写四段经历.")
    }else {
        document.getElementById("experience").insertAdjacentHTML("beforeend",
            '                                               <hr /> <block>\n' +
            '                                                    <table class="table table-striped table-condensed" id="experience">' +
            '                                                    <tr>' +
            '                                                        <th colspan="3" style="border-bottom: 1px solid #2e6da4;">工作经历'+exp+'</th>' +
            '                                                    </tr>' +
            '                                                    <tr  name="experience'+exp+'">' +
            '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">起止日期</th>' +
            '                                                        <td style="border-right: 1px solid #2e6da4;background: #ffffff;"><input name="experience'+exp+'" type="text" value="" class="form-control" id="date-group1-'+stime+'" placeholder="开始时间" onclick="initDate()" style="height: 28px;border: none;margin: -3px 0px;padding: 6px 0px;"></td>' +
            '                                                        <td style="border-right: 1px solid #2e6da4;background: #ffffff;"><input name="experience'+exp+'" type="text" value="" class="form-control" id="date-group1-'+etime+'" placeholder="结束时间" onclick="initDate()" style="height: 28px;border: none;margin: -3px 0px;padding: 6px 0px;"></td>' +
            '                                                    </tr>' +
            '                                                    <tr  name="experience'+exp+'">' +
            '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">公司名称</th>' +
            '                                                        <td onclick="inputValue(this)" colspan="2" style="border-right: 1px solid #2e6da4;background: #ffffff;">请点击<input name="experience'+exp+'" type="hidden" value=""></td>' +
            '                                                    </tr>' +
            '                                                    <tr  name="experience'+exp+'">' +
            '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">担任职务</th>' +
            '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="experience'+exp+'" type="hidden" value=""></td>' +
            '                                                    </tr>' +
            '                                                    <tr  name="experience'+exp+'">' +
            '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">月收入</th>' +
            '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="experience'+exp+'" type="hidden" value=""></td>' +
            '                                                    </tr>' +
            '                                                    <tr  name="experience'+exp+'">' +
            '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">证明人</th>' +
            '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="experience'+exp+'" type="hidden" value=""></td>' +
            '                                                    </tr>' +
            '                                                    <tr  name="experience'+exp+'">' +
            '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">联系电话</th>' +
            '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="experience'+exp+'" type="hidden" value=""></td>' +
            '                                                    </tr>' +
            '                                                    <tr  name="experience'+exp+'">' +
            '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">离职原因</th>' +
            '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="experience'+exp+'" type="hidden" value=""></td>' +
            '                                                    </tr>' +
            '                                                    </table>' +
            '                                                </block>');
        exp++;
        stime = stime+2;
        etime = etime+2;
    }
}*/

var stime = 9
var etime = 10
function addExp(size){  //添加工作经历
    //var count = document.getElementById("experience").getElementsByTagName("block").length;
    var count = parseInt(document.getElementById("blockcount").value);
    if(count>=4){
        alert("最多填写四段经历.")
    }else {
        if(confirm("确认添加经历吗？")){
            var exp = parseInt(document.getElementById("blockcount").value);
            exp=exp+1;
            document.getElementById("experience").insertAdjacentHTML("beforeend",
                '<block>\n' +
                '                                                    <table class="table table-striped table-condensed" id="experience">' +
                '                                                    <tbody id="tbody'+exp+'">'+
                '                                                    <tr>' +
                '                                                        <th colspan="2" style="border-bottom: 1px solid #2e6da4;"><span id="expe'+exp+'">工作经历'+exp+'</span></th>' +
                '                                                        <td align="right"><input onclick="deletebody'+exp+'('+exp+')" type="button" class="btn  btn-fill btn-info btn-wd btn-sm" style="height:22px;padding-top: 1px;padding-bottom: 1px;" value="删除经历" id="dele"></td>' +
                '                                                    <tr  name="moreexperience">' +
                '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">起止日期</th>' +
                '                                                        <td style="border-right: 1px solid #2e6da4;background: #ffffff;"><input name="moreexperience" type="text" value="" class="form-control" id="date-group1-'+stime+'" placeholder="开始时间" onclick="initDate()" style="height: 28px;border: none;margin: -3px 0px;padding: 6px 0px;"></td>' +
                '                                                        <td style="border-right: 1px solid #2e6da4;background: #ffffff;"><input name="moreexperience" type="text" value="" class="form-control" id="date-group1-'+etime+'" placeholder="结束时间" onclick="initDate()" style="height: 28px;border: none;margin: -3px 0px;padding: 6px 0px;"></td>' +
                '                                                    </tr>' +
                '                                                    <tr  name="moreexperience">' +
                '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">公司名称</th>' +
                '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="moreexperience" type="hidden" value=""></td>' +
                '                                                    </tr>' +
                '                                                    <tr  name="moreexperience">' +
                '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">担任职务</th>' +
                '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="moreexperience" type="hidden" value=""></td>' +
                '                                                    </tr>' +
                '                                                    <tr  name="moreexperience">' +
                '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">月收入</th>' +
                '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="moreexperience" type="hidden" value=""></td>' +
                '                                                    </tr>' +
                '                                                    <tr  name="moreexperience">' +
                '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">证明人</th>' +
                '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="moreexperience" type="hidden" value=""></td>' +
                '                                                    </tr>' +
                '                                                    <tr  name="moreexperience">' +
                '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">联系电话</th>' +
                '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="moreexperience" type="hidden" value=""></td>' +
                '                                                    </tr>' +
                '                                                    <tr  name="moreexperience">' +
                '                                                        <th style="width: 15%;background: #5bc0de;border-right: 1px solid #2e6da4;">离职原因</th>' +
                '                                                        <td onclick="inputValue(this)" colspan="2" style="border-bottom: 1px solid #2e6da4;background: #ffffff;">请点击<input name="moreexperience" type="hidden" value=""></td>' +
                '                                                    </tr>' +
                '                                                    </tbody>'+
                '                                                    </table>' +
                '                                                </block>');
            //exp=exp+1;
            document.getElementById("blockcount").value = parseInt(document.getElementById("blockcount").value)+1;
            stime=stime+2;
            etime = etime+2;
        }
        else {
            return false;
        }
    }
}

function deletebody2(exp){
    var mainbody = document.getElementById("experience");
    var cell = document.getElementById("tbody2");
    mainbody.removeChild(cell);
    if(document.getElementById('expe'+3) !== null && document.getElementById('expe'+4) !== null){
        document.getElementById('expe'+3).innerText = '工作经历2';
        document.getElementById('expe'+4).innerText = '工作经历3';
    }else if(document.getElementById('expe'+3) !== null && document.getElementById('expe'+4) === null){
        document.getElementById('expe'+3).innerText = '工作经历2';
    }else if(document.getElementById('expe'+3)=== null && document.getElementById('expe'+4) !== null){
        document.getElementById('expe'+4).innerText = '工作经历2';
    }
    document.getElementById("blockcount").value = parseInt(document.getElementById("blockcount").value)-1;
    var j = 2;
    for(var i =1;i<=4;i++){
        if(document.getElementById('expe'+i) !== null){
            document.getElementById('expe'+''+i+'').innerText = '工作经历'+j;
            j = j +1;
        }
    }
}
function deletebody3(exp){
    var mainbody = document.getElementById("experience");
    var cell = document.getElementById("tbody3");
    mainbody.removeChild(cell);
    if(document.getElementById('expe'+2) !== null && document.getElementById('expe'+4) !== null){
        document.getElementById('expe'+2).innerText = '工作经历2';
        document.getElementById('expe'+4).innerText = '工作经历3';
    }else if(document.getElementById('expe'+2) !== null && document.getElementById('expe'+4) === null){
        document.getElementById('expe'+2).innerText = '工作经历2';
    }else if(document.getElementById('expe'+2)=== null && document.getElementById('expe'+4) !== null){
        document.getElementById('expe'+4).innerText = '工作经历2';
    }
    document.getElementById("blockcount").value = parseInt(document.getElementById("blockcount").value)-1;
    var j = 2;
    for(var i =1;i<=4;i++){
        if(document.getElementById('expe'+i) !== null){
            document.getElementById('expe'+''+i+'').innerText = '工作经历'+j;
            j = j +1;
        }
    }
}
function deletebody4(exp){
    var mainbody = document.getElementById("experience");
    var cell = document.getElementById("tbody4");
    mainbody.removeChild(cell);
    if(document.getElementById('expe'+2) !== null && document.getElementById('expe'+3) !== null){
        document.getElementById('expe'+2).innerText = '工作经历2';
        document.getElementById('expe'+3).innerText = '工作经历3';
    }else if(document.getElementById('expe'+2) !== null && document.getElementById('expe'+3) === null){
        document.getElementById('expe'+2).innerText = '工作经历2';
    }else if(document.getElementById('expe'+2)=== null && document.getElementById('expe'+3) !== null){
        document.getElementById('expe'+3).innerText = '工作经历2';
    }
    document.getElementById("blockcount").value = parseInt(document.getElementById("blockcount").value)-1;
    var j = 2;
    for(var i =1;i<=4;i++){
        if(document.getElementById('expe'+i) !== null){
            document.getElementById('expe'+''+i+'').innerText = '工作经历'+j;
            j = j +1;
        }
    }
}

function initDate(){
    var rd = new Rolldate({
        el: '#date-group1-9',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-10',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-11',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-12',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-13',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-14',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-15',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-16',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-17',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-18',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-19',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-20',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-21',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-22',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-23',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-24',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-25',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-26',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-27',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-28',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-29',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })
    var rd = new Rolldate({
        el: '#date-group1-30',
        format: 'YYYY-MM',
        beginYear: 1970,
        endYear: 2030,
        minStep:1,
    })

    rd.show();
}

//全变量,当前页数.
var page = 1;   //1 代表第一页,2代表第二页,3代表第三页   +1  下一步   -1后退

//移动到顶部
function toNext() {
    document.body.scrollTop = document.documentElement.scrollTop = 0;
    // page++;
    checkInput()
}
/* 检查填写的内容*/
var right = false;
var sos = false;
var exps = false;
function checkContent(selector){
    $(selector).each(function(){
        var b = selector;
        var a= $(this).children()
        if (a.context.innerText.indexOf("请点击")!=-1){  //存在  请点击
            if (selector.indexOf("family")!=-1){   //且是family
                right = false;//没填写完整
            }else if (selector.indexOf("sos")!=-1){
                sos = false ;
            }else if (selector.indexOf("experience")!=-1){
                exps = false;
            }

        }else {   //完整
            if (selector.indexOf("family")!=-1){   //且是family
                right = true;//填写完整
            }else if (selector.indexOf("sos")!=-1){
                sos = true ;
            }else if (selector.indexOf("experience")!=-1){
                exps = true;
            }
        }
    })
}
//检查用户输入
function checkInput(){
        $("#title").children().each(function () {
            var type = $(this)
            console.log("id:"+type.context.id)
            var id = type.context.id;
            var boolean = id=="jin"
            if(id=="jin"){
                console.log(type.context.className)
                if(type.context.className=="active"){  //选中的是这个元素
                    for(i=1 ; i<=2 ;i++){
                        checkContent("#family"+i);
                        console.log(right)
                        if(right==true){ //填写完整
                            continue
                        }
                        else{  //存在 请点击字符 未填写完整
                            alert("请填写完整家庭成员信息,至少两位.")
                            setTimeout(function () {
                                $("#back").click()
                            },100)
                            break
                        }
                    }
                }
            }else if (id=="jiny"){
                if(type.context.className=="active") {//选中的是这个元素
                    checkContent("#experience1")
                    if(exps==true){ //填写完整
                        send2 = true
                    }
                    else if (exps==false) {  //存在 请点击字符 未填写完整
                        send2 = false
                        alert("请填写工作经历,至少一段!")
                    }
                }
            }

        })

}




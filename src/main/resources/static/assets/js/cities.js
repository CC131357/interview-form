var cityarea = '<div id="citylist" class="search-citys-list click">'+
	'<ul class="s-citys1 click" id="s-citys1" style="display: block;">'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;汉族&quot;)">汉族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;蒙古族&quot;,)">蒙古族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;回族&quot;)">回族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;藏族&quot;)">藏族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;维吾尔族&quot;)">维吾尔族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;苗族&quot;)">苗族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;彝族&quot;)">彝族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;壮族&quot;)">壮族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;布依族&quot;)">布依族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;朝鲜族&quot;)">朝鲜族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;满族&quot;)">满族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;侗族&quot;)">侗族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;瑶族&quot;)">瑶族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;白族&quot;)">白族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;土家族&quot;)">土家族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;哈尼族&quot;)">哈尼族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;哈萨克族&quot;)">哈萨克族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;傣族&quot;,)">傣族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;黎族&quot;)">黎族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;傈僳族&quot;)">傈僳族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;佤族&quot;)">佤族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;畲族&quot;)">畲族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;高山族&quot;)">高山族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;拉祜族&quot;)">拉祜族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;水族&quot;)">水族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;东乡族&quot;)">东乡族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;纳西族&quot;)">纳西族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;柯尔克孜族&quot;)">柯尔克孜族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;景颇族&quot;)">景颇族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;土族&quot;)">土族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;达斡尔族&quot;)">达斡尔族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;仫佬族&quot;)">仫佬族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;羌族&quot;)">羌族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;布朗族&quot;,)">布朗族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;撒拉族&quot;)">撒拉族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;毛南族&quot;)">毛南族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;仡佬族&quot;)">仡佬族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;锡伯族&quot;)">锡伯族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;阿昌族&quot;)">阿昌族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;普米族&quot;)">普米族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;塔吉克族&quot;)">塔吉克族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;怒族&quot;)">怒族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;俄罗斯族&quot;)">俄罗斯族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;乌孜别克族&quot;)">乌孜别克族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;鄂温克族&quot;)">鄂温克族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;德昂族&quot;)">德昂族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;保安族&quot;)">保安族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;裕固族&quot;)">裕固族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;京族&quot;)">京族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;塔塔尔族&quot;)">塔塔尔族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;独龙族&quot;)">独龙族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;鄂伦春族&quot;)">鄂伦春族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;赫哲族&quot;)">赫哲族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;门巴族&quot;)">门巴族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;珞巴族&quot;)">珞巴族</a></li>'+
	'<li class="click"><a href="javascript:;" class="click" onclick="change_city_val(&quot;基诺族&quot;)">基诺族</a></li>'+
	'</ul>'+
	'</div>';
function append_city(){
	$('#cityarea').show();
	if($("#citylist").text()==""){
		$("#citylist").append(cityarea);
	}
}
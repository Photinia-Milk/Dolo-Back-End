//# sourceURL=zzxkYzb.js

jQuery(function($){

	jQuery("#kklxdm").val(jQuery("#firstKklxdm").val());

	jQuery("#xkkz_id").val(jQuery("#firstXkkzId").val());

	jQuery("#njdm_id").val(jQuery("#firstNjdmId").val());

	jQuery("#zyh_id").val(jQuery("#firstZyhId").val());

	if($("#iskxk").val()=="1"){//当前在选课时间内时，才可以加载选课页面

		$("#displayBox").load(_path+"/xsxk/zzxkyzb_cxZzxkYzbDisplay.html",{

			"xkkz_id":jQuery("#xkkz_id").val(),"xszxzt":jQuery("#xszxzt").val(),"kspage":0,"jspage":0

		},function(){

			$("#choosedBox").load(_path+"/xsxk/zzxkyzb_cxZzxkYzbChoosed.html",{},function(){});

		});

	}

	//绑定默认高级查询

	$.extend(true,$.bootui.widget.messages,{

		searchbox:{

			placeholder		:	$.i18n.get("msg_srkcjxbcx") //请输入课程号或课程名称查询!

        }

	});



	jQuery("#searchBox").searchBox({

		showSize:6,

		searchFilter:true,

		autoSearch:false,

		onSearchClick:function(paramMap){

			$("#isEnd").val("false");

			$("#endsign").hide(); //隐藏到达最后一页提示

			$("#more").hide(); //隐藏到达最后一页提示

			if($("#iskxk").val()=="1"){//当前在选课时间内时，才可以加载选课页面

				var s_html = [];

				if($("#isInxksj").val()=="0" && $("#xksjxskz").val()=="0"){

					s_html.push("<div class='clearfix'></div>");

					s_html.push("<div class='panel panel-info'>");

					s_html.push("<div class='panel-heading'>&nbsp;</div>");

					s_html.push("<div class='panel-body'>");

					//对不起，当前时间不可选课！

					s_html.push("<div class='nodata'><span>"+$.i18n.get("txt-no-xksj")+"</span></div>");//对不起，当前时间不可选课！

					s_html.push("</div>");

					s_html.push("</div>");

					$("#contentBox").html(s_html.join(""));

				}/*else if($("#isAlreadBm").val()=="0"){

					s_html.push("<div class='clearfix'></div>");

					s_html.push("<div class='panel panel-info'>");

					s_html.push("<div class='panel-heading'>&nbsp;</div>");

					s_html.push("<div class='panel-body'>");

					s_html.push("<div class='nodata'><span>"+$.i18n.get("txt-no-bmxx")+"</span></div>");//对不起，未找到您的报名信息，不可选此类课程！

					s_html.push("</div>");

					s_html.push("</div>");

					$("#contentBox").html(s_html.join(""));

				}*/

				/*else if($("#isPjAll").val()=="0"){	

					s_html.push("<div class='clearfix'></div>");

					s_html.push("<div class='panel panel-info'>");

					s_html.push("<div class='panel-heading'>&nbsp;</div>");

					s_html.push("<div class='panel-body'>");

					s_html.push("<div class='nodata'><span>"+$.i18n.prop("txt-no-pj", [$("#xkpdpjxnmc").val(), $("#xkpdpjxqmc").val()])+"</span></div>");//对不起，"+$("#xkpdpjxnmc").val()+"学年"+$("#xkpdpjxqmc").val()+"学期评价未完成，不可选此类课程！

					s_html.push("</div>");

					s_html.push("</div>");

					$("#contentBox").html(s_html.join(""));

				}else if($("#isJf").val()=="0"){	

					s_html.push("<div class='clearfix'></div>");

					s_html.push("<div class='panel panel-info'>");

					s_html.push("<div class='panel-heading'>&nbsp;</div>");

					s_html.push("<div class='panel-body'>");

					s_html.push("<div class='nodata'><span>"+$.i18n.prop("txt-no-jf", [$("#xkpdjfxnmc").val(), $("#xkpdjfxqmc").val()])+"</span></div>");//对不起，"+$("#xkpdjfxnmc").val()+"学年"+$("#xkpdjfxqmc").val()+"学期未完成缴费，不可选此类课程！

					s_html.push("</div>");

					s_html.push("</div>");

					$("#contentBox").html(s_html.join(""));

				}else if($("#isZxKxk").val() == '0'){

					s_html.push("<div class='clearfix'></div>");

					s_html.push("<div class='panel panel-info'>");

					s_html.push("<div class='panel-heading'>&nbsp;</div>");

					s_html.push("<div class='panel-body'>");

					s_html.push("<div class='nodata'><span>"+$.i18n.get("txt-no-zaix")+"</span></div>");//对不起，您当前学籍状态为不在校，不可选此类课程！

					s_html.push("</div>");

					s_html.push("</div>");

					$("#contentBox").html(s_html.join(""));

				}*/

				else{

					$("#kspage").val("0");

					$("#jspage").val("0");

					$(".tjxk_list").remove();

					loadCoursesByPaged();

				}

			}

		},

		model:getConditionCols()

		 /*[

			{"index":"njdm_id_list","text":"年级",url:_path+"/xtgl/comm_cxNjPaged.html",mapper:{"key":"njdm_id","text":"njmc"},showSize:10,sort:"njmc",order:"desc"},

			{"index":"jg_id_list","text":"学院",url:_path+"/xtgl/comm_cxXydmPaged.html",mapper:{"key":"jg_id","text":"jgmc"},sort:"jgdm",order:"asc",gridType:"3"},

			{"index":"zyh_id_list","text":"专业",url:_path+"/xtgl/comm_cxZydmPaged.html",mapper:{"key":"zyh_id","text":"zymc"},parent:"jg_id_list",sort:"zyh_id",order:"asc",gridType:"4"},

			{"index":"kkbm_id_list","text":$.i18n.jwglxt["kkxymc"],url:_path+"/xtgl/comm_cxKkbmList.html?rangeable=false",mapper:{"key":"jg_id","text":"jgmc"},sort:"jgdm",order:"desc",gridType:"3"},

            {"index":"kclb_id_list","text":"课程类别",url:_path+"/xkgl/common_queryKclbList.html",mapper:{"key":"kclbdm","text":"kclbmc"},showSize:6,sort:"kclbdm",order:"asc",gridType:"-1"},

            {"index":"kcxzdm_list","text":"课程性质",url:_path+"/query/query_queryKcxzList.html",mapper:{"key":"dm","text":"mc"},sort:"dm",showSize:6,order:"asc",gridType:"-1"},

            {"index":"jxms_list","text":"教学模式",url:_path+"/xtgl/comm_cxJcsjList.html?lxdm=0032",mapper:{"key":"dm","text":"mc"},showSize:7},

            {"index":"kcgs_list","text":"课程归属",url:_path+"/xkgl/common_queryKcgsPaged.html",mapper:{"key":"kcgsdm","text":"kcgsmc"},showSize:7,sort:"kcgsdm",order:"asc",gridType:"-1"},

            {"index":"sksj_list","text":"上课星期",url:_path+"/xtgl/comm_cxJcsjList.html?lxdm=0036",mapper:{"key":"dm","text":"mc"},showSize:7},

            {"index":"skjc_list","text":"上课节次",url:_path+"/xkgl/common_querySkjcList.html",mapper:{"key":"dm","text":"dm"},showSize:15,sort:"dm",order:"asc"},

            {"index":"jxbmc_list","text":"教学班",fixed:true,type:"string",hidden:false},

            {"index":"cxbj_list","text":"是否重修",showSize:5,options:[{"1":"是"},{"0":"否"}],hidden:false},

            {"index":"yl_list","text":"有无余量",showSize:5,options:[{"1":"有"},{"0":"无"}],defaults:[{"key":"1","text":"有"}]}

		]*/

	});

});



function getConditionCols(){

	var conditions = [];

	if($("#zzxkgjcxkg_nj").val()=="1"){//年级

		conditions.push({"index":"njdm_id_list","text":$.i18n.jwglxt["njmc"],url:_path+"/xtgl/comm_cxNjPaged.html",mapper:{"key":"njdm_id","text":"njmc"},showSize:10,sort:"njmc",order:"desc"});

	}

	if($("#zzxkgjcxkg_xy").val()=="1"){//学院

		conditions.push({"index":"jg_id_list","text":$.i18n.jwglxt["xymc"],url:_path+"/xtgl/comm_cxXydmPaged.html?localeKey="+$("#localeKey").val(),mapper:{"key":"jg_id","text":"jgmc"},sort:"jgdm",order:"asc",gridType:"3"});

	}

	if($("#zzxkgjcxkg_zy").val()=="1"){//专业

		conditions.push({"index":"zyh_id_list","text":$.i18n.jwglxt["zymc"],url:_path+"/xtgl/comm_cxZydmPaged.html?localeKey="+$("#localeKey").val(),mapper:{"key":"zyh_id","text":"zymc"},parent:"jg_id_list",sort:"zyh_id",order:"asc",gridType:"4"});

	}

	if($("#zzxkgjcxkg_kkxy").val()=="1"){//开课学院

		conditions.push({"index":"kkbm_id_list","text":$.i18n.jwglxt["kkxymc"],url:_path+"/xtgl/comm_cxKkbmList.html?rangeable=false",mapper:{"key":"jg_id","text":"jgmc"},sort:"jgdm",order:"desc",gridType:"3"});

	}

	if($("#zzxkgjcxkg_xqu").val()=="1"){//校区

		conditions.push({"index":"xq_list","text":$.i18n.jwglxt["xxxq"],url:_path+"/query/query_cxXqList.html",mapper:{"key":"xqh_id","text":"xqmc"},sort:"xqmc",order:"desc",gridType:"20"});

	}

	if($("#zzxkgjcxkg_kclb").val()=="1"){//课程类别

		conditions.push({"index":"kclb_id_list","text":$.i18n.get("msg_kclb"),url:_path+"/xkgl/common_queryKclbListPaged.html",mapper:{"key":"kclbdm","text":"kclbmc"},showSize:6,sort:"kclbdm",order:"asc",gridType:"-1"});

	}

	if($("#zzxkgjcxkg_kcxz").val()=="1"){//课程性质

		conditions.push({"index":"kcxzdm_list","text":$.i18n.get("msg_kcxz"),url:_path+"/xkgl/common_queryKcxzPaged.html",mapper:{"key":"dm","text":"mc"},sort:"dm",showSize:6,order:"asc",gridType:"-1"});

	}

	if($("#zzxkgjcxkg_jxms").val()=="1"){//教学模式

		conditions.push({"index":"jxms_list","text":$.i18n.get("msg_jxms"),url:_path+"/xtgl/comm_cxJcsjList.html?lxdm=0032",mapper:{"key":"dm","text":"mc"},showSize:7});

	}

	if($("#zzxkgjcxkg_kcgs").val()=="1"){//课程归属

		conditions.push({"index":"kcgs_list","text":$.i18n.get("msg_kcgs"),url:_path+"/xkgl/common_queryKcgsPaged.html",mapper:{"key":"kcgsdm","text":"kcgsmc"},showSize:7,sort:"kcgsdm",order:"asc",gridType:"-1"});

	}

	if($("#zzxkgjcxkg_skxq").val()=="1"){//上课星期

		conditions.push({"index":"sksj_list","text":$.i18n.get("msg_skxq"),url:_path+"/xtgl/comm_cxJcsjList.html?lxdm=0036",mapper:{"key":"dm","text":"mc"},showSize:7});

	}

	if($("#zzxkgjcxkg_skjc").val()=="1"){//上课节次

		conditions.push({"index":"skjc_list","text":$.i18n.get("msg_skjc"),url:_path+"/xkgl/common_querySkjcList.html",mapper:{"key":"dm","text":"dm"},showSize:15,sort:"dm",order:"asc"});

	}

	if($("#zzxkgjcxkg_jxb").val()=="1"){//教学班

		conditions.push({"index":"jxbmc_list","text":$.i18n.get("msg_jxbmc"),fixed:true,type:"string",hidden:false});

	}

	if($("#zzxkgjcxkg_sfcx").val()=="1"){//是否重修

		conditions.push({"index":"cxbj_list","text":$.i18n.get("msg_sfcx"),showSize:5,options:[{"1":$.i18n.get("msg_shi")},{"0":$.i18n.get("msg_fou")}],hidden:false});

	}

	if($("#zzxkgjcxkg_ywyl").val()=="1"){//有无余量

		conditions.push({"index":"yl_list","text":$.i18n.get("msg_ywyl"),showSize:5,options:[{"1":$.i18n.get("msg_you")},{"0":$.i18n.get("msg_wu")}]});

	}

	return conditions;

}



function queryCourse(a_element,kklxdm,xkkz_id,njdm_id,zyh_id){

	$("#nav_tab").find("li").removeClass("active");

	$(a_element).parent().addClass("active"); // this

	$("#kklxdm").val(kklxdm); // 71

	// 选课课种id
	$("#xkkz_id").val(xkkz_id);  // A9781479C2445A7FE055F8163ED16360

	$("#njdm_id").val(njdm_id);  // 2018

	$("#zyh_id").val(zyh_id); // 0806050037

	$("#displayBox").load(_path+"/xsxk/zzxkyzb_cxZzxkYzbDisplay.html",{
		// 选课课种id
		"xkkz_id":$("#xkkz_id").val(),
		// ??只有一个值，value是1
		"xszxzt":jQuery("#xszxzt").val(),
		"kspage":0,
		"jspage":0
		// https://i.sjtu.edu.cn/xsxk/zzxkyzb_cxZzxkYzbDisplay.html?xkkz_id='A9781479C2445A7FE055F8163ED16360'&xszxzt=1&kspage=0&jspage=0

	},function(){

		//if(checkSlct()){

			//$("#searchBox").trigger("searchResult");

		//}

		setTimeout("$('#searchBox').trigger('searchResult')",100);//延迟加载，避免参数未加载完就执行了查询，否则有较小概率出现A页签下显示了B页签的课程

	});

}



function chooseCoursesQuickly(){

	$.ajaxSetup({async:false});

	$.post(_path+"/xsxk/zzxkyzb_xkZzxkyzbQuickly.html",{"xkkz_id":$("#xkkz_id").val()},function(data){

		if(data.flag=="0"){

			$.alert(data.msg);

		}else if(data.flag=="1"){

			//$("#xkczbj").val("1");//减少课表的刷新频率

			$("#choosedBox").load(_path+"/xsxk/zzxkyzb_cxZzxkYzbChoosed.html",{},function(){

				$("#searchBox").trigger("searchResult");

				var yxxf = 0;

				$("input[name='right_xf']").each(function(idx,itm){

					yxxf = yxxf + parseInt($(itm).val());

				});

				$("#yxxfs").text(yxxf);

			});

			$.success($.i18n.get("msg_yjxkywc"));//一键选课已完成！

		}

	},'json');

	$.ajaxSetup({async:true});

}



function checkSlct(){

	if($(".selecteds").text()=="" && $("input[name='searchInput']").val()==""){

		return false;

	}else{

		return true;

	}

}



$("#btn_jf").click(function() {

	$.openWin(_path + "/paycenter/paycenter_cxGrjfIndex.html?gnmkdm=N0185&layout=default");

});



$("#kbcxbtn_zzxk").click(function(){

	var map={xnm:$("#xkxnm").val(),xqm:$("#xkxqm").val()};//'学生课表预览'

	$.showDialog(_path+'/kbcx/xskbcx_cxXskbPopupIndex.html',$.i18n.get("msg_xskbyl"),$.extend({},viewConfig,

		{width: $("#yhgnPage").innerWidth()+"px",data: {'map':map}}

	));

});





//加载某门课程的教学班

function loadJxbxxZzxk(obj){

	var czzt = $(obj).find("input[name='czzt']").val();

	if(czzt=="0"){

		var requestMap = $("#searchBox").searchBox("getConditions");

		$.extend(requestMap,{

			"rwlx":$("#rwlx").val(),"xkly":$("#xkly").val(),"bklx_id":$("#bklx_id").val(),

			"xqh_id":$("#xqh_id").val(),"jg_id":$("#jg_id_1").val(),"zyh_id":$("#zyh_id").val(),"zyfx_id":$("#zyfx_id").val(),

			"njdm_id":$("#njdm_id").val(),"bh_id":$("#bh_id").val(),"xbm":$("#xbm").val(),"xslbdm":$("#xslbdm").val(),

			"ccdm":$("#ccdm").val(),"xsbj":$("#xsbj").val(),"sfkknj":$("#sfkknj").val(),"sfkkzy":$("#sfkkzy").val(),

			"sfznkx":$("#sfznkx").val(),"zdkxms":$("#zdkxms").val(),"sfkxq":$("#sfkxq").val(),"sfkcfx":$("#sfkcfx").val(),

			"kkbk":$("#kkbk").val(),"kkbkdj":$("#kkbkdj").val(),"xkxnm":$("#xkxnm").val(),"xkxqm":$("#xkxqm").val(),

			"rlkz":$("#rlkz").val(),"kklxdm":$("#kklxdm").val(),"kch_id":$(obj).find("input[name='kch_id']").val(),

			"xkkz_id":$("#xkkz_id").val(),"cxbj":$(obj).find("input[name='cxbj']").val(),"fxbj":$(obj).find("input[name='fxbj']").val()

		});

		$.ajaxSetup({async:false});

		$.post(_path+"/xsxk/zzxkyzb_cxJxbWithKchZzxkYzb.html",requestMap,function(data){

			setTimeout(function(){

				if(data!=null){

					if(data=="0"){

						$.alert($.i18n.get("msg_jgfffw"));//警告：你正在非法访问！

						return false;

					}

					showHideJxb(obj);//展开关闭当前课程的教学班列表

					var rwlx = $("#rwlx").val();

					var kklxdm = null;

					for(var i=0; i<data.length; i++){

						var trObj = $("#tr_"+$.convertID(data[i].jxb_id));

						if(i==0){

							kklxdm = trObj.find(".kklxdm").text();

						}

						trObj.find(".jxbrl").text(data[i].jxbrl);

						trObj.find(".sksj").html(data[i].sksj);

						trObj.find(".jxdd").html(data[i].jxdd);

						trObj.find(".jxms").text(data[i].jxms);

						trObj.find(".xkbz").text(data[i].xkbz);

						trObj.find(".kcgs").text(data[i].kcgsmc);

						trObj.find(".kcxz").text(data[i].kcxzmc);

						trObj.find(".xqh_id").text(data[i].xqh_id);

						trObj.find(".xqumc").text(data[i].xqumc);

						trObj.find(".do_jxb_id").text(data[i].do_jxb_id);

						if($.defined(data[i].jsxx)){

							var jsxxArray = data[i].jsxx.split(";");

							var jsxmHtml = null;

							var jsxmString = null;

							var jszcString = null;

							for(var m=0; m<jsxxArray.length; m++){

								var tmpArray = jsxxArray[m].split("/");

								if(m==0){

									jsxmHtml = "<font color='blue'><a href='javascript:void(0);' onclick=showTeacherInfo('"+tmpArray[0]+"')>"+($.defined(tmpArray[1])?tmpArray[1]:"--")+"</a></font>";

									jsxmString = $.defined(tmpArray[1])?tmpArray[1]:"--";

									jszcString = $.defined(tmpArray[2])?tmpArray[2]:"--";

								}else{

									jsxmHtml = jsxmHtml + "、<font color='blue'><a href='javascript:void(0);' onclick=showTeacherInfo('"+tmpArray[0]+"')>"+($.defined(tmpArray[1])?tmpArray[1]:"--")+"</a></font>";

									jsxmString = jsxmString + "、" +($.defined(tmpArray[1])?tmpArray[1]:"--");

									jszcString = jszcString + "、" +($.defined(tmpArray[2])?tmpArray[2]:"--");

								}

							}

							trObj.find(".jsxm").text(jsxmString);

							trObj.find(".jszc").text(jszcString);

							trObj.find(".jsxmzc").html("【"+jsxmHtml+"】<br>"+jszcString);

						}else{

							trObj.find(".jsxm").text("--");

							trObj.find(".jszc").text("--");

							trObj.find(".jsxmzc").html("【--】<br>--");

						}

					}

					var zckz = $("#zckz").val();

					var bdzcbj = $("#bdzcbj").val();

					var rlkz = $("#rlkz").val();

					var rlzlkz = $("#rlzlkz").val();

					var zcxkbj = "1";

					if(zckz=="1" && bdzcbj!="2" && bdzcbj!="3"){

						zcxkbj = "0";

					}

					var kch_id = $(obj).find("input[name='kch_id']").val();

					var kcxzzt = $(obj).find("input[name='kcxzzt']").val();

					var jxb_ids = [];

					$(obj).parent().find("div table tbody").find(".jxb_id").each(function(index,item){

						var m_jxb_id = $(item).text();

						var trObj = $("#tr_"+$.convertID(m_jxb_id));

						var m_jxbzls = trObj.find(".jxbzls").text();

						var m_jxbrs = trObj.find(".jxbrs").text();

						var m_jxbrl = trObj.find(".jxbrl").text();

						var m_do_jxb_id = trObj.find(".do_jxb_id").text();

						setRlxxAddZzxk(trObj,m_jxbrs,m_jxbrl);//设置容量是否已满

						if($("#sfkxk").val()=="1" && $("#jzxkf").val()=="0" && zcxkbj=="1" && $("#isinxksj").val()=="1"){

							trObj.find("td.an").html("<button type='button' class='btn btn-primary btn-sm' onclick=chooseCourseZzxk('"+m_jxb_id+"','"+m_do_jxb_id+"','"+kch_id+"','"+m_jxbzls+"')>"+$.i18n.get("msg_xk")+"</button>");

						}else{

							trObj.find("td.an").html("<span class='jinxuan' style='font-size:15px;color:red;'><b>"+$.i18n.get("msg_jx")+"</b></span>");

						}

					});

					if(kcxzzt=="1"){//如果有被选中的课程，则遍历浮动框中对应课程下的已选中班级把主页面中的教学班修改为选中状态

						if($("#tykpzykg").val()=="1" && kklxdm=="05"){

							kch_id = "sports";

						}

						$("#right_ul_"+kch_id).find("input[name='right_jxb_id']").each(function(index,item){

							var trObj = $("#tr_"+$.convertID($(item).val()));

							//$("#tr_"+$.convertID($(item).val())).find(".an").html($(item).parent().find(".but").html());

							if($(item).parent().find(".but").find("button").length>0){

								var jxb_id = $(item).val();

								var do_jxb_id = trObj.find(".do_jxb_id").text();

								var m_jxbzls = trObj.find(".jxbzls").text();

								trObj.find(".an").html("<button class='btn btn-danger btn-sm' onclick=cancelCourseZzxk('leftpage','"+jxb_id+"','"+do_jxb_id+"','"+kch_id+"','"+m_jxbzls+"','"+$("#xkkz_id").val()+"') type='button'>"+$.i18n.get("msg_tx")+"</button>");

							}else{

								trObj.find(".an").html("<span style='font-size:15px;color:#428BCA;'><b>"+$.i18n.get("txt-yx")+"</b></span>");

							}

							trObj.find("input[name='hidsfxz']").val("1");

						});

					}

					$(obj).find("input[name='czzt']").val("1");

				}

			},1); 

		},'json');

		$.ajaxSetup({async:true});

	}else{

		showHideJxb(obj);//展开关闭当前课程的教学班列表

	}

}



function showHideJxb(obj){

	if($(obj).children(".expand_close").attr("class").indexOf("expand1")>0){ 

		//打开一门课程的教学班列表的同时，关闭其他课程下的教学班列表 

		$(".tjxk_list .panel-heading .expand_close").each(function(index,item){

			if($(item).attr("class").indexOf("close1")>0){

				$(item).removeClass('close1').addClass('expand1');

				$(item).parent().parent().find(".panel-body").slideUp();

			}

		});

		$(obj).children(".expand_close").removeClass('expand1').addClass('close1');

		$(obj).next(".panel-body").slideDown();

	}else{

		$(obj).children(".expand_close").removeClass('close1').addClass('expand1');

		$(obj).next(".panel-body").slideUp();

	}

}



function setRlxxAddZzxk(trObj,jxbrs,jxbrl){

	var rlkz = $("#rlkz").val();

	var rlzlkz = $("#rlzlkz").val();

	if((rlkz=="1" || rlzlkz=="1") && 1*jxbrs >= 1*jxbrl){

		trObj.find(".full").css("display","");

		trObj.find(".rsxx").css("display","none");

	}

}



function setRlxxSubtractZzxk(trObj,jxbrs,jxbrl){

	var rlkz = $("#rlkz").val();

	var rlzlkz = $("#rlzlkz").val();

	if((rlkz=="1" || rlzlkz=="1") && 1*jxbrs < 1*jxbrl){

		trObj.find(".full").css("display","none");

		trObj.find(".rsxx").css("display","");

	}

}



function showTeacherInfo(jgh_id){

	if(jgh_id!='--'){

		$("#jgh_id").val(jgh_id);//'教师简介'

		$.showDialog(_path+'/xkgl/common_cxJsxxModel.html',$.i18n.get("msg_jsjj"),$.extend({},viewConfig,

				{width: ($("#yhgnPage").innerWidth()-400)+"px",data: {'jgh_id':jgh_id}}

		));

	}else{

		$.alert($.i18n.get("msg_jxbjsdd"));//该教学班教师待定！

		return false;

	}

}



function showCourseInfo(kch_id){

	var event = $.event.get();

	event.stopPropagation();//课程简介

	$.showDialog(_path+'/xkgl/common_cxKcxxModel.html',$.i18n.get("msg_kcjj"),$.extend({},viewConfig,

			{width: ($("#yhgnPage").innerWidth()-400)+"px",data: {'kch_id':kch_id}}

	));

}



function showJcInfo(jxb_id){

	if($.founded(jxb_id)){//教材信息

		$.showDialog(_path+"/xsxk/tjxkyzb_cxJcxxList.html",$.i18n.get("msg_jcxx"),$.extend(true,{},viewConfig,

				{width: ($("#yhgnPage").innerWidth()-100)+"px",data: {'jxb_id':jxb_id}}

		));

	}else{

		return false;

	}

}





function loadCoursesByPaged(){

	var step = 10;

	var jspage = $("#jspage").val();

    var globJsPage = $("#globJsPage").val();

    var isEnd = $("#isEnd").val();

    var isSlct = checkSlct();

    if(isEnd=="true"){

		$("#globJsPage").val(jspage);

		$("#more").hide(); //隐藏点击链接

		$("#endsign").show(); //显示到达最后一页提示

	}else if((jspage=="0" || parseInt(globJsPage)<parseInt(jspage)) && isEnd=="false"){

		if(parseInt(jspage)==step && $(".kc_head").length < step){//未瀑布加载前已到最后页时，就不需要再次访问数据库

			$("#more").hide(); //隐藏点击链接

			$("#endsign").show(); //显示到达最后一页提示

			$("#isEnd").val("true");

		}else{

			$("#globJsPage").val(jspage);

			$("#endsign").hide(); //隐藏到达最后一页提示

			var requestMap = $("#searchBox").searchBox("getConditions");

			$.extend(requestMap,{

				"rwlx":$("#rwlx").val(),"xkly":$("#xkly").val(),"bklx_id":$("#bklx_id").val(),/*"xh_id":$("#xh_id").val(),*/

				"xqh_id":$("#xqh_id").val(),"jg_id":$("#jg_id_1").val(),"zyh_id":$("#zyh_id").val(),"zyfx_id":$("#zyfx_id").val(),

				"njdm_id":$("#njdm_id").val(),"bh_id":$("#bh_id").val(),"xbm":$("#xbm").val(),"xslbdm":$("#xslbdm").val(),

				"ccdm":$("#ccdm").val(),"xsbj":$("#xsbj").val(),"sfkknj":$("#sfkknj").val(),"sfkkzy":$("#sfkkzy").val(),

				"sfznkx":$("#sfznkx").val(),"zdkxms":$("#zdkxms").val(),"sfkxq":$("#sfkxq").val(),"sfkcfx":$("#sfkcfx").val(),

				"kkbk":$("#kkbk").val(),"kkbkdj":$("#kkbkdj").val(),"sfkgbcx":$("#sfkgbcx").val(),"sfrxtgkcxd":$("#sfrxtgkcxd").val(),

				"tykczgxdcs":$("#tykczgxdcs").val(),"xkxnm":$("#xkxnm").val(),"xkxqm":$("#xkxqm").val(),"kklxdm":$("#kklxdm").val(),

				"rlkz":$("#rlkz").val(),"xkzgbj":$("#xkzgbj").val(),"kspage":parseInt(jspage)+1,"jspage":parseInt(jspage)+parseInt(step)

			});

			if($("#jxbzbkg").val()=="1"){

				$.extend(requestMap,{"jxbzb":$("#jxbzb").val()});

			}

			if($("#jxbzhkg").val()=="1"){

				$.extend(requestMap,{"zh":$("#zh").val()});

			}

			var s_html = [];

			$.ajaxSetup({async:false});

			$.post(_path+"/xsxk/zzxkyzb_cxZzxkYzbPartDisplay.html",requestMap,function(rst){

				var data = rst.tmpList;

				var flg = rst.sfxsjc;

				if(data!=null && data.length>0){

					var rwlx = $("#rwlx").val();

					var l_kklxpx = $("#kklxpx").val();

					var l_kchid = "";

					var h_kchid = "";

					var l_jxbid = "";

					var tmp_kcrow = 0;

					var ks_kcrow = 0;

					var js_kcrow = 0;

					var kklxdm = $("#kklxdm").val();

					if(jspage=="0"){

						s_html.push("<div id='hintsdiv'></div>");

						s_html.push("<div class='tjxk_list' style='margin-top:-30px'>");

						s_html.push("<h4 class='tjxk_title'></h4>");

					}

					for(var i=0; i<data.length; i++){

						if(i==0){

							ks_kcrow = data[0].kcrow;

						}

						if(i==data.length-1){

							js_kcrow = data[i].kcrow;

						}

						var mdA = data[i];

						var mdB = null;

						if(i+1<=data.length){

							mdB = data[i+1];

						}

						if(l_kchid != mdA.kch_id){

							l_kchid = mdA.kch_id;

							s_html.push("<div class='panel panel-info'>");

							s_html.push("<div class='panel-heading kc_head' ");

							if(mdA.cxbj=="1"){

								s_html.push(" style='background-color:#fff7b2;' ");

							}

							s_html.push(" onclick='loadJxbxxZzxk(this)'>");

							s_html.push("<h3 class='panel-title'>");

							if(mdA.cxbj=="1"){//重修

								s_html.push("<span style='margin-right:-40px'><font color='red'>【"+$.i18n.get("msg_cx")+"】</font></span>");

							}

							if(mdA.xxkbj=="1"){//有先行课

								s_html.push("<span style='margin-right:-40px'><font color='red'>【"+$.i18n.get("msg_yxxk")+"】</font></span>");

							}

							s_html.push("<span class='kcmc' id='kcmc_"+l_kchid+"'>");

							s_html.push("("+mdA.kch+")<a href='javascript:void(0);' onclick=showCourseInfo('"+mdA.kch_id+"')>"+mdA.kcmc+"</a>");

							s_html.push(" - <i id='xf_"+l_kchid+"'>"+mdA.xf+"</i> "+$.i18n.get("msg_xf")+"</span><span>"+$.i18n.get("msg_jxbgs")+"：<font class='jxbgsxx'>0</font></span><span id='zt_txt_"+mdA.kch_id+"'>"+$.i18n.get("msg_zt")+"："+$.i18n.get("txt-wx")+"</span></h3>");

							s_html.push("<input type='hidden' name='kch_id' value='"+mdA.kch_id+"'/>");

							s_html.push("<input type='hidden' name='kcxzzt' id='kcxzzt_"+mdA.kch_id+"' value='0'/>");

							s_html.push("<input type='hidden' name='cxbj' id='cxbj_"+mdA.kch_id+"' value='"+mdA.cxbj+"'/>");

							s_html.push("<input type='hidden' name='fxbj' id='fxbj_"+mdA.kch_id+"' value='"+mdA.fxbj+"'/>");

							s_html.push("<input type='hidden' name='xxkbj' id='xxkbj_"+mdA.kch_id+"' value='"+mdA.xxkbj+"'/>");

							s_html.push("<input type='hidden' name='czzt' value='0'/>");

							s_html.push("<a href='javascript:void(0);' class='expand_close expand1'>"+$.i18n.get("msg_zkgb")+"</a>");

							s_html.push("</div>");

						}

						

						if(l_jxbid != mdA.jxb_id){

							l_jxbid = mdA.jxb_id;

							if(mdA.kch_id!=h_kchid){

								h_kchid = mdA.kch_id;

								s_html.push("<div class='panel-body table-responsive'>");

								s_html.push("<table class='table table-hover'>");

								s_html.push("<thead>");

								s_html.push("<tr class='active'>");

								s_html.push("<th nowrap width='5%'>"+$.i18n.get("msg_jxbmc")+"</th>");//教学班

								s_html.push("<th nowrap width='7%'>"+$.i18n.get("msg_skjs")+"</th>");//上课教师

								s_html.push("<th nowrap width='1%'>"+$.i18n.get("msg_sksj")+"</th>");//上课时间

								s_html.push("<th nowrap>"+$.i18n.get("msg_jxdd")+"</th>");//教学地点

								if($("#zzxkgjcxkg_xqu").val()=="1"){

									s_html.push("<th width='10%'>"+$.i18n.jwglxt["xxxq"]+"</th>");//校区

								}

								if($("#sfxsxkbz").val()=="1"){

									s_html.push("<th width='10%'>"+$.i18n.get("msg_xkbz")+"</th>");//选课备注

								}

								if($("#xkxskcgskg").val()=="1"){

									s_html.push("<th nowrap>"+$.i18n.get("msg_kcgs")+"</th>");//课程归属

								}

								s_html.push("<th nowrap>"+$.i18n.get("msg_kcxz")+"</th>");//课程性质

								s_html.push("<th>"+$.i18n.get("msg_jxms")+"</th>");//教学模式

								s_html.push("<th>"+$.i18n.get("msg_yxrl")+"</th>");//已选/容量

								s_html.push("<th width='15%'>"+$.i18n.get("msg_cz")+"</th>");//操作

								s_html.push("</tr></thead><tbody>");

							}

							s_html.push("<tr class='body_tr' id='tr_"+mdA.jxb_id+"'>");

							s_html.push("<td style='display:none'><div class='jxb_id' id='main_"+mdA.jxb_id+"'>"+mdA.jxb_id+"</div></td>");

							s_html.push("<td style='display:none' class='do_jxb_id' id='do_"+mdA.jxb_id+"'></td>");

							s_html.push("<td class='kch_id' style='display:none'>"+mdA.kch_id+"</td>");

							s_html.push("<td class='jxbzls' style='display:none'>"+mdA.jxbzls+"</td>");

							s_html.push("<td class='kklxdm' style='display:none'>"+mdA.kklxdm+"</td>");

							s_html.push("<td class='jxbzb' style='display:none'>"+mdA.jxbzb+"</td>");

							s_html.push("<td class='zhiyuan' style='display:none'>0</td>"); 

							s_html.push("<td class='xqh_id' style='display:none'></td>");

							s_html.push("<td class='jsxm' style='display:none'></td>");

							s_html.push("<td class='jszc' style='display:none'></td>");

							s_html.push("<td class='zjxbxx' style='display:none'></td>");

							

							if(flg=="1"){

								s_html.push("<td nowrap class='jxbmc'><a href='javascript:void(0);' class='clj showJc' onclick=showJcInfo('"+mdA.jxb_id+"') >"+mdA.jxbmc+"</a></td>");

							}else{

								s_html.push("<td  class='jxbmc' nowrap>"+mdA.jxbmc+"</td>");

							}

							

							s_html.push("<td class='jsxmzc' nowrap></td>");

							s_html.push("<td class='sksj' style='text-align:left' nowrap></td>");

							s_html.push("<td class='jxdd' nowrap></td>");

							if($("#zzxkgjcxkg_xqu").val()=="1"){

								s_html.push("<td class='xqumc'></td>");//校区

							}

							if($("#sfxsxkbz").val()=="1"){

								s_html.push("<td class='xkbz'></td>");

							}

							if($("#xkxskcgskg").val()=="1"){

								s_html.push("<td class='kcgs'></td>");

							}

							s_html.push("<td class='kcxz'></td>");

							s_html.push("<td class='jxms'></td>");

							s_html.push("<td class='full' style='display:none'>"+$.i18n.get("msg_ym")+"</td>");//已满

							s_html.push("<td class='rsxx'><font class='jxbrs'>"+mdA.yxzrs+"</font>/<font class='jxbrl'>0</font></td>");

							s_html.push("<td class='an'><button type='button' class='btn btn-primary btn-sm' onclick=chooseCourseZzxk('"+mdA.jxb_id+"','"+mdA.do_jxb_id+"','"+mdA.kch_id+"','"+mdA.jxbzls+"')>"+$.i18n.get("msg_xk")+"</button></td>");

							s_html.push("<input type='hidden' name='hidsfxz' value='0'/>");

							s_html.push("</tr>");

						}

						if(mdB==null || mdA.kch_id!=mdB.kch_id){

							s_html.push("</tbody></table></div></div>");

						}

					}

					

					if(jspage=="0"){

						s_html.push("<div class='clearfix' id='left_clearfix'></div>");

						s_html.push("</div>");

						$("#contentBox").html(s_html.join(""));

					}else{

						$("#left_clearfix").before($(s_html.join("")));

					}

					

					//将选课列表中的已选课程的选课状态改为“已选”

					$("input[name='right_sub_kchid']").each(function(index,item){

						$("#zt_txt_"+$(item).val()).html($.i18n.get("msg_zt")+"：<b>"+$.i18n.get("txt-yx")+"</b>");

						$("#kcxzzt_"+$(item).val()).val("1");

						$("#kcxzzt_"+$(item).val()).parent().attr("style","background-color:#C1FFC1;");

					});

					

					$(".panel-info").each(function(index,item){

						$(item).find(".jxbgsxx").text($(item).find(".table-responsive").find("table tbody tr").length);

					});

					/*****************绑定课程下教学班展开关闭事件（开始）*********************/

					/*$(".tjxk_list .panel-heading").unbind("click").click(function() {

						if($(this).children(".expand_close").attr("class").indexOf("expand1")>0){ 

							//打开一门课程的教学班列表的同时，关闭其他课程下的教学班列表 

							$(".tjxk_list .panel-heading .expand_close").each(function(index,item){

								if($(item).attr("class").indexOf("close1")>0){

									$(item).removeClass('close1').addClass('expand1');

									$(item).parent().parent().find(".panel-body").slideUp();

								}

							});

							$(this).children(".expand_close").removeClass('expand1').addClass('close1');

							$(this).next(".panel-body").slideDown();

						}

						else

						{

							$(this).children(".expand_close").removeClass('close1').addClass('expand1');

							$(this).next(".panel-body").slideUp();

						}

					});*/



					if(jspage=="0"){

						$(".kc_head").eq(0).click();//加载第一门课程的教学班

						$("#more").show(); //显示点击链接

					}

					$("#jspage").val(parseInt(jspage)+parseInt(step));

					if((parseInt(js_kcrow)-parseInt(ks_kcrow)+1)<step){

						$("#isEnd").val("true");

						$("#endsign").show();

						$("#more").hide();

					}

				}else{

					$("#more").hide(); //关闭查看更多链接

					$("#isEnd").val("true");

					if($(".kc_head").length>0){

						$("#endsign").show();

					}else{

						$("#endsign").hide();

						s_html.push("<div class='clearfix'></div>");

						s_html.push("<div class='panel panel-info'>");

						s_html.push("<div class='panel-heading'>&nbsp;</div>");

						s_html.push("<div class='panel-body'>");

						//无可选课程

						s_html.push("<div class='nodata'><span>"+$.i18n.get("msg_wkxkc")+"</span></div>");

						s_html.push("</div>");

						s_html.push("</div>");

						$("#contentBox").html(s_html.join(""));

					}

				}

			},'json');

			$.ajaxSetup({async:true});

		}

	}

}
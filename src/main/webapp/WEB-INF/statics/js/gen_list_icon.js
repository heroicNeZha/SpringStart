/**
 * 根据参数自动生成列表中的操作按钮
 * 
 * @author gaolh
 * @date 2016-11-3 09:27:58
 */
var TableList = {
	/**
	 * 生成操作按钮 
	 * 第一个参数：table的ID 
	 * 第二个参数：生成的样式，1-图标，2-悬停（我要使用）
	 * 	使用<tag:field className="com.zfsoft.common.BaseStaticParameter" fieldName="LIST_STYLE" />取值，统一样式
	 * 后续参数为不定长参数，每四个为一组
	 * 第一个参数：操作名称 
	 * 第二个参数：图标样式 
	 * 第三个参数：操作事件 
	 * 第四个参数：获取列表中的值，key为操作事件中的参数，value为需要替换的参数，从tr的属性中取值
	 */
	genOperIcon : function() {
		if (!arguments) {
			return;
		}
		var tableId = arguments[0];
		var listStyle = arguments[1];
		var tableObj = $("#" + tableId);
		var tableTr = $("#" + tableId + " tr");
		var args = arguments;
		if (listStyle == 2) {
			TableList.openIcon2(tableTr, args);
		} else if (listStyle == 3) {

		} else {
			TableList.openIcon1(tableTr, args);
		}
	},
	/**
	 * 生成操作按钮 
	 * 第一个参数：table的ID 
	 * 第二个参数：生成的样式，1-图标，2-悬停（我要使用）
	 * 	使用<tag:field className="com.zfsoft.common.BaseStaticParameter" fieldName="LIST_STYLE" />取值，统一样式
	 * 后续参数为不定长参数，每四个为一组
	 * 第一个参数：操作名称 
	 * 第二个参数：图标样式 
	 * 第三个参数：操作事件 
	 * 第四个参数：获取列表中的值，key为操作事件中的参数，value为需要替换的参数，从tr的属性中取值
	 */
	genCheckOperIcon : function() {
		if (!arguments) {
			return;
		}
		var tableId = arguments[0];
		var listStyle = arguments[1];
		var tableObj = $("#" + tableId);
		var tableTr = $("#" + tableId + " tr");
		var args = arguments;
		if (listStyle == 2) {
			TableList.openIcon2(tableTr, args, true);
		} else if (listStyle == 3) {

		} else {
			TableList.openIcon1(tableTr, args, true);
		}
	},

	openIcon1 : function(tableTr, args, check) {
		var size = 4;
		if(check) {
			size = 5;
		}
		tableTr.each(function() {
			var objTr = $(this);
			var oid = objTr.attr("oid"); // 当tr中添加oid属性时，才会添加操作按钮
			if (oid) {
				var html = "<div style='text-align: center;' class=\"use use_two green_use1\">";
				for (var i = 2; i < args.length; i = i + size) {
					if (i + size > args.length) {
						break;
					}
					var operName = args[i];
					var operStyle = args[i + 1];
					var operEvent = args[i + 2];
					var operValue = args[i + 3];
					var checkCompare = args[i + 4];
					
					var iconHtml = "";
					if (operName && operEvent && operValue) {
						var btnFlag = false;	//默认为false
						if(checkCompare && checkCompare.length > 0) {
							//第一层为或的关系，第二层为且的关系
							for(var c = 0; c < checkCompare.length; c++) {
								var andCheck = checkCompare[c];
								if(andCheck) {
									var andFlag = true;
									for(var a = 0; a < andCheck.length; a = a + 2) {
										if(andCheck[a] && andCheck[a + 1]) {
											var v1 = andCheck[a], v2 = andCheck[a + 1];
											for (var j = 0; j < operValue.length; j++) {
												for ( var key in operValue[j]) {
													var value = objTr.attr(operValue[j][key]);
													if (value) {	//当value有效时，替换
														v1 = v1.replace(key, value);
														v2 = v2.replace(key, value);
													}
												}
											}
											if(v1 != v2) {
												//当第二层为false时，跳出循环，条件不成立
												andFlag = false;
												break;
											}
										} 
									}
									//当第二层为true时，设置第一层为true，直接跳出循环，条件成立
									if(andFlag) {
										btnFlag = true;
										break;
									}
								}
							}
						} else {
							btnFlag = true;	//当没有判断条件时，设置为true，展示按钮
						}
						if(btnFlag) {
							for (var j = 0; j < operValue.length; j++) {
								for ( var key in operValue[j]) {
									var value = objTr.attr(operValue[j][key]);
									if (value) {	//当value有效时，替换
										operEvent = operEvent.replace(key, value);
									}
								}
							}
							iconHtml = "<i class=\""
									+ operStyle + "\" onclick=\"" + operEvent + "\" title=\"" + operName + "\"data-toggle=tooltip></i>";
						}
					}
					html += iconHtml;
				}
				html += "</div>"
				objTr.find("td:last").html(html);
			}
		});
	},

	openIcon2 : function(tableTr, args) {
		tableTr.each(function() {
			var objTr = $(this);
			var oid = objTr.attr("oid"); // 当tr中添加oid属性时，才会添加操作按钮
			if (id) {
				var html = "<div class=\"use\">我要使用<div class=\"change_use_box\">"
						+ "<div class=\"change_use_cont\"><div class=\"triangel\">"
						+ "</div><ul class=\"clearfix\">";
				for (var i = 2; i < args.length; i = i + 4) {
					if (i + 4 > args.length) {
						break;
					}
					var operName = args[i];
					var operStyle = args[i + 1];
					var operEvent = args[i + 2];
					var operValue = args[i + 3];
					
					var iconHtml = "";
					if (operName && operEvent && operValue) {
						var btnFlag = false;	//默认为false
						if(checkCompare && checkCompare.length > 0) {
							//第一层为或的关系，第二层为且的关系
							for(var c = 0; c < checkCompare.length; c++) {
								var andCheck = checkCompare[c];
								if(andCheck) {
									var andFlag = true;
									for(var a = 0; a < andCheck.length; a = a + 2) {
										if(andCheck[a] && andCheck[a + 1]) {
											var v1 = andCheck[a], v2 = andCheck[a + 1];
											for (var j = 0; j < operValue.length; j++) {
												for ( var key in operValue[j]) {
													var value = objTr.attr(operValue[j][key]);
													if (value) {	//当value有效时，替换
														v1 = v1.replace(key, value);
														v2 = v2.replace(key, value);
													}
												}
											}
											if(v1 == v2) {
												//当第二层为false时，跳出循环，条件不成立
												andFlag = false;
												break;
											}
										} 
									}
									//当第二层为true时，设置第一层为true，直接跳出循环，条件成立
									if(andFlag) {
										btnFlag = true;
										break;
									}
								}
							}
						} else {
							btnFlag = true;	//当没有判断条件时，设置为true，展示按钮
						}
						if(btnFlag) {
							for (var j = 0; j < operValue.length; j++) {
								for ( var key in operValue[j]) {
									var value = objTr.attr(operValue[j][key]);
									if (value) {
										operEvent = operEvent.replace(key, value);
									}
								}
							}
							iconHtml = "<li><a onclick=\"" + operEvent + "\"><i class=\""
									+ operStyle + "\"></i>" + operName + "</a></li>";
						}
					}
					html += iconHtml;
				}
				html += "</ul></div></div></div>"
				objTr.find("td:last").html(html);
			}
		});
		$(".table-bordered td .use").mouseover(function() {
			$(this).find('.change_use_box').show();
		}).mouseout(function() {
			$(this).find('.change_use_box').hide();
		});
		$(".table-bordered td .use .change_use_box .change_use_cont ul").each(
			function() {
				var num = $(this).children("li").length;
				var width = num * 80;
				$(this).width(width);
				if (num > 2) {
					var left = -(num - 2) * 80 - 60;
					$(this).parents(".change_use_box").css(
							'left', left);
				} else if (num == 2) {
					$(this).parents(".change_use_box").css(
							'left', '-70px');
					$(this).parents(".change_use_box").find(
							".triangel").css('left', '100px');
				} else if (num == 1) {
					$(this).parents(".change_use_box").css(
							'left', '0px');
					$(this).parents(".change_use_box").find(
							".triangel").css('left', '30px');
				} else {
					$(this).parents(".change_use_box").find(
							".triangel").hide();
				}
			});

		$(".table-bordered td .use .change_use_box .change_use_cont ul li:last-child a")
				.css("border-right", "0");
	}
}

$(function () { $("[data-toggle='tooltip']").tooltip('show'); });
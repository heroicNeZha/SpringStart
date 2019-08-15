$(function(){
	
	 if($('.form-group.col-md-9.col-sm-8>div').length==1 && $('.form-group.col-md-9.col-sm-8>div').width()<=350) {
		 $('.form-group.col-md-9.col-sm-8').removeClass("col-md-9 col-sm-8").addClass('col-md-4 col-sm-4');
		 $(this).removeClass('col-lg-4 col-md-6 col-sm-6').addClass('col-lg-12 col-md-12 col-sm-12');
		 $(".btn-group.col-md-3.col-sm-4").removeClass('col-md-3 col-sm-4').addClass("col-md-8 col-sm-8").css("text-align","right");
	 }

    $("body,.lock_screen").css("background-size","cover");
    
    // 宽窄导航切换
    $(".sidebar1 .collapse-btn span").click(function(){
        $(".sidebar1").hide();
        $(".sidebar2").show();
        $(".sidebar-wrap").animate({"width":"57px"},300);
        $(".main-wrap").animate({"margin-left":"63px"},300);
        $('.sidebar1 .collapse-btn a img').hide();
       
        
    });
    $(".sidebar2 .collapse-btn a").click(function(){
        $(".sidebar2").hide();
        $(".sidebar1").show();
        $(".sidebar-wrap").animate({"width":"210px"},300);
        $(".main-wrap").animate({"margin-left":"217px"},300);
        setTimeout(function () {
            $('.sidebar1 .collapse-btn a img').show();
        }, 300);
        
    });

    autoHeight();

  //弹出层下边框的线
  var manaSum = $('#manage .pull-wrap ul li').length;
  $('#manage .pull-wrap ul li:even').css('border-right','none')
  $('#manage .pull-wrap ul li:last').css({'border-bottom':'1px solid #ccc','border-right':'1px solid #ccc'})
  $('#manage .pull-wrap ul li').eq(manaSum-2).css('border-bottom','1px solid #ccc')
  
//表格hover
  $('.table-bordered tr').removeClass('active');
  $('.table-bordered tr:first').addClass('active');
});

//圆形进度条
$('.circle').each(function(index, el) {
    var maxNum = 200; //总人数
    var lineNum = $('.person_num').find('span').text(); //在线人数
    var nums = lineNum / maxNum * 100;
    var num = nums * 3.6;
    if (num<=180) {
        $(this).find('.right').css('transform', "rotate(" + num + "deg)");
    } else {
        $(this).find('.right').css('transform', "rotate(180deg)");
        $(this).find('.left').css('transform', "rotate(" + (num - 180) + "deg)");
    };
});
//自动获取高度

function autoHeight(){
    $('body').height( $(window).height());
    var screenHeight = $(window).height();
    var screenWidth = $(window).width();
    $('.sidebar1').height(screenHeight-145);
    $('.sidebar2').height(screenHeight-87);
    $('.sidebar3').height(screenHeight-147);
    $('.sidebar1_list,.scrollbar,#scrollbar .viewport').height(screenHeight-168);//滚动条高度
    if(screenWidth>1250){
    	$('.main-cont').height(screenHeight - 147);//右侧高度
        $('#content-main').height($('.main-cont').height() - 37);//右侧内容高度
    }
    
    $('.sidebar3_wrap .main-cont').height(screenHeight-200);//单页面，右侧的高度
    $('.tab-content-container,.bui-nav-tab').height(screenHeight - 77);//内嵌链接tab，右侧的高度
    $('.bottom_rel').height( $('.sidebar1').height()-$('.overview>ul').height());//这里是圆形进度条外层div的高度
    
}
$(window).resize(function() {
    autoHeight();
});

//关闭右下角提示层
$('.system_position .system .icon-x').click(function(){
    $('.system_position .system').hide(300)
});
$('#abs-notice .icon-x').click(function(){
    $('#abs-notice').hide(300)
});
$('.abs-notice .icon-jiantouxia').click(function(){
    $('#abs-notice .person_info').slideToggle();
});


if (window.PIE) {
    $('.pie_right .left,.pie_right .left').each(function() {
        PIE.attach(this);
    });
}
//宽导航点击
$(".sidebar1 .overview>.nav>li>a").click(function(){
    $(this).parent().siblings().find(".nav-inner").slideUp(300);
    $(this).parent().siblings().find("i.rig").removeClass("icon-jiantouxia").addClass("icon-youjiantou");
    $(this).next(".nav-inner").slideToggle(300);
    $(this).parents(".sidebar").css("height","auto");
    if($(this).find("i.rig").hasClass("icon-youjiantou")){
        $(this).find("i.rig").removeClass("icon-youjiantou").addClass("icon-jiantouxia");
    }else{
        $(this).find("i.rig").removeClass("icon-jiantouxia").addClass("icon-youjiantou");
    }

    setTimeout(function () {
        // 获取高度
        var screenHeight = $(window).height();
        $('.sidebar1').height(screenHeight-145);
        $('.sidebar2').height(screenHeight-87);
        $('.sidebar3').height(screenHeight-147);
        $('.sidebar1_list,.scrollbar,#scrollbar .viewport').height(screenHeight-168); //这里是滚动条的高度
        //判断是否显示滚动条
        var bottomH = $('.viewport').height()-$('.overview>ul').height();
        $(".bottom_rel").animate({"height":bottomH},300);
        setTimeout(function () { 
          $('.overview').height($('.overview ul').height()+ $('.bottom_rel') -6)
          var ovHeight = $('.overview').height();
          var sidHeight = $('.viewport').height();
          $('#scrollbar').tinyscrollbar();
          //判断如果鼠标在左侧导航上，导航显示，如果不在，导航消失
 		 $('.sidebar1').mouseover(function(){
 		    	  if(ovHeight > sidHeight){
 		              $('#scrollbar .track,.scrollbar').show();
 		          }else{
 		              $('#scrollbar .track,.scrollbar').hide();
 		              //滚动时改变top
 		          }
 		    	   //判断左侧宽度
 		          if( $('.scrollbar').is(':hidden')){
 		              $('.viewport').css({"width":"100%"});
 		              $(window) .bind('mousewheel', function() {
 		                  $('.overview').css('top','0')
 		              });
 		          }else{
 		        	  $('.viewport').css({"width":"95%"});
 		          }
 		    }).mouseout(function(){
 		    	 $('#scrollbar .track,.scrollbar').hide();
 		    }) 	          
         //判断圆形进度条的定位
         var posCirHeight =  $('.bottom_rel').height();
         if(posCirHeight > 110){
             $('.progress_box').css({'position':'absolute','bottom':'20px','margin-top':'0'})
         }else{
             $('.progress_box').css({'position':'relative','bottom':'0','margin-top':'20px'})
         }
        },310);
    },300);
   
});
//宽导航三级菜单鼠标经过
$(".sidebar1 .nav-inner li dd,.sidebar2 .third_nav dd a").mouseover(function(){
    $('.sidebar2 .third_nav dd .circle_icon,.sidebar1 .nav-inner li dd .circle_icon').removeClass('Nchangeline changeline');
    $(this).find('.circle_icon').addClass('changeline');
    $(this).find('.circle_icon').css({'height':'12px','width':'3px','margin-top':'12px'});
}).mouseout(function(){
    $('.sidebar2 .third_nav dd .circle_icon,.sidebar1 .nav-inner li dd .circle_icon').removeClass('Nchangeline changeline');
    $(this).find('.circle_icon').addClass('Nchangeline');
    $(this).find('.circle_icon').css({'height':'5px','width':'5px','margin-top':'15px'});
});
function notHeightC(){
    $(".sidebar2 .nav-inner li.big-title").css("height","auto");
    $(".sidebar2 .nav-inner").css('width','214px');
    $(".sidebar2 .nav-inner li dt").css({'width':'100%','text-align':'left'});
    $(".sidebar2 .nav-inner li>dl>dd").css({'width':'100%','float':'none'});
    $('.sidebar2 .third_nav dd a span').css("width","70%");
}
$(".sidebar2 .nav>li").mouseover(function(){
    $(this).find(".nav-inner").show();
    $(".sidebar2 .nav li").find('.nav_menus').css('background','none');
    $(this).find('.nav_menus').css('background','#5a77a3');
    var screenHeight = $(window).height();
    if(screenHeight<610){
       var liNumbers = $(this).find('.big-title dd').length;
       if(liNumbers > 7){
           $('.sidebar2 .third_nav dd a span').css("width","60%");
           $(".sidebar2 .nav-inner li.big-title").css("max-height","400px");
           $(".sidebar2 .nav-inner").css('width','400px');
           $(".sidebar2 .nav-inner li dt").css({'width':'100%','text-align':'center'});
           $(".sidebar2 .nav-inner li>dl>dd").css({'width':'50%','float':'left'});
       }else{
           notHeightC();
       }
    }else{
        notHeightC();
    }
}).mouseout(function(){
    $(".sidebar2 .nav li").find('.nav_menus').css('background','none');
    $(this).find(".nav-inner").hide();
});
//窄导航三级菜单
function notHeightD(){
    $(".sidebar2 .nav-inner .third_nav").css("max-height", "auto");
    $(".sidebar2 .nav-inner .third_nav dl").css('width', '214px');
    $(".sidebar2 .nav-inner .third_nav dl dd").css({'width': '100%', 'float': 'none'});
}
$(".sidebar2 .nav-inner li>dl>dd").mouseover(function(){
    $(this).find('a').addClass('hoverSecond');
    $(this).find('.third_nav').show();
    var thirdNumber = $(this).find('.third_nav dd').length;
    var screenHeight = $(window).height();
    if(screenHeight<610) {
        if (thirdNumber > 7) {
            $(".sidebar2 .nav-inner .third_nav").css("max-height", "400px");
            $(".sidebar2 .nav-inner .third_nav dl").css('width', '380px');
            $(".sidebar2 .nav-inner .third_nav dl dd").css({'width': '50%', 'float': 'left'});
        } else {
            notHeightD();
        }
    }else{
        notHeightD();
    }
}).mouseout(function(){
    $(this).find('a').removeClass('hoverSecond');
    $(this).find('.third_nav').hide();
    $(".sidebar2 .nav-inner .third_nav").css("max-height","auto");
    $(".sidebar2 .nav-inner .third_nav dl").css('width','230px');
    $(".sidebar2 .nav-inner .third_nav dl dd").css({'width':'100%','float':'none'});
});
//点击出现换肤弹层
$(".change_skin").click(function(){
    $('.skin_cover').slideDown(500)
});
//点击关闭换肤弹层
$(".skin_cover .skin_cover_cont h4 i").click(function(){
    $('.skin_cover').slideUp(500);
    $('.skin_list_infobg').hide();
});
//换肤层鼠标经过事件
$(".skin_list_list li").hover(function(){
    $(".skin_list_list li .hover_cover").hide();
    $(this).find('.hover_cover').show();
});
//换肤操作（改变右侧图片）
var skinClassName = "";
$(".skin_list_list li").each(function(i){
	 $(this).click(function(){
	    $(".skin_list_list li .select_cover").hide();
	    $(this).find('.select_cover').show();
	    $('.skin_list_info img').hide();
	    $('.skin_list_info img').eq(i).show();
	    $('.skin_list_infobg').show();
		var skins = ["", "pureBlueBg", "ChinaWindBg", "DarkBg", "StarBg", "FabricBg"];
		skinClassName = skins[i]; 
	});
})
$('.skin_list_infobg').click(function(){
	common.ajaxPost('userSwitchSkin.do', {"skinClassName" : skinClassName}, function(){
		Dialog.alert("换肤成功！", function(){
			location.href = location.href;
		});
	});
});
//鼠标经过出现我的资料
$(".person_data").mouseover(function(){
    $(this).find('.popup_personData').show();
}).mouseout(function(){
    $(this).find('.popup_personData').hide();
});
//登录状态
$(".popup_personData_top .popup_right .title>i,.state_style").mouseover(function(){
    $(this).parent().find('.state_style').show();
}).mouseout(function(){
    $(this).parent().find('.state_style').hide();
});

//关闭操作选项卡
$(".close_handle_click").click(function(){
    $('.close_handle_choose').slideToggle();
});

function navChange() {
	var screenHeight = $(window).height();
	navChange1();
	$('.main-cont').height(screenHeight);
	$('#content-main').height(screenHeight - 129);// 右侧内容高度
	$('.main-subnav').hide();
	$('#sidebar1,.navbar-wrap01').hide();
	$('.sidebar2,.navbar-wrap02').show();
	$('.main-cont').css('margin-top', '13px');
	$(".sidebar1").hide();
	$(".sidebar2").show();
	$(".sidebar-wrap").animate({
		"width" : "57px"
	}, 0);
	$(".main-wrap").animate({
		"margin-left" : "63px"
	}, 0);
	$('.sidebar1 .collapse-btn a img').hide();
}
//当导航只有一个时，隐藏
function navChange1() {
	var screenHeight = $(window).height();
	if (screenHeight < 610) {
		$(".sidebar2 .nav-inner li.big-title").css("max-height", "400px");
		$(".sidebar2 .nav-inner").css('width', '368px');
		$(".sidebar2 .nav-inner li dt").css({
			'width' : '100%',
			'text-align' : 'center'
		});
		$(".sidebar2 .nav-inner li dd").css({
			'width' : '50%',
			'float' : 'left'
		});
	} else {
		$(".sidebar2 .nav-inner li.big-title").css("height", "auto");
		$(".sidebar2 .nav-inner").css('width', '214px');
		$(".sidebar2 .nav-inner li dt").css({
			'width' : '100%',
			'text-align' : 'left'
		});
		$(".sidebar2 .nav-inner li dd").css({
			'width' : '100%',
			'float' : 'none'
		});
	}
	$('.main-cont').height(screenHeight);
	$('#content-main').height(screenHeight - 129);// 右侧内容高度
	$('.main-subnav').hide();
	$('.main-cont').css('margin-top', '13px');
}
function unChange(){
    var screenHeight = $(window).height();
    $('.main-subnav').show();
    $('.main-cont').height(screenHeight - 147);
    $('.sidebar2,.navbar-wrap02').hide();
    $('#sidebar1,.navbar-wrap01').show();
    $('.main-cont').css('margin-top','0');
    $(".sidebar2").hide();
    $(".sidebar1").show();
    $(".sidebar-wrap").animate({"width":"210px"},300);
    $(".main-wrap").animate({"margin-left":"217px"},300);
    setTimeout(function () {
        $('.sidebar1 .collapse-btn a img').show();
    }, 300);
   
   
}
function judgementWidth(){
	var windowWidth = $(window).width();
    if(windowWidth < 1250 ){
        navChange()
    } else{
        unChange()
    }
}
judgementWidth();
$(window).resize(function() {
    var windowWidth = $(window).width();
    if(windowWidth < 1250 ){
        navChange()
    } else{
        unChange()
    }
});
$('.carousel-inner-close').click(function(){
    var screenHeight = $(window).height();
    //$('.tab-content-container,.bui-nav-tab').height(screenHeight -107);
    navChange()
});
$('.Concealment-return').click(function(){
    var screenHeight = $(window).height();
    $('#content-main').height(screenHeight -183);
    unChange()
});

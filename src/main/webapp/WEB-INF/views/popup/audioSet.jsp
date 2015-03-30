<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>${title}</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge" />

	<link href="../resources/common/css/default.css" rel="stylesheet" type="text/css" />		    	 
	<link  href="../resources/common/css/skin/pink.flag/jplayer.pink.flag.css" rel="stylesheet" type="text/css" />
	
  	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
	<script type="text/javascript" src="../resources/common/js/jquery.i18n.properties.js"></script>
	<script type="text/javascript" src="../resources/common/js/dropit.js"></script>
	<script type="text/javascript" src="../resources/common/js/jquery-filestyle.js"></script>
	<script type="text/javascript" src="../resources/common/js/jquery.easydropdown.js"></script>
	<script type="text/javascript" src="../resources/common/js/jquery.jplayer.min.js"></script>	
	<script type="text/javascript" src="../resources/common/js/ma2rixplayer.js"></script>
	<script type="text/javascript" src="../resources/common/js/j_progress.js"></script>		
	<script type="text/javascript" src="../resources/common/js/ui.js"></script>	
	
	<script type="text/javascript" >
		$(document).ready(function(){
//			loadBundles("${locale}");
		});
		
		/**
		 * 인자로 전달된 로케일에 대항하는 메시지 파일을 읽어서  자바 스크립트 객체를 생성
		 * @param en, ko 등의 언어 문자열
		 */
		function loadBundles(lang) {
		        jQuery.i18n.properties({
		            name:'message', 
		            path:'/music/locale/properties/', 
		            mode:'both',
		            language:lang, 
		            callback: function() {}
		    });
		}	

		/**
		 * 메시지를 읽어온다. 프레임 중첩등의 경우도 발생할 수 있기 때문에 
		 * 자신이 부모 프레임이 아닐 경우 부모 프레임의 함수를 재 호출한다.
		 * @param msg
		 * @returns
		 */
		function i18n(msg) {
		    var args = "\""+ msg + "\"";
		    for (var i = 1; i < arguments.length; i++) {
		           args += ", \"" + arguments[i] + "\"";
		    }
		    if (parent != this) {
		           return eval("parent.i18n(" + args + ")");
		    }
		    return eval("jQuery.i18n.prop(" + args + ")");
		}
	</script>			
</head>
<body>
	<!-- 오디오 컨트롤러 셋 -->
	<div class="audioSetWrap">
	    <div id="audioSet"></div>
	    <div id="jp_container_1" class="jp-audio">
	    	<!-- 앨범소개 -->
	    	<div class="infoWrap">
	    		<div class="visual"><img src="../resources/images/holderType3.gif" alt="" style="width: 50px; height: 50px;"></div>
	    		<div class="infoText">
	    			<strong class="tit">${arrangeDetail.arrangeTitle}</strong>
	    			<p class="singler">By ${arrangeDetail.arrangeMemberNickName}</p>
	    		</div>
	    		<div class="muszList">
	    			<ul>
	    				<li>작곡가 : ahn</li>
	    				<li>작사가 : ahn</li>
	    				<li>편곡자 : ahn</li>
	    			</ul>
	    		</div>
	    	</div>
	    	<!-- //앨범소개 -->
	    	<!-- 오디어 제어버튼 -->
	        <div class="jp-type-single">
	            <div class="jp-gui jp-interface">
	                <ul class="jp-controls">
	                    <li><a href="javascript:;" class="jp-before" tabindex="1">play</a></li>
	                    <li><a href="javascript:;" class="jp-play" tabindex="1">play</a></li>
	                    <li><a href="javascript:;" class="jp-pause" tabindex="1">pause</a></li>
	                    <li><a href="javascript:;" class="jp-stop" tabindex="1">stop</a></li>
	                    <li><a href="javascript:;" class="jp-next" tabindex="1">next</a></li>
	                </ul>
	            </div>
	            <!-- <div class="jp-details">
	                <ul>
	                    <li><span class="jp-title">타이틀 들어가는 곳</span></li>
	                </ul>
	            </div>
	             -->
	            <div class="jp-no-solution">
	                <span>Update Required</span>
	                To play the media you will need to either update your browser to a recent version or update your <a href="http://get.adobe.com/flashplayer/" target="_blank">Flash plugin</a>.
	            </div>
	        </div>
	        <!-- //오디어 제어버튼 -->
	    </div>
	</div>
	<!-- //오디오 컨트롤러 셋 -->
</body>
</html>

<div id="btn" style="display:block;">
<a class="bulPlay" href="#none" data-sound-title="${arrangeDetail.arrangeTitle}" data-sound-url="http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a;http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"><i class="fa fa-play-circle fa-2x"></i></a>
</div>


<script type="text/javascript">

	$("#btn").hide();

	var ma2 = new Ma2rixInit('#audioSet');
	$(document).on("click", ".bulPlay", function () {
		
	    ma2.stopAudio();
	    
	    var currentPlay = $(document).find(".bulPlay").index(this);

	    $(document).find(".bulPlay i").not(':eq(' + currentPlay + ')').removeClass("fa-stop").addClass("fa-play-circle");
	    if ($(this).find("i").hasClass("fa-play-circle")) {
	        $(this).find("i").removeClass("fa-play-circle").addClass("fa-stop");
	        ma2.startAuidoPlaySelector($(this));
	    } else if ($(this).find("i").hasClass("fa-stop")) {
	        $(this).find("i").removeClass("fa-stop").addClass("fa-play-circle");
	        ma2.stopAudio();
	    }		
	

	});
	
	$(".bulPlay").trigger('click');

	
</script>

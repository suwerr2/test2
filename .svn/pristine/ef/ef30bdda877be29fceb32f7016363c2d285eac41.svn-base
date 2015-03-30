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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>계좌번호등록</title>
	<link href="../resources/common/css/common.css" rel="stylesheet" type="text/css" />
	<link href="../resources/common/css/font-awesome.css" rel="stylesheet" type="text/css" />
	<link href="../resources/common/css/js.css" rel="stylesheet" type="text/css" />
	<link href="../resources/common/css/common-admin.css" rel="stylesheet" type="text/css" />		    	 
	<link href="../resources/common/css/skin/pink.flag/jplayer.pink.flag.css" rel="stylesheet" type="text/css" />
	
	<script type="text/javascript" src="../resources/common/js/jquery-1.11.1.min.js"></script>  	  	
	<script type="text/javascript" src="../resources/common/js/jquery.i18n.properties.js"></script>	
	<script type="text/javascript" src="../resources/common/js/dropit.js"></script>
	<script type="text/javascript" src="../resources/common/js/jquery-filestyle.js"></script>
	<script type="text/javascript" src="../resources/common/js/jquery.easydropdown.js"></script>
	<script type="text/javascript" src="../resources/common/js/jquery.jplayer.min.js"></script>	
	<script type="text/javascript" src="../resources/common/js/ma2rixplayer.js"></script>
	<script type="text/javascript" src="../resources/common/js/dropit.js"></script>
    <script type="text/javascript" src="../resources/common/js/jquery.form.js"></script>		
	<script type="text/javascript" src="../resources/common/js/j_progress.js"></script>		
	<script type="text/javascript" src="../resources/common/js/ui.js"></script>
    
    <script type="text/javascript" >
        var buttonSetType = "01";
        
        	// 쿠키를 만듭니다. 아래 closeWin() 함수에서 호출됩니다
        	
        	function aaa(){ 
        	} 

        	function setCookie( name, value, expiredays ){ 
        			var todayDate = new Date(); 
        			todayDate.setDate( todayDate.getDate() + expiredays ); 
        			document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";" 
        			} 

        	// 체크후 닫기버튼을 눌렀을때 쿠키를 만들고 창을 닫습니다

        	function closeWin(){ 
        		var isTrue= $("input:checkbox[id='oneNotice']").is(":checked");
        		if (isTrue) setCookie( "oneNotice", "done" , 1);  // 오른쪽 숫자는 쿠키를 유지할 기간을 설정합니다
        		self.close(); 
        	} 
        
    </script>
</head>
<body>
	<div class="layerPopupWrap">
		<div class="outer">
			<p class="mb30"><strong>${userName}</strong>님은 현재<br>
				수익금을 돌려받을 계좌를 등록하지 않았습니다.<br>
				계좌를 등록하지 않으면 수익금을 지급받을수 없습니다.<br>
				지금 계좌를 등록하시겠습니까?
			</p>
			<div class="textC mb20">
				<a class="btn" href="javascript:aaa();"><span>예</span></a>
				<a class="btn" href="javascript:closeWin();"><span>다음에</span></a>
			</div>
			<p><input type="checkbox" id="oneNotice" name="Notice" > 하루동안 안보이기</p>
		</div>
	</div>
</body>
</html>

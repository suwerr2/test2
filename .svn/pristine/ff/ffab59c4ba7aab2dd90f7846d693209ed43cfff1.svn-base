<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/top.jsp" %>

			<div class="contents">
                <div class="titleWrap">
                    <h2>My Income</h2>
                </div>
                <div style="height:10px;"> </div>  
                <div class="accuntArea mb10">
					<div class="searchpPriod">
						<span class="">조회년월 :</span>
						<input type="text" id="datepickerFrom" name="dateFrom" value="" /> ~
						<input type="text" id="datepickerTo" name="dateTo" value=""  />
						<div class="floatR">
							<a class="btnPro btn large btnPoint btnType4" href="javascript:fnSearch();"><span>검색</span></a>
						</div>
					</div>
				</div>
				<div class="checkboxArea mb30">
 					<input type="checkbox" id="fieldBox"  value="01"> <label for="comp">작곡</label>
					<input type="checkbox" id="fieldBox"  value="02"> <label for="arrage">편곡</label>
					<input type="checkbox" id="fieldBox"  value="03"> <label for="musi">뮤지션</label>
					<input type="checkbox" id="fieldBox"  value="04"> <label for="write">작사</label> 
				</div>  
				<table class="tblType03 addTrType2"  id="settleList_tb">
                    <colgroup>
                        <col style="width:10%">
                        <col style="width:10%">
                        <col style="width:auto">
                        <col style="width:10%">
                        <col style="width:10%">
                        <col style="width:10%">
                        <col style="width:10%">
                        <col style="width:10%">
                        <col style="width:10%">
                    </colgroup>
                    <tr>
                    	<th>번호</th>
                        <th>분야</th>
                        <th>제목</th>
                        <th>판매가</th>
                        <th>배분율(%)</th>
                        <th>판매갯수</th>
                        <th>총배분금액($)</th>
                        <th>정산</th>
                        <th>미정산</th>
                    </tr>
                    
                </table>
			</div>
		
<%@ include file="../include/bottom.jsp" %>

<script type="text/javascript" src="../resources/common/js/scroll.js"></script>

<script type="text/javascript">
	

	$(document).ready(function(target) {
		var dateFrom = $("#datepickerFrom").val();
		var dateTo = $("#datepickerTo").val();
		
		var newDate = new Date();
		var yy = newDate.getFullYear();
		var mm = newDate.getMonth()+1;
	//	var dd = newDate.getDate();
		var toDay = yy + "-" + mm ;
		
		if 	(dateFrom=="")			$("#datepickerFrom").val(toDay);
		if 	(dateTo=="")			$("#datepickerTo").val(toDay);
		
		$("input[id=fieldBox]:checkbox").attr("checked", true);
		
	});


	function fnSearch(){
 		
 		// 체크 되어 있는 값 추출
 		var field = "";    
		$("input[id=fieldBox]:checked").each(function() {
			if(field==""){
				field = $(this).val(); }else{
					field = field + ',' + $(this).val();	
			}
		});
		
		AutoAddLine.page = 1;
		$("#settleList_tb tr:not(:first)").remove();
 
		if(!$("#datepickerFrom").val()){
			alert('시작일을 입력하시오');
			$("#datepickerFrom").focus();
			return;
		} 
		if(!$("#datepickerTo").val()){
			alert('종료일을 입력하시오');
			$("#datepickerTo").focus();
			return;
		} 
		
		AutoAddLine.dateFrom = $("#datepickerFrom").val();
		AutoAddLine.dateTo = $("#datepickerTo").val();
		AutoAddLine.musicField = field;
		
		AutoAddLine.addRowTypeEmpty(); // 리스트 비우기.			
		AutoAddLine.callScroll();		
	
	}

	
	
	function fnInitSearch(){
		/* 		if(!$("#searchWord").val()){
					alert('검색어를 입력하여주세요');
					$("#searchWord").focus();
					return;
				} */
				AutoAddLine.page = 1;
				$("#settleList_tb tr:not(:first)").remove();
			
	}
	
	
	
	AutoAddLine.dateFrom = "";
	AutoAddLine.dateTo = "";
	var rowCount = 0;

	AutoAddLine.callScroll = function(){ };
	AutoAddLine.prototype.callScroll = function(){
		
		//보내줄 URL
		//var param = "?dateFrom=2014-11-21&dateTo=2015-01-01&searchMemberNo=1";
		
		var param = "?page=" + AutoAddLine.page +
				"&dateFrom=" + AutoAddLine.dateFrom + 
				"&dateTo=" + AutoAddLine.dateTo + 
				"&fieldParam=" + AutoAddLine.musicField;
		
		
		AutoAddLine.url = "/music/settle/getMyIncome" + param;		
		new $$loop_progress_init();
		new $$open_loop_progress();	
		e.beginScroll();
		AutoAddLine.page++;
		rowCount = 0;
	}
	
	
	
	//편곡 라인 추가 함수
	AutoAddLine.addRow = function(){};	
	AutoAddLine.prototype.addRow = function(data){
		rowCount = rowCount + 1;
	    $("#settleList_tb").append(
	            
				"<tr>" + 
		            "<td>" + rowCount + "</td>" +
		            "<td>" + data['musicClass'] + "</td>" +
		            "<td>" + data['musicTitle'] + "</td>" +
		            "<td>" + data['settleAmount'].toLocaleString() + "</td>" +
		            "<td>" + data['settleRate'] + "</td>" +
		            "<td>" + data['settleCount'] + "</td>" +
		            "<td>" + data['totSettleAmount'].toLocaleString() +"</td>" +
		            "<td>" + data['yesSettleAmount'].toLocaleString() + "</td>" +
		            "<td>" + data['notSettleAmount'].toLocaleString() + "</td>" +
				"<tr>"                  
	 	);
	};	
	
	
	/*이벤트 객체 생성*/
	var e = new AutoAddLine_event.Event.InfiniteScroll();
	
	var AutoAddLine = new AutoAddLine();

	AutoAddLine.page = "${page}";	
	AutoAddLine.dateFrom = "${dateFrom}";
	AutoAddLine.dateTo = "${dateTo}";
	AutoAddLine.musicField = "${musicField}";
	
	//변수초기화    
	AutoAddLine.load_cnt = 1;
	AutoAddLine.scroll_able = true;
	AutoAddLine.scrollOK = true;
	AutoAddLine.scrollLock = false;    
	AutoAddLine.callScroll();
		
	
</script>
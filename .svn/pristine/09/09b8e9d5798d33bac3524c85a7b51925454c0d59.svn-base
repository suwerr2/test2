<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/topAdmin.jsp" %>	


			<div class="contents">
				<div class="titleWrap">
					<h2 class="testBtn floatL">로그인 이력조회</h2>
				</div>
				<div class="conArea">
					<input type="text" id="searchMemberNo" name="searchMemberNo" placeholder="Nick Name" style="width: 200px;" value="${searchMemberNo}">
					<a class="btn" href="#none"><span>찾기</span></a>
					<div class="accuntArea mt30 mb30">
						<div class="searchpPriod">
							<span class="">조회기간 :</span>
						<input type="radio" id="rdoPrd" name="rdoPrd" checked onclick="dateSelect('1');" ><label for="dayPrd">일</label>
						<input type="radio" id="rdoPrd" name="rdoPrd" onclick="dateSelect('2');" ><label for="weekPrd">주</label>
						<input type="radio" id="rdoPrd" name="rdoPrd" onclick="dateSelect('3');" ><label for="monthPrd">월</label>
						<input type="radio" id="rdoPrd" name="rdoPrd" onclick="dateSelect('0');" ><label for="inputPrd">기간</label>
							<input type="text" id="datepickerFrom" name="evFrom" value="" /> ~
							<input type="text" id="datepickerTo" name="evTo" value=""  />
							<div class="floatR">
								<a class="btn" href="javascript:fnSearch()"><span>검색</span></a>
								<a class="btn" href="javascript:fnInitSearch()"><span>초기화</span></a>
							</div>
						</div>
					</div>
					<div class="tblScroll">
						<table class="tblType03 addTrType2"  id="logList_tb">
		                    <colgroup>
		                        <col style="width:17%">
		                        <col style="width:15%">
		                        <col style="width:auto">
		                        <col style="width:10%">
		                        <col style="width:10%">
		                    </colgroup>
		                    <tr>
		                    	<th>등록일시</th>
		                        <th>회원</th>
		                        <th>호출URL</th>
		                        <th>접속IP</th>
		                        <th>결과</th>
		                    </tr>
		                    
		                </table>
	                </div>
				</div>
			</div>
			
			               	<!-- layer popup : 편곡자검색 -->
				<div class="layer">
					<div class="bg"></div>
					<div id=vocalSearch class="pop-layer">
						<div class="layerPopupWrap">
							<h3>편곡자검색</h3>
							<div class="popCont">
								<div class="floatL mb10">
									<select class="dropdown" id="selectOpt">
										<option value="01">ID</option>
										<option value="02">Nick</option>
			
									</select>
								</div>
								<div class="floatR mb10">
									<input id="searchComposer" type="text"><a id="getSelectComposer" class="btn small btnPoint ctgView" href="#none"><span>검색</span></a>
								</div>
								<table  id="desk_item_emp" class="tblType03 addTrType2">
									<colgroup>
										<col style="width: 8%">
										<col style="width: 25%">
										<col style="width: 20%">
										<col style="width: auto">
										<col style="width: 16%">
									</colgroup>
									<tbody>
										<tr>
											<th>번호</th>
											<th>ID</th>
											<th>닉네임</th>
											<th>활동분야</th>
											<th>선택</th>
										</tr>

									</tbody>
								</table>
								<div class="textC mt20">
									<a class="btn large btnPoint btnClose" href="#none"><span>닫기</span></a>
								</div>
							</div>
						</div>
					</div>
				</div>
		
<%@ include file="../include/bottom.jsp" %>

<script type="text/javascript" src="../resources/common/js/scroll.js"></script>

<script type="text/javascript">
	// 달력
	$(function() {
		$('#datepickerFrom').datepicker({
			inline : true,
			showOn : "button",
			buttonImage : "<c:url value="/resources/images/icon_month.png" />",
			buttonImageOnly : true,
			onClose : function(date) {
				var fdate = date.replace(/-/gi, ''); //시작일
				var tdate = $('#datepickerTo').val().replace(
						/-/gi, ''); //종료일
				if (fdate > tdate) {
					alert("시작일이 종료일보다 클 수 없습니다.");
					$(this).val($('#datepickerTo').val());
				}
			}
		});
		$('#datepickerTo').datepicker({
			inline : true,
			showOn : "button",
			buttonImage : "<c:url value="/resources/images/icon_month.png" />",
			buttonImageOnly : true,
			onClose : function(date) {
				var fdate = $('#datepickerFrom').val().replace(
						/-/gi, ''); //시작일
				var tdate = date.replace(/-/gi, ''); //종료일
				if (fdate > tdate) {
					alert("종료일이 시작일보다 작을 수 없습니다.");
					$(this).val($('#datepickerFrom').val());
				}
			}
		});
		
	});
	
	
	$(document).ready(function(target) {
		var evFrom = $("#datepickerFrom").val();
		var evTo = $("#datepickerTo").val();
		var searchMemberNo = $("#searchMemberNo").val();
		
		var newDate = new Date();
		var yy = newDate.getFullYear();
		var mm = newDate.getMonth()+1;
		var dd = newDate.getDate();
		var toDay = yy + "-" + mm + "-" + dd;
		
		if 	(evFrom=="")		$("#datepickerFrom").val(toDay);
		if 	(evTo=="")			$("#datepickerTo").val(toDay);
		if 	(searchMemberNo=="")			$("#searchMemberNo").val(0);
		
	});
	
	
	//달력 선택에 따라 일자를 설정한다.
	function dateSelect(val){
		var dateFrom = $("#datepickerFrom").val();
		var dateTo = $("#datepickerTo").val();
		
		var newDate = new Date();
		var yy = newDate.getFullYear();
		var mm = newDate.getMonth()+1;
		var dd = newDate.getDate();
		var today = yy + "-" + mm + "-" + dd;
	
		var selectDate = today.split("-");
		var changeDate = new Date();
		var resultDate = "";	
		
		if(val == "1" || val == "0"){ //일, 기간
			resultDate = today;
		}else if(val == "2") { //주
			changeDate.setFullYear(selectDate[0], selectDate[1]-1, selectDate[2]-6);
			var y = changeDate.getFullYear();
			var m = changeDate.getMonth() + 1;
			var d = changeDate.getDate();
			if(m < 10) { m = "0" + m; }
			if(d < 10) { d = "0" + d; }
			resultDate = y + "-" + m + "-" + d;
		}else if(val == "3"){	//월
			changeDate.setFullYear(selectDate[0], selectDate[1]-1, selectDate[2]);
		      var y = changeDate.getFullYear();
		      var m = changeDate.getMonth();
		      var d = changeDate.getDate()+1;
		      if(m < 10) { m = "0" + m; }
		      if(d < 10) { d = "0" + d; }
		      resultDate = y + "-" + m + "-" + d;
		}
		$("#datepickerFrom").val(resultDate);
		
	}

	function fnSearch(){
 		
		AutoAddLine.page = 1;
		$("#logList_tb tr:not(:first)").remove();
 		
		if(!$("#searchMemberNo").val()){
			alert('회원번호를 입력하여주세요');
			$("#searchMemberNo").focus();
			return;
		} 
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
		AutoAddLine.searchMemberNo = $("#searchMemberNo").val();	
		
		AutoAddLine.addRowTypeEmpty(); // 리스트 비우기.			
		AutoAddLine.callScroll();		
	
	}

	function fnInitSearch(){
		AutoAddLine.page = 1;
		$("#logList_tb tr:not(:first)").remove();
			
	}
	
	AutoAddLine.dateFrom = "";
	AutoAddLine.dateTo = "";
	AutoAddLine.searchMemberNo = "";	

	AutoAddLine.callScroll = function(){};
	AutoAddLine.prototype.callScroll = function(){
		
		//보내줄 URL
			
		var param = "?page=" + AutoAddLine.page +
				"&dateFrom=" + AutoAddLine.dateFrom + 
				"&dateTo=" + AutoAddLine.dateTo + 
				"&searchMemberNo=" + AutoAddLine.searchMemberNo;
		
		
		AutoAddLine.url = "/music/log/getLogListByMemberNo" + param;
		
		new $$loop_progress_init();
		new $$open_loop_progress();	
		e.beginScroll();
		AutoAddLine.page++;
	}
	
	
	
	//편곡 라인 추가 함수
	AutoAddLine.addRow = function(){};	
	AutoAddLine.prototype.addRow = function(data){
	
	    $("#logList_tb").append(
	            
				"<tr>" + 
	            "<td>" + data['regDateTime'] + "</td>" +
	            "<td>" + data['memberNo'] + "</td>" +
	            "<td class='textL'>" + data['actMenu'] + "</td>" +
	            "<td>" + data['actIp'] + "</td>" +
	            "<td class='textL'>" + data['actResult'] + "</td>" +
				"<tr>"                  
				
	 	);
	};	
	
	
	/*이벤트 객체 생성*/
	var e = new AutoAddLine_event.Event.InfiniteScroll();
	
	var AutoAddLine = new AutoAddLine();

	AutoAddLine.page = "${page}";	
	AutoAddLine.dateFrom = "${dateFrom}";
	AutoAddLine.dateTo = "${dateTo}";
	AutoAddLine.searchMemberNo = "${searchMemberNo}";
	
	//변수초기화    
	AutoAddLine.load_cnt = 1;
	AutoAddLine.scroll_able = true;
	AutoAddLine.scrollOK = true;
	AutoAddLine.scrollLock = false;    
	AutoAddLine.callScroll();
		
	
</script>
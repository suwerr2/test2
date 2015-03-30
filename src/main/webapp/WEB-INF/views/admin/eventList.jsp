<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/topAdmin.jsp" %>	
<input type="hidden" id="delEventNo" name="delEventNo" value="0" />

		<!-- contents -->
		<div class="mrContainer">
			<div class="contents">
				<div class="titleWrap">
					<h2 class="testBtn floatL">무료구매관리(이벤트기간, 횟수지정)</h2>
				</div>
				<div class="conArea">
					<div class="accuntArea">
						<h3>작곡/편곡 무료 횟수 지정</h3>
						
						<div class="searchpPriod mt30 mb30">
							<span class="">기간 :</span>
							<input type="text" id="datepickerFrom" name="evFrom" value="" /> ~
							<input type="text" id="datepickerTo" name="evTo" value=""  />
							<span class="ml30">작곡 :</span><input type="text" id="composeCnt" placeholder="작곡 무료 횟수" style="width: 100px;" value=0>
							<span class="ml30">편곡 :</span><input type="text" id="arrangeCnt"  placeholder="편곡 무료 횟수" style="width: 100px;" value=0>
							<a class="btn ml30" id="addEvent" href="#none"><span>등록</span></a>
							<a class="btn ml30" id="delEvent" href="#none"><div id="divDelEvent"><span>삭제</span></div></a>
						</div>
					</div>
					<div class="tblScroll">
						<table class="tblType03 addTrType2"  id="logList_tb">
		                    <colgroup>
		                        <col style="width: 20%">
		                        <col style="width: 20%">
		                        <col style="width: auto">
		                        <col style="width: 30%">
		                    </colgroup>
		                    <tr>
		                    	<th>기간(~부터)</th>
		                        <th>기간(~까지)</th>
		                        <th>분야</th>
		                        <th>무료곡 수</th>
		                    </tr>

		                </table>
		            </div>
				</div>
			</div>
		</div>
		<!-- //contents -->

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
			//if (fdate > tdate) {
			//	alert("시작일이 종료일보다 클 수 없습니다.");
			//	$(this).val($('#datepickerTo').val());
			//}
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
	
	//addEvent
    //등록버튼 이벤트 핸들러 
    //클래스 변경(dsbae 2014.11.26)
    $("#addEvent").on("click", function () {
        $("#delEventNo").val(0);
    	fnSearch("insert");
    });
	
	//delEvent
    //삭제버튼 이벤트 핸들러 
    //클래스 변경(dsbae 2014.11.26)
    $("#delEvent").on("click", function () {
    	fnSearch("delete");
    });

});



$(document).ready(function(target) {
	var evFrom = $("#datepickerFrom").val();
	var evTo = $("#datepickerTo").val();
	
	var newDate = new Date();
	var yy = newDate.getFullYear();
	var mm = newDate.getMonth()+1;
	var dd = newDate.getDate();
	var toDay = yy + "-" + mm + "-" + dd;
	
	//if 	(evFrom=="")		$("#datepickerFrom").val(toDay);
	//if 	(evTo=="")			$("#datepickerTo").val(toDay);
	
    $("#divDelEvent").hide();
    $("#delEventNo").val(0);
    
});


function selectDel(eventNo, evFrom, evTo, musicClass, cnt){
	$("#delEventNo").val(eventNo);
	$("#datepickerFrom").val(evFrom);
	$("#datepickerTo").val(evTo);
	if (musicClass=="작곡") {
		$("#composeCnt").val(cnt);
		$("#arrangeCnt").val(0);
	}else{
		$("#composeCnt").val(0);
		$("#arrangeCnt").val(cnt);
	}
		
	$("#divDelEvent").show();

}

function fnSearch(action){
	
	AutoAddLine.page = 1;
	$("#logList_tb tr:not(:first)").remove();

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
	
	AutoAddLine.evFrom = $("#datepickerFrom").val();
	AutoAddLine.evTo = $("#datepickerTo").val();
	if ($("#composeCnt").val()=="") $("#composeCnt").val("0");
	if ($("#arrangeCnt").val()=="") $("#arrangeCnt").val("0");
	if ($("#delEventNo").val()=="") $("#delEventNo").val("0");
	
	AutoAddLine.composeCnt = $("#composeCnt").val();	
	AutoAddLine.arrangeCnt = $("#arrangeCnt").val();
	AutoAddLine.action = action;
	
	AutoAddLine.addRowTypeEmpty(); // 리스트 비우기.			
	AutoAddLine.callScroll();
	$("#divDelEvent").hide();
	$("#datepickerFrom").focus();
	
	$("#datepickerFrom").val("");
	$("#datepickerTo").val("");
	$("#composeCnt").val("0");
	$("#arrangeCnt").val("0");
	$("#delEventNo").val("0");
}

function fnInitSearch(){
	/* 		if(!$("#searchWord").val()){
				alert('검색어를 입력하여주세요');
				$("#searchWord").focus();
				return;
			} */
			AutoAddLine.page = 1;
			$("#logList_tb tr:not(:first)").remove();
		
}
</script>		
<%@ include file="../include/bottom.jsp" %>

<script type="text/javascript" src="../resources/common/js/scroll.js"></script>

<script type="text/javascript">

AutoAddLine.evFrom = "";
AutoAddLine.evTo = "";
AutoAddLine.composeCnt = 0;
AutoAddLine.arrangeCnt = 0;
AutoAddLine.delEventNo = 0;

AutoAddLine.callScroll = function(){};
AutoAddLine.prototype.callScroll = function(){
	
	//보내줄 URL
	//var param = "?evFrom=2014-11-21&evTo=2015-01-01&searchMemberNo=1";
	
	var param = "?page=" + AutoAddLine.page +
			"&evFrom=" + AutoAddLine.evFrom + 
			"&evTo=" + AutoAddLine.evTo + 
			"&composeCnt=" + AutoAddLine.composeCnt + 
			"&arrangeCnt=" + AutoAddLine.arrangeCnt +
			"&delEventNo="+ $("#delEventNo").val();
	
	AutoAddLine.url = "/music/event/getEventList" + param;
	
	new $$loop_progress_init();
	new $$open_loop_progress();	
	e.beginScroll();
	AutoAddLine.page++;
}



//편곡 라인 추가 함수
AutoAddLine.addRow = function(){};	
AutoAddLine.prototype.addRow = function(data){

    $("#logList_tb").append(
            
		"<tr onclick='javascript:selectDel(" + data['eventNo'] + ",\"" + data['evFromDate'] + "\",\"" + data['evToDate'] + "\",\"" + data['musicClass'] + "\"," + data['eventCnt'] + ")' >" +
            "<td>" + data['evFromDate'] + "</td>" + 
        	"<td>" + data['evToDate'] + "</td>" + 
        	"<td>" + data['musicClass'] + "</td>" + 
        	"<td>" + data['eventCnt'] + "곡 까지 무료</td>" + 
           "<tr>"                  
 	);
};	


/*이벤트 객체 생성*/
var e = new AutoAddLine_event.Event.InfiniteScroll();

var AutoAddLine = new AutoAddLine();

AutoAddLine.page = "${page}";	
AutoAddLine.evFrom = "${evFrom}";
AutoAddLine.evTo = "${evTo}";
AutoAddLine.composeCnt = "${composeCnt}";
AutoAddLine.arrangeCnt = "${arrangeCnt}";
AutoAddLine.delEventNo = "${delEventNo}";

//변수초기화    
AutoAddLine.load_cnt = 1;
AutoAddLine.scroll_able = true;
AutoAddLine.scrollOK = true;
AutoAddLine.scrollLock = false;    
AutoAddLine.callScroll();
		
	
</script>
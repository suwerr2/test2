<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>

<%
	String tabActiveNum = request.getParameter("tabActiveNum");
	String memberNo = request.getParameter("memberNo");
%>

<script>
	var tabActiveNum ="<%=tabActiveNum%>";
	var myId = ${memberNo};
	var visitId = ${profileCommand.user.memberNo};
</script>

            <div class="contents">
                <div class="myFanPro">
                	<div class="visual"><a href="/music/user/myProfile?menu=1&page=1&memberNo=${profileCommand.user.memberNo}"><img src="/music/resources/images/myprofile.jpg" style="width: 100px; height: 100px;" alt=""></a></div>
                	<p class="idView"><a href="#none">${profileCommand.user.memberUserId}</a>  </p>
                </div>
                <!--tab-->
                <div class="tabWrapType1">
                    <ul class="tabBtnSet1 tabCommon">
                        <li><a href="#none" class="menu1"><span><strong>${fanTotal1}</strong> Fans</span></a></li>
                        <li><a href="#none" class="menu2"><span><strong>${playListTotalSum}</strong> PlayList</span></a></li>
                        <li><a href="#none" class="menu3"><span><strong>${fanTotal2}</strong> Star</span></a></li>
                        <li><a href="#none" class="menu4"><span><strong>${sponTotalCount}</strong> Sponsor</span></a></li>
                    </ul>
                    <!-- tabBox1 -->
                    <div class="tabCont">
	                	<div class="myFanList">
	                		<ul class="tenFans">
	                		</ul>
	                	</div>
	                </div>
	                <!-- //tabBox1 -->
                    <!-- tabBox2 -->
                    <div class="tabCont">
                    	<div class="listWrap">
							<ul class="arrList">
							</ul>
						</div>
		            </div>
                    <!-- tabBox2 -->
                    <!-- tabBox3 -->
                    <div class="tabCont">
	                    <div class="myFanList">
	                		<ul class="tenFans">
	                		</ul>
	                	</div>
	                </div>
	                <!-- //tabBox3 -->
                    <!-- tabBox4 -->
                    <div class="tabCont">
                    	<div class="contBox01 mb20">
	                    	<ul class="floatL">
		                		<li>스폰 시작 일시 : ${sponStartDay}  </li>
		                		<li>현재 금액 : ${sponTotalSum}$ </li>
		                		<li>스폰수 : ${sponTotalCount}명 </li>
		                	</ul>
		                	<div class="btnComposition">
                		<c:if test="${profileCommand.user.memberNo != memberNo}">		                	
		                		<a class="pt10 pb10" data-targetId="${profileCommand.user.memberNo}" href="javascript:layer_open_common('sponsorPop')" id="sponsorBtn"><span>스폰하기</span></a>
		                </c:if>
		                	</div>
	                    </div>
	                    <div class="hType1 pt0">
		                    <h3>스폰서 리스트</h3>
		                </div>
		                <div class="sponList">
		                	<ul class="tenSponsor">
		                	</ul>
		                </div>
                    </div>
                    <!-- tabBox4 -->
                </div>
                <!-- //tab -->                 
            </div>
            <!-- //contents -->

<%@ include file="../include/bottom.jsp" %>	     


<script type="text/javascript" src="../resources/common/js/scroll.js"></script>

<script type="text/javascript">	

	AutoAddLine.callScroll = function(){};
	AutoAddLine.prototype.callScroll = function(){
		
		//url that send
		var param = "&page=" + AutoAddLine.page + "&memberNo=" + AutoAddLine.memberNo;			
		AutoAddLine.url = AutoAddLine.tempUrl + param;
//		alert(AutoAddLine.url);

		new $$loop_progress_init();
		new $$open_loop_progress();
		e.beginScroll();
		
		AutoAddLine.page++;
	}
</script>
	


<script type="text/javascript">

	//this is function that add line
	AutoAddLine.addRow = function(){};	
	AutoAddLine.prototype.addRow = function(data){

		if(AutoAddLine.menu == 1 || AutoAddLine.menu == 3){

			    $(".tenFans").append(
			            "<li>" +
			            "   <a href='/music/user/myProfile?memberNo=" + data["memberNo"] + "'><img src='/music/resources/images/img_nonprofile.gif' alt=''></a>" +
			            "   <div class='viewIcon'>" +
			            "       <p><a href='/music/user/myProfile?memberNo=" + data["memberNo"] + "'>" + data["memberNickName"] + "</a></p>" +
			            "       <div class='fanIcon'>" +
			            "           <i class='fa fa-heart'></i>" +
			            "           <strong>" + data["fanCnt"] + "</strong>" +
			            "       </div>" +
			            "   </div>" +
			            "</li>"	
			 	);

			    $(".tenFans li:last").append(
			            "<div class='heartStat'><i class='fa fa-heart pointColorRed'></i></div>"
			    );

		}


		if(AutoAddLine.menu == 2){
			
		    $(".arrList").append(
		            
					"<li class='secType1 oh'>" + 
					"<div class='coverArt'>" +
					"	<a href='#none'><img src='/music/resources/images/holderType3.gif' alt='' style='width: 110px; height: 110px;'></a>" +
					"</div>" +
					"<div class='soundArea'>" +
					"	<div class='soundHeader'>" +
					"		<a class='bulPlay data-sound-url' href='#none' data-sound-url=''><i class='fa fa-play-circle fa-2x'></i></a>" +
					"		<span class='songTitle'><a href='#none'>" + data["arrangeTitle"] + "</a></span>" +
					"		<span class='songSinger'><a href='#none'>" + data["memberNickName"] + "</a></span>" +
					"		<a class='btn small btnPoint ctgView' href='#none'><span>" + data['genreName'] + "</span></a>" +
					"	</div>" +
					"	<!-- 개발에서 확인요망 -->" +
					"	<div class='soundBody'>" +
                    "        <div class='pajaImg'><img src='/music/resources/images/holderType2.gif' alt='' style='width: 100%;'></div>" +
                    "        <div class='soundBar'></div>" +
					"	</div>" +
					"	<!-- //개발에서 확인요망 -->" +
                    "   <div class='soundFooter'>" +
                    "       <a class='btn large btnType1' href='#none'><span>Fan</span></a>" +
                    "       <a class='btn large btnType2' href='#none' data-showing='0'><span>Comment</span></a>" +
                    "       <a class='btn large btnType3' href='#none'><span>연주자 현황</span></a>" +
                    "       <a class='btn large btnPoint btnType4' href='#none'><span>참여하기</span></a>" +
           		 	"       <a class='btn large btnType5' href='javascript:playListInsert(\"04\", " + data['vocalNo'] + ", ${memberNo})'><span>Play list</span></a> " +                    
                    "       <a class='btn large btnType6' href='#none'><span>맵보기</span></a>" +
                    "       <a class='btn large btnPoint btnType7' href='#none'><span>구매</span></a>" +
                    "       <a class='btn large btnType8' href='#none'><span>악보</span></a>" +
                    "       <a class='btn large btnType9' href='#none'><span>SponsorsShip</span></a>" +
                    "       <a class='btn large btnType10' href='#none'><span>편곡 보컬 참여</span></a>" +
                    "       <a class='btn large btnType11' href='#none'><span><i class='fa fa-share-square-o'></i> Share</span></a>" +
                    "        <ul class='soundFooterRight'>" +
                    "           <li>" +
                    "               <i class='fa fa-heart'></i>" +
                    "               <strong>" + data["fanCount"] + "</strong>" +
                    "           </li>" +
                    "           <li>" +
                    "               <i class='fa fa-download'></i>" +
                    "               <strong>0</strong>" +
                    "           </li>" +
                    "           <li>" +
                    "               <i class='fa fa-dollar'></i>" +
                    "               <strong>" + data["sponsorAmount"] + "</strong>" +
                    "           </li>" +
                    "           <li>" +
                    "               <a href='javascript:deletePlayList(" + data["playListNo"] + ")'><span class='deletIcon'><i class='fa fa-trash'></i></span></a>" +
                    "           </li>" +
                    "       </ul>" +
                    "   </div>" +
					"	<div class='commentWrap' style='display: none;'>" +
                	"       <span class='commetText'>comment</span>" +
					"		<input type='text' class='cmtMemo' style='width: 700px;' placeholder='글을 입력 하세요' onkeypress='javascript:cmt_write_common(" + data['playListNo'] + ",this.value)'>" +
					"	</div>" +
					"	</div>" +
					"	</li>"
		 	);
		    
 	         $(".arrList li:last-child .btnType3,.arrList li:last-child .btnType4, .arrList li:last-child .btnType7, .arrList li:last-child .btnType12, .arrList li:last-child .btnType8").remove();
 	         
			if(myId != visitId){ 	         
 	         $(".soundFooterRight:last li:last").remove();
			}
		    
		    
		    $(".tenFans li:last").append(
		            "<div class='heartStat'><i class='fa fa-heart pointColorRed'></i></div>"
		    );
    
		}
		
		if(AutoAddLine.menu==4){
		    $(".tenSponsor").append(		            
            	"<li>" +
        		"	<div class='sponImg'><a href='/music/user/myProfile?memberNo=" + data["sponsorMemberNo"] + "'><img src='/music/resources/images/img_nonprofile.gif' style='width: 100px; height: 100px;' alt=''></a></div>" +
        		"	<p><a href='/music/user/myProfile?memberNo=" + data["sponsorMemberNo"] + "'>" + data["memberNickName"] + "</a></p>" +
        		"</li>"		    		
		 	);			
		}

	};	
</script>



<script type="text/javascript">

	

	/*이벤트 객체 생성*/
	var e = new AutoAddLine_event.Event.InfiniteScroll();	
	var AutoAddLine = new AutoAddLine();

	//변수초기화
	AutoAddLine.page = "1";	
	AutoAddLine.menu = "";	
	AutoAddLine.load_cnt = 1;
	AutoAddLine.scroll_able = true;
	AutoAddLine.scrollOK = true;
	AutoAddLine.scrollLock = false;
	AutoAddLine.likeFor = "0";
	AutoAddLine.url = "";
	AutoAddLine.memberNo = <%=memberNo%>;
	
	AutoAddLine.tempUrl = "/music/user/remoteMyFan?likeFor=0&menu=1";     //This is default URL

	//one run when into this page
//	AutoAddLine.callScroll(); No need run
	
</script>



<script type="text/javascript">	


function playListInsert(musicClass, musicNo, memberNo){
	
	$.ajax({
		url:"/music/vocal/vocalRemoteInsert?musicClass=" + musicClass + "&musicNo=" + musicNo + "&memberNo=" + memberNo,
		success:function(data){
			alert('플레이리스트에 해당곡이 추가되었습니다.');		
		},
		error:function(data){
//			alert('관리자에게 문의하세요');
		}
	})	
	
}



$(function(){
	
	$(".tenFans").empty();		
	$(".tenSponsor").empty();
	$(".arrList").empty();	

	if(tabActiveNum==0){	
	
		AutoAddLine.page = "1";			
		AutoAddLine.tempUrl = "/music/user/remoteMyFan?likeFor=0&menu=1";
		$(".tenFans").empty();	
		AutoAddLine.callScroll();
	
	}else if(tabActiveNum==1){
		
		AutoAddLine.page = "1";			
		AutoAddLine.tempUrl = "/music/user/remotePlayList?menu=2";
		$(".arrList").empty();
		AutoAddLine.callScroll();		
		
	}else if(tabActiveNum==2){
		
		AutoAddLine.page = "1";
		AutoAddLine.tempUrl = "/music/user/remoteMyFan?likeFor=1&menu=3";
		$(".tenFans").empty();
		AutoAddLine.callScroll();	
		
	}else if(tabActiveNum==3){
		
		AutoAddLine.page = "1";			
		AutoAddLine.tempUrl = "/music/user/remoteMySpon?menu=4";
		$(".tenSponsor").empty();
		AutoAddLine.callScroll();
		
	}

})



$(document).on("click",".menu1",function(){
	AutoAddLine.page = "1";			
	AutoAddLine.tempUrl = "/music/user/remoteMyFan?likeFor=0&menu=1";
	$(".tenFans").empty();	
	AutoAddLine.callScroll();
});	

$(document).on("click",".menu2",function(){	
	AutoAddLine.page = "1";			
	AutoAddLine.tempUrl = "/music/user/remotePlayList?menu=2";
	$(".arrList").empty();
	AutoAddLine.callScroll();
});	

$(document).on("click",".menu3",function(){	
	AutoAddLine.page = "1";
	AutoAddLine.tempUrl = "/music/user/remoteMyFan?likeFor=1&menu=3";
	$(".tenFans").empty();
	AutoAddLine.callScroll();
});

$(document).on("click",".menu4",function(){	
	AutoAddLine.page = "1";			
	AutoAddLine.tempUrl = "/music/user/remoteMySpon?menu=4";
	$(".tenSponsor").empty();
	AutoAddLine.callScroll();	
});	




$(document).ready(function(target) {
    //폼 등록 버튼 클릭시 호출
    $('#sponsor-submit').click(function(event){
    	event.preventDefault();
    	
		$.ajax({
			url:'/music/vocal/initSponsor',
			data:$('#sponsor-form').serialize(),
			dataType:'json',
			success:function(data){
				if(data["check"] > 0){
					alert("스폰은 1회만 가능합니다.");
				}else{
					location.href = "/music/user/myFan?tabActiveNum=3&memberNo=" + ${profileCommand.user.memberNo};
				}
			},
			error:function(data){
//				alert('관리자에게 문의하세요');
			}
		})

    });
    
});







//음원리스트에서 스폰서 클릭시
$(document).on("click", "#sponsorBtn", function () {
    var data_targetId = $(this).attr('data-targetId');
    $("#memberId").val(data_targetId);
    $("#vocalNum").val(0);
    $("#memberSponsorId").val("${memberNo}");
    
});


function deletePlayList(playListNo){

	$.ajax({
		url:'/music/user/remoteDeletePlayList?playListNo=' + playListNo,
		success:function(data){
			alert('플레이 리스트에서 삭제 되었습니다.');
			location.href="/music/user/myFan?tabActiveNum=1&memberNo=" + ${memberNo};
		},
		error:function(data){
//			alert('관리자에게 문의하세요');
		}
	})
}

</script>



	<!-- layer popup : 스폰서 -->
	<form id ="sponsor-form" method ="POST" action="/music/vocal/initSponsor">				
          <div class="layer">
              <div class="bg"></div>
           <div id="sponsorPop" class="pop-layer">
           	<div class="layerPopupWrap">
           		<h3>Sponsor</h3>
           		<div class="popCont">
           		<div class="arrInfoWrap floatL pd0">
           				<h4>금액</h4>
           			</div>
            		<div class="floatL mb10 ml10">
             		<select class="dropdown" name="sponsorAmount" id="sponsorAmount">			                		
						<c:forEach var="i" begin="1" end="10">
						<option value="${i}">${i}$</option>   
						</c:forEach>    
                  	</select>
              </div>
              <div class="contBox01">
              	<ul>
              		<li>스폰 금액은 최대 10달러 까지 가능합니다.</li>
              		<li>스폰 금액은 실제 결제되는 것이 아니라, 입력하신 금액에 대응하는 포인트로 보컬에게 부여됩니다.</li>
              	</ul>
              </div>
                 <div class="textC mt20">
                 	<a class="btn large btnPoint btnClose" href="#none"><span>취소</span></a>
                 	<a class="btn large btnPoint btnClose" href="#none" id="sponsor-submit"><span>확인</span></a>
                 </div>
                </div>
        	</div> 
        </div>
    </div>
    
    <input type="hidden" id="memberId" name="memberId" value="">
    <input type="hidden" id="vocalNum" name="vocalNum" value="">	            
    <input type="hidden" id="memberSponsorId" name="memberSponsorId" value="">	            
    
    </form>
    <!-- //layer popup : 스폰서 -->   



       
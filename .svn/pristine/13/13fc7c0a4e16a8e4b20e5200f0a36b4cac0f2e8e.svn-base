<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>	

		<!-- contents -->
		<div class="mrContainer">
			<div class="contents">
				<div class="titleWrap">
					<h2 class="testBtn">음원 리스트</h2>
					<div class="arrayWrap">
						<div class="listSearch"><input type="text" id="searchWord" onkeypress="javascript:search()"><i class="fa fa-search searchIcon"></i></div>
						<div class="checkSelect">
                            <select class="dropdown" id="genre_sel" name="genre_sel" onchange="javascript:sortGenre()">                            
	                                <option value="0">--전체장르--</option>                            
								<c:forEach var="genre" items="${genreList}">
	                                <option value="${genre.genreNo}" <c:if test="${genre.genreNo == genreNo}">selected="selected"</c:if>>${genre.genreName}</option>
								</c:forEach>
                            </select>
						</div> 
					</div>
				</div>
				<div class="listWrap">
					<ul class="arrList"></ul>
				</div>
	            
			</div>
			
			
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



       <input type="hidden" id="musicClassNo"  name="musicClassNo" 	value="03" />
       <input type="hidden" id="musicMemberNo" name="musicMemberNo" value="" />       		
	   <input type="hidden" id="fanMemberNo" 	name="fanMemberNo" value="" />
       <input type="hidden" id="musicNo" 		name="musicNo"  value="" />	   


	
<%@ include file="../include/listCommonLayer.jsp" %>	
<%@ include file="../include/bottom.jsp" %>









<script type="text/javascript">



function beforeCallFanAjax(musicMemberNo, musicNo){
	$("#musicMemberNo").val(musicMemberNo);
	$("#fanMemberNo").val(musicMemberNo);
	$("#musicNo").val(musicNo);
	
	if (musicMemberNo == AutoAddLine.memberNo){
		alert("로그인사용자의 팬이 될수 없습니다.");
		return;
	}		
	
	checkFan();
}








function checkFan(){

	var url = "/music/common/checkFanCount?fanMemberNo=" + $("#fanMemberNo").val() + 
	"&musicMemberNo=" + $("#musicMemberNo").val() + 
	"&musicClass=" + $("#musicClassNo").val() + 
	"&musicNo=" + $("#musicNo").val();				
//	alert(url);
	
	$.ajax({     
		contentType : "application/x-www-form-urlencoded;charset=UTF-8",
		type : "GET",
		url : url,
		success : function(data){
			$.each(data, function(key, state){
				if(key=="fanCommand"){
					//alert('값 : ' + state['fanHeartCount']);
					if(state['fanHeartCount'] > 0){
						delFanAjax();
					}else{
						addFanAjax();
					}
				}
			});
		},
		error : function(xhr, status, error){
      		alert('로그인 후 진행하기 바랍니다');
		}
	});

}	



function delFanAjax(){
	
	if (confirm("해당곡 팬이 삭제됩니다.\n 삭제하겠습니까?") == true){
		// 팬 삭제처리
		
		var url = "/music/common/subFan?fanMemberNo=" + $("#fanMemberNo").val() + 
		"&musicMemberNo=" + $("#musicMemberNo").val() + 
		"&musicClass=" + $("#musicClassNo").val() + 
		"&musicNo=" + $("#musicNo").val();				
//		alert(url);
		
		$.ajax({     
			contentType : "application/x-www-form-urlencoded;charset=UTF-8",
			type : "GET",
			url : url,
			success : function(data){
				$.each(data, function(key, state){
					if(key=="fanCommand"){
 						className = ".fa-heart" + $("#musicNo").val();						
 						$(className).removeClass("pointColorRed");		
 						
 						className2 = "#fanCnt" + $("#musicNo").val();
 						$(className2).text(state['fanCount']);
					}
				});
				//alert('등록된 팬이 삭제되었습니다.');
			},
			error : function(xhr, status, error){
	      		alert('로그인 후 진행하기 바랍니다');
			}
		});	

	}		
}

function addFanAjax(){
	$.ajax({     
		contentType : "application/x-www-form-urlencoded;charset=UTF-8",
		type : "GET",
		url : "/music/common/addFan?fanMemberNo=" + $("#fanMemberNo").val() + 
						"&musicMemberNo="+$("#musicMemberNo").val() + 
						"&musicClass=" + $("#musicClassNo").val() + 
						"&musicNo="+$("#musicNo").val(),
		success : function(data){
			$.each(data, function(key, state){
				if(key=="fanCommand"){
						className = ".fa-heart" + $("#musicNo").val();						
						$(className).addClass("pointColorRed"); 		
						
						className2 = "#fanCnt" + $("#musicNo").val();	 						 						
						$(className2).text(state['fanCount']);						

				}					
			});
			alert('팬으로 등록되었습니다.');
		},
		error : function(xhr, status, error){
      		alert('로그인 후 진행하기 바랍니다.');
		}
	});			
	
}






//완료된 편곡에서 공유클릭
$(document).on("click", ".btnType11", function () {
    var data_url = $(this).attr('data-url');
    var data_title = $(this).attr('data-title');
    var data_genre = $(this).attr('data-genre');
    var data_image = $(this).attr('data-image');
    var data_singer = $(this).attr('data-singer');
    var data_puls = $(this).attr('data-puls');    
	layer_open_a("sharePop", data_url, data_title, data_genre, data_image, data_singer, data_puls);
});



// 매개변수 보내기 위한 팝업함수 따로 정의 (김기수)
function layer_open_a(el, data_url, data_title, data_genre, data_image, data_singer, data_puls) {
	
    var temp = $('#' + el);

    temp.parents('.layer').fadeIn();

    if (temp.outerHeight() < $(document).height()) {
        temp.css('margin-top', '-' + temp.outerHeight() / 2 + 'px')
    } else {
        temp.css('top', '0px');
    }
    
    if (temp.outerWidth() < $(document).width()) {
        temp.css('margin-left', '-' + temp.outerWidth() / 2 + 'px')
    } else {
        temp.css('left', '0px');
    }
    
    $('.layer .songTitle').html(data_title);
    $('.layer .songSinger').html(data_singer);
    $('.layer .idcType1').html(data_genre);
    $('#shareUrl').val(data_url);
    $('.layer .coverArt img').attr("src", "/music/resources/images/holderType3.gif");
    $('.layer .pajaImg img').attr("src", "/music/resources/images/holderType2.gif");    
    
    $('.layer .bg, .layer .btnClose').click(function (e) {
        $('.layer').fadeOut();
        e.preventDefault();
    });

}





$(document).ready(function(target) {
    //폼 등록 버튼 클릭시 호출
    $('#sponsor-submit').click(function(event){
    	event.preventDefault();

		$.ajax({
			url:'/music/vocal/initSponsor',
			data:$('#sponsor-form').serialize(),
			dataType:'json',
			success:function(data){
				var className = ".fa-dollar" + data['sponsorNo'];
				$(className).text(data['sponsorAmount']);
				
			},
			error:function(data){
//				alert('관리자에게 문의하세요');
			}
		})

    });
    
});



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




//순별로 가져오기.
function sortGo(orderBy){
	
	AutoAddLine.page = 1;
	AutoAddLine.orderby = orderBy;
	AutoAddLine.genreNo = $("#genre_sel").val();
			
	AutoAddLine.addRowTypeEmpty(); // 리스트 비우기.	
	AutoAddLine.callScroll();
	
}

function sortGenre(){
	
	AutoAddLine.page = 1;
	AutoAddLine.genreNo = $("#genre_sel").val();			
			
	AutoAddLine.addRowTypeEmpty(); // 리스트 비우기.	
	AutoAddLine.callScroll();
	
}


//음원리스트에서 스폰서 클릭시
$(document).on("click", "#sponsorBtn", function () {
    var memberNo = $(this).attr('data-member');
    var vocal_num = $(this).attr('data-vocal-num');
    var memberLoinId = $(this).attr('data-member-login');
    $("#memberId").val(memberNo);
    $("#vocalNum").val(vocal_num);
    $("#memberSponsorId").val(memberLoinId);
    
});

</script>



<script type="text/javascript" src="../resources/common/js/scroll.js"></script>
<script type="text/javascript">

	AutoAddLine.callScroll = function(){};
	AutoAddLine.prototype.callScroll = function(){
		
		
		//보내줄 URL
		var param = "?page=" + AutoAddLine.page + "&listType=" + AutoAddLine.listType + 
					"&genreNo=" + AutoAddLine.genreNo + "&orderBy=" + AutoAddLine.orderby + 
					"&searchWord=" + AutoAddLine.searchWord + "&isSearch=" + AutoAddLine.isSearch;			
		AutoAddLine.url = "/music/vocal/vocalRemoteList" + param;
		
	//	alert(AutoAddLine.url);

		new $$loop_progress_init();
		new $$open_loop_progress();	
		e.beginScroll();
		AutoAddLine.page++;
	}


	//음원리스트 라인 추가 함수
	AutoAddLine.addRow = function(){};	
	AutoAddLine.prototype.addRow = function(data){
			
		if(AutoAddLine.memberNo==0){	
				var sponsorBtn = "<a class='btn large btnType9' data-member-login='${memberNo}' data-vocal-num='" + data['vocalNo'] + "' data-member='" + data['vocalMemberNo'] + "' href='javascript:alert(\"로그인이 필요한 메뉴입니다.\")' id='sponsorBtn'><span>SponsorsShip</span></a>";
		}else if(AutoAddLine.memberNo == data['vocalMemberNo']){
				var sponsorBtn = "<a class='btn large btnType9' data-member-login='${memberNo}' data-vocal-num='" + data['vocalNo'] + "' data-member='" + data['vocalMemberNo'] + "' href='javascript:alert(\"자신에게는 스폰 할수 없습니다.\")' id='sponsorBtn'><span>SponsorsShip</span></a>";		
		}else{
				var sponsorBtn = "<a class='btn large btnType9' data-member-login='${memberNo}' data-vocal-num='" + data['vocalNo'] + "' data-member='" + data['vocalMemberNo'] + "' href='javascript:layer_open_common(\"sponsorPop\")' id='sponsorBtn'><span>SponsorsShip</span></a>";				
		}
		

         $(".arrList").append(
        		 "						<li class='secType1 oh'> " + 
        		 "							<div class='coverArt'> " +             		 
        		 "								<a href='/music/vocal/vocalDetail?vocalNo=" + data['vocalNo'] + "'><img src='/music/resources/images/vocal_sample.jpg' alt='' style='width: 110px; height: 110px;'></a> " + 
        		 "							</div> " + 
        		 "							<div class='soundArea'> " + 
        		 "								<div class='soundHeader'> " + 
        		 "									<a class='bulPlay data-sound-url' href='#none' data-sound-url=''><i class='fa fa-play-circle fa-2x'></i></a> " + 
        		 "									<span class='songTitle'><a href='#none'>" + data['arrangeTitle'] + "</a></span> " + 
        		 "									<span class='songSinger'><a href='#none'>" + data['memberNickName'] + "</a></span> " + 
        		 "									<a class='btn small btnPoint ctgView'><span>" + data['genreName'] + "</span></a> " + 
        		 "								</div> " + 
        		 "								<div class='soundBody'> " + 
        		 "                                    <div class='pajaImg'><img src='/music/resources/images/holderType2.gif' alt='' style='width: 100%;'></div> " + 
        		 "                                    <div class='soundBar'></div> " + 
        		 "								</div> " + 
        		 "                               <div class='soundFooter'> " + 
                 "									<a class='btn large btnType1' href='javascript:beforeCallFanAjax(" + data['vocalMemberNo'] + ", " + data['vocalNo'] + ")'><span>Fan</span></a> " +        		 
        		 "                                    <a class='btn large btnType2' href='#none' data-showing='0'><span>Comment</span></a> " + 
        		 "                                    <a class='btn large btnType3' href='#none'><span>연주자 현황</span></a> " + 
        		 "                                    <a class='btn large btnPoint btnType4' href='#none'><span>참여하기</span></a> " + 
        		 "                                    <a class='btn large btnType5' href='javascript:playListInsert(\"03\", " + data['vocalNo'] + ", ${memberNo})'><span>Play list</span></a> " +
													  sponsorBtn + 
        		 "                                    <a class='btn large btnPoint btnType7' href='javascript:layer_open_common(\"buyPop\")'><span>구매</span></a> " +            		 
                 "									  <a class='btn large btnType6' href='javascript:layer_open_common(\"mapView\")'><span>맵보기</span></a> " +        		 
        		 "                                    <a class='btn large btnType8' href='#none'><span>악보</span></a> " + 
        		 "                                    <a class='btn large btnType10' href='#none'><span>편곡 보컬 참여</span></a> " + 
        		 "                                    <a class='btn large btnType11' data-url='/music/vocal/vocalDetail?vocalNo=" + data['vocalNo'] + "' data-title='" + data['arrangeTitle'] + "' data-genre='" + data['genreName'] + "' data-singer='" + data['memberNickName'] + "' data-image='/music/resources/images/vocal_sample.jpg' class='albumImg' href='#none'><span><i class='fa fa-share-square-o'></i> Share</span></a> " + 
        		 "                                    <ul class='soundFooterRight'> " + 
                 "               							<li> " +
                 "                    						<i class='fa fa-heart fa-heart" + data['vocalNo'] + "'></i> " +
                 "                    						<strong id='fanCnt"+data['vocalNo']+"'>" + data['fanCount'] + "</strong> " +
                 "              							 </li> " +
        		 "                                        <li> " + 
        		 "                                            <i class='fa fa-list-ul'></i> " + 
        		 "                                            <strong>100</strong>  " + 
        		 "                                        </li> " + 
        		 "                                        <li> " + 
        		 "                                            <i class='fa fa-dollar'></i> " + 
        		 "                                            <strong class='fa-dollar" + data['vocalNo'] + "'>" + data['sponsorAmount'] + "</strong> " + 
        		 "                                        </li> " + 
        		 "                                    </ul> " + 
        		 "                                </div> " + 
        		 "								<div class='commentWrap' style='display: none;'> " + 
        		 "	                                <span class='commetText'>comment</span> " + 
                 "		 							<input type='text' class='cmtMemo' style='width: 700px;' placeholder='글을 입력 하세요' onkeypress='javascript:cmt_write_common(" + data['vocalNo'] + ",this.value)'>" + 
        		 "								</div> " + 
        		 "							</div> " + 
        		 "						</li> " 
         );
         
         
 		if(data['fanHeartCount']>0){ //이미 팬이면 마크업
			$(".arrList li:last-child .fa-heart").addClass("pointColorRed");
		}         

         $(".arrList li:last-child .btnType3, .arrList li:last-child .btnType4, .arrList li:last-child .btnType8, .arrList li:last-child .btnType10, .arrList li:last-child .btnType12").remove();
	    
	};	
	
	

	






	/*이벤트 객체 생성*/
	var e = new AutoAddLine_event.Event.InfiniteScroll();
	
	var AutoAddLine = new AutoAddLine();
		
	AutoAddLine.listType = "${listType}";
	AutoAddLine.page = "${page}";	
	AutoAddLine.orderby = "${orderBy}";
	AutoAddLine.genreNo = "${genreNo}";
	AutoAddLine.pageon = "";
	AutoAddLine.searchWord = "";
	AutoAddLine.isSearch = "";
	AutoAddLine.memberNo = ${memberNo};	
	
	//변수초기화    
	AutoAddLine.load_cnt = 1;
	AutoAddLine.scroll_able = true;
	AutoAddLine.scrollOK = true;
	AutoAddLine.scrollLock = false;
	
	$(document).ready(function() {
		AutoAddLine.callScroll();
	});
	
	
	FB.login(function(){
		 FB.api('/me/feed', 'post', {message: 'Hello, world!'});
		}, {scope: 'publish_actions'});	
	
</script>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>	


			<div class="contents">
				<div class="titleWrap">
					<h2 class="testBtn floatL">${listTypeString}</h2>
					<div class="btnComposition"><a class="large layerPopType3"><span>작곡등록</span></a></div>
					<div class="arrayWrap">
						<div class="listSearch"><input type="text" id="searchWord" onkeypress="javascript:search()"><i class="fa fa-search searchIcon"></i></div>
						<dl class="arrayArea">
							<dt>[정렬]</dt>
							<dd><a href="javascript:sortGo(1)">팬 수</a><span class="bar"></span></dd>
							<dd><a href="javascript:sortGo(2)">최신순</a><span class="bar"></span></dd>
							<dd><a href="javascript:sortGo(3)">판매순</a></dd>
						</dl>
					</div>
				</div>
				<div class="listWrap">
					<ul class="arrList"></ul>
				</div>
			</div>

			
       <input type="hidden" id="musicClassNo"  name="musicClassNo" 	value="01" />
       <input type="hidden" id="musicMemberNo" name="musicMemberNo" value="" />       		
	   <input type="hidden" id="fanMemberNo" 	name="fanMemberNo" value="" />
       <input type="hidden" id="musicNo" 		name="musicNo"  value="" />	   





			<form id ="arrange-payment-form" name ="arrange-payment-form" method ="post" >
			<!-- layer popup : 편곡방 개설 -->
            <div class="layer">
            	<div class="bg"></div>
               	<div id="vocalSearch2" class="pop-layer">
               		<div class="layerPopupWrap">
               			<h3>편곡방 개설</h3>
               			<div class="popCont">
               				<h4 class="tit01">구매정보</h4>
               				<table class="tblType01 mb30">
		                        <colgroup>
		                            <col style="width:25%">
		                            <col style="width:auto">
		                        </colgroup>
		                        <caption></caption>
		                        <tbody>
			                        <tr>
			                            <th>작곡자</th>
			                            <td>홍길동</td>
			                        </tr>
			                        <tr>
			                            <th>곡제목</th>
			                            <td>young blood</td>
			                        </tr>
			                        <tr>
			                            <th>곡 공개 여부</th>
			                            <td>공개</td>
			                        </tr>
			                        <tr>
			                            <th>작곡가 수익률</th>
			                            <td>50%</td>
			                        </tr>
			                    </tbody>
			                </table>
               				<h4 class="tit01">결제정보</h4>
                       		<div class="contBox01">
		                    	<ul>
			                		<li>결제대상 : 작곡방 구매</li>
			                		<li>결제금액 : <strong class="pointColor">1$</strong></li>
			                	</ul>
		                    </div>
		                    <div class="contBox02">
		                    	<ul>
			                		<li>
			                			<span class="cardTitle">카드구분</span>
				                		<select class="dropdown" name="">
				                            <option>카드1</option>
				                            <option>카드2</option>
		                                    <option>카드2</option>
				                        </select>
			                		</li>
			                		<li>
			                			<span class="cardTitle">카드번호</span>
			                			<input type="text" style="width: 50px;">
			                			<input type="text" style="width: 50px;">
			                			<input type="text" style="width: 50px;">
			                			<input type="text" style="width: 50px;">
			                		<li>
			                			<span class="cardTitle">CVS</span>
			                			<input type="text">
			                		</li>
			                	</ul>
		                    </div>

		                    <input type="hidden" name="arrangeTitle" value="arrangeTitle" />
		                    <input type="hidden" name="openStatus" value="N" />
		                    <input type="hidden" name="arrangeMemo" value="arrangeMemo" />
                            <input type="hidden" name="chargeStatus" value="N" />
		                    <input type="hidden" name="arrangeStatus" value="01" />
		                    <input type="hidden" name="saleStatus"    value="01" />
		                    <input type="hidden" name="limitStatus"    value="N" />

	                        <div class="textC mt20">
	                        	<a class="btn large btnPoint" href="#none" id="arrange-payment-submit"><span>결제하기</span></a>
	                        	<a class="btn large btnClose" href="#none"><span>취소</span></a>
	                        </div>
                       	</div>
               		</div> 
               	</div>
            </div>
            </form>
            <!-- //layer popup : 편곡방 개설 -->


            
			<!-- layer popup : 작곡방 개설 -->
			<form id ="compose-payment-form" name ="compose-payment-form" method ="post" >
            <div class="layer">
            	<div class="bg"></div>
               	<div id="vocalSearch" class="pop-layer">
               		<div class="layerPopupWrap">
               			<h3>작곡방 개설</h3>
               			<div class="popCont">
               				<h4 class="tit01">작곡방 구매</h4>
                       		<div class="contBox01">
		                    	<ul>
			                		<li>작곡제목 : <input type="text" name="composeTitle"></li>
			                		<li>결제금액 : <strong class="pointColor">1$</strong></li>
			                	</ul>
		                    </div>
		                    <div class="contBox02">
		                    	<ul>
			                		<li>
			                			<span class="cardTitle">카드구분</span>
				                		<select class="dropdown" name="">
				                            <option>카드1</option>
				                            <option>카드2</option>
		                                    <option>카드2</option>
				                        </select>
			                		</li>
			                		<li>
			                			<span class="cardTitle">카드번호</span>
			                			<input type="text" style="width: 50px;">
			                			<input type="text" style="width: 50px;">
			                			<input type="text" style="width: 50px;">
			                			<input type="text" style="width: 50px;">
			                		<li>
			                			<span class="cardTitle">CVS</span>
			                			<input type="text">
			                		</li>
			                	</ul>
		                    </div>
		                    
		                    <input type="hidden" name="openStatus" value="N" />
		                    <input type="hidden" name="composeMemo" value="buying composition" />
		                    <input type="hidden" name="chargeStatus" value="N" />
		                    <input type="hidden" name="composeStatus" value="01" />
		                    <input type="hidden" name="saleStatus"    value="01" />
		                    
	                        <div class="textC mt20">
	                        	<a class="btn large btnPoint" href="#none"  id="compose-payment-submit"><span>결제하기</span></a>
	                        	<a class="btn large btnClose" href="#none"><span>닫기</span></a>
	                        </div>
                       	</div>
               		</div> 
               	</div>
            </div>
            </form>
            <!-- //layer popup : 작곡방 개설 -->



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
//		alert(url);
		
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
//			alert(url);
			
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


	





	//순별로 가져오기.
	function sortGo(orderBy){

		AutoAddLine.orderby = orderBy;		
		AutoAddLine.page = 1;
		
		AutoAddLine.addRowTypeEmpty(); // 리스트 비우기.
		AutoAddLine.callScroll();
		
	}
	
	
    //작곡등록 버튼 클릭시 결제후 작곡등록 페이지로 이동 (김기수)
    $(document).on("click", ".btnComposition", function () {
    	layer_open("vocalSearch");
    });	
	

	
	$(document).ready(function(target) {
	    //폼 등록 버튼 클릭시 호출
	    $('#arrange-payment-submit').click(function(event){
	    	event.preventDefault();
	    	$('#arrange-payment-form').attr('action','/music/arrange/initArrange?composeNo='+composeNo).submit()
	    });	    
	    
	    //폼 등록 버튼 클릭시 호출
	    $('#compose-payment-submit').click(function(event){
	    	event.preventDefault();
	    	$('#compose-payment-form').attr('action','/music/compose/initCompose').submit();
	    });	   
	});
	
    function getComposeNo(composeNoTemp, arrangeMemberNo) {
    	
    	if(AutoAddLine.memberNo != arrangeMemberNo){
    		alert('해당 작곡에 대하여 편곡자로 지정되신분만 구매가능합니다.');
    		return;
    	}else if(AutoAddLine.memberNo == arrangeMemberNo){
    		composeNo = composeNoTemp;    		
    	}
    	
    }
    
</script>


<%@ include file="../include/listCommonLayer.jsp" %>
<%@ include file="../include/bottom.jsp" %>


<script type="text/javascript" src="../resources/common/js/scroll.js"></script>

<script type="text/javascript">	
	AutoAddLine.callScroll = function(){};
	AutoAddLine.prototype.callScroll = function(){
		
		//보내줄 URL
		var param = "?page=" + AutoAddLine.page + "&listType=" + AutoAddLine.listType + 
					"&genreNo=" + AutoAddLine.genreNo + "&orderBy=" + AutoAddLine.orderby + 
					"&searchWord=" + AutoAddLine.searchWord + "&isSearch=" + AutoAddLine.isSearch;			
		AutoAddLine.url = "/music/compose/composeRemoteList" + param;
		
		//document.writeln(AutoAddLine.url);
		//alert(AutoAddLine.url);
		
		new $$loop_progress_init();
		new $$open_loop_progress();	
		e.beginScroll();
		AutoAddLine.page++;
	}
	
	
	
	//편곡 라인 추가 함수
	AutoAddLine.addRow = function(){};	
	AutoAddLine.prototype.addRow = function(data){
		
	    $(".arrList").append(
	            
				"<li class='secType1 oh'>" + 
				"<div class='coverArt'>" +
					"<a href='/music/compose/composeDetail?composeNo=" + data['composeNo'] + "&listType=" + AutoAddLine.listType + "'><img src='/music/resources/images/holderType3.gif' alt='' style='width: 110px; height: 110px;'></a>" +							
				"</div>" +
				"<div class='soundArea'>" +
					"<div class='soundHeader'>" +
						"<a class='bulPlay' href='javascript:audioPop(" + data['composeNo'] + ")'><i class='fa fa-2x fa-play-circle'></i></a> " +
						"<span class='songTitle'><a href='#none'>" + data['composeTitle'] + "</a></span>" +
						"<span class='songSinger'><a href='#none'>" + data['composeMemberNickName'] + "</a></span>" +
					"</div>" +
					
					"<div class='soundBody'>" +
	                 "<div class='pajaImg'><img src='/music/resources/images/arrage/holderType2.gif' alt='' style='width: 100%;'></div>" +
	                 "<div class='soundBar'></div>" +
					"</div>" +
	
	             "<div class='soundFooter'>" +
	                 "<a class='btn large btnType1' href='javascript:beforeCallFanAjax(" + data['composeMemberNo'] + ", " + data['composeNo'] + ")'><span>Fan</span></a> " +	                 	                
	                 "<a class='btn large btnType2' href='#none' data-showing='0'><span>Comment</span></a> " +
	                 "<a class='btn large btnType3' href='#none'><span>연주자 현황</span></a> " +
	                 "<a class='btn large btnPoint btnType4' href='#none'><span>참여하기</span></a> " +
	                 "<a class='btn large btnType5' href='#none'><span>Play list</span></a> " +
	                 "<a class='btn large btnType6' href='javascript:layer_open_common(\"mapView\")'><span>맵보기</span></a> " +
	                 "<a class='btn large btnPoint3 btnType7' id='buyCompose' data-member='" + data['arrangeMemberNo'] + "' href='javascript:getComposeNo(" + data['composeNo'] + "," + data['arrangeMemberNo'] + ")'><span>구매</span></a> " +
	                 "<a class='btn large btnPoint btnType12' href='#none'><span>작사등록</span></a> " +                             
	                 "<a class='btn large btnType8' href='javascript:layer_open_common(\"sheetMusic\")'><span>악보</span></a> " +                                                          
	                 "<a class='btn large btnType9' href='#none'><span>SponsorsShip</span></a> " +
	                 "<a class='btn large btnType10' href='#none'><span>편곡 보컬 참여</span></a> " +
	                 "<a class='btn large btnType11' href='#none'><span><i class='fa fa-share-square-o'></i> Share</span></a> " +                             
	                 "<ul class='soundFooterRight'>" +
	                 "          <ul class='soundFooterRight'> " +
	                 "               <li> " +
	                 "                    <i class='fa fa-heart fa-heart"+data['composeNo']+"'></i> " +
	                 "                    <strong id='fanCnt"+data['composeNo']+"'>" + data['fanCount'] + "</strong> " +
	                 "               </li> " +
	                 "               <li> " +
	                 "                    <i class='fa fa-download'></i> " +
	                 "                    <strong>" + data['downloadCount'] + "</strong> " +
	                 "               </li> " +
	                 "               <li> " +
	                 "                    <i class='fa fa-dollar'></i> " +
	                 "                    <strong>100,000</strong> " +
	                 "               </li> " +
	                 "               <li> " +
	                 "                    <a href='#none'><span class='deletIcon'><i class='fa fa-trash'></i></span></a> " +
	                 "               </li> " +
	                 "          </ul> " +
	                 "</ul>" +
	             "</div>" +
	             "<div class='commentWrap' style='display: none;'>" +
	             "	<span class='commetText'>comment</span> " +
	             "	<input type='text' class='cmtMemo' style='width: 700px;' placeholder='글을 입력 하세요' onkeypress='javascript:cmt_write_common(" + data['composeNo'] + ",this.value)'>" +
	             "</div>" +
				"</div>" +
			"</li>"    
				
	 	);
	    
		if(data['fanHeartCount']>0){ //이미 팬이면 마크업
			$(".arrList li:last-child .fa-heart").addClass("pointColorRed");
		}	    
	
		 //버튼 숨기기
		 $(".arrList li:last-child .btnType3, .arrList li:last-child .btnType4, .arrList li:last-child .btnType5, .arrList li:last-child .btnType9, .arrList li:last-child .btnType10, .arrList li:last-child .btnType11, .arrList li:last-child .btnType12").remove();
		 $(".soundFooterRight:last li:gt(1)").remove();
	 
		if(AutoAddLine.memberNo == data['arrangeMemberNo'] && AutoAddLine.memberNo != ''){ //구매버튼 권한체크             
			$(".arrList li:last-child .btnType7").attr("class", "btn large btnPoint btnType7");
		}
	    
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
	AutoAddLine.callScroll();
</script>


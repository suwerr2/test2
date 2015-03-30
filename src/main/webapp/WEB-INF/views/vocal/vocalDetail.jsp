<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>


        <!-- contents -->
        <input type="hidden" id="musicClassNo"  name="musicClassNo" 	value="03" />
        <input type="hidden" id="musicNo" 		name="musicNo"      	value=${vocalCommand.vocalNo} />
        <input type="hidden" id="fanMemberNo" 	name="fanMemberNo"      value=${vocalCommand.vocalMemberNo} />
        <input type="hidden" id="musicMemberNo" name="musicMemberNo"    value=${vocalCommand.vocalMemberNo} />
        <input type="hidden" id="fanHeartCount" name="fanHeartCount"      value=${vocalCommand.fanHeartCount} />


        <!-- contents -->
        <div class="mrContainer">
            <div class="contents">
                <div class="titleWrap">
                    <h2>보컬 상세</h2>
                </div>
                <div class="detailTop">
                	<div class="visual"><img src="../resources/images/vocal_sample.jpg" alt="" style="width: 150px; height: 150px;"></div>
                	<div class="soundArea">
                		<div class="soundHeader">
							<a class="bulPlay" href="#none"><i class="fa fa-play-circle fa-2x"></i></a>
							<span class="songTitle">${vocalCommand.arrangeTitle}</span>
							<span class="songSinger"><a href="#none">by ${vocalCommand.memberNickName}</a></span>
							<span class="songSinger">2014-10-10</span>
							<a class="btn small btnPoint ctgView" href="#none"><span>${vocalCommand.genreName}</span></a>
						</div>

						<div class="soundBody">
	                        <div class="pajaImg"><img src="../resources/images/holderType2.gif" alt="" style="width: 100%;"></div>
	                        <!-- <div class="soundBar"></div> -->
						</div>

                		<div class="textL mt10">
		                    <a id="addFan" class="btn large" href="#none"><span>Fan</span></a>
		                    <a class="btn large" href="javascript:layer_open_common('playList')"><span>PlayList</span></a>
		                    <a class="btn large" href="javascript:layer_open_common('mapView')"><span>Map</span></a>
		                    <a class="btn large" data-member="${vocalCommand.vocalMemberNo}" data-member-login="${memberNo}" data-vocal-num="${vocalCommand.vocalNo}" href="javascript:layer_open_common('sponsorPop2')" data-member="${vocalCommand.vocalMemberNo}" id="sponsorBtn2"><span>Sponsor</span></a>		                    
		                    <a class="btn large btnPoint" href="javascript:layer_open_common('buyPop')"><span>구매</span></a>
		                    <a class="btn large btnType7" href="javascript:layer_open_common('sharePop')"><span><i class="fa fa-share-square-o"></i> Share</span></a>
		                    <span class="floatR">
                               	<i id="fanHeart" <c:if test="${vocalCommand.fanHeartCount == 0}"> class="fa fa-heart" </c:if>
                               	<c:if test="${vocalCommand.fanHeartCount > 0}"> class="fa fa-heart pointColorRed" </c:if>></i>
                                <span><strong id="fanCount">${vocalCommand.fanCount}</strong></span>
                                <span class="bar"></span>
                                <i class="fa fa-download"></i>
                                <span><strong>100</strong></span>
                                <span class="bar"></span>
                                <i class="fa fa-dollar"></i>
                                <span><strong class="strong-fa-dollar">${vocalCommand.sponsorAmount}</strong></span>
                            </span>
		                </div>
                	</div>
                </div>
                <div class="hType1 pt0">
                    <h3>보컬 메모</h3>
                </div>  
                <textarea cols="50" rows="5" placeholder="보컬 메모 내용 삽입" style="width: 908px">${vocalCommand.vocalMemo}</textarea>
				
				<div class="hType1">
                    <h3 class="floatL">가사</h3>
					<div class="floatR"><a href="#none" class="addLineType1 btn topayc"><span>가사보기</span></a></div>
                </div>  

                
                <table class="tblType02 textL addTrType2">
                    <colgroup>
                        <col style="width: 10%">
                        <col style="width: auto">
                    </colgroup>                    
                    <tbody>
                    
	<c:if test="${fn:length(songList)==0}">
	                    <tr>
	                        <td colspan="2" class="textC">
	                        	<div class="mb10"> <strong>등록된 가사가 없습니다.</strong></div>
	                        </td>
	                    </tr>
	</c:if>                    

    <c:forEach items="${songList}" var="songList">                    
	                    <tr>
	                    	<td colspan="2"><span class="bulList">제목 :</span> <strong>${songList.writeTitle}</strong></td>
	                    </tr>
	                    <tr>
	                        <td><img src="${songList.getRealArrangeImage()}" alt="" style="width: 50px; height: 50px;"></td>
	                        <td class="textL">
	                        	<div class="mb10"><a href="#">${songList.memberUserid}</a></div>
	                        	<p><i class="fa fa-heart"></i> <strong>${songList.fanCount}</strong></p>
	                        </td>
	                    </tr>
    </c:forEach>	                	                    
	                </tbody>
                </table>    
    				
		        <input type="hidden" id="musicClassNo"  name="musicClassNo" 	value="03" />
		        <input type="hidden" id="musicNo" 		name="musicNo"      	value=${vocalCommand.vocalNo} />				

				<div class="hType1">
                    <h3>Comment</h3>
                </div>
                
                <%@ include file="../include/comment.jsp" %>
                         
            </div>
            <!-- //contents -->
            
            
            
				<!-- layer popup : 스폰서 -->
				<form id ="sponsor-form2" method ="POST" action="/music/vocal/initSponsor">				
                <div class="layer">
                    <div class="bg"></div>
	                <div id="sponsorPop2" class="pop-layer">
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
		                        	<a class="btn large btnPoint btnClose" href="#none" id="sponsor-submit2"><span>확인</span></a>
		                        </div>
	                        </div>
	                	</div> 
	                </div>
	            </div>
	            
	            <input type="hidden" id="memberId2" name="memberId" value="">
	            <input type="hidden" id="vocalNum2" name="vocalNum" value="">	            
	            <input type="hidden" id="memberSponsorId2" name="memberSponsorId" value="">	            
	            
	            </form>
	            <!-- //layer popup : 스폰서 -->                
            
            
            
<script type="text/javascript">


	 $("#addFan").on("click", function () {
	 	addFanAjax(false);
	 });

	
	$(document).ready(function(target) {
	    //폼 등록 버튼 클릭시 호출
	    $('#sponsor-submit2').click(function(event){
	    	event.preventDefault();

			$.ajax({
				url:'/music/vocal/initSponsor',
				data:$('#sponsor-form2').serialize(),
				dataType:'json',
				success:function(data){
					var className = ".strong-fa-dollar";
					$(className).text(data['sponsorAmount']);
				},
				error:function(data){
//					alert('관리자에게 문의하세요');
				}
			})

	    });
	    
	});	
	
	
	
    //음원리스트에서 스폰서 클릭시
    $(document).on("click", "#sponsorBtn2", function () {
        var memberNo = $(this).attr('data-member');
        var vocal_num = $(this).attr('data-vocal-num');        
        var memberLoinId = $(this).attr('data-member-login');
        $("#memberId2").val(memberNo);
        $("#vocalNum2").val(vocal_num);        
        $("#memberSponsorId2").val(memberLoinId);
    });
    
    
    
    
    /* 팬등록처리 */
	function addFanAjax(init){
		
		//로그인사용자가 동일뮤지션일 경우 팬이 될수 없음.
		var musicMemberNo = $("#musicMemberNo").val();
		
		var fanHeartCount = $("#fanHeartCount").val();
		
		if (musicMemberNo == '${memberNo}'){
			alert("로그인사용자의 팬이 될수 없습니다.");
			return;
		}
		
		
		if ( fanHeartCount > 0 ){
			if (confirm("해당곡 팬이 삭제됩니다.\n 삭제하겠습니까?") == true){
				// 팬 삭제처리
				
				var url = "/music/common/subFan?fanMemberNo=" + $("#fanMemberNo").val() + 
				"&musicMemberNo="+$("#musicMemberNo").val() + "&musicClass=" + 
				$("#musicClassNo").val() + "&musicNo=" + 
				$("#musicNo").val();				
//				alert(url);				
				
				$.ajax({     
					contentType : "application/x-www-form-urlencoded;charset=UTF-8",
					type : "GET",
					url : url,
					success : function(data){
						$.each(data, function(key, state){
							if(key=="fanCommand"){
								$('#fanCount').text(state['fanCount']);
								$('#fanHeart').removeClass("pointColorRed");	//본인 체크후
								$("#fanHeartCount").val(0);
							}					
						});
						//alert('등록된 팬이 삭제되었습니다.');
					},
					error : function(xhr, status, error){
			      		alert('로그인 후 진행하기 바랍니다');
					}
				});	
				
				
				return;
			}else{
				return;	
			};
			
		}
		

		
		var url = "/music/common/addFan?fanMemberNo=" + $("#fanMemberNo").val() + 
				"&musicMemberNo="+$("#musicMemberNo").val() + "&musicClass=" + 
				$("#musicClassNo").val() + "&musicNo=" + 
				$("#musicNo").val();			
//				alert(url);		
		
		$.ajax({     
			
			contentType : "application/x-www-form-urlencoded;charset=UTF-8",
			type : "GET",
			url : url,
			success : function(data){
				$.each(data, function(key, state){
					if(key=="fanCommand"){
						$('#fanCount').text(state['fanCount']);
						$('#fanHeart').addClass("pointColorRed");	//본인 체크후
						$("#fanHeartCount").val(1);
					}
				});
				alert('팬으로 등록되었습니다.');
			},
			error : function(xhr, status, error){
	      		alert('로그인 후 진행하기 바랍니다.');
			}
		});	
		
	}// end addFanAjax    
    
	
</script>            
            
      
<%@ include file="../include/listCommonLayer.jsp" %>          
<%@ include file="../include/bottom.jsp" %>

      
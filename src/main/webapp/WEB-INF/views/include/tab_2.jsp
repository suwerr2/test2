<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

                <!--tab-->
                <div class="tabWrapType1">
                    <ul class="tabBtnSet1 tabCommon">
                        <li><a href="#none"><span>기본정보</span></a></li>
                        <li><a href="#none"><span>음원 및 파일</span></a></li>
                        <li><a href="#none"><span>현황</span></a></li>
                        <li><a href="#none"><span>Comment</span></a></li>
                    </ul>
                    <!-- tabBox1 -->
                    <div class="tabCont">
	                	<table class="tblType01 addTrType2">
                            <colgroup>
                                <col style="width: 20%">
                                <col style="width: 30%">
                                <col style="width: 20%">
                                <col style="width: 30%">
                            </colgroup>
                            <tr>
                            	<th>제목</th>
                                <td colspan="3">${arrangeDetail.arrangeTitle}</td>
                            </tr>
                            <tr>
                                <th>편곡자</th>
                                <td>${arrangeDetail.arrangeMemberNickName}</td>
                                <th class="line">작곡자</th>
                                <td>${arrangeDetail.composeMemberNickName}</td>
                            </tr>
                            <tr>
                                <th>장르</th>
                                <td>${arrangeDetail.genreName}</td>
                                <th class="line">구성원</th>
                                <td>${arrangeDetail.performCount + arrangeDetail.vocalCount +arrangeDetail.lyricsCount}</td>
                            </tr>
                            <tr>
                                <th>작사수</th>
                                <td>${arrangeDetail.lyricsCount}</td>
                                <th class="line">보컬수</th>
                                <td>${arrangeDetail.vocalCount}</td>
                            </tr>
                        </table>
                        <div class="hType1">
		                    <h3>필요 연주 파트</h3>
		                </div>
                        <div class="needPart">
							<c:forEach var="performanceDetail" items="${performanceDetail}">
								<c:choose>
									<c:when test = "${performanceDetail.playFieldName == 'Guitar'}">
						    			<span class="label label-blue">기타</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Keyboards'}">
						    			<span class="label label-sky">키보드</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Drums'}">
						    			<span class="label label-green">드럼</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Percussion'}">
						    			<span class="label label-sky">Percussion</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Brass'}">
						    			<span class="label label-sky">Brass</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Woodwind'}">
						    			<span class="label label-sky">Woodwind</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Strings'}">
						    			<span class="label label-sky">Strings</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Saxophone'}">
						    			<span class="label label-red">색소폰</span>
						    		</c:when>
									<c:when test = "${performanceDetail.playFieldName == 'Harmonica'}">
						    			<span class="label label-orange">하모니카<span>
						    		</c:when>
						    		<c:otherwise>
						    			<span class="label label-orange">${performanceDetail.playFieldName}</span>
						    		</c:otherwise>
						    	</c:choose>
							</c:forEach>
                        </div>
                        <div class="hType1">
		                    <h3>편곡자 메모</h3>
		                </div>  
		                <div class="memoArea">${arrangeDetail.arrangeMemo}</div>
		                <div class="hType1">
		                    <h3>작곡자 메모</h3>
		                </div>  
		                <div class="memoArea">${arrangeDetail.composeMemo}</div>
	                </div>
	                <!-- //tabBox1 -->
                    <!-- tabBox2 -->
                    <div class="tabCont">
                    	<div class="hType1 pt0">
		                    <h3>연관 파일</h3>
		                </div>
		                <div class="needPart">
						    <span class="label label-score">작곡 악보</span>
						    <span class="label label-source">작곡 음원</span>
                        </div>
                        <div class="hType1">
		                    <h3>믹싱 파일</h3>
		                </div>
		                <div class="listWrap">
							<ul class="arrList">
								<li class="secType1 oh pt0">
									<div class="coverArt">
										<a href="#none"><img src="../resources/images/arrage/holderType3.gif" alt="" style="width: 110px; height: 110px;"></a>
									</div>
									<div class="soundArea">
										<div class="soundHeader">
											<a class="bulPlay" href="#none"><i class="fa fa-play-circle fa-2x"></i></a>
											<span class="songTitle">Guitar</span>
											<span class="songSinger"><a href="#none">ahn young chul</a></span>
										</div>
										<!-- 개발에서 확인요망 -->
										<div class="soundBody">
		                                    <div class="pajaImg"><img src="../resources/images/arrage/holderType2.gif" alt="" style="width: 100%;"></div>
		                                    <div class="soundBar"></div>
										</div>
									</div>
								</li>
								<li class="secType1 oh">
									<div class="coverArt">
										<a href="#none"><img src="../resources/images/arrage/holderType3.gif" alt="" style="width: 110px; height: 110px;"></a>
									</div>
									<div class="soundArea">
										<div class="soundHeader">
											<a class="bulPlay" href="#none"><i class="fa fa-play-circle fa-2x"></i></a>
											<span class="songTitle">Guitar</span>
											<span class="songSinger"><a href="#none">ahn young chul</a></span>
										</div>
										<!-- 개발에서 확인요망 -->
										<div class="soundBody">
		                                    <div class="pajaImg"><img src="../resources/images/arrage/holderType2.gif" alt="" style="width: 100%;"></div>
		                                    <div class="soundBar"></div>
										</div>
										<!-- //개발에서 확인요망 -->
										<div class="soundFooter">
											<div class="playerMemo">${arrangeDetail.arrangeMemo}</div>
										</div>
									</div>
								</li>
							</ul>
						</div>
		            </div>
                    <!-- tabBox2 -->
                    <!-- tabBox3 -->
                    <div class="tabCont">
	                    <table class="tblType03 addTrType2">
						    <c:if test = "${performanceDetailLength > 0 }">
						    	<colgroup>
                                	<col style="width: 10%">
                                	<col style="width: 10%">
                                	<col style="width: 10%">
                                	<col style="width: 15%">
                                	<col style="width: auto">
                                	<col style="width: 10%">
                            	</colgroup>
                                    <tr>
                                    	<th>연주파트</th>
                                        <th>연주자</th>
                                        <th>배분율</th>
                                        <th>상태</th>
                                        <th>상세정보</th>
                                        <th>참여가능여부</th>
                                    </tr>
						    	<c:forEach items = "${performanceDetail}" var = "performanceDetail" begin = "0" end = "${performanceDetailLength-1}" varStatus ="status">
                                    <tr>
                                    	<td><span class="label label-blue">${performanceDetail.playFieldName}</span></td>
                                    	<td></td>
                                    	<td>${performanceDetail.performRate}</td>
                                    	<td>${performanceDetail.performStatusName}</td>
                                    	<td class="textL">현재 파트는 참여 요청이 가능합니다.</td>
                                    	<td><span class="label label-joinOK">참여하기</span></td>
                                    	
                                    	
                                    	<!-- <td class="textL">편곡자에게 참여를 요청했고, 편곡자의 선택을 기다리고 있습니다.</td>
                                    	<td><span class="label label-joinDone">참여완료</span></td>

                                    	<td class="textL">편곡자가 당신은 연주자로 선택했습니다. 요청 수락을 누르면 확정되며, 연주탈퇴를 누르면 해당 참여가 취소됩니다.</td>
                                    	<td><span class="label label-joinCancel">참여취소</span></td>
                                    	
                                    	
                                    	<td class="textL">연주자가 확정되었습니다. 연주곡을 등록할 수 있습니다.</td>
                                    	<td><span class="label label-joinAsk">요청수락</span></td>
                                    	
                                    	
                                    	<td class="textL">현재 파트는 참여 요청이 가능합니다.</td>
                                    	<td><span class="label label-joinOut">연주탈퇴</span></td> -->
                                    </tr>
                               </c:forEach>
                            </c:if>
						    <c:if test = "${performanceDetailLength == 0 }">
								<tr>
                                    <td>등록된 연주파트가 없습니다.</td>
                                </tr>
                            </c:if>
                        </table>
	                </div>
	                <!-- //tabBox3 -->
                    <!-- tabBox4 -->

						<%@ include file="../include/comment.jsp" %>

                    <!-- tabBox4 -->
                </div>
                <!-- //tab -->     
                
<script type = "text/javascript">
	// 진행중인 편곡상세 참여가능여부 
    $(document).on("click", ".label-joinOK", function () {
    	$(this).parent().parent().find('td').eq(4).empty().append(
            "편곡자에게 참여를 요청했고, 편곡자의 선택을 기다리고 있습니다."
        ); 
    	$(this).parent().empty().append(
            "<span class='label label-joinDone'>참여완료</span>"
        );
    });
</script>
    	
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>

<% String listType = request.getParameter("listType");%>

<c:set var="listType" value="<%=listType%>"/>
<fmt:parseNumber  var = "performanceDetailLength" value = "${fn:length(performanceDetail)}"/>
<input type="hidden" id="musicClassNo"  name="musicClassNo" 	value="${musicClassNo}" />
<input type="hidden" id="musicNo" 		name="musicNo"      	value=${arrangeDetail.arrangeNo} />

            <div class="contents">
                <div class="titleWrap">
                    <h2>${listTypeString}</h2>
                </div>
                <div class="detailTop">
                	<div class="visual"><img src="${arrangeDetail.getRealArrangeImage()}" alt="" style="width: 150px; height: 150px;"></div>
                	<div class="soundArea">
                		<div class="soundHeader">
							<a class="bulPlay" href="#none" data-sound-title="${arrangeDetail.arrangeTitle}" data-sound-url="http://www.jplayer.org/audio/m4a/Miaow-07-Bubble.m4a;http://www.jplayer.org/audio/ogg/Miaow-07-Bubble.ogg"><i class="fa fa-play-circle fa-2x"></i></a>
							<span class="songTitle">${arrangeDetail.arrangeMemo}</span>
							<span class="songSinger"><a href="#none">${arrangeDetail.composeMemberName}</a></span>
							<a class="btn small btnPoint ctgView" href="#none"><span>${arrangeDetail.genreName}</span></a>
						</div>
                		<!-- 개발에서 확인요망 -->
						<div class="soundBody">
	                        <div class="pajaImg"><img src="../resources/images/arrage/holderType2.gif" alt="" style="width: 100%;"></div>
	                        <div class="soundBar"></div>
						</div>
						<!-- //개발에서 확인요망 -->
                		<div class="textR mt20">
		                    <a class="btn large" href="#none"><span>Fan</span></a>
		                    <a class="btn large layerPopTypeMap" href="#none"><span>Map</span></a>
		                </div>
                	</div>
                </div>

<c:if test = "${ listType eq '1'}" >                                
<%@ include file="../include/tab_1.jsp" %>  <!--  작곡 상세  -->
</c:if>                

<c:if test = "${ listType eq '2'}" >                                
<%@ include file="../include/tab_2.jsp" %>  <!--  편곡 상세  -->
</c:if>                

<c:if test = "${ listType eq '3'}" >                                
<%@ include file="../include/tab_3.jsp" %>  <!--  완료 상세  -->
</c:if>                

  				<!-- layer popup : 맵보기 -->
                <div class="layer">
                    <div class="bg"></div>
                    <div id="viewMap" class="pop-layer">
                        <div class="layerPopupWrap">
                            <h3>맵보기[${arrangeDetail.arrangeTitle}] </h3>
                            <div class="popCont">
                                <div class="contBox01">
			                    	<ul>
			                    		<li>편곡수 : <strong>3</strong></li>
			                    		<li>보컬수 : <strong>6</strong></li>
			                    	</ul>
			                    </div>
                                <div class="textC mt20">
                                    <a class="btn large btnPoint btnClose" href="#none"><span>닫기</span></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- //layer popup : 맵보기 -->

            </div>
            <!-- //contents -->   
   
<script type="text/javascript">

	var tabActiveNum=${tabActiveNum};
	var listType = ${listType};

    if (listType == 2) {
	    $(".btn.large.layerPopTypeMap").remove();
	    $(".btn.large").remove();
	}  
</script>

<%@ include file="../include/bottom.jsp" %>

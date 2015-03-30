<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>	

        <!-- contents -->
        <div class="mrContainer">
	            <div class="contents">
                <div class="titleWrap">
                    <h2>공지사항</h2>
                </div>
              	<div class="messageBoxWrap mt30">
			        <ul class="messageBox">
			        <c:forEach var="noticetList" items="${Bulletin}">
			        
			            <li class="article">
			                <div class="tit"><a href="#none">${noticetList.bulletinTitle}</a><span class="date">${noticetList.regDatetime}</span></div>
			                <div class="con">
			                	<div class="msgCon" style="width: 100%">
			                		<p><a href="#none">${noticetList.bulletinContent}</a></p> 
			                	</div>
			                </div>
			            </li>
			        </c:forEach>    
			        </ul>
			    </div>               
            </div>
            <!-- //contents -->        
			
			


<%@ include file="../include/bottom.jsp" %>



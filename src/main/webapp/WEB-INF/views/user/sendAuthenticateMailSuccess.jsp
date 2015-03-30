<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>	

<div class="contents">
	<div class="m_com">
		<h2 class="tit wrap mb30"><spring:message code ="msg.alert.completeEmailSent"/></h2>
		<div class="contBox01">
			<ul>
				<li><spring:message code ="info.email.msg001"/></li>
				<li><spring:message code ="info.email.msg002"/></li>
			</ul>
		 </div>
	<%@ include file="../shared/member_function.jsp" %>
	</div>
</div>

<%@ include file="../include/bottom.jsp" %>




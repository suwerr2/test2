<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/top.jsp" %>

<div class="contents">
	<div class="m_com">
		<h2 class="tit wrap"><spring:message code ="title.emailCertification"/> </h2>
		<div class="pw">
			<div class="contBox01 mt30 mb30">
               	<ul>
               		<li>${message.mainMessage}</li>
               		<li>${message.subMessage}</li>
               	</ul>
            </div>
			<p class="textC pointColor mb10">${message}</p>
			<form id="pw"  method="post">
				<div class="emailConfirm textC">
					<span class="bulList">E-mail</span>
					<input type="text" name="email" id="email" class="w_300 ml20"   placeholder="<spring:message code ="msg.inut.email"/>">
					<p id="alert1" class="vb_hid ml_30 fc_red"><spring:message code ="msg.inut.email"/></p>
					<input type="text" class="dp_none"><br>	
					<div class="mt20"><input type="submit" id="pw_box" value="<spring:message code ="title.confirm"/>"></div>
				</div>
			</form> 
		 </div>
	<%@ include file="../shared/member_function.jsp" %>
	</div>
</div>
<%@ include file="../include/bottom.jsp" %>	


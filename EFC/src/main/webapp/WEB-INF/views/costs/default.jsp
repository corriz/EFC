<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přehled nad výdaji</h1>

<c:if test="${not empty message}">
	<div class="uk-alert uk-alert-success" data-uk-alert>
		<p>${message}</p>
	</div>
</c:if>



<%@ include file="/WEB-INF/views/footer.jsp" %>
<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat čerpání <c:if test="${not empty car.id}">pro ${car.made} ${car.model}</c:if></h1>

<%@ include file="/WEB-INF/views/footer.jsp" %>
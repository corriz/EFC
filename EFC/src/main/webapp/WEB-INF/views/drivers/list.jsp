<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Seznam řidičů</h1>

<c:choose>
<c:when test="${not empty drivers.driversMap}">
<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
<tr>
	<th>ID</th>
	<th>Příjmeni</th>
	<th>Jméno</th>
	<th>Generated Id</th>
	<th>Akce</th>
</tr>
<c:forEach items="${drivers.driversMap}" var="driverEntry">
<c:set var="driver" value="${driverEntry.value}"/>
<c:set var="driverId" value="${driverEntry.key}"/>
	<tr>
		<th>${driverId}</th>
		<th>${driver.lastname}</th>
		<th>${driver.firstname}</th>
		<th>${driver.own_number}</th>
		<th><a href="">Editovat</a> <a href="">Smazat</a></a></th>
	</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<p>Nic tu neni, pardoon!!</p>
</c:otherwise>
</c:choose>

<%@ include file="/WEB-INF/views/footer.jsp" %>
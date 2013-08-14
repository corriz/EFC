<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Seznam řidičů</h1>

<c:choose>
<c:when test="${not empty drivers.driversMap}">
<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
<thead>
	<tr>
		<th>ID</th>
		<th>Příjmeni</th>
		<th>Jméno</th>
		<th>Generated Id</th>
		<th>Akce</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${drivers.driversMap}" var="driverEntry">
	<c:set var="driver" value="${driverEntry.value}"/>
	<c:set var="driverId" value="${driverEntry.key}"/>
		<tr>
			<td>${driverId}</td>
			<td>${driver.lastname}</td>
			<td>${driver.firstname}</td>
			<td><span class="uk-badge">${driver.own_number}</span></td>
			<td><a href="">Editovat</a> <a href="remove?id=${driverId}">Smazat</a></a></td>
		</tr>
	</c:forEach>
</tbody>
</table>
</c:when>
<c:otherwise>
<p>Nic tu neni, pardoon!!</p>
</c:otherwise>
</c:choose>

<%@ include file="/WEB-INF/views/footer.jsp" %>
<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Seznam čerpání</h1>
<c:choose>
<c:when test="${not empty refuelings.itemsMap}">
<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
<thead>
	<tr>
		<th>ID</th>
		<th>Auto</th>
	</tr>
</thead>
<tbody>
	<c:forEach items="${refuelings.itemsMap}" var="refuelingEntry">
	<c:set var="refueling" value="${refuelingEntry.value}"/>
	<c:set var="refuelingId" value="${refuelingEntry.key}"/>
		<tr>
			<td>${refuelingId}</td>
			<td>${refueling.car.spz }</td>
			<!-- <td>${driver.lastname}</td>
			<td>${driver.firstname}</td>
			<td><span class="uk-badge">${driver.own_number}</span></td>-->
			<td><a href="">Editovat</a> <a href="remove?id=${refuelingId}">Smazat</a></a></td>
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
<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přehled pro řidiče</h1>
<c:if test="${not empty message}">
	<div class="uk-alert uk-alert-success"  data-uk-alert>
		<p>${message}</p>
	</div>
</c:if>

<c:choose>
<c:when test="${not empty drivers.itemsMap}">
<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
<tbody>
	<c:forEach items="${drivers.itemsMap}" var="driverEntry">
	<c:set var="driver" value="${driverEntry.value}"/>
	<c:set var="driverId" value="${driverEntry.key}"/>
		<tr>
			<th>${driver.lastname} ${driver.firstname}</th>
		</tr>
		<c:forEach items="${cars.itemsMap}" var="carEntry">
			<c:set var="car" value="${carEntry.value}"/>
			<c:if test="${car.driver.id eq driver.id}">
				<tr>
					<td>${ car.spz }</td>
				</tr>
			</c:if>
		</c:forEach>
	</c:forEach>
</tbody>
</table>
</c:when>
<c:otherwise>
<p>Nic tu neni, pardoon!!</p>
</c:otherwise>
</c:choose>

<%@ include file="/WEB-INF/views/footer.jsp" %>
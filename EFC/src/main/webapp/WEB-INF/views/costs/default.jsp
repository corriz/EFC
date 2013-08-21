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

<c:choose>
<c:when test="${not empty cars.itemsMap}">
<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
<tbody>
	<c:forEach items="${cars.itemsMap}" var="carEntry">
	<c:set var="car" value="${carEntry.value}"/>
		<tr>
			<th>${ car.spz }</th>
		</tr>
		<c:choose>
		<c:when test="${not empty costs.itemsMap}">
			<c:forEach items="${costs.itemsMap}" var="costsEntry">
				<c:set var="cost" value="${costsEntry.value}"/>
				<c:if test="${cost.car.id eq car.id}">
					<tr>
						<td>${ cost.name }</td>
					</tr>
				</c:if>
			</c:forEach>
		</c:when>
		</c:choose>
	</c:forEach>
</tbody>
</table>
</c:when>
<c:otherwise>
<p>Nic tu neni, pardoon!!</p>
</c:otherwise>
</c:choose>

<%@ include file="/WEB-INF/views/footer.jsp" %>
<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Seznam vydajů</h1>

<c:if test="${not empty message}">
	<div class="uk-alert uk-alert-success" data-uk-alert>
		<p>${message}</p>
	</div>
</c:if>

<c:choose>
	<c:when test="${not empty costs.itemsMap}">
		<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
			<thead>
				<tr>
					<th>Id</th>
					<th>Automobil</th>
					<th>Výdaj</th>
					<th>Datum</th>
					<th>Stav km</th>
					<th>Cena</th>
					<th>Akce</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${costs.itemsMap}" var="costEntry">
				<c:set value="${costEntry.key}" var="costId" />
				<c:set value="${costEntry.value}" var="cost" />
				<tr>
					<td>${costId}</td>
					<td>${cost.car.made} ${cost.car.model}</td>
					<td>${cost.name}</td>
					<td><fmt:formatDate value="${cost.stat.date}" pattern="dd. MM. yyyy" /></td>
					<td>${cost.stat.kilometers}</td>
					<td>${cost.stat.price}</td>
					<td>
						<a href="<spring:url value="/costs/${costId}/edit" />"  class="uk-button-mini uk-button-primary"><i class="uk-icon-edit"></i></a>
						<a href="<spring:url value="/costs/remove?id=${costId}" />" class="uk-button-mini uk-button-danger"><i class="uk-icon-remove"></i></a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:when>
	<c:otherwise>
	<div class="uk-alert">
		<p>Není vložen žádný výdaj !</p>
	</div>
	</c:otherwise>
</c:choose>

<%@ include file="/WEB-INF/views/footer.jsp" %>
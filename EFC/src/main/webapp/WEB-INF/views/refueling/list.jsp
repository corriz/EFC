<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Seznam všech čerpání</h1>
<c:choose>
<c:when test="${not empty cars.itemsMap}">
<ul class="uk-subnav uk-subnav-pill" data-uk-switcher="{connect:'#car-id'}">
	<c:forEach items="${cars.itemsMap}" var="carEntry">
		<c:set value="${carEntry.key}" var="carId" />
		<c:set value="${carEntry.value}" var="car" />
		<li><a href="#${carId}">${car.made} ${car.model}</a></li>
	</c:forEach>
</ul>
<div id="car-id"  class="uk-switcher">
	<c:forEach items="${cars.itemsMap}" var="carEntry">
	<c:set value="${carEntry.key}" var="carId" />
	<c:set value="${carEntry.value}" var="car" />
	<div>
		<div class="uk-button-group">
			<a href="<spring:url value="/refueling/${carId}/add" />" class="uk-button">Přidal čerpání pro ${car.made} ${car.model}</a>
		</div>
		<c:choose>
		<c:when test="${not empty refuelings.itemsMap}">
		<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
		<thead>
			<tr>
				<th>ID</th>
				<th>Řidič</th>
				<th>Datum</th>
				<th>Cena</th>
				<th>litrů</th>
				<th>Stav</th>
				<th>Akce</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${refuelings.itemsMap}" var="refEntry">
			<c:set value="${refEntry.key}" var="refId" />
			<c:set value="${refEntry.value}" var="ref" />
				<tr>
					<td>${ref.id}</td>
					<td>${ref.driver.firstname} ${ref.driver.lastname}</td>
					<td>${ref.stat.date}</td>
					<td>${ref.amount} l</td>
					<td>${ref.stat.kilometers}</td>
					<td><a href="">Editovat</a> <a href="remove?id=${ref.id}">Smazat</a></td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		</c:when>
		<c:otherwise>
		<div class="uk-alert">
			<p>Není zaznaménáno žádné čerpání!!</p>
		</div>
		</c:otherwise>
		</c:choose>
	</div>
	</c:forEach>
	
</div>
</c:when>
<c:otherwise>
	<div class="uk-alert">
		<p>Není zaznaménáno žádné čerpání!! A žádný automobil. Prvně přidej automobil pak čerpání.</p>
	</div>
</c:otherwise>
</c:choose>

<%@ include file="/WEB-INF/views/footer.jsp" %>
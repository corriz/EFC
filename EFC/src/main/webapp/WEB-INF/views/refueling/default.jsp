<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přehled pro všechny čerpání</h1>

<c:choose>
<c:when test="${not empty cars.itemsMap}">
<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
<tbody>
	<c:forEach items="${cars.itemsMap}" var="carEntry">
	<c:set var="car" value="${carEntry.value}"/>
		<tr>
			<th colspan=2>${ car.spz }</th>
		</tr>
		<c:choose>
		<c:when test="${not empty refuelings.itemsMap}">
			<c:forEach items="${refuelings.itemsMap}" var="refuelingsEntry">
				<c:set var="refueling" value="${refuelingsEntry.value}"/>
				<c:if test="${refueling.car.id eq car.id}">
					<tr>
						<td>${ refueling.amount } l</td>
						<td>${ refueling.stat.price } kč</td>
						<td><fmt:formatNumber value="${ refueling.stat.price * refueling.amount }" maxFractionDigits="2" minFractionDigits="2" ></fmt:formatNumber> kč</td>
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
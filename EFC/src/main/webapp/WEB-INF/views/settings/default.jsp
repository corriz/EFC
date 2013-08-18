<%@ include file="/WEB-INF/views/includes.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Nastavení aplikace</h1>
<c:if test="${not empty message}">
	<div class="uk-alert uk-alert-success" data-uk-alert>
		<p>${message}</p>
	</div>
</c:if>

<ul class="uk-tab" data-uk-tab="{connect:'#form-id'}">
	<li><a href="">Automobily</a></li>
	<li><a href="">Paliva</a></li>
</ul>

<div id="form-id" class="uk-switcher uk-margin">
	<div>
		<h2>Automobily</h2>
		<div class="uk-button-group">
			<a class="uk-button" href="<spring:url value="/settings/add-car" />">Přidat automobil</a>
		</div>
		<hr>
		<table
			class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
			<thead>
				<tr>
					<th>Název</th>
					<th>Jednotka</th>
					<th>Akce</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Benzin</td>
					<td>litr</td>
					<td><a href="">Smazat</a></td>
				</tr>
			</tbody>
		</table>
	</div>
	
	<div>
		<h2>Paliva</h2>
		<div class="uk-button-group">
			<a class="uk-button" href="<spring:url value="/settings/add-fuel" />">Přidat palivo</a>
		</div>
		<hr>
		<c:choose>
		<c:when test="${not empty fuels.itemsMap}">
		<table
			class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
			<thead>
				<tr>
					<th>Název</th>
					<th>Jednotka</th>
					<th>Akce</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${fuels.itemsMap}" var="fuelEntry">
				<c:set var="fuel" value="${fuelEntry.value}"/>
				<tr>
					<td>${fuel.name}</td>
					<td>${fuel.unit}</td>
					<td><a href="" class="uk-button-mini uk-button-danger"><i class="uk-icon-remove"></i></a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</c:when>
		<c:otherwise>
			<div class="uk-alert uk-alert-warning"><p>WARNING: Není vloženo žádné palivo...</p></div>
		</c:otherwise>
		</c:choose>
	</div>
</div>

<%@ include file="/WEB-INF/views/footer.jsp"%>
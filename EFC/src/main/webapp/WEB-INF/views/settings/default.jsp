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
	<div class="uk-active">
		<h2>Automobily</h2>
		<div class="uk-button-group">
			<a class="uk-button" href="<spring:url value="/settings/add-car" />">Přidat automobil</a>
		</div>
		<hr>
		<c:choose>
		<c:when test="${not empty cars.itemsMap}">
			<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
				<thead>
					<tr>
						<th>Id</th>
						<th>Značka</th>
						<th>Model</th>
						<th>SPZ</th>
						<th>Palivo</th>
						<th>Majitel</th>
						<th>Akce</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${cars.itemsMap}" var="car">
					<c:set var="carId" value="${car.key}" />
					<c:set var="car" value="${car.value}" />
						<tr>
							<td>${carId}</td>
							<td>${car.made}</td>
							<td>${car.model}</td>
							<td>${car.spz}</td>
							<td>${car.fuel.name}</td>
							<td>${car.driver.firstname} ${car.driver.lastname}</td>
							<td>
								<a href="<spring:url value="/settings/${carId}/edit-car" />" class="uk-button-mini uk-button-primary"><i class="uk-icon-edit" ></i></a>
								<a href="settings/car-remove?id=${carId}" class="uk-button-mini uk-button-danger"><i class="uk-icon-remove" ></i></a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
		<c:otherwise>
			<div class="uk-alert-warning">
				<p>Nejsou zde žádné automobily</p>
			</div>
		</c:otherwise>
		</c:choose>
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
				<c:set var="fuelId" value="${fuelEntry.key}"/>
				<tr>
					<td>${fuel.name}</td>
					<td>${fuel.unit}</td>
					<td><a href="settings/fuel-remove?id=${fuelId}" class="uk-button-mini uk-button-danger"><i class="uk-icon-remove"></i></a></td>
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
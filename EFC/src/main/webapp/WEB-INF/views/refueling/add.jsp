<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat čerpání <c:if test="${not empty car.id}">pro ${car.made} ${car.model}</c:if></h1>

<c:choose>
	<c:when test="${refueling.amount eq 0}"><c:set var="method" value="post"></c:set></c:when>
	<c:otherwise><c:set var="method" value="put"></c:set></c:otherwise>
</c:choose>

<form:form commandName="refueling" cssClass="uk-form" method="${method}">
	<fieldset class="uk-form-horizontal">
		<c:if test="${empty car.id}">
			<div class="uk-form-row">
				<label class="uk-form-label">Automobil: </label>
				<form:select path="car.id" cssClass="uk-form-width-medium">
					<c:forEach items="${cars.itemsMap}" var="carsEntry">
						<c:set var="carId" value="${carsEntry.key}"/>
						<c:set var="car" value="${carsEntry.value}"/>
						<form:option value="${carId}">${car.made} ${car.model}</form:option>
					</c:forEach>
				</form:select>
			</div>
		</c:if>
		<div class="uk-form-row">
			<label class="uk-form-label">Řidič: </label>
			<form:select path="driver.id" cssClass="uk-form-width-medium">
				<c:forEach items="${drivers.itemsMap}" var="driverEntry">
					<c:set var="driverId" value="${driverEntry.key}"/>
					<c:set var="driver" value="${driverEntry.value}"/>
					<form:option value="${driverId}">${driver.firstname} ${driver.lastname}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<form:hidden path="stat.date"/>
		<div class="uk-form-row">
			<label class="uk-form-label">Cena: </label>
			<form:input path="stat.price" type="text" cssClass="uk-form-success" placeholder="cena"/>
		</div>
		<div class="uk-form-row">
			<label class="uk-form-label">Množství: </label>
			<form:input path="amount" type="text" placeholder="množství"/>
		</div>
		<div class="uk-form-row">
			<label class="uk-form-label">Aktuálně najeto: </label>
			<form:input path="stat.kilometers" type="text" cssClass="uk-form-success" placeholder="aktulně najeto"/>
		</div>
		<div class="uk-form-row">
			<form:button class="uk-button uk-button-primary">Submit</form:button>
		</div>
	</fieldset>
</form:form>

<%@ include file="/WEB-INF/views/footer.jsp" %>
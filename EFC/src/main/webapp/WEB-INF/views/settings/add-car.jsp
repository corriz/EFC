<%@ include file="/WEB-INF/views/includes.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat automobil</h1>

<form:form class="uk-form" commandName="car">
	<fieldset>
	<legend>Formulář pro přidání paliva</legend>
		
		<c:if test="${not empty drivers}">
			<div class="uk-form-row">
				<form:select path="driver" cssClass="uk-form-width-medium">
					<c:forEach items="${drivers}" var="driver">
						<form:option value="${driver.id}" label="${driver.firstname} ${driver.lastname}"  />
					</c:forEach>
				</form:select>
			</div>
		</c:if>
		
		<div class="uk-form-row">
			<form:input path="spz" type="text" placeholder="SPZ" cssClass="uk-form-width-medium" />
		</div>
		<div class="uk-form-row">
			<form:input path="made" type="text" placeholder="Značka" cssClass="uk-form-width-medium" />
		</div>
		<div class="uk-form-row">
			<form:input path="model" type="text" placeholder="Model" cssClass="uk-form-width-medium" />
		</div>
		
		<c:if test="${not empty fuels.itemsMap}">
			<div class="uk-form-row">
				<form:select path="fuel" cssClass="uk-form-width-medium">
					<c:forEach items="${fuels.itemsMap}" var="fuelEntry">
						<c:set var="fuelId" value="${fuelEntry.key}"/>
						<c:set var="fuel" value="${fuelEntry.value}"/>
						<form:option value="${fuelEntry}">${fuel.name}</form:option>
					</c:forEach>
				</form:select>
			</div>
		</c:if>

		<div class="uk-form-row">
			<form:button class="uk-button" type="submit" cssClass="uk-form-width-medium">Submit</form:button>
		</div>
	</fieldset>
</form:form>

<%@ include file="/WEB-INF/views/footer.jsp"%>
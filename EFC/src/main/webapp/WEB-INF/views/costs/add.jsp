<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat výdaj</h1>

<c:choose>
	<c:when test="${not empty cost.name}"><c:set var="method" value="put"></c:set></c:when>
	<c:otherwise><c:set var="method" value="post"></c:set></c:otherwise>
</c:choose>

<form:form commandName="cost" cssClass="uk-form" method="${method}">
	<fieldset class="uk-form-horizontal">
	<c:if test="${not empty cost.name}"><form:hidden path="id"/></c:if>
		<div class="uk-form-row">
		<label class="uk-form-label">Automobil: </label>
			<form:select path="car.id" cssClass="uk-form-width-medium">
				<c:forEach items="${cars.itemsMap}" var="carEntry">
					<c:set var="carId" value="${carEntry.key}"/>
					<c:set var="car" value="${carEntry.value}"/>
					<form:option value="${carId}">${car.made} ${car.model}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="uk-form-row">
			<label class="uk-form-label">Název: </label>
			<form:input path="name" type="text" placeholder="Název" cssClass="uk-form-width-medium"/>
		</div>
		<div class="uk-form-row">
			<label class="uk-form-label">Cena: </label>
			<form:input path="stat.price" type="text" placeholder="Cena" cssClass="uk-form-width-medium uk-form-large uk-form-success"/>
		</div>
		<div class="uk-form-row">
			<label class="uk-form-label">Ujeto kilometru: </label>
			<form:input path="stat.kilometers" type="text" placeholder="Ujeto kilometrů" cssClass="uk-form-width-medium"/>
		</div>
		<div class="uk-form-row">
			<label class="uk-form-label">Poznámka: </label>
			<form:textarea path="text" placeholder="Poznámka" cssClass="uk-form-width-medium"/>
		</div>
		<div class="uk-form-row">
			<c:choose>
			<c:when test="${not empty cost.name}">
			<form:button type="submit" class="uk-button" >Edit</form:button>
			</c:when>
			<c:otherwise>
			<form:button type="submit" class="uk-button" >Submit</form:button>
			</c:otherwise>
			</c:choose>
		</div>
	</fieldset>
</form:form>

<%@ include file="/WEB-INF/views/footer.jsp" %>
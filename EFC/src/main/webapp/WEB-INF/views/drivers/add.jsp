<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat řidiče</h1>

<form:form cssClass="uk-form" modelAttribute="drivers">
	<fieldset>
		<legend>Formulář pro přidání řidiče</legend>
		<div class="uk-form-row">
			<form:input type="text" path="firstname" placeholder="Jméno" cssClass="uk-form-width-medium" />
		</div>
		<div class="uk-form-row">
			<form:input type="text" path="lastname" placeholder="Příjmení" cssClass="uk-form-width-medium" />
		</div>
		<div class="uk-form-row">
			<form:button type="submit" cssClass="uk-button">Submit</form:button>
		</div>
	</fieldset>
</form:form>

<%@ include file="/WEB-INF/views/footer.jsp" %>
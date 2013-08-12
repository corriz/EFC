<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat řidiče</h1>

<form class="uk-form">
	<fieldset>
		<legend>Formulář pro přidání řidiče</legend>
		<div class="uk-form-row">
			<input type="text" placeholder="Jméno" class="uk-form-width-medium" />
		</div>
		<div class="uk-form-row">
			<input type="text" placeholder="Příjmení" class="uk-form-width-medium" />
		</div>
		<div class="uk-form-row">
			<button type="submit" class="uk-button">Submit</button>
		</div>
	</fieldset>
</form>

<%@ include file="/WEB-INF/views/footer.jsp" %>
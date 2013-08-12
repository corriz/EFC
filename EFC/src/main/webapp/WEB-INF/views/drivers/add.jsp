<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat řidiče</h1>

<form class="uk-form">
	<fieldset>
		<legend>Formulář pro přidání řidiče</legend>
		<div class="uk-form-row">
			<input type="text" placeholder="Jméno" />
		</div>
		<div class="uk-form-row">
			<input type="text" placeholder="Příjmení" />
		</div>
	</fieldset>
</form>

<%@ include file="/WEB-INF/views/footer.jsp" %>
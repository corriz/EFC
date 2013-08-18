<%@ include file="/WEB-INF/views/includes.jsp"%>
<%@ include file="/WEB-INF/views/header.jsp"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat palivo</h1>

<form:form class="uk-form" commandName="fuel">
	<fieldset>
	<legend>Formulář pro přidání automobilu</legend>
		<form:input path="name" type="text" placeholder="Název" />
		<form:select path="unit">
			<form:option value="litr">litr</form:option>
			<form:option value="gallon">gallon</form:option>
		</form:select>
		<form:button class="uk-button" type="submit">Submit</form:button>
	</fieldset>
</form:form>

<%@ include file="/WEB-INF/views/footer.jsp"%>
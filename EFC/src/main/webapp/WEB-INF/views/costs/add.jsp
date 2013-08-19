<%@ include file="/WEB-INF/views/includes.jsp" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<h1>Přidat výdaj</h1>

<form:form commandName="cost" cssClass="uk-form">
	<fieldset>
		<form:hidden path="cost.id"/>
		<div class="uk-form-row">
			<form:select path="cost.car">
				<form:option value="" />
			</form:select>
		</div>
		<div class="uk-form-row"><label>Název: </label><form:input path="cost.name" type="text" placeholder="Název"/></div>
		<div class="uk-form-row"><form:input path="cost.stat.price" type="text" placeholder="Cena"/></div>
		<div class="uk-form-row"><form:input path="cost.stat.kilometers" type="text" placeholder="Název"/></div>
		<div class="uk-form-row"><form:input path="cost.text" type="text" placeholder="Poznámka"/></div>
		
	</fieldset>
</form:form>

<%@ include file="/WEB-INF/views/footer.jsp" %>
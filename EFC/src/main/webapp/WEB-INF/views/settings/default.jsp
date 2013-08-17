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
		<hr>
	</div>
	<div>
		<h2>Paliva</h2>
		<form class="uk-form">
			<fieldset>
				<input type="text" placeholder="Název" /> 
				<select>
					<option>litr</option>
					<option>gallon</option>
				</select>
				<button class="uk-button" type="submit">Submit</button>
			</fieldset>
		</form>
		<table class="uk-table uk-table-hover uk-table-striped uk-table-condensed">
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
</div>

<%@ include file="/WEB-INF/views/footer.jsp"%>
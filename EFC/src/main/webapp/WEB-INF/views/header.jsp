<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Template</title>

	<link href="<spring:url value="/css/uikit.min.css" />" rel="stylesheet" type="text/css" />
    </head>
    <body class="my-background">
	<nav class="tm-navbar uk-navbar uk-navbar-attached">
	    <div class="uk-container uk-containter-center">
		<a class="uk-navbar-brand uk-hidden-small" href="<spring:url value="/" />">
		    PPRO Projekt 2012
		</a>
		<ul class="uk-navbar-nav uk-hidden-small">
		    <li><a href="<spring:url value="/" />">Domů</a></li>
		</ul>
		<a href="#my-offcanvas" class="uk-navbar-toggle uk-visible-small" data-uk-offcanvas></a>
	    </div>
	</nav>

	<div class="my-middle">
	    <div class="uk-container uk-containter-center">
	    	<div class="uk-grid" data-uk-grid-margin>
	    		<aside class="my-sidebar uk-width-medium-1-4 uk-hidden-small">
					<ul class="tm-nav uk-nav" data-uk-nav>
					    <li class="uk-nav-header"><i class="uk-icon-road"></i> Čerpání</li>
					    <li><a href="<spring:url value="/refueling/" />">Přehled</a></li>
					    <li><a href="<spring:url value="/refueling/list" />">Seznam</a></li>
					    <li><a href="<spring:url value="/refueling/add" />">Přidat</a></li>
					    		
					    <li class="uk-nav-header"><i class="uk-icon-gears"></i> Další výdaje</li>
					    <li><a href="<spring:url value="/costs" />">Přehled</a></li>
					    <li><a href="<spring:url value="/costs/list" />">Seznam</a></li>
					    <li><a href="<spring:url value="/costs/add" />">Přidat</a></li>
		
					    <li class="uk-nav-header"><i class="uk-icon-group"></i> Řidiči</li>
					    <li><a href="<spring:url value="/drivers/" />">Přehled</a></li>
					    <li><a href="<spring:url value="/drivers/list/" />">Seznam</a></li>
					    <li><a href="<spring:url value="/drivers/add/" />">Přidat</a></li>
					    
					    <li class="uk-nav-header"><i class="uk-icon-cog"></i> Nastavení</li>
					    <li><a href="<spring:url value="/settings" />">Přehled</a></li>
					</ul>
			    </aside>
			    <div class="my-main uk-width-medium-3-4">
	<!-- CONTENT -->
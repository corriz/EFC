<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<!-- CONTENT -->
				</div>
			</div>
	    </div>
	</div>

	<div class="tm-footer">
	    <div class="uk-container uk-container-center uk-text-center">
		<div class="uk-panel">
		    <p>Made by <a href="#">Roman Michalcik</a> and <a href="#">Pavel Pech</a>.</p>
		</div>

	    </div>
	</div>

	<div id="my-offcanvas" class="uk-offcanvas">
	    <div class="uk-offcanvas-bar">
		<ul class="uk-nav uk-nav-offcanvas uk-nav-parent-icon" data-uk-nav="{multiple:true}">
		    <li><a href="<spring:url value="/" />"><i class="uk-icon-home"></i> Domů</a></li>
		    <li class="uk-parent"><a href="#"><i class="uk-icon-folder-road"></i> Čerpání</a>
			<ul class="uk-nav-sub">
			    <li><a href="<spring:url value="/" />">Přehled</a></li>
				<li><a href="<spring:url value="/" />">Seznam</a></li>
				<li><a href="<spring:url value="/" />">Přidat</a></li>
			</ul>
			<li class="uk-parent"><a href="#"><i class="uk-icon-folder-gears"></i> Další výdaje</a>
			<ul class="uk-nav-sub">
			    <li><a href="<spring:url value="/" />">Přehled</a></li>
				<li><a href="<spring:url value="/" />">Seznam</a></li>
				<li><a href="<spring:url value="/" />">Přidat</a></li>
			</ul>
		    </li>
		    <li class="uk-parent"><a href="#"><i class="uk-icon-group"></i> Řidiči</a>
			<ul class="uk-nav-sub">
			    <li><a href="<spring:url value="/drivers/" />">Přehled</a></li>
				<li><a href="<spring:url value="/drivers/list/" />">Seznam</a></li>
				<li><a href="<spring:url value="/drivers/add/" />">Přidat</a></li>
			</ul>
		    </li>
		    <li><a href="#"><i class="uk-icon-cog"></i> Nastavení</a>
		    </li>
		</ul>

	    </div>

	</div>

	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
	<script src="<spring:url value="/js/uikit.min.js"  htmlEscape="true" />" type="text/javascript"></script>
    </body>
</html>

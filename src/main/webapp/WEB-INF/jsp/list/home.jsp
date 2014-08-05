<fmt:message key="site.name" var="siteName"/>

<fmt:message key="metas.default.description" var="description">
	<fmt:param value="${siteName}" />
</fmt:message>

<fmt:message key="metas.generic.title" var="genericTitle" >
	<fmt:param value="${siteName}" />
</fmt:message>

<tags:header facebookMetas="${true}" title="${genericTitle} - ${title}" description="${description}"/>

<section class="first-content content">
	<tags:questionList recentTags="${recentTags}" questions="${questions}" title="${title}" tabs="${tabs}"/>
</section>
<tags:joyrideIntro />

<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<form class="metro search-form" action="${linkTo[SearchController].search}" method="get">
    <div class="input-control text size4">
        <input class="text-input" name="query" type="text" />
        <button class="btn-search"></button>
    </div>
</form>
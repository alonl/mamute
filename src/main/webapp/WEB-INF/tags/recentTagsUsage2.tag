<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@attribute name="tagsUsage" type="java.util.List" required="true" %>

<c:forEach items="${tagsUsage}" var="tagUsage">
    <li class="tags-item"><tags:tag2 tag="${tagUsage}"/></li>
</c:forEach>
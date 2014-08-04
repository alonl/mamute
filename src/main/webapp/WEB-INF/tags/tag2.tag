<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="tag" type="org.mamute.model.TagUsage" required="true" %>

<a href="${linkTo[ListController].withTag(tag.tag.name)}">${tag.tag.name} x ${tag.usage}</a>

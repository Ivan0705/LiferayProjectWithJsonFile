<%@ taglib prefix="liferay" uri="http://java.sun.com/portlet" %>
<%@ include file="/init.jsp" %>

<p>
    <b><liferay-ui:message key="postportletfromjson.caption"/></b>
    <liferay:defineObjects/>
    <%
        String postList = (String) renderRequest.getAttribute("post");
    %>
    <%=postList%>
</p>
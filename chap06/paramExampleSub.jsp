<%@ page contextType="test/html; charset=UTF-8" %>
<%
    String type = request.getParameter("type");
    if(type == null){
        return;
    }
%>
<br>
<table witdth="100%" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td>타입</td>
    <td><b><%= type %></b></td>
</tr>
<tr>
    <td>특징</td>
    <td>

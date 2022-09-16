<%@ page contextType="test/html; charset=UTF-8" %>
<html>
<head><title> 파라미터 액션태그 </title></head>
<body>

<jsp:include page="paramExampleSub.jsp" flush="false">
    <jsp:param name="type" value="A"/>
</jsp:include>
</body>
</html>
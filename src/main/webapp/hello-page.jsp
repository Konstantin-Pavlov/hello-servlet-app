<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

    <head>
        <title>${requestScope.title}</title>
    </head>

    <body>
        <h1>${requestScope.title}</h1>
        ${requestScope.content}
        <br> <a href="http://localhost:8085/hello_servlet_app/">home</a> <br>
    </body>

</html>

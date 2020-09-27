<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/test1" method="post">
       用户名： <input type="text" name="name"/><span style="color: red">${name}</span>  <br/><br/>
        年龄： <input type="text" name="age"/><span style="color: red">${age}</span>  <br/><br/>
        地址： <input type="text" name="city.address"/><span style="color: red">${requestScope['city.address']}</span>  <br/><br/>
        工作： <input type="text" name="city.job"/><span style="color: red">${requestScope['city.job']}</span>  <br/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>

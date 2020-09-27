<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/js/jquery-3.3.1.min.js"></script>
<body>
    <form action="/test1" method="post" enctype="multipart/form-data">
        上传文件：<input type="file" name="fileData"/><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>

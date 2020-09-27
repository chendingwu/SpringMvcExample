<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/js/jquery-3.3.1.min.js"></script>
<body>
<a href="javascript:void(0);" id="link1">请求到controller</a>
</body>
<script>
    $("#link1").click(function () {
        $.ajax({
           type:"post",
           url:"test1",
           data:"request data",
           dataType:"text",
           contentType:"application/text",
            success:function (res) {
                alert(res);
            }
        });
    });
</script>
</html>

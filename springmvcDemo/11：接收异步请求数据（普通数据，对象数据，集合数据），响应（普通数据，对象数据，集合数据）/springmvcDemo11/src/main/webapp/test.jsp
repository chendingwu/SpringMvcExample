<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/js/jquery-3.3.1.min.js"></script>
<body>
<a href="javascript:void(0);" id="link1">把普通数据请求给Controller</a> <br/><br/>
<a href="javascript:void(0);" id="link2">把对象数据请求给Controller</a> <br/><br/>
<a href="javascript:void(0);" id="link3">把List集合类型对象数据请求给Controller</a> <br/><br/><hr/>
<a href="javascript:void(0);" id="link4">Controller把普通数据响应给页面</a><br/><br/>
<a href="javascript:void(0);" id="link5">Controller把对象数据响应给页面</a><br/><br/>
<a href="javascript:void(0);" id="link6">Controller把List集合数据响应给页面</a>
</body>
<script>
    $("#link1").click(function () {
        $.ajax({
            type:"POST",
            url:"test1",
            data:"xiaoming",
            dataType:"text",  //响应正文类型
            contentType:"application/text"  //请求正文MIME类型

        });
    });


    $("#link2").click(function () {
        $.ajax({
            type:"POST",
            url:"test2",
            data:'{"id":1,"name":"tom","age":12}',
            dataType:"text",  //响应正文类型
            contentType:"application/json"  //请求正文MIME类型
        });
    });


    $("#link3").click(function () {
        $.ajax({
            type:"POST",
            url:"test3",
            data:'[{"id":1,"name":"tom","age":12},{"id":2,"name":"jack","age":21},{"id":3,"name":"tony","age":15}]',
            dataType:"text",  //响应正文类型
            contentType:"application/json"  //请求正文MIME类型
        });
    });

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    $("#link4").click(function () {
        $.ajax({
            type:"POST",
            url:"test4",
            success:function (resp) {
                alert(resp)
            }
        });
    });

    $("#link5").click(function () {
        $.ajax({
            type:"POST",
            url:"test5",
            success:function (resp) {
                alert(resp['name'] + "     "+ resp['age'])
            }
        });
    });



    $("#link6").click(function () {
        $.ajax({
            type:"POST",
            url:"test6",
            success:function (resp) {
                alert(resp[0]['name'] + "     "+ resp[0]['age']);
                alert(resp[1]['name'] + "     "+ resp[1]['age']);
                alert(resp[2]['name'] + "     "+ resp[2]['age']);
            }
        });
    });

</script>
</html>

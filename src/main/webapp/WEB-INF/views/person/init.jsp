<%--
  Created by IntelliJ IDEA.
  User: lzw
  Date: 2019/8/15
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Person Test</title>
    <c:set var="ctxPath"
           value='${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/'/>
    <!-- Bootstrap -->
    <link href="${ctxPath}css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${ctxPath}css/init.css" type="text/css"/>
    <link href="${ctxPath}css/index.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="${ctxPath}js/jquery-3.3.1.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="${ctxPath}js/bootstrap.min.js"></script>
    <script src="${ctxPath}js/index.js"></script>
    <script src="${ctxPath}js/gen_list_icon.js"></script>

    <%-- zDialog --%>
    <link rel="stylesheet" href="${ctxPath }js/zDialog/zDialog.css">
    <script src="${ctxPath }js/zDialog/zepto.js"></script>
    <script src="${ctxPath }js/zDialog/zDialog.js"></script>


    <script type="text/javascript">

        function savePerson() {
            let form1 = $('#form1');
            $.post(form1.attr("action"), form1.serialize(), function (data) {
                let mes = eval(data);
                if (mes.success) {
                    Dialog.alert("保存成功！", function () {
                        top.Dialog.close();
                    });
                } else {
                    Dialog.alert(mes.data);
                }
            });
        }
    </script>
</head>
<body>
<div id="man-open1">
    <div id="manage">
        <form action="${ctxPath}person/save" id="form1" name="form1">
            <input type="hidden" name="id" value="${person.id}"/>
            <div class="pull-wrap">
                <table class="table-bordereds" border="0" cellspacing="0">
                    <tr>
                        <td class="table_header"><label for="name"> 姓名： </label></td>
                        <td class="table_text">
                            <input type="text" class="form-control" id="name" name="name"
                                   value="${person.name }" placeholder="姓名"/>
                            <font style="color: red; float: left; margin: 5px 0 0 5px;">*</font>
                        </td>
                    </tr>
                    <tr>
                        <td class="table_header"><label for="age">年龄：</label></td>
                        <td class="table_text">
                            <input type="number" class="form-control" id="age" name="age"
                                   value="${person.age }" placeholder="年龄"/>
                            <font style="color: red; margin: 5px 0 0 5px;">*</font>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="work-list"></div>
            <div class="layui-layer-btn">
                <button class="layui-layer-btn2" type="button" onclick="savePerson()">确定</button>
                <button onclick="top.Dialog.close();" class="layui-layer-btn1">关闭</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
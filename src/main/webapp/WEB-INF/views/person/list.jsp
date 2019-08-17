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
    <link href="${ctxPath}css/index.css" rel="stylesheet">
    <link rel="stylesheet" href="${ctxPath}css/init.css" type="text/css"/>
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
</head>
<body style="background: #f1f1f1;">
<script type="text/javascript">
    function initPersonEdit(oid) {
        var url = "${ctxPath}person/init";
        var message;
        if (oid) {
            message = "编辑Person";
            url += "?id=" + oid;
        } else {
            message = "新增Person";
        }

        let diag = new Dialog();
        diag.Width = 900;
        diag.Height = 250;
        diag.URL = url;
        diag.Title = message;
        diag.CancelEvent = function () {
            diag.close();
            window.location.reload();
        };
        diag.show();
    }

    function deletePerson(oid) {
        Dialog.confirm('你确定要删除吗？', function () {
            $.post('${ctxPath }person/delete?id=' + oid, null, function (data) {
                let mes = eval(data);
                if (mes.success) {
                    Dialog.alert("删除成功！", function () {
                        top.window.location.reload();
                    });
                } else {
                    Dialog.alert(mes.data);
                }
            });
        });
    }

    function confimForm() {
        $('#queryForm').submit();
    }
</script>
<h2>Person</h2>
<div class="nav_information">
    <div class="select_area_cont">
        <div class="select_exist_list">
            <form class="form-horizontal" role="form" action="${ctxPath}person/search" id="queryForm" name="queryForm"
                  method="get">
                <div class="form-group col-md-9">
                    <div>
                        <label class="control-label" for="name">姓名</label>
                        <input type="text" class="form-control key" placeholder="请输入用户名" id="name" name="name"
                               value="<c:out value='${param.name }'/>"/>
                    </div>
                </div>

                <div class="btn-group col-md-3">
                    <button type="submit" class="btn btn-primary" onclick="confimForm()">
                        <i class=" fa fa-search"></i> 搜索
                    </button>
                    <button type="button" class="btn btn-primary" onclick="initPersonEdit()">
                        <i class="icon-plus"></i> 增加
                    </button>
                </div>
            </form>
        </div>
    </div>
    <div class="select_area_list">
        <div class="select_result_list">
            <table class="table table-bordered" style="table-layout: fixed;" id="tableList">
                <tr>
                    <th width="10%">序号</th>
                    <th width="30%">姓名</th>
                    <th width="30%">年龄</th>
                    <th width="20%">操作</th>
                </tr>
                <c:forEach items="${people}" var="person" varStatus="status">
                    <tr oid="<c:out value='${person.id }' />">
                        <td title="<c:out value='${status.count }'/>"><c:out value='${status.count }'/></td>
                        <td title="<c:out value='${person.name }'/> "><a
                                href="${ctxPath}person/search?name=${person.name }"><c:out value='${person.name }'/></a>
                        </td>
                        <td title="<c:out value='${person.age }'/>"><c:out value='${person.age }'/></td>
                        <td class="visible"></td>
                    </tr>
                </c:forEach>
            </table>
            <!--分页-->
        </div>
    </div>
</div>
<script>

    $(function () {
        TableList.genOperIcon("tableList", '1'
            , "修改", "glyphicon glyphicon-pencil", "initPersonEdit('holidayOid')", [{"holidayOid": "oid"}]
            , "删除", "glyphicon glyphicon-trash", "deletePerson('holidayOid')", [{"holidayOid": "oid"}]
        )
    });
</script>
</body>
</html>

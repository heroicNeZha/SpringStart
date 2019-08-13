<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<header>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Person Test</title>

    <!-- Bootstrap -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <link href="./css/index.css" rel="stylesheet">
</header>
<body style="background: #f1f1f1;">
<script type="text/javascript">
    <%--function initHolidayEdit(oid) {--%>
    <%--    var url = "${ctxPath }sys/holiday/init.do";--%>
    <%--    var message;--%>
    <%--    if (oid) {--%>
    <%--        message = "节假日信息编辑"--%>
    <%--        url += "?oid=" + oid;--%>
    <%--    } else {--%>
    <%--        message = "节假日信息新增"--%>
    <%--    }--%>
    <%--    var diag = openDialog(message, 900, 250, url, function (oid, name) {--%>
    <%--        diag.close();--%>
    <%--        if (oid != "close") {--%>
    <%--            nextPage('${page.pageNumber }');--%>
    <%--        }--%>
    <%--    });--%>
    <%--}--%>

    <%--function deleteHoliday(oid) {--%>
    <%--    Dialog.confirm('你确定要删除吗？', function () {--%>
    <%--        common.ajaxPost('${ctxPath }sys/holiday/delete.do?oid=' + oid,--%>
    <%--            null, function (data) {--%>
    <%--                var mes = eval(data);--%>
    <%--                if (mes.success) {--%>
    <%--                    Dialog.alert("删除成功！", function () {--%>
    <%--                        nextPage('${page.pageNumber }');--%>
    <%--                    });--%>
    <%--                } else {--%>
    <%--                    Dialog.alert(mes.data);--%>
    <%--                }--%>
    <%--            });--%>
    <%--    });--%>
    <%--}--%>

    function confimForm() {
        $('#queryForm').submit();
    }
</script>
<h2>Person</h2>
<div class="nav_information">
    <div class="select_area_cont">
        <div class="select_exist_list">
            <form class="form-horizontal" role="form" action="search.do" id="queryForm"
                  name="queryForm" method="holiday">
                <div class="form-group col-md-9 col-sm-8">
                    <div class=" col-lg-4 col-md-6 col-sm-6">
                        <label class="control-label" for="name">姓名</label>
                        <input type="text" class="form-control key" placeholder="请选择节假日期" id="name"
                               name="name"
                               value="<c:out value='${param.name }'/>"/>
                    </div>
                </div>

                <div class="btn-group col-md-3 col-sm-4">
                    <button type="submit" class="btn btn-primary" onclick="confimForm()">
                        <i class=" fa fa-search"></i> 搜索
                    </button>
                    <button type="button" class="btn btn-primary" onclick="initHolidayEdit()">
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
                    <th width="5%">序号</th>
                    <th width="30%">姓名</th>
                    <th width="30%">性别</th>
                </tr>
                <%--            <c:forEach items="${page.datas}" var="holiday" varStatus="sta">--%>
                <tr oid="<c:out value='${person.id }' />">
                    <td title="<c:out value='${person.id }' />"><c:out value='${person.id }'/></td>
                    <td title="<c:out value='${person.name }'/> "><c:out value='${person.name }'/></td>
                    <td title="<c:out value='${person.age}'/>"><c:out value='${person.age}'/></td>
                </tr>
                <%--            </c:forEach>--%>
            </table>
            <!--分页-->
        </div>
    </div>
</div>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="./js/jquery-3.3.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="./js/bootstrap.min.js"></script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: lzw
  Date: 2019/9/9
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>

<script>
    $(function () {

        $("#addForm").submit(function () {
            if (!checkEmpty("name", "产品名称"))
                return false;
            if (!checkEmpty("subTitle", "产品小标题"))
                return false;
            if (!checkEmpty("originalPrice", "原价格"))
                return false;
            if (!checkEmpty("promotePrice", "优惠价格"))
                return false;
            if (!checkEmpty("stock", "库存"))
                return false;
            return true;
        });
    });
</script>
<title>产品管理</title>

<div class="workingArea">
    <ol class="breadcrumb">
        <li><a href="${ctxPath}tmall/admin_category_list">所有分类</a></li>
        <li><a href="${ctxPath}tmall/admin_product_list?cid=${category.id}">${category.name}</a></li>
        <li class="active">产品管理</li>
    </ol>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>图片</th>
                <th>产品名称</th>
                <th>产品小标题</th>
                <th>原价格</th>
                <th>优惠价格</th>
                <th>库存</th>
                <th>编辑</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${products}" var="p">

                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.subTitle}</td>
                    <td>${p.originalPrice}</td>
                    <td>${p.promotePrice}</td>
                    <td>${p.stock}</td>
                    <td><a href="${ctxPath}tmall/admin_product_edit?id=${p.id}"><span
                            class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a deleteLink="true" href="${ctxPath}tmall/admin_product_delete?id=${p.id}"><span
                            class="glyphicon glyphicon-trash"></span></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>

    <div class="panel panel-warning addDiv">
        <div class="panel-heading">新增产品</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="${ctxPath}tmall/admin_product_add">
                <input type="hidden" id="cid" name="cid" value="${category.id}"/>
                <table class="addTable">
                    <tr>
                        <td>产品名称</td>
                        <td><input id="name" name="name" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>产品小标题</td>
                        <td><input id="subTitle" name="subTitle" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>原价格</td>
                        <td><input id="originalPrice" name="originalPrice" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>优惠价格</td>
                        <td><input id="promotePrice" name="promotePrice" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>库存</td>
                        <td><input id="stock" name="stock" type="text" class="form-control"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</div>

<%@include file="../include/admin/adminFooter.jsp" %>

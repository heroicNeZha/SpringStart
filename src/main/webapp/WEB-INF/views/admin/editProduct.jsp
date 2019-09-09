<jsp:useBean id="product" scope="request" type="edu.ustc.SpringStart.tmall.pojo.Product"/>
<%--
  Created by IntelliJ IDEA.
  User: lzw
  Date: 2019/9/9
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>

<script>
    $(function () {
        $("#editForm").submit(function () {
            return checkEmpty("name", "属性名称");
        })
    })
</script>

<div class="workingArea">
    <ol class="breadcrumb">
        <li><a href="${ctxPath}tmall/admin_category_list">分类管理</a></li>
        <li><a href="${ctxPath}tmall/admin_property_list?cid=${category.id}">${category.name}</a></li>
        <li class="active">编辑分类</li>
    </ol>

    <div class="panel panel-warning editDiv">
        <div class="panel-heading">编辑产品</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="${ctxPath}tmall/admin_product_update">
                <input type="hidden" id="cid" name="cid" value="${category.id}"/>
                <table class="addTable">
                    <tr>
                        <td>产品名称</td>
                        <td><input id="name" name="name" type="text" class="form-control">${product.name}</td>
                    </tr>
                    <tr>
                        <td>产品小标题</td>
                        <td><input id="subTitle" name="subTitle" type="text" class="form-control">${product.subTitle}
                        </td>
                    </tr>
                    <tr>
                        <td>原价格</td>
                        <td><input id="originalPrice" name="originalPrice" type="text"
                                   class="form-control">${product.originalPrice}</td>
                    </tr>
                    <tr>
                        <td>优惠价格</td>
                        <td><input id="promotePrice" name="promotePrice" type="text"
                                   class="form-control">${product.promotePrice}</td>
                    </tr>
                    <tr>
                        <td>库存</td>
                        <td><input id="stock" name="stock" type="text" class="form-control">${product.stock}</td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${product.id}"/>
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>


</div>

<%@include file="../include/admin/adminFooter.jsp" %>

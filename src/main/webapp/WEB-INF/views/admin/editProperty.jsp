<%--
  Created by IntelliJ IDEA.
  User: lzw
  Date: 2019/9/8
  Time: 21:01
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
        <div class="panel-heading">编辑属性</div>
        <div class="panel-body">
            <form method="post" id="editForm" action="${ctxPath}tmall/admin_property_update"
                  enctype="multipart/form-data">
                <input value="${property.cid}" name="cid" id="cid" type="hidden">
                <table class="editTable">
                    <tr>
                        <td>属性名称</td>
                        <td><input id="name" name="name" type="text" class="form-control"
                                   value="${property.name}"></td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <input type="hidden" name="id" value="${property.id}"/>
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>


</div>

<%@include file="../include/admin/adminFooter.jsp" %>

<%--
  Created by IntelliJ IDEA.
  User: lzw
  Date: 2019/8/28
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../include/admin/adminHeader.jsp" %>
<%@include file="../include/admin/adminNavigator.jsp" %>

<script>
    $(function () {
        $("#editForm").submit(function () {
            return checkEmpty("name", "分类名称");
        })
    })
</script>

<div class="workingArea">

</div>

<%@include file="../include/admin/adminFooter.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: lzw
  Date: 2019/8/15
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="../css/init.css" type="text/css"/>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function saveHoliday() {
            var holidayDate = $("#holidayDate").val();
            var holidayType = $('input:radio[name=holidayType]:checked').val();
            var errorMessage = common.validValueParam(holidayDate, 'em',
                '节假日期不能为空！', holidayType, 'em', '必须选择类型！');
            if (errorMessage.length > 0) {
                Dialog.alert(errorMessage[0]);
                return false;
            }
            common.ajaxPost($('#form1').attr("action"), $('#form1').serialize(),
                function(data) {
                    var mes = eval(data);
                    if (mes.success) {
                        Dialog.alert("保存成功！", function() {
                            ownerDialog.diagClose(mes.data, name);
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
        <form action="sys/holiday/save.do" id="form1" name="form1">
            <input type="hidden" name="token" value="${token }" />
            <input type="hidden" name="oid" value="${holiday.oid}" />
            <div class="pull-wrap">
                <table class="table-bordereds" border="0" cellspacing="0">
                    <tr>
                        <td class="table_header"><label for="holidayDate"> 节假日期： </label></td>
                        <td class="table_text">
                            <input type="text" class="form-control" id="holidayDate" name="holidayDate"
                                   value="${holiday.holidayDate }" placeholder="节假日期" onclick="WdatePicker()" />
                            <font style="color: red; float: left; margin: 5px 0 0 5px;">*</font></td>
                        <td class="table_header"><label for="holidayType">类型：</label></td>
                        <td class="table_text">
                            <tag:set attrName="holidayDateMap" className="com.zfsoft.common.BaseStaticParameter" fieldName="HOLIDAY_DATE_MAP" />
                            <span>
									<c:forEach items="${holidayDateMap }" var="map">
										<label>
											<input type="radio" name="holidayType" class="minimal" value="${map.key }"
                                                   <c:if test="${map.key eq holiday.holidayType }">checked</c:if> />${map.value }</label>
                                    </c:forEach>
								</span>
                            <font style="color: red; margin: 5px 0 0 5px;">*</font></td>
                    </tr>
                    <tr>
                        <td class="table_header"><label for="memo">备注：</label></td>
                        <td class="table_text" colspan="3"><textarea class="form-control" id="memo" name="memo" placeholder="备注">${holiday.memo}</textarea>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="work-list"></div>
            <div class="layui-layer-btn">
                <button class="layui-layer-btn2" type="button" onclick="saveHoliday()">确定</button>
                <button onclick="ownerDialog.diagClose('close',null)" class="layui-layer-btn1">关闭</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
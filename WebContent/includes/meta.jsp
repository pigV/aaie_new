<%@ page language="java"  contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/taglib.jsp"%>
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=EDGE"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="pragma" content="no-cache"/>
<meta http-equiv="cache-control" content="no-cache"/>
<meta http-equiv="expires" content="0"/>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
   String userId = request.getParameter("user_id"); // 用request得到 
%>
<link   href="${ctx}/assets/css/jquery-ui/jquery-ui-1.12.1.min.css" rel="stylesheet" />
<link   href="${ctx}/assets/lib/ztree/zTreeStyle/zTreeStyle.css" rel="stylesheet" />
<link   href="${ctx}/assets/css/button.css" rel="stylesheet" />
<link   href="${ctx}/assets/css/jquery-ui.css" rel="stylesheet" />
<link   href="${ctx}/assets/css/table.css" rel="stylesheet" />
<link   href="${ctx}/assets/css/page.css" rel="stylesheet" />
<link   href="${ctx}/assets/css/alert.tip.css" rel="stylesheet" />
<link   href="${ctx}/assets/css/base.css?123123123" rel="stylesheet" />

<script src="${ctx}/assets/lib/EJS/ejs_production.js"></script>
<script src="${ctx}/assets/lib/jQuery/jquery-1.10.2.js"></script>
<script src="${ctx}/assets/lib/jQuery/jquery-ui-1.12.1.min.js"></script>
<script src="${ctx}/assets/lib/jQuery/jquery-form.js"></script>
<script src="${ctx}/assets/lib/My97DatePicker/WdatePicker.js"></script>
<script src="${ctx}/assets/lib/pager/pager.js"></script>
<script src="${ctx}/assets/lib/extend/Log.js"></script>
<script src="${ctx}/assets/lib/extend/utils/date/DateFmt.js"></script>
<script src="${ctx}/assets/lib/extend/utils/json/json2.js"></script>
<script src="${ctx}/assets/lib/ztree/jquery.ztree.all-3.5.min.js"></script>

<script >
	$.ctx='${ctx}';
	$.ctxServer = '${ctx}/rest/';
	$.userId = '<%= userId %>';
	//$.ajaxSetup({contentType: "application/x-www-form-urlencoded; charset=utf-8"});
</script>
<script src="${ctx}/assets/js/public.js"></script>

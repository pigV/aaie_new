<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ include file="/includes/taglib.jsp"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/includes/meta.jsp"%>
<title>数据质量保障系统</title>
<link rel="stylesheet" href="${ctx}/assets/css/pages/schedule.css" />
<script src="${ctx}/assets/js/schedule/scheduleMap.js"></script>

</head>

<body>
	
	<%@ include file="/includes/header.jsp"%>

	 <div class="content-inner">
          <div class="blue-hr"></div>
          <div class="schedule-btn-box">
        	<ol>
        		<li>
        			<button id="prev">前驱</button>
        		</li>
        		<li>
        			<button id="next">后置</button>
        		</li>
        	</ol>
           </div>
           <div class="red-hr"></div> 
     </div>
</body>
 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/includes/taglib.jsp"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div class="header">
    <h1>数据质量保障系统</h1>
	<dl class="oper-list">
         <dd>
             <div  class="user-info">张三</div>
         </dd>
         <dd>
             <div class="seg-line"></div>
         </dd>
         <dd>
             <div class="current-timer" id="currentTimer"></div>
         </dd>
    </dl>
</div>
<%@page import="cn.etl.settting.Constant"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="cn.etl.util.FileUtil"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=Constant.projectTitle %></title>
<style type="text/css">
	.mylink{
	display :block;
	}
</style>
</head>
<body>

	<%
	File[] files=(File[])request.getAttribute("files");
	if(files!=null) for(File f:files){
	%>
	<%if(f.isDirectory()) {%>
		<a href='<%=request.getContextPath()%>/file/list?servletPath=${servletPath}/<%=f.getName() %>' class="dir mylink" ><%=f.getName() %></a>
	<%}else if(FileUtil.isVideo(f)){%>
		<a href='<%=request.getContextPath()%>/player.jsp?playsrc=courseFile/${servletPath}/<%=f.getName() %>' class="video mylink" ><%=f.getName() %></a>
	<%}else if(FileUtil.isPdf(f)){%>
	<a href='<%=request.getContextPath()%>/courseFile/${servletPath}/<%=f.getName() %>' class="pdf mylink"><%=f.getName() %></a>
	<%}else{%>
	<a href='<%=request.getContextPath()%>/file/download?servletPath=${servletPath }/<%=f.getName() %>' class="download mylink"><%=f.getName() %></a>
	<%}} %>
</body>
</html>
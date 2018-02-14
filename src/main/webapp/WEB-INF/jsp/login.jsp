<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/inc/inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		${mess}
		<form action="<%=request.getContextPath() %>/login" method="post">
	   	<div class="container">
	   		<div class="modalshow" tabindex="-1">
	   			<div class="modal-dialog">
	   				<div class="modal-content">
	   					<div class="modal-header">
	   						login<br/>
								   						
	   					</div>
	   					<div class="modal-body">
	   						帐号：<input type="text" name="username"><br>
							密码：<input type="password" name="password">
	   					</div>
	   					<div class="modal-footer">
	   						<button class="btn btn-primary">login</button>
	   					</div>
	   				</div>
	   			</div>
	   		</div>
	   	</div>
	   </form>	
</body>
</html>
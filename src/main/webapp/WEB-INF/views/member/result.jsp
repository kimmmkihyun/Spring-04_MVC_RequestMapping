<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
member\result.jsp<br>

id1 : <%=request.getParameter("id") %> <br>
id2 : ${ param.id } <br>
id3 : ${ id } <br>
id4 : ${ requestScope.id } <br>
id5 : <%=request.getAttribute("id") %> <br>
<!-- 
model로 설정을 해서 넘기는 경우에는  param으로 받지 못한다.
id1 : null	
id2 :	   	
id3 : abc  따로  get으로 받지 않아도 알아서 받아서 출력
id4 : abc  request범위안에 있기때문
id5 : abc  requestset으로 설정했기 때문
 -->

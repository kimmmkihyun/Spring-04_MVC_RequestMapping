<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
member\list.jsp <br>

name1 : <%=request.getParameter("name") %> <br>
name2 : ${ param.name } <br>
name3 : ${ name } <br>
name4 : ${ requestScope.name } <br>
name5 : <%=request.getAttribute("name") %> <br>
<!-- 
model로 넘어오는 걸  받아서 출력할 때와 동일한 결과
name1 : null
name2 :
name3 : 태연
name4 : 태연
name5 : 태연
 -->
****************************<br>
pw1 : ${ pw } <br>
pw2 : ${ requestScope.pw } <br>
pw3 : <%=request.getAttribute("pw") %> <br>
 
 
 
 
 
 
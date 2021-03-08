<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>



<!DOCTYPE html>
<html>

<body>



	<h3>Introduction to JSTL!</h3>

<%--
<br>
<c:set var="testscore" scope="session" value="${80 }" />
<h2>output:<c:out value=" ${ testscore}"/></h2>

<br>
<c:if test="${testscore>=90 }">
	<p> Eligible For Scholarship</p>
	<h2><c:out value=" Your Score is :  ${ testscore}"/></h2>
	
</c:if>
<br>
<c:choose>
	
	<c:when test="${testscore>= 80 }">
	A grade student.
	</c:when>
	
	<c:when test="${testscore>=60 && testscore < 80 }">
	B grade student.
	</c:when>
	<c:otherwise>
	
	C grade student 
	
	</c:otherwise>
</c:choose>

<br>Printing from 1 to 5 <br>
<c:forEach var="i" begin="1" end="5"><br>
<c:out value= "${i }"/>
</c:forEach>

<%

List<String> studentNames = new ArrayList<String>();

studentNames.add("krishna");
studentNames.add("Arjun");
studentNames.add("Karana");
studentNames.add("Bhima");
studentNames.add("Bhishma");

request.setAttribute("sNames",studentNames );

%>
<c:forEach var = "student" items="${ sNames}"><br>
<c:out value="${student }"/>



</c:forEach>

<br>
<%--<c:remove var="testscore"/>
<h2>Output:<c:out value=" ${ testscore}"/></h2>
 --%> 
 
 ++++++++++++++++++++++++++++++++++++++++++++++++++++++
 <c:set var="accountBalance" value="797542.89980"/>
 
 <%-- <fmt:parseNumber var="i" type="number" value ="${accountBalance+10}"></fmt:parseNumber>--%>
 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 
 Formatting to Currency:
 <br><fmt:formatNumber var="i" type="currency" value ="${accountBalance+10}"/>
 <br>
 <c:out value="Balance : ${i }"/>
<br>
<br>
++++++++++++++++++++++++++++++++++++++++++
Formatting Decimal Value 
<br><fmt:formatNumber var="i" type="number"  value ="${accountBalance+10}"/>
 <br>
 <c:out value="Balance : ${i }"/>

<br>
++++++++++++++++++++++++++++++++++++++++++++
Formatting Decimal Value 
<br><fmt:formatNumber var="i" type="number" maxFractionDigits="1" value ="${accountBalance+10}"/>
 <br>
 <c:out value="Balance : ${i }"/>
+++++++++++++++++++++++++++++++++++++++++++++++
Formatting to Percentage
<c:set var ="marks" value="79.88"/>
<br><fmt:formatNumber var="marks" type="percent" maxFractionDigits="2" value ="${accountBalance+10}"/>
 <c:out value="percent : ${marks }"/>
 <br>
++++++++++++++++++++++++++++++++++++++++++++++
Date Format
<br>

<c:set var="myDate" value="03-03-2021"/>
<fmt:parseDate var="date" value="${myDate }" pattern="dd-mm-yyyy"></fmt:parseDate>
ParseDate:<c:out value="${date }"/>
 



</body>
</html>
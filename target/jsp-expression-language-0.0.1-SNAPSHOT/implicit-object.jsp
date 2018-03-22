<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<LINK REL=STYLESHEET HREF="./css/JSP-Styles.css" TYPE="text/css">
</head>
<body>
	<TABLE BORDER=5 ALIGN="CENTER">
		<TR>
			<TH CLASS="TITLE">Accessing Collections</TH>
		</TR>
	</TABLE>
	<P>
	<UL>
		<LI><B>test Request Parameter:</B> ${param.test}
		<LI><B>User-Agent Header:</B> ${header["User-Agent"]}
		<LI><B>JSESSIONID Cookie Value:</B> ${cookie.JSESSIONID.value}
		<LI><B>Server:</B> ${pageContext.servletContext.serverInfo}
	</UL>
</body>
</html>
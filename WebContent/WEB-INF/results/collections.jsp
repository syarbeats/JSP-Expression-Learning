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
		<LI>${first[0]} ${last[0]} (${company["Ellison"]})
		<LI>${first[1]} ${last[1]} (${company["Gates"]})
		<LI>${first[2]} ${last[2]} (${company["McNealy"]})
	</UL>
</body>
</html>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.util.Random"%>
<%@page import="java.io.BufferedReader"%>
<%@page import ="java.io.IOException" %>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.net.URL"%>
<%@page import="java.net.URLConnection"%> 
<%@page import=" java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try {
	String[] productsnames=(String[]) session.getAttribute("products");
	String orderid= (String)session.getAttribute("orderid");
	String orderamount=(String)session.getAttribute("orderAmount");
	String numbers="&numbers="+session.getAttribute("mno");
	String apikey = "apikey="+"J/3tSFgo948-P0Rz1PoY12DaMegAjtyERCrjYp4BsT";
	String message="&message="+"Ordered Placed:Your order for productname[0],productname[1]... with  (order id) amounting to (order amount) has been recieved.";
	String sender="&sender="+"KartIn";
	
	//int phonenumber=(Integer)session.getAttribute("phone");
	//String phoneNo=Integer.toString(phonenumber);
	//String numbers="&numbers="+"919919874779";
	//session.setAttribute("number",number);
	
	//creating connection
	HttpURLConnection con=(HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
	String data=apikey+numbers+message+sender;
	con.setDoOutput(true);
	con.setRequestMethod("POST");
	con.setRequestProperty("Content-Length", Integer.toString(data.length()));
	con.getOutputStream().write(data.getBytes("UTF-8"));
	final BufferedReader rd= new BufferedReader(new InputStreamReader(con.getInputStream()));
	StringBuffer sb = new StringBuffer();
	String line;
	while((line=rd.readLine())!=null) {
		sb.append(line);
	}rd.close();
	response.sendRedirect("order.jsp");	
}catch(Exception e) {
	e.printStackTrace();
		}
%>

</body>
</html>
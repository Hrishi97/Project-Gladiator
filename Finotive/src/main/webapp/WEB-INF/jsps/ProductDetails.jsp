<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<table border="1">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Cost</th>
			<th>Product All Details</th>
		</tr>
		<tr>
			<td>${requestScope.productDetail.product_id}</td>
			<td>${requestScope.productDetail.product_name}</td>
			<td>${requestScope.productDetail.product_cost}</td>
			<td>${requestScope.productDetail.product_all_details}</td>
		</tr>
	</table>
</body>
</html>
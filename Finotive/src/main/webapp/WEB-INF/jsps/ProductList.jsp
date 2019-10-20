<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="no-js" lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Products</title>
<link rel="stylesheet" href="/style.css" type="text/css">

</head>

<body>
	<!-- Navigation Bar -->
	<div class="topnav">
		<a href="home.hr">Home</a> <a class="active" href="/productList.hr">Product List</a>

		<div class="topnav-right">
			<a href="Register.html ">Register</a>
		</div>

		<div class="dropdown">
			<button class="dropbtn">Login</button>
			<div class="dropdown-content">
				<a href="login.html">User Login</a> <a href="admin.html">Admin Login</a>
			</div>
		</div>
	</div>
	
	<!-- Product List -->
	<br>
	<br>
	<div>
		<c:forEach items="${productList}" var="productList">
		<div class="list">
			<img src="<c:out value='${productList.imageblob}'/> width="230px"
				height="130px" href="productDetails.hr"><br> <b>${productList.product_name}</b><br>
			<br>
			
			<p>${productList.product_id}<br>${productList.product_cost}<br>${productList.product_brief_details}</p>
			<form method="post" action="productDetails.hr?id=${productList.product_id}">
				<button type="submit" class="form-button">Buy</button>
			</form>

		</div>
		</c:forEach>

		 <!-- <div class="list">
			<img src="C:\Users\AE206_PC7\Desktop\dshel\tv.jpg" width="200px"
				height="130px"><br> <b>TV</b><br>
			<br>
			<form method="get" action="prodinfo.html">
				<button type="submit" class="form-button">Buy</button>
			</form>
		</div>

		<div class="list">
			<img src="C:\Users\AE206_PC7\Desktop\dshel\apple.jpg" width="130px"
				height="130px"><br> <b>Mobiles </b><br>
			<br>
			<form method="get" action="prodinfo.html">
				<button type="submit" class="form-button">Buy</button>
			</form>
		</div>

		<div class="list">
			<img src="C:\Users\AE206_PC7\Desktop\dshel\beats.jpg" width="130px"
				height="130px"><br> <b>Headphones</b><br>
			<br>
			<form method="get" action="prodinfo.html">
				<button type="submit" class="form-button">Buy</button>
			</form>
		</div>

		<div class="list">
			<img src="C:\Users\AE206_PC7\Desktop\dshel\camera.jpg" width="140px"
				height="130px"><br> <b>Cameras</b><br>
			<br>
			<form method="get" action="prodinfo.html">
				<button type="submit" class="form-button">Buy</button>
			</form>
		</div> -->
		
	</div>
</body>
</html> 
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List</h1>
	<table border="1">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Cost</th>
			<th>Product Brief Details</th> 
			<!-- 
			<th>Product All Details</th>
			<th>Product Image(some raw text)</th>-->
		</tr>
		<!-- For loop -->
		<c:forEach items="${productList}" var="productList">
			<tr>
				<td>${productList.product_id}</td>
				<td>${productList.product_name}</td>
				<td>${productList.product_cost}</td>
				<td>${productList.product_brief_details}</td>
								
				<td>${productList.product_all_details}</td> 
				<td>${productList.imageblob}</td>
				<td><a href="productDetails.hr?id=${productList.product_id}">View</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html> --%>
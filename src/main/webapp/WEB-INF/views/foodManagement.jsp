<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Food Management</title>
<jsp:include page="./layout/headlink.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid program">
		<div class="wrapper container">
			<jsp:include page="./layout/header.jsp"></jsp:include>
			<div class="content">
				<div class="content_title text-center">
					<h2 class="color1">Food Management</h2>
				</div>
				<div class="main col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="row">
						<div class="col-lg-3 col-md-4 main_left">
							<jsp:include page="./layout/panel.jsp"></jsp:include>
						</div>
						<div class="col-lg-9 col-md-8 main_center">
							<div class="panel panel-default">
								<div class="panel-body">
									<div class="col-lg-12 col-md-12 form_header">
										<div
											class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
											<c:if test="${message eq 'Success' }">
												<div class="alert alert-success" role="alert">Success</div>
											</c:if>
											<c:if test="${message eq 'Fail' }">
												<div class="alert alert-danger" role="alert">Fail</div>
											</c:if>
											<spring:form
												action="${pageContext.request.contextPath}/food/${action}"
												method="post" modelAttribute="food" accept-charset="utf-8">
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="food_id">Food ID</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" name="food_id" id="food_id"
															value="${food.food_id }" class="form-control"
															required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="foodName">Food Name</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" name="foodName" id="foodName"
															value="${food.foodName }" class="form-control"
															required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="quantity">Quantity</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="number" name="quantity" id="quantity"
															value="${food.quantity }" class="form-control"
															required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4"></div>
													<div class="col-lg-8 col-md-8">
														<button type="submit" class="btn btn-primary">${submit}</button>
													</div>
												</div>
											</spring:form>
										</div>
									</div>
									<table class="table table-striped main_right_table text-center">
										<div class="col-lg-10 col-md-10">
											<spring:form action="#" method="post">
												<div class="input-group">
													<input type="text" class="form-control"
														placeholder="Food Name">
													<button class="btn btn-primary" type="submit">
														<i class="fa fa-search" aria-hidden="true"></i>
													</button>
												</div>
											</spring:form>
										</div>
										<thead>

											<tr>
												<th class="text-center">Food ID</th>
												<th class="text-center">Food Name</th>
												<th class="text-center">Quantity(gam)</th>
												<th class="text-center">Edit</th>
												<th class="text-center">Delete</th>
											</tr>

										</thead>
										<tbody>
											<c:forEach var="f" items="${foods }">
												<tr>
													<td>${f.food_id }</td>
													<td>${f.foodName }</td>
													<td>${f.quantity}</td>
													<td><a
														href="${pageContext.request.contextPath}/food/edit/${f.food_id}"
														title=""><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
													<td><a
														href="${pageContext.request.contextPath}/food/delete/${f.food_id}"
														title=""><i class="fa fa-trash-o" aria-hidden="true"></i></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<div class="text-center">
									<ul class="pagination">
										<li><a href="#">1</a></li>
										<li class="active"><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">4</a></li>
										<li><a href="#">5</a></li>
									</ul>
								</div>
								<!-- end-footer -->
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- end-content -->
		</div>
		<!-- end-wrapper -->
	</div>

	<!-- link fontawesome.js -->
	<script defer src="js/fontawesome-all.js"></script>

	<!-- link bootstrap.js -->
	<script defer src="js/bootstrap.min.js"></script>

</body>
</html>
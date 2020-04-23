<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="./layout/headlink.jsp"></jsp:include>
</head>
<body>

	<div class="container-fluid program">
		<div class="wrapper container">
			<div class="header">
				<jsp:include page="./layout/header.jsp"></jsp:include>
			</div>
			<!-- end-header -->
			<div class="content">
				<div class="content_title text-center">
					<h2 class="color1">Service Cost Management - List</h2>
				</div>
				<div class="main col-lg-12  col-md-12 col-sm-12 col-xs-12">
					<div class="row">
						<div class="col-lg-3 col-md-4 main_left">
							<jsp:include page="./layout/panel.jsp"></jsp:include>
						</div>
						<div class="col-lg-9 col-md-8 main_center">
							<div class="panel panel-default" style="padding-top: 24px;">
								<div class="panel-body">
									<div class="col-lg-12 col-md-12 form_header">
										<div
											class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
											<spring:form
												action="${pageContext.request.contextPath}/servicecost/${action}"
												method="post" modelAttribute="serviceCost"
												accept-charset="utf-8">
												<div class="col-lg-12 col-md-12 form_header_main2">
													<div class="col-lg-4 col-md-4">
														<label for="">Service Name</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main2">
														<select name="serviceCost.service" class="form-control">
															<c:forEach var="s" items="${serviceIds }">
																<c:if test="${s eq serviceCost.service.serviceId }">
																	<option selected="selected">${serviceCost.service.serviceId}</option>
																</c:if>
																<c:if test="${s ne serviceCost.service.serviceId }">
																	<option>${serviceCost.service.serviceId}</option>
																</c:if>

																<option>${s }</option>
															</c:forEach>
														</select>
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main2">
													<div class="col-lg-4 col-md-4">
														<label for="startTime">Start Time</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main2">
														<input type="text" name="startTime" id="startTime"
															class="form-control" required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main2">
													<div class="col-lg-4 col-md-4">
														<label for="servicePrice">Service Price</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main2">
														<input type="number" name="servicePrice" id="servicePrice"
															class="form-control" required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main2">
													<div class="col-lg-4 col-md-4">
														<label for="">Quantity</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main2">
														<input type="number" name="" class="form-control"
															required="true">
													</div>
												</div>

												<div class="col-lg-12 col-md-12 form_header_main2">
													<div class="col-lg-4 col-md-4">
														<label for="quantity">Start Date</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main2">
														<input type="date" name="quantity" id="quantity"
															class="form-control" required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main2">
													<div class="col-lg-4 col-md-4"></div>
													<div class="col-lg-8 col-md-8">
														<button type="submit" class="btn btn-primary">${submit }</button>
													</div>
												</div>
											</spring:form>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-12 col-md-12">
							<div class="panel panel-default">
								<div class="panel-body">
									<table class="table table-striped main_right_table text-center">
										<div>
											<form action="#" method="post">
												<div class="input-group">
													<input type="text" class="form-control"
														placeholder="Enter Service ID"> <span
														class="input-group-btn">
														<button class="btn btn-primary" type="submit">
															<i class="fa fa-search" aria-hidden="true"></i>
														</button>
													</span>
												</div>
												<!-- /input-group -->
											</form>
										</div>
										<thead>
											<tr>
												<th class="text-center">Service ID</th>
												<th class="text-center">Start Time</th>
												<th class="text-center">Service Price</th>
												<th class="text-center">Quantity</th>
												<th class="text-center">Start Date</th>
												<th class="text-center">Edit</th>
												<th class="text-center">Delete</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="s" items="">
												<tr>
													<td>${s.service.seriveId }</td>
													<td>${s.startTime }</td>
													<td>${s.servicePrice }</td>
													<td>${quantity }td>
													<td>${s.startDate }</td>
													<td><a
														href="${pageContext.request.contextPath}/cost/edit/${s.id}"
														title=""><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
													<td><a
														href="${pageContext.request.contextPath}/cost/delete/${s.id}"
														title=""><i class="fa fa-trash-o" aria-hidden="true"></i></a></td>
												</tr>

											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<div class="footer container text-center">
							<ul class="pagination">
								<li><a href="#">1</a></li>
								<li class="active"><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<!-- end-content -->
		</div>
		<!-- end-wrapper -->
	</div>
</body>
</html>
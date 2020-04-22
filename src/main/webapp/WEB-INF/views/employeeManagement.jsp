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
					<h2 class="color1">Employee Management - List</h2>
				</div>
				<div class="main col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="row">
						<div class="col-lg-3 col-md-4 main_left">
							<div class="panel panel-default">
								<jsp:include page="./layout/panel.jsp"></jsp:include>
							</div>
						</div>
						<div class="col-lg-9 col-md-8 main_center">
							<div class="panel panel-default" style="padding-top: 18px;">
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
												action="${pageContext.request.contextPath}/employee/${action}"
												method="post" modelAttribute="employee"
												accept-charset="utf-8">
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="employee_id">Employee ID</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" id="employee_id" name="employee_id"
															value="${employee.employee_id }" class="form-control"
															required="true"> <br>
														<spring:errors path="employee_id" cssClass="error" />
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="employeeName">Employee Name</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" id="employeeName" name="employeeName"
															value="${employee.employeeName }" class="form-control"
															required="true"> <br>
														<spring:errors path="employeeName" cssClass="error" />
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="sex">Sex</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="radio" id="male" name="sex" value="MALE"
															checked> <label class="label_checkbox" for="male">MALE</label>
														&nbsp; &nbsp;&nbsp; <input type="radio" id="FEMALE"
															name="sex" value="FEMALE"> <label
															class="label_checkbox" for="female">FEMALE</label>
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="phoneNumber">Phone number</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" name="phoneNumber" id="phoneNumber"
															value="${employee.phoneNumber }" class="form-control"
															required="true"> <br>
														<spring:errors path="phoneNumber" cssClass="error" />
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="address">Address</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" id="address" name="address"
															value="${employee.address }" class="form-control"
															required="true"> <br>
														<spring:errors path="address" cssClass="error" />
													</div>
												</div>

												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="">Position</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<select class="form-control" name="position">
															<c:forEach items="${positions}" var="p">
																<c:if test="${p == employee.position}">
																	<option value="${employee.position}" selected>${employee.position}</option>
																</c:if>
																<c:if test="${p != position}">
																	<option value="${p}">${p}</option>
																</c:if>
															</c:forEach>

														</select>
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
								</div>
							</div>
						</div>
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="panel panel-default">
								<div class="panel-body">
									<table class="table table-striped main_right_table text-center">
										<div class="col-lg-12 col-md-12">
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
										</div>
										<thead>
											<tr>
												<th class="text-center">Employee ID</th>
												<th class="text-center">Employee Name</th>
												<th class="text-center">Sex</th>
												<th class="text-center">Phone number</th>
												<th class="text-center">Address</th>
												<th class="text-center">Position</th>
												<th class="text-center">Edit</th>
												<th class="text-center">Delete</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="e" items="${employees}">
												<tr>
													<td>${e.employee_id}</td>
													<td>${e.employeeName}</td>
													<td>${e.sex}</td>
													<td>${e.phoneNumber}</td>
													<td>${e.address}</td>
													<td>${e.position}</td>
													<td><a
														href="${pageContext.request.contextPath}/employee/edit/${e.employee_id}"
														title=""><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
													<td><a
														href="${pageContext.request.contextPath}/employee/delete/${e.employee_id}"
														title=""><i class="fa fa-trash-o" aria-hidden="true"></i></a></td>
												</tr>
											</c:forEach>


										</tbody>
									</table>
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
			</div>
		</div>
		<!-- end-content -->
	</div>
	<!-- end-wrapper -->
	</div>
</body>
</html>
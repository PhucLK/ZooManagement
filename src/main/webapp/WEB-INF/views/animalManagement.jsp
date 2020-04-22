<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
			<jsp:include page="./layout/header.jsp"></jsp:include>
			<div class="content">
				<div class="content_title text-center">
					<h2 class="color1">Animal Management List</h2>
				</div>
				<div class="main col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="row">
						<div class="col-lg-3 col-md-4 main_left">
							<jsp:include page="./layout/panel.jsp"></jsp:include>
						</div>
						<div class="col-lg-9 col-md-8 main_center">
							<div class="panel panel-default" style="padding-top: 25px;">
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
												action="${pageContext.request.contextPath}/animal/${action }"
												method="post" modelAttribute="animal" accept-charset="utf-8">
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="animal_id">Animal ID</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" id="animal_id" name="animal_id"
															value="${animal.animal_id}" class="form-control"
															required="true"><br>
														<spring:errors path="animal_id" cssClass="error" />
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="animalName">Animal Name</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="text" id="animalName" name="animalName"
															value="${animal.animalName }" class="form-control"
															required="true"> <br>
														<spring:errors path="animal_id" cssClass="error" />
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
														<label for="weight">Weight</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="tel" id="weight" name="weight"
															value="${animal.weight }" class="form-control"
															required="true"> <br>
														<spring:errors path="animal_id" cssClass="error" />
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="animalType">Animal Type</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<select name="animal.animalType.animalTypeId"
															class="form-control">
															<c:forEach var="a" items="${animalTypes}">
																<c:if test="${a eq animal.animalType.animalTypeName}">
																	<option value="${animal.animalType.animalTypeName}"
																		selected>${animal.animalType.animalTypeName}</option>
																</c:if>
																<c:if test="${a ne animal.animalType.animalTypeName}">
																	<option value="${a}">${a}</option>
																</c:if>
															</c:forEach>
														</select>
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="">Employee ID</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<select name="animal.employee.employee_id"
															class="form-control">
															<c:forEach items="${employee_ids}" var="e">
																<c:if test="${e eq animal.employee.employee_id}">
																	<option value="${animal.employee.employee_id}" selected>${animal.employee.employeeName}</option>
																</c:if>
																<c:if test="${e ne animal.employee.employee_id}">
																	<option value="${e}">${e}</option>
																</c:if>
															</c:forEach>
														</select>
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4 col-md-4"></div>
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
						<div class="col-lg-12 col-md-12">
							<div class="panel panel-default">
								<div class="panel-body">
									<div class="col-lg-12 col-md-12">
										<div class="col-lg-10 col-md-10">
											<spring:form
												action="${pageContext.request.contextPath}/animal/search"
												method="post">
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
									<table class="table table-striped main_right_table text-center">

										<thead>
											<tr>
												<th class="text-center">Animal ID</th>
												<th class="text-center">Animal Name</th>
												<th class="text-center">Sex</th>
												<th class="text-center">Food</th>
												<th class="text-center">Animal type</th>
												<th class="text-center">Employee ID</th>
												<th class="text-center">Edit</th>
												<th class="text-center">Delete</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="a" items="${animals }">
												<tr>
													<td>${a.animal_id }</td>
													<td>${a.animalName }</td>
													<td>${a.sex }</td>
													<td>${a.food.foodName }</td>
													<td>${a.animalType.animalTypeName }</td>
													<td>${a.employee.employee_id }</td>
													<td><a
														href="${pageContext.request.contextPath}/animal/edit/${a.animal_id}"
														title=""><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
													<td><a
														href="${pageContext.request.contextPath}/animal/delete/${a.animal_id}"
														title=""><i class="fa fa-trash-o" aria-hidden="true"></i></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<jsp:include page="./layout/footer.jsp"></jsp:include>
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
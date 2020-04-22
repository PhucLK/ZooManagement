<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:include page="./layout/headlink.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid program">
		<div class="wrapper container" style="padding-bottom: 120px;">
			<jsp:include page="./layout/header.jsp"></jsp:include>
			<div class="content">
				<div class="content_title text-center">
					<h2 class="color1">Animal Type Management - List</h2>
				</div>
				<div class="main col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="row">
						<div class="col-lg-3 col-md-4 main_left">
							<jsp:include page="./layout/panel.jsp"></jsp:include>
						</div>
						<div class="col-lg-9 col-md-8 main_center">
							<div class="panel panel-delfault">
								<div class="panel-body">
									<div class="col-lg-12 col-md-12 form_header">
										<div class="col-lg-8 col-lg-offset-2 ">
											<c:if test="${message eq 'Success' }">
												<div class="alert alert-success" role="alert">Success</div>
											</c:if>
											<c:if test="${message eq 'Fail' }">
												<div class="alert alert-danger" role="alert">Fail</div>
											</c:if>
											<spring:form
												action="${pageContext.request.contextPath}/animaltype/${action}"
												modelAttribute="animalType" method="post"
												accept-charset="utf-8">
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-5 col-md-5">
														<label for="animalTypeId">Animal Type ID</label>
													</div>
													<div class="col-lg-7 col-md-7 form_header_main">
														<input type="text" id="animalTypeId" name="animalTypeId"
															value="${animalType.animalTypeId }" class="form-control"
															required="required"> <br>
														<spring:errors path="animalTypeId" cssClass="error" />
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-5 col-md-5">
														<label for="animalTypeName">Animal Type Name</label>
													</div>
													<div class="col-lg-7 col-md-7">
														<input type="text" id="animalTypeName"
															value="${animalType.animalTypeName }"
															name="animalTypeName" required="required"
															class="form-control"> <br>
														<spring:errors path="animalTypeName" cssClass="error" />
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-5 col-md-5"></div>
													<div class="col-lg-7 col-md-7">
														<button type="submit" class="btn btn-primary">${submit}</button>
													</div>
												</div>
											</spring:form>
										</div>
									</div>

									<table class="table table-striped main_right_table text-center">
										<div class="col-lg-12 col-md-12" >
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
												<th class="text-center">Animal ID</th>
												<th class="text-center">Animal Name</th>
												<th class="text-center">Edit</th>
												<th class="text-center">Delete</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="a" items="${animalTypes }">
												<tr>
													<td>${a.animalTypeId }</td>
													<td>${a.animalTypeName }</td>
													<td><a
														href="${pageContext.request.contextPath}/animaltype/edit/${a.animalTypeId}"
														title=""><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
													<td><a
														href="${pageContext.request.contextPath}/animaltype/edit/${a.animalTypeId}"
														title=""><i class="fa fa-trash-o" aria-hidden="true"></i></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<div class="text-center">
									<jsp:include page="./layout/footer.jsp"></jsp:include>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
			<!-- end-content -->
			<!-- end-footer -->
		</div>
		<!-- end-wrapper -->
	</div>
</body>
</html>
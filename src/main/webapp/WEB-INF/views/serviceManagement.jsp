<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
					<h2 class="color1">Service Management - List</h2>
				</div>
				<div class="main col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="row">
						<div class="col-lg-3 col-md-4 main_left">
							<div class="panel panel-default">
								<jsp:include page="./layout/panel.jsp"></jsp:include>
							</div>
						</div>
						<div class="col-lg-9 col-md-8 main_center">
							<div class="panel panel-default"
								style="padding-top: 27px; padding-bottom: 25px;">
								<div class="panel-body">
									<div class="col-lg-12 col-md-12 form_header">
										<div class="col-lg-8 col-lg-offset-2 col-md-11">
											<spring:form action="index_submit" method="get"
												accept-charset="utf-8">
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="">Service ID</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="tel" name="" class="form-control"
															required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="">Service Name</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<input type="tel" name="" class="form-control"
															required="true">
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="">Animal ID</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<select class="form-control">
															<option>TN01</option>
															<option>TN02</option>
															<option>TN03</option>
															<option>TN04</option>
														</select>
													</div>
												</div>

												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4">
														<label for="">Description</label>
													</div>
													<div class="col-lg-8 col-md-8 form_header_main">
														<textarea rows="5" class="form-control"></textarea>
													</div>
												</div>
												<div class="col-lg-12 col-md-12 form_header_main">
													<div class="col-lg-4 col-md-4"></div>
													<div class="col-lg-8 col-md-8">
														<button type="submit" class="btn btn-primary">Add</button>
														&nbsp;&nbsp;
														<button type="submit" class="btn btn-primary">Edit</button>
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
									<table id="serviceTable"
										class="table table-striped main_right_table text-center">
										<caption class="text-center table_title">
													<div
														class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3">
														<form action="#" method="post">
															<div class="input-group">
																<input type="text" class="form-control"
																	placeholder="Enter Service Name"> <span
																	class="input-group-btn">
																	<button class="btn btn-primary" type="submit">
																		<i class="fas fa-search"></i>
																	</button>
																</span>
															</div>
															<!-- /input-group -->
														</form>
													</div>
										</caption>
										<thead>
											<tr>
												<th class="text-center">Service ID</th>
												<th class="text-center">Service Name</th>
												<th class="text-center">Animal ID</th>
												<th class="text-center">Description</th>
												<th class="text-center">Image</th>
												<th class="text-center">Edit</th>
												<th class="text-center">Delete</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>DV01</td>
												<td>Cưỡi ngựa</td>
												<td>LVN01</td>
												<td>Cưỡi ngựa xem hoa</td>
												<td>
													<div id="image-holder" class="col-md-6">
														<img id="my_image0" style="width: 120px" height="120px"
															alt="hinhanh" src='img/anh1.jpg' />
													</div>
													<div class="col-md-6" style="margin-top: 15px;">
														<label for="fileUpload0"
															class="btn btn-primary btn-block btn-outlined">Choose
															Img</label> <input id="fileUpload0" name="file" type="file"
															onchange="return showImg(this,0)" accept="image/*"
															style="display: none"> <br> <input
															type="hidden" name="idServiceUpdateImg"
															value=${service.serviceId }>
														<button type="submit" class="btn btn-info">Update
															Image</button>
													</div>
												</td>
												<td><a href="#" title=""><i class='fas'>&#xf044;</i></a></td>
												<td><a href="#" title=""><i
														class='fas fa-trash-alt'></i></a></td>
											</tr>

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
	<!-- link fontawesome.js -->
	<script defer src="js/fontawesome-all.js"></script>

	<!-- link bootstrap.js -->
	<script defer src="js/bootstrap.min.js"></script>
	<script src="js/anologclock.js"></script>
	<!-- -------------------- -->
	<script>
		function showImg(r, index) {
			var countFiles = r.files.length;
			var imgPath = r.value;
			var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1)
					.toLowerCase();
			if (extn == "gif" || extn == "png" || extn == "jpg"
					|| extn == "jpeg") {
				if (typeof (FileReader) != "undefined") {
					for (var i = 0; i < countFiles; i++) {
						var reader = new FileReader();
						reader.onload = function(e) {
							$('#my_image' + index).attr("src", e.target.result);
						}
						reader.readAsDataURL(r.files[i]);
					}
				} else {
					alert("This browser does not support FileReader.");
					return false;
				}
			} else {
				alert("Pls select only images");
				return false;
			}
		}
	</script>
</body>
</html>
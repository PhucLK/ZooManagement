<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

			<div class="header">
				<div class="menu1 text-center">
					<ul class="list-inline">
						<li>
							<a href="#">HOME</a> |
						</li>
						<li>
							&nbsp; <a href="#">ZOO MAP</a> |
						</li>
						<li>
							&nbsp; <a href="#">EVENT</a> |
						</li>
					</ul>
				</div>
				<div class="logo container">
					<div class="col-lg-3 col-md-3  logo_img">
						<img src="${pageContext.request.contextPath}/resources/img/zoo.jpg" alt="logo" class="img-responsive">
					</div>
					<div class="col-lg-6 col-md-6 logo_title" style="padding-top: 68px;">
						<h3>Open from 9.00am to 6.00pm</h3>
					</div>
					<div class="col-lg-3 col-md-3 ">
						<!-- 	<canvas id="canvas" width="210px" height="210px" ></canvas> -->
					</div>
				</div>
				<nav class="navbar navbar-inverse">
					<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="animalTypeManagement.html">Home Page</a>
						</div>

						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li class=""><a href="serviceList.html">Service<span class="sr-only">(current)</span></a></li>
								<li><a href="">Animal</a></li>
								<li><a href="#">Management</a></li>
								<li><a href="#">Membership</a></li>

							</ul>
							<ul class="nav navbar-nav navbar-right">
								<li><a href="#">Hello, Admin</a></li>
								<li><a href="#"><i class="fas fa-sign-out-alt"></i> Logout</a></li>
							</ul>
						</div><!-- /.navbar-collapse -->
					</div><!-- /.container-fluid -->
				</nav>
			</div> <!-- end-header -->
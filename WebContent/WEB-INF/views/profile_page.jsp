<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.mfm_app.entities.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous" />
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="/mfm_app/resources/css/profile_page.css" />


<title>My Profile</title>
</head>
<body>

	<%@ include file="nav.jsp"%>
	<div class="bigwords">
		<h1>My stats</h1>
	</div>
	<div class="container ">
		<div class="main-body">



			<div class="row justify-content-center">
				<div class="col-md-8">
					<div class="card mb-3">
						<div class="card-body">
							<div class="row">
								<div class="col-sm-3">
									<h6 class="mb-0">Username</h6>
								</div>
								<div class="col-sm-9 text-secondary">${user.username}</div>
							</div>
							<hr>
							<div class="row">
								<div class="col-sm-3">
									<h6 class="mb-0">Total Weight lifted</h6>
								</div>
								<div class="col-sm-9 text-secondary">
									<c:choose>
										<c:when test="${ user.total_weight_lifted  == null}">
                    						You haven't logged a workout yet
                    					</c:when>
										<c:otherwise>
                    						${user.total_weight_lifted }
                   					</c:otherwise>
									</c:choose>

								</div>
							</div>
							<hr>
							<div class="row">
								<div class="col-sm-3">
									<h6 class="mb-0">Average Weight Lifted</h6>
								</div>
								<div class="col-sm-9 text-secondary">
									<c:choose>
										<c:when test="${ user.total_workouts  == null}">
                    						You haven't logged a workout yet
                   						 </c:when>
										<c:otherwise>
                   							 ${user.total_weight_lifted/user.total_workouts }
                    					</c:otherwise>
									</c:choose>
								</div>
							</div>

						</div>
					</div>
					<div class="row gutters-sm">
						<div class="col-sm-6 mb-3">
							<div class="card h-100">
								<div class="card-body">
									<h6 class="d-flex align-items-center mb-3">
										<i class="material-icons text-info mr-2">assignment</i>Project
										Status
									</h6>
									<small>Web Design</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 80%" aria-valuenow="80" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>Website Markup</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 72%" aria-valuenow="72" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>One Page</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 89%" aria-valuenow="89" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>Mobile Template</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 55%" aria-valuenow="55" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>Backend API</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 66%" aria-valuenow="66" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-sm-6 mb-3">
							<div class="card h-100">
								<div class="card-body">
									<h6 class="d-flex align-items-center mb-3">
										<i class="material-icons text-info mr-2">assignment</i>Project
										Status
									</h6>
									<small>Web Design</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 80%" aria-valuenow="80" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>Website Markup</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 72%" aria-valuenow="72" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>One Page</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 89%" aria-valuenow="89" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>Mobile Template</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 55%" aria-valuenow="55" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
									<small>Backend API</small>
									<div class="progress mb-3" style="height: 5px">
										<div class="progress-bar bg-primary" role="progressbar"
											style="width: 66%" aria-valuenow="66" aria-valuemin="0"
											aria-valuemax="100"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="d-flex row justify-content-center">
						<button class="btn btn-outline-secondary btn-lg " type="button"
							onclick="location.href='workout'">Start New Workout</button>
					</div>

				</div>

			</div>
		</div>
	</div>
</body>
</html>

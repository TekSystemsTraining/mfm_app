<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
<link rel="stylesheet" type="text/css"
	href="/mfm_app/resources/css/workout.css" />
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

<title>Workout</title>
</head>
<body>

	<%@ include file="nav.jsp"%>
	<div class="bigwords">
		<h1>Workout Tracker</h1>
	</div>

	<div class="about" id="grid">
		<div class="container" style="width: 50rem">
			<div class="description"></div>
			<div class="exercise-container">


				<div class="container">
					<div class="row">
						<div class="col">
							<select name="category">
								<option value="-" selected="selected">please select an
									exercise</option>
								<c:forEach items="${exercises}" var="exercise">
									<option value="${exercise}">${exercise}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col">
							<div class="row">
								<label class="col">Reps</label> <label class="col">Weight</label>
								<label class="col">Total</label>
							</div>
							<div class="row">
								<input class="col-sm" id="1-1-1" /> <input class="col-sm"
									id="1-1-2" /> <input class="col-sm" id="1-1-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="1-2-1" /> <input class="col-sm"
									id="1-2-2" /> <input class="col-sm" id="1-2-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="1-3-1" /> <input class="col-sm"
									id="1-3-2" /> <input class="col-sm" id="1-3-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="1-4-1" /> <input class="col-sm"
									id="1-4-2" /> <input class="col-sm" id="1-4-3" disabled />
							</div>
							<div class="d-flex justify-content-between total_button">
								<div>
									<button onclick="total_exercise(1)"
										class="btn btn-outline-secondary btn-lg " type="button">View
										Totals</button>
								</div>
								<div>
									Total:<b id="ex-total-1"></b>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="exercise-container">


				<div class="container">
					<div class="row">
						<div class="col">
							<select name="category">
								<option value="-" selected="selected">please select an
									exercise</option>
								<c:forEach items="${exercises}" var="exercise">
									<option value="${exercise}">${exercise}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col">
							<div class="row">
								<label class="col">Reps</label> <label class="col">Weight</label>
								<label class="col">Total</label>
							</div>
							<div class="row">
								<input class="col-sm" id="2-1-1" /> <input class="col-sm"
									id="2-1-2" /> <input class="col-sm" id="2-1-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="2-2-1" /> <input class="col-sm"
									id="2-2-2" /> <input class="col-sm" id="2-2-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="2-3-1" /> <input class="col-sm"
									id="2-3-2" /> <input class="col-sm" id="2-3-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="2-4-1" /> <input class="col-sm"
									id="2-4-2" /> <input class="col-sm" id="2-4-3" disabled />
							</div>
							<div class="d-flex justify-content-between total_button">
								<div>
									<button onclick="total_exercise(2)"
										class="btn btn-outline-secondary btn-lg " type="button">View
										Totals</button>
								</div>
								<div>
									Total:<b id="ex-total-2"></b>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="exercise-container">


				<div class="container">
					<div class="row">
						<div class="col">
							<select name="category">
								<option value="-" selected="selected">please select an
									exercise</option>
								<c:forEach items="${exercises}" var="exercise">
									<option value="${exercise}">${exercise}</option>
								</c:forEach>
							</select>
						</div>
						<div class="col">
							<div class="row">
								<label class="col">Reps</label> <label class="col">Weight</label>
								<label class="col">Total</label>
							</div>
							<div class="row">
								<input class="col-sm" id="3-1-1" /> <input class="col-sm"
									id="3-1-2" /> <input class="col-sm" id="3-1-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="3-2-1" /> <input class="col-sm"
									id="3-2-2" /> <input class="col-sm" id="3-2-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="3-3-1" /> <input class="col-sm"
									id="3-3-2" /> <input class="col-sm" id="3-3-3" disabled />
							</div>
							<div class="row">
								<input class="col-sm" id="3-4-1" /> <input class="col-sm"
									id="3-4-2" /> <input class="col-sm" id="3-4-3" disabled />
							</div>
							<div class="d-flex justify-content-between total_button">
								<div>
									<button onclick="total_exercise(3)"
										class="btn btn-outline-secondary btn-lg " type="button">View
										Totals</button>
								</div>
								<div>
									Total:<b id="ex-total-3"></b>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="d-flex row justify-content-center workout_submit">
				<button class="btn btn-outline-secondary btn-lg " type="button">Submit
					Workout</button>

			</div>
		</div>
	</div>

</body>
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/mfm_app/resources/js/workout.js"></script>
</html>

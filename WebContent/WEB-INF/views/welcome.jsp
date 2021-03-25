<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" type= "text/css" href="/mfm_app/resources/css/welcome.css" >
<script type="text/javascript" src="/mfm_app/resources/js/welcome.js"></script>
    <style>
        body{
            background-color: dimgray;
        }
      .login-form {
        width: 340px;
        margin: 50px auto;
      }
      .login-form form {
        margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
      }
      .login-form h2 {
        margin: 0 0 15px;
      }
      .form-control,
      .btn {
        min-height: 38px;
        border-radius: 2px;
      }
      .btn {
        font-size: 15px;
        font-weight: bold;
      }
    </style>
<title>Insert title here</title>
</head>
<body>
<h1 id="heading"> we doing the things fam</h1>

<form role="form" class="card login-form px-2 py-2" action="moving_on" style="width: 18rem;">
	<div class="row">
		<div class="col">
			<label for="inputEmail">email</label>
			<input type="email" class="form-control" id="inputEmail" placeholder="enter email">
		</div>
		<div class="col">
			<label for="inputPassword">Password</label>
			<input type="password" class="form-control" id="inputPassword" placeholder="password">
		</div>
	</div>
	<div class="form-group">
		<label for="inputFile">File input</label>
		<input type="file" id="inputFile">
		<p class = "help-block">Example block level help text</p>
	</div>
	<div class="checkbox">
		<label>
			<input type="checkbox">check me out
		</label>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
</form>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Weather Service</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Weather Service</h1>
				<p>Report Page</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-md-5">
				<p>
					<strong>City</strong> : ${weatherReport.cityName}
				</p>
				<p>
					<strong>State</strong> : ${weatherReport.stateName}
				</p>
				<p>
					<strong>Temprature</strong> : ${weatherReport.temprature} F
				</p>

				<p >
					<a href="<spring:url value="/" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> back
					</a>
				</p>
			</div>
		</div>
	</section>
</body>
</html>
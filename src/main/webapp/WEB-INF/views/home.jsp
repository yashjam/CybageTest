<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

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
				<p>Home Page</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="weatherReport" class="form-horizontal">
			<form:errors path="*" cssClass="alert alert-danger" element="div"/>
			<fieldset>
				<legend>Enter the zip code</legend>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="zipCode"><spring:message
							code="weatherReport.form.zipCode.label" /></label>
					<div class="col-lg-10">
						<form:input id="zipCode" path="zipCode" type="text"
							class="form:input-large" />
						<form:errors path="zipCode" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Weather Report" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>
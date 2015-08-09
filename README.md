# weatherReporter
Weather service Application

How to run?
1. Import project in eclipse as - Existing Maven Projects.
2. Update dependencies mentioned in pom.xml
3. Run as - Maven Install to build application
4. Use tomcat to run application.
Home Page: http://localhost:8080/weatherReporter

------------------------------------------
Unit Testing:
------------------------------------------
Prerequisite:- As application uses API to get weather data. Please make sure internet connection is up.

 Junit test1: WeatherTest1.java
 Expected: This test case should pass. 
 Because zipCode 11111 does not exist. Method should throw exception.
 
 Junit test2: WeatherTest2.java
  Expected: This test case should fail. 
  Because zipCode 22222 does exist. And method should not throw exception.
 
 Junit test3: WeatherTest3.java
  Expected: This test case should pass. 
  Because zipCode 22222 exists.

set JAVA_HOME=c:\Java\jdk1.8.0_172
REM This variable is for picking up the portal security services 
set deployment.environment=dev
set DB_PASS=root
cd C:\Users\sony\eclipse-workspace\SpringBootJdbcCrud

java -jar target\SpringBootJdbcCrud-0.0.1-SNAPSHOT.jar --spring.config.location="C:\Users\sony\eclipse-workspace\SpringBootJdbcCrud\deploy\eccomerceapi.properties" --spring.profiles.active=local -Djavax.net.ssl.keyStore=C:\Java\jdk1.8.0_172\jre\lib\security\cacerts -Djavax.net.debug=all
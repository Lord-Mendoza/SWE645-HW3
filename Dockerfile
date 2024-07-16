# Lord Mendoza
# SWE 645 - HW3
# The following file pulls the latest tomcat image, puts the warfile in its webapps folder, then calls tomcat to run.

FROM tomcat:10.1.14-jdk17
COPY /target/hw3-latest.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
#FROM tomcat:9.0
#COPY target/greenland-sso-server-1.0.0-SNAPSHOT.war /usr/local/tomcat/webapps
#ENV JAVA_OPTS -Djava.security.egd=file:/dev/./urandom
#USER root
#EXPOSE 8081
#CMD ["catalina.sh", "run"]

#
#FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME /tmp
#ADD greenland-sso-server-1.0.0-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD  greenland-sso-server-1.0.0-SNAPSHOT.jar greenland-sso.jar
RUN sh -c 'touch /greenland-sso.jar'
ENV JAVA_OPTS=""
EXPOSE 8081
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /greenland-sso.jar" ]

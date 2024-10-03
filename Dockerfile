FROM adoptopenjdk:11-jre-hotspot
ENV TZ=America/Guayaquil
RUN cp /usr/share/zoneinfo/America/Guayaquil /etc/localtime && echo "America/Guayaquil"
COPY target/tcs-backend-0.0.1-SNAPSHOT.jar /app/tcs-backend-0.0.1-SNAPSHOT.jar
ENV JAVA_TOOL_OPTIONS="-Xms1024M -Xmx2048M -XX:MaxMetaspaceSize=2048M"

ENTRYPOINT ["java", "-jar", "/app/tcs-backend-0.0.1-SNAPSHOT.jar", "--server.port=8080"]
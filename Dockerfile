FROM openjdk:11

COPY target/transaction-management.jar transaction-management.jar

EXPOSE 8098

ENTRYPOINT ["java", "-jar", "/transaction-management.jar"]
FROM openjdk:11

COPY target/TransactionManagement.jar

EXPOSE 8098

ENTRYPOINT ["java", "-jar", "/TransactionManagement.jar"]
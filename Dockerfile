FROM openjdk:8
ADD build/libs/rm-groovy-app-0.0.1-SNAPSHOT.jar rm-groovy-app-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","rm-groovy-app-0.0.1-SNAPSHOT.jar"]
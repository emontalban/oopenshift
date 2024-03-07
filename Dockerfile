# Usa la imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Copia el archivo JAR desde el directorio target de tu proyecto
COPY "./target/openshift2-0.0.1-SNAPSHOT.jar" "app.jar"

# Expone el puerto 8080, que probablemente sea el puerto en el que tu aplicación Spring Boot escucha
EXPOSE 8080

# Comando de entrada para ejecutar la aplicación al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]
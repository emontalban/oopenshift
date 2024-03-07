
# Establecer la imagen base con una etiqueta específica
FROM openjdk:17-jdk-slim-buster

# Crear un usuario no-root
RUN addgroup --system appgroup && adduser --system --no-create-home --ingroup appgroup appuser

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR desde el directorio target de tu proyecto
COPY "./target/openshift2-0.0.1-SNAPSHOT.jar" "app.jar"

# Cambiar la propiedad del archivo JAR al usuario no-root
RUN chown appuser:appgroup app.jar

# Cambiar al usuario no-root
USER appuser

# Exponer el puerto 8080, que probablemente sea el puerto en el que tu aplicación Spring Boot escucha
EXPOSE 8080


# Comando de entrada para ejecutar la aplicación al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]
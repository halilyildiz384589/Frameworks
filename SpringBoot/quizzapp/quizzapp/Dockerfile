# Basic image ı aldık
FROM openjdk:17-jdk-slim

# Çalışma dizini oluşturduk
WORKDIR /app

# Jar dosyasını kopyalıyoruz
COPY ./target/quizzapp-0.0.1-SNAPSHOT.jar app.jar

# Uygulamayı çalıştırıyoruz
ENTRYPOINT ["java", "-jar", "app.jar"]

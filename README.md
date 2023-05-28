### CodegGems is a Java Blog application made with java 17.0.7, Spring-boot 3.1.0, mySQL and Thymeleaf

<h2>Installation</h2>

1- Clone the repository:
```
git clone https://github.com/JoaoHr1/CodeGems.gi
```

2- Navigate to the project directory:
```
cd CodeGems
```

3- Build the application with Maven:
```
mvn clean package
```

4- Create a MySQL database for the application:
```
spring.datasource.url=jdbc:mysql://localhost:3306/db_codegems
spring.datasource.username=your_username
spring.datasource.password=your_password
```

5- Run the application:
```
mvn spring-boot:run
```

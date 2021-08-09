# ACTUATOR METRICS PROMETHEUS


## Desarrollo.

este desarrollo es para realizar pruebas de las metricas exportadas por las dependencias habilitadas para monitoreo de recursos de un desarrollo en spring.

Agregar dependencias maven al pom.xml

``
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
	<groupId>io.micrometer</groupId>
	<artifactId>micrometer-registry-prometheus</artifactId>
	<version>1.5.1</version>
</dependency>

``

Activar endpoint de prometheus de forma estandar adicionando las siguientes lineas al application.properties

``
server.port=80
spring.datasource.url=jdbc:h2:mem:test
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=h2user
spring.datasource.password=h2passwd

spring.h2.console.enabled=true
# default path: h2
spring.h2.console.path=/h2

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto= update

## Required for 
management.endpoints.web.exposure.include=metrics,prometheus,health

``

Proyecto java: UserManager
Java version: jdk 8
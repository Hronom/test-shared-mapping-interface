# test-shared-mapping-interface
This projects tests feature [Feign Inheritance Support](http://projects.spring.io/spring-cloud/spring-cloud.html#spring-cloud-feign-inheritance)

* `eureka-server` - standalone Eureka server
* `test-user-service` - user service that provides retrieving of user. [Swagger UI](http://localhost:8103/swagger-ui.html#/)
*  `test-user-processing-service` - asks `test-user-service` for users. [Swagger UI](http://localhost:8104/swagger-ui.html#/)
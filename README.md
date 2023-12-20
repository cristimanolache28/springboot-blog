This project was made using Spring Boot, Spring Security 6, JWT, Spring Data JPA, Hibernate, MySQL, Docker & Deploy on AWS. 


##Technology Stack:
Java platform: Java 17+
Java Frameworks: Spring Framework
Build Tool: Maven
IDEA: IntelliJ IDEA
Database: MySql
Cloud for Deployment: AWS Cloud


##Functionalities
1. Posts Management - Create, Read, Update and Delete posts. Provide pagination and sorting.
2. Comments Management - Create, Read, Update and Delete Comments for Blog Post.
3. Category Management - Create, Read, Update and Delete Category.
4. Authentication and Authorization - Register, Login and Security.



##New Things
DTO - reduce overfetching (retrieving more data then needed) and uderfetching (not retrieving enough data)
    hiding sensitive data
    reducing dependency

All the methods of JpaRepository are Transactional

Pagination consist of two fields - page size and page number. Defining default values for pageNo is 0 and PageSize = 10

The FetchType.LAZY tells Hibernate to only fetch the related entities from the database when you use the relationship.

There are many reasons why we use DTO's and here are some reasons:
1. In Java applications - we use entity classes to represent tables in a relational database. Without DTOs, we'd have to expose the entire entities to a remote interface. This causes a strong coupling between an API and a persistence model.
2. Using DTOs on RESTful APIs written in Java (and on Spring Boot), is that they can help to hide implementation details of domain objects (JPA entities). Exposing entities through endpoints can become a security issue if we do not carefully handle what properties can be changed through what operations.
For Example: If the entity class contains sensitive information (ex: password, codes, etc) then if we return the entity directly then the client will get this sensitive information which causes security issues.
Regarding the Builder pattern.
Ideally, It is good to use a builder pattern when you have many properties in your class and needs to create many constructors.
But you can go ahead with the builder pattern to get more exposure to the builder pattern.

##Spring Security
Authentification Filter - create instance of authentification object. This object basically contains the username and password. And then Authentification filter will pass this authetification object to Authentification Manager/

Authentification Manager - manages different authentification providers

Types of authentification: OAuth2, LDAP and DAO.

##JWT
JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object.

JWO, or JSON Web Tokens is a standard that is mostly used for securing REST APIs

JWT follows stateless autentication mechanism.

JSON Web Tokens used: Authorization and Information Exchange
Authorization - this is the most common scenario for using JWT. Once the user is logged in, each subsequent request will include the JWT, allowing the user to access resources that are permitted with that tocken. Single Sing On is a feature that widely uses JSWT nowadays.

JSON Web Tokens consist of three parts separed by dots, which are: Header, Payload and Signature.

Development JWT Steps:

1. Add JWT related Maven dependecy

2. Create JwtAuthenticationEntryPoint

3. Add Jwt properties in application properties file

4. Create JwtTokenProvider - By creating this JwtTokenProvider class, you centralize the logic for generating, validating, and extracting information from JWT tokens in a Spring Boot application, making it easier to manage authentication and authorization with JWT tokens.

5. Creaate JwtAuthenticationFilter

6. Create JwtAuthResponse DTO

7. Configure JWT in Spring Security

8. Change Login/Signin REST API to Return JWT Token

##Swagger 
springdoc-openapi java library helps to automate the generation of API documentation using spring boot projects.

springdoc-openapi java library provides integration between spring-boot and swagger-uri.

Automatically generates documentation in JSON/YAML and HTML format APIs.

http://localhost:8080/swagger-ui/index.html
 
http://localhost:8080/v3/api-docs

##Annotation

@ResponseStatus annotation cause Spring Boot to respond with the specified HTTP status code whenever this exception is thrown from your controller.

@PathVariable annotation used on a method argument to bind it to the value of a URI template variable.

@RequestBody - Annotation indicating a method parameter should be bound to the body of the web request. Convert json to Java objec.

@PathVariable - Annotation which indicates that a method parameter should be bound to a URI template variable.

@ExceptionHandler - it is an annotation used to handle the specific exceptions and sending the custom response to the client.

@ControlAdvice - it is an annotatation to handgle exceptios globally.



















































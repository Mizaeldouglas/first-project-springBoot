# first-project-springBoot

<br>

![Domain model](https://user-images.githubusercontent.com/89351018/185816393-ea875562-d112-48d1-9934-0d7a8bbdcea6.png)

<br>

![DomainInstace](https://user-images.githubusercontent.com/89351018/185816402-ee0c2e0e-86f8-43fe-a73b-4ed17fc963ab.png)



<br>

## Project created
- Checklist:
  - File -> New -> Spring Starter Project
  - Maven
  - Java 11
  - Packing JAR
  - Dependencies: Spring Web Starter

## User entity and resource
- Basic entity checklist:
  - Basic attributes
  - Associations (instantiate collections)
  - Constructors
  - Getters & Setters (collections: only get)
  - hashCode & equals
  - Serializable
## H2 database, test profile, JPA
- Checklist:
  - JPA & H2 dependencies
  - application.properties
  - application-test.properties
  - Entity: JPA mapping
## JPA repository, dependency injection, database seeding
- Checklist:
  - UserRepository extends JPARepository<User, Long>
  - Configuration class for "test" profile
  - @Autowired UserRepository
  - Instantiate objects in memory
  - Persist objects
## Order, Instant, ISO 8601
- Basic new entity checklist:
  - Entity
  - "To many" association, lazy loading, JsonIgnore
  - Repository
  - Seed
  - Service
  - Resource
## Many-to-many association with JoinTable
## OrderItem, many-to-many association with extra attributes
- Checklist:
  - OrderItemPK
  - OrderItem
  - Order one-to-many association
  - Seed
## Product-OrderItem one-to-many association
## Payment, one-to-one association
## Subtotal & Total methods 
## User insert
- Checklist:
  - UserService
  - UserResource
## User delete
- Checklist:
  - UserService
  - UserResource
## User update
- Checklist:
  - UserService
  - UserResource
## Exception handling - findById
- Checklist:
  - NEW CLASS: services.exceptions.ResourceNotFoundException
  - NEW CLASS: resources.exceptions.StandardError
  - NEW CLASS: resources.exceptions.ResourceExceptionHandler
  - UserService 
## Exception handling - delete
- Checklist:
  - NEW CLASS: services.exceptions.DatabaseException
  - ResourceExceptionHandler
  - UserService
   - EmptyResultDataAccessException
   - DataIntegrityViolationException
## Exception handling - update
- Checklist:
  - UserService
  - EntityNotFoundException

# microlab
Microservice experimentation with Quarkus

# General
- [x] Banner customization
- [x] Dev UI -> <host>/q/dev-ui
- [x] Dev services -> https://quarkus.io/guides/dev-services

# Quarkus CLI
- [x] Create application
```
$ quarkus create app xyz.tham:microlab --extension quarkus-rest --no-code
```
- [ ] quarkus update
- [ ] quarkus extensions
```
$ quarkus extension categories
$ quarkus extension list
$ quarkus extension list --installable --category "ai"
(or)
$ quarkus ext list -ic "ai"
```
- [ ] manage extensions
```
$ quarkus extension add "<artifactid>"
$ quarkus extension remove "<artifactid>"
```

# Micro Profile Standard
## Jakarta EE Core Profile
- Jakarta Annotations
- Jakarta CDI (CDI Lite)
- Jakarta Dependency Injection
- Jakarta Interceptors
- Jakarta JSON Processing
- Jakarta JSON Binding
- Jakarta RESTful Web Services

## Jakarta RESTful Web Services
### REST API
GET / POST / PUT / DELETE

### Graph QL API
Query / Mutation / Subscription

### gRPC API
x

## Config
Manages the application configuration. Refer https://microprofile.io/specifications/config/ for more information
```
src\main\resources\application.properties

@ConfigProperty(name="<key>")
```
### Configuration profiles
1. prod -> active when application is running in production mode
2. dev -> active when application is running in dev mode
3. test -> active during tests
4. custom -> which can be activated using `quarkus.profile` configuration property

### Configuration profile declaration
#1: Add `%<profile>.` with the configuration property. 
```
%dev.quarkus.http.port=7777
```
#2: Add `-<profile>` with the configuration file
```
application-dev.properties
application-prod.properties
```

### Overriding configuration properties
Compile time -> Profile specific configuration properties
Runtime:
1. System property
2. Environment variables
3. Configuration property file (application.properties)

```
Environment property should be capitalized and replace the `.` with `_` value
my.greeting -> MY_GREETING
MY_GREETING="Welcome to earth"
```
```
System property should be handled with -D argument
-Dgreeting="Welcome to microlab"
```

## Health
x

## JWT Authentication
x

## Fault Tolerence
x

## REST Client
x

## Open API
x

## Telemetry
x

# References
- https://github.com/xstefank/quarkus-in-action

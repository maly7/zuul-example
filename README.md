
## Spring Cloud Zuul Example
This example project contains 3 application, a Zuul Gateway application, and 2 other applications behind the proxy.

### Running
1. In separate consoles (or through the IntelliJ Spring Boot Runner) start all three applications
2. Navigate to `http://localhost:8080/bookstore` or `http://localhost:8080/library` to access the proxied applications through Zuul


### Notes
- Importing the Spring Cloud BOM is necessary, without it you get a ClassDefNotFoundError
- Zuul adds quite a few headers
  - Host
  - X-Forwarded-Host, X-Forwarded-Port, and many other X-Forwarded-\* Headers
- It's probably worth investigating what headers are added when Spring Security is enabled

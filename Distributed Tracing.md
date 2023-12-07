## Distributed Tracing
```
It is latency measurement of each service in distributed system or microservice architecture.
```
Distributed tracing helps us to monitor and understand requests as they traverse multiple services in a distributed architecture. It involves generating unique identifiers (trace and span IDs) and propagating them across services to track the flow of a request.

## Spring Cloud Sleuth
Spring Cloud Sleuth is a distributed tracing solution provided by the Spring Cloud ecosystem.Sleuth assigns each incoming request a _unique trace ID and individual span IDs_ for different operations within that request's flow.

These IDs are propagated via headers in subsequent requests between services.Propagates trace and span IDs automatically add through HTTP headers.
>Spring Cloud Sleuth is commonly used for instrumenting Spring Boot applications to generate trace and span IDs.
>
>Sleuth integrates seamlessly with Zipkin, sending trace data to Zipkin's collector for storage and visualization.

## How Sleuth Works
1.  Generates a trace ID when a request enters the system.
2.  Assigns a span ID for each operation within the request (e.g., processing in different services).
3.  Propagates trace and span IDs across service boundaries using standard HTTP headers.

## Zipkin
Zipkin provides a powerful toolset for understanding the flow of requests within distributed systems.

It provides insights into how requests propagate across services, aiding in troubleshooting, performance monitoring, and understanding dependencies within a system.


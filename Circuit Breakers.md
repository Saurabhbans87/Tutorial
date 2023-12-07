## Circuit Breakers
Circuit breakers are crucial components in distributed systems that help handle failures, prevent cascading failures, and improve system resilience. They act as a safety mechanism to detect and mitigate issues within microservices architectures.
> [!NOTE]
> Imagine a scenario where Service A calls Service B. If Service B encounters issues or is slow, Service A might experience delayed responses or become unresponsive, affecting the entire system. A circuit breaker works similarly to an electrical circuit breaker: it trips (opens) when there's a fault or failure and prevents further requests to the failing service for a certain duration.
## Circuit Breaker States
### Closed State
1.    Initially, the circuit breaker is in the closed state, allowing requests to pass through to the service.
2.    During this state, the system monitors the service for failures (like timeouts, exceptions, etc.).
### Open State
1.    When the threshold for failures (e.g., consecutive failures or timeouts) is reached, the circuit breaker trips and enters the open   state.
2.    In this state, requests are not sent to the failing service. Instead, a predefined fallback mechanism (e.g., returning default values or cached responses) is used.
### Half-Open State
1.    After a specified time, the circuit breaker transitions to the half-open state to check if the service has recovered.
2.    It allows a limited number of requests to pass through to the service. If they succeed, the circuit breaker returns to the closed state; otherwise, it remains open.
## Benefits
### Fault Isolation: 
  Circuit breakers prevent failures in one service from affecting other parts of the system.
### Resilience: 
  They improve system resilience by handling and recovering from failures gracefully.
### Fallback Mechanisms: 
  Fallbacks ensure the system can provide responses even when a service is unavailable.
## Circuit Breaker Implementations

###  Resilience4j
  Resilience4j is a lightweight fault tolerance library designed for Java 8 and above.Resilience4j offers multiple resilience patterns
  1.  Circuit Breaker-Prevents a single failing component from causing cascading failures.
  2.  Rate Limiter: Limits the rate of events or calls to a system.
  3.  Retry: Automatically retries failed operations with customizable configurations.
  4.  Bulkhead: Isolates different parts of the system to prevent failures from spreading.
  5.  Time Limiter: Enforces time limits for operations.
  6.  Retry, TimeLimiter, and RateLimiter decorators can be combined within a circuit breaker.
###  Spring Cloud Circuit Breaker
###  Netflix Hystrix


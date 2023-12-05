## Service Discovery and Service Registry
Service Discovery and Registration is a crucial aspect of building and managing applications in a distributed system.

## Service Discovery: 

Imagine a network of different services (like a shopping website with inventory, payment, and user services). Service discovery helps these services find each other. For instance, when the inventory service needs to talk to the payment service, it doesn't need to know the exact address or location of the payment service. Instead, it asks a service discovery tool, which keeps a directory of all services and their locations, to find and connect it to the payment service.

      Think of it as a map or a directory for finding things. In a big city, you might use a map to find restaurants or shops. Service discovery is like that map but for computer programs. It helps one program find another program that it needs to talk to, even if they don't know each other's exact location.

## Service Registration: 

When a service starts up, it registers itself with the service discovery tool. It says, "Hey, I'm the inventory service, and I'm here!" It provides information about its location, capabilities, and how other services can communicate with it. This way, other services can find and interact with it without needing to know where it specifically resides.

      When a new shop opens in a city, it gets added to the map so people can find it. Similarly, when a new computer program (like a service) starts running, it tells the service discovery tool, "Hey, I'm here and ready to work!" It registers its name and location so that other programs can easily find and connect to it when needed.

In essence, service discovery and registration make it easier for services in a distributed system to communicate with each other without the need for hardcoded addresses or configurations, making the system more dynamic and scalable. Tools like Eureka, Consul, or ZooKeeper are used to implement service discovery and registration in frameworks like Spring Cloud.

## Tools
Eureka
ZooKeeper
Consul

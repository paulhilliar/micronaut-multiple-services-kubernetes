# micronaut-multiple-services-kubernetes
Example of running multiple microservices talking to each other in Micronaut / Docker / Kubernetes

So the point of this example is demonstrating simpy how to:
* build a couple of Micronaut microservices
* package them in Docker images
* deploy them in a Kubernetes deployment
* have Kubnernetes set up DNS so the services can call each other

To run/test:
* run `build.sh` - this will build the Micronaut apps and create docker images 
* run `kubectl apply -f micronaut-multiple-services-kubernetes.yaml` - this will 
* curl localhost:8080/greetings | jq

Note that there are two microservices:
* 'name service' - GET /names returns a random name
* 'greeting service' - GET /greetings retrieves a random name from the name serivce and returns a greeting 'hello \<random name\>'

The Kubernetes deployment file (micronaut-multiple-services-kubernetes.yaml) 
* deploys the services (with appropriate 'liveness' checks)
* sets up a LoadBalancer service for the greeting service, to expose it externally
* sets up a NodePort service for the name serivce, so the greeting service can call the name serivce via `GET http://name-service-loadbalancer:8080/names` (see NameServiceClient)

Please see this page for the relevant Kubernetes docs: https://kubernetes.io/docs/concepts/services-networking/connect-applications-service/

###### Deployment steps
1. install and configure maven
2. install and configure aws cli
3. install and configure sam cli
4. browse to the project root folder
5. run **sam build**
6. run **sam deploy**, _you will get the api url exported to CloudFormation output **SpringFunctionApi15**_
7. use the following curl command to test  
`curl --location --request POST '{SpringFunctionApi15}/' \
--header 'Content-Type: text/plain' \
--data-raw 'Zsolt'`
---
###### References
- https://aws.amazon.com/lambda/
- https://spring.io/projects/spring-cloud-function
- https://docs.spring.io/spring-cloud-function/docs/3.0.10.RELEASE/reference/html/aws.html
- https://aws.amazon.com/serverless/sam/
- https://www.baeldung.com/spring-cloud-function
- https://github.com/awslabs/aws-serverless-java-container/tree/master/samples/springboot2/pet-store



#environment variables
set FUNCTION_NAME=greeter or FUNCTION_NAME=reverseString in the template.yml file to expose the function you want

###### Deployment steps
install and configure maven
install and configure aws cli
install and configure sam cli
browse to the project root folder
run **sam build**
run **sam deploy**, _you will get the api url exported to CloudFormation output **SpringFunctionApi15**_
use the following curl command to test 
`curl --location --request POST '**SpringFunctionApi15**/' \
--header 'Content-Type: text/plain' \
--data-raw 'Zsolt'`

###### References
https://aws.amazon.com/lambda/
https://spring.io/projects/spring-cloud-function
https://docs.spring.io/spring-cloud-function/docs/3.0.10.RELEASE/reference/html/aws.html
https://aws.amazon.com/serverless/sam/
https://www.baeldung.com/spring-cloud-function
https://github.com/awslabs/aws-serverless-java-container/tree/master/samples/springboot2/pet-store



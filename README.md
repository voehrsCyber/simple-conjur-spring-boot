# Simple Conjur Spring Boot integration
This project should help to give a quick inside how conjur can be integrated into Spring Boot applications.
This project has been built with openjdk version "1.8.0_222" on a CENTOS 7.2

## How to build
To build the repository just run "gradlew build" within the project root folder. All dependencies will be loaded automatically.
Maven is currently a ToDo.

## How to run
To run the project you can just run the existing compiled project in build with following command:
java -DCONJUR_ACCOUNT="cyberark" -DCONJUR_APPLIANCE_URL="https://CONJUR/api" -DCONJUR_AUTHN_LOGIN="CONJUR USER" -DCONJUR_AUTHN_API_KEY="API KEY of CONJUR USER" -jar build/libs/gs-spring-boot-0.1.0.jar
Therefore you need a conjur user like the admin user or a host. Each of it has its own password/api-key. The accountname might need to be adjusted as my conjur runs with "cyberark" as account name. Also you need a secret within conjur with the following path: secrets/frontend/aws_access_key
CONJUR_APPLIANCE_URL has to be set to the correct conjur url, which looks something like: "https://conjur-master/api". To import the SSL certificate please follow the instructions on here: https://github.com/cyberark/conjur-api-java#setup-trust-between-app-and-conjur

## Future plans
  - Integration of maven build
  - JPA integration in a seperate repository using Spring Boot

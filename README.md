### Contacts App

###### Overview
A simple app that shows a list of contacts and allows for adding new contacts to that list. Embedded H2 is used for tests as well as the runtime database. Liquibase is used to manage the schema as well as to put that schema in the embeded H2 db each time the app is started for both tests and runtime. You can find the migrations under src/main/resources.

The frontend is written in Angular 1.5.8. UI-Router is used instead of ngRoute. Bootstrap was used instead of raw css. The form to create a new contact requires something in every input and it will flash red if you delete the contents of an input box.

###### Requirements
Java 8
Maven
NPM

###### Setup, Running, and Usage

First, npm install


then, bower install


then to compile the Spring app: mvn clean install


Then, to run: mvn spring-boot:run


There's no gulp or grunt routine since this is a simple app. There's a 'bootstrap' routine which loads a few contacts into H2 using Hibernate and Spring-Data.

The app listens on port 8080 and can be accessed while running locally by typing localhost:8080 into your browser.

One test was written to test persistence using Hibernate and Spring-Data.
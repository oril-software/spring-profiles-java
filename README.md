## Using Profiles with Spring Boot
This repository is an example of how to use Profiles in different ways

### Requirements
* Java
* Maven

### How to Use
There are a few different ways to activate a specific profile:
* Enabling active profile in **__application.yml__** file
* By specifying in command line while running .jar file `java -jar myapp.jar --spring.profiles.active=dev`
* Programmatically in main application method

Also there are ways to run profile-specific code:
* Using **@Profile** annotation for different method implementation
* Using `environment.acceptsProfiles()` method to check what profile is active
## Using Profiles with Spring Boot
This repository is an example of how to use Profiles in different ways

### Prerequisites
* Java 8+
* Maven ^3.6.0

### How to Use
There are a few different ways to activate a specific profile:
* Enabling active profile in **__application.yml__** file
* By specifying in command line while running .jar file `java -jar myapp.jar --spring.profiles.active=dev`
* Programmatically in main application method

Also there are ways to run profile-specific code:
* Using **@Profile** annotation for different method implementation
* Using `environment.acceptsProfiles()` method to check what profile is active

### Community
* Please send us your suggestions on how we make this code even more useful for the development community or contribute to this repo!
* Check out our [blog](https://oril.co/blog) with more articles!
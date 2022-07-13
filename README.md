# Building and Testing an API Framework with Java and Sauce Labs API Testing

Hello, if you are reading this you are interested in and hopefully attending the [Testing for Good](https://info.saucelabs.com/EVT-Testing-for-Good-Workshops-Registration.html) workshop _API Testing With Java_. In this workshop we will build and test a simple web API service called Sauce Logs. Let's have some fun!

## Technical Requirements

You will need to have installed

Java JDK 11+
IntelliJ or VS Code
Git
A Valid Sauce Labs account

### Gitpod setup

ℹ Gitpod lets you run an entire Dev environment from a browser! You can use this approach if you don't have time or you don't know how to setup a local Java environment.

1. Sign up for a free [GitHub account](https://github.com/)
2. [Fork this repository](https://docs.github.com/en/get-started/quickstart/fork-a-repo)
 * Make sure you are logged into GitHub
 * Click the Fork in the upper right of the GitHub.
 * Give the repo a ⭐ while you're here 🤩
3. In the browser address bar, your GitHub url (`https://github.com/USERNAME/this-repo-name`) with `https://gitpod.io/#`
    * The resulting url should look as follows:
   
      > https://gitpod.io/#https://github.com/USERNAME/mobile-appium-java-workshop
   
4. Once the Gitpod.io URL is loaded, you will need to sign in with the GitHub account you created earlier 
5. Once the development environment is loaded, you should see 'Ready to test!' in the Terminal window in the lower portion of the window, run the following commands in that Terminal to set your `SAUCE_USERNAME`, `SAUCE_ACCESS_KEY`:

```bash
eval $(gp env -e SAUCE_USERNAME=<sauce_username>)
eval $(gp env -e SAUCE_ACCESS_KEY=<sauce_access_key>)
```

> Replace <sauce_username>, <sauce_access_key> with your credentials

Once you have run those 2 commands, you can run the following commands to test your environment variables:

```bash
echo $SAUCE_USERNAME
echo $SAUCE_ACCESS_KEY
```

## Workshop Structure

The structure of this workshop is as follows:

### Building an API Service with Java Spring Boot

In the first part of this workshop we will build a basic API web service locally using Java and Spring Boot, a Model-View-Controller (MVC) framework. I'll walk through

- How to create the main service
- How to create a Model, representing a hot sauce
- How to create a Controller, representing the logic for CRUD operations on a our app, and finally
- How to create an OpenAPI specification for our API

### Testing an API Service with Sauce Labs API Testing

In the second part of this workshop, we will walk through testing our application using Sauce Labs API Testing, a cloud-based API testing platform. 

I'll walk through

- How to create a test from scratch on Sauce API Testing
- How to create a test from an OpenAPI spec
- How to run tests manually and from command line or CI

## Installation and Running the App

This project uses Gradle. From the project root directory, first run

```bash
./gradlew build
```

to make sure there are no build errors. After that, you can build and deploy the API service locally using

```
./gradlew bootRun
```

which will start a service on `http://localhost:7000/`.
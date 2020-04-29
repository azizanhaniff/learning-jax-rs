# Java RESTful API (JAX-RS) using Jersey 2.0

A program sample for JAX-RS using Jersey 2.0 with implementation of CORS included.
This program was not developed using Maven, although recommended by Jersey to do so.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

1. Eclipse IDE (Project was developed with Eclipse IDE for Enterprise Java Developers, Version 2020-03)
2. Tomcat 9 (Project was developed with Tomcat 9 configuration)
3. JDK 8 (Project was developed with JDK 8u131)
4. List of dependencies required to run the project.
[Jersey's JAX-RS 2.1 RI bundle](http://repo1.maven.org/maven2/org/glassfish/jersey/bundles/jaxrs-ri/2.30.1/jaxrs-ri-2.30.1.zip) ([official website](https://eclipse-ee4j.github.io/jersey/download.html))
[Jackson JAX-RS JSON Provider](https://jar-download.com/artifacts/com.fasterxml.jackson.jaxrs/jackson-jaxrs-json-provider)
Note: These dependencies are available in <i>lib</i>. See <strong>Configure Build Path</strong> and <strong>Configure Deployment Assembly</strong> in <strong>Installing</strong> section on how to include them at classpath.

### Installing

#### Getting It Running on Eclipse.

1. Copy the SSH URL to clipboard.

2. Clone this project on GitHub Desktop or Sourcetree or any other relevant application.

3. Open Eclipse IDE.
Open <i>File</i> > </i>Open Projects from File System...<i>.
Click <i>Directory...</i> and select the folder of the cloned project.
Click <i>Finish</i>.

#### Configure Build Path

1. Right-click project folder and select <i>Build Path</i> > <i>Configure Build Path...</i>.
2. Click <i>Add External JARs...</i>.
3. Go to <i>lib</i> folder and add all the JAR files.
4. Click <i>Apply and Close</i>.

#### Configure Deployment Assembly

1. Right-click project folder and select <i>Properties</i>.
2. On the left-side of the window, click <i>Deployment Assembly</i>.
3. On the right-side of the window, click <i>Add...</i>.
4. Choose <i>Java Build Path Entries</i> and select all JAR files.
5. Click <i>Finish</i>.
6. Click <i>Apply and Close</i>.

#### (Optional) Adding Your Local Tomcat Server to Eclipse

If you have any, you can add your local Tomcat server to Eclipse. This is especially useful during development.

1. Click <i>File</i> > <i>New</i> > <i>Other</i>.
2. Search and choose <i>Server</i>, then click <i>Next</i>.
3. Select your Tomcat's server type and click <i>Next</i>.
4. Click <i>Browse</i> and specify your Tomcat installation directory, then click <i>Next</i>.
5. Click <i>Finish</i>.

Your Eclipse might not show Servers tab at the bottom by default. You can enable it by going to <i>Window</i> > <i>Show View</i> > <i>Servers</i>.

## Running the Tests

### Start Server

1. Right-click project folder and click <i>Run As</i> > <i>Run on Server</i>. 
2. Choose relevant Tomcat Server and click <i>Finish</i>.
3. Eclipse may ask you to restart the server. If so, choose to restart.

### Send Request (Simulate as Client)

This simulates the scenario where clients are sending requests to the API to perform some process.

1. Go to <i>client.test</i> package, there should be 3 Java files.
2. Right-click any and select <i>Run As</i> > <i>Run As Application</i>.
3. Output will be displayed on the <i>Console</i> tab.

Note: You can also simulate through Postman by sending request to the URL listed in <i>app.JerseyApplication</i>.

## Deployment

Export the project as a WAR file.

1. Right-click project folder and select <i>Export</i>.
2. Choose <i>Web</i> > <i>WAR file</i>.
3. Choose Destination.
4. Click Finish.
5. Copy the WAR file to inside your Tomcat's webapp folder. 
This automatically extracts the content of the WAR file into webapp folder. 
You might be seeing a folder of the project's name created soon enough.

Note: If you want to remove the project from the webapp, simply delete the WAR file. This will automatically delete the folder as well.

## Test Whether Deployment Works

Once you've placed the project inside your Tomcat <i>webapp</i> folder, you can test it out through your web browser or Postman application.

The available URLs for sending requests are as below:

```
http://localhost:8080/jersey-restful-sample/api/first/hello
GET : text/html, text/plain, text/xml

http://localhost:8080/jersey-restful-sample/api/jaxb/todo
GET : application/json, application/xml, and text/xml

http://localhost:8080/jersey-restful-sample/api/crud/todos
GET : application/json, application/xml, and text/xml

http://localhost:8080/jersey-restful-sample/api/crud/todos/count
GET : application/json, application/xml, and text/xml
POST: text/html

http://localhost:8080/jersey-restful-sample/api/crud/todos/{todo}
@todo int e.g. 1, 2.
GET : application/json, application/xml, and text/xml
PUT : application/xml
```

## Research and Development Sources

* [Vogella](https://www.vogella.com/tutorials/REST/article.html) - REST with Java (JAX-RS) using Jersey
* [CORS](https://stackoverflow.com/a/28067653/13387145) - How to handle CORS using JAX-RS with Jersey
* [Jersey without Maven](https://stackoverflow.com/q/17923273/13387145) - How to implement Jersey 2.0 without Maven
* Readme by [PurpleBooth](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2).

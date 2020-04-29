package app;

import org.glassfish.jersey.server.ResourceConfig;

import util.filter.CorsFilter;

public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        /*
         *  List of available requests and responses
         * 
         *  http://localhost:8080/jersey-restful-sample/api/first/hello
         *  GET : text/html, text/plain, text/xml
         *  
         *  http://localhost:8080/jersey-restful-sample/api/jaxb/todo
         *  GET : application/json, application/xml, and text/xml
         *  
         *  http://localhost:8080/jersey-restful-sample/api/crud/todos
         *  GET : application/json, application/xml, and text/xml
         *  
         *  http://localhost:8080/jersey-restful-sample/api/crud/todos/count
         *  GET : application/json, application/xml, and text/xml
         *  POST: text/html
         *  
         *  http://localhost:8080/jersey-restful-sample/api/crud/todos/{todo}
         *  @todo int e.g. 1, 2.
         *  GET : application/json, application/xml, and text/xml
         *  PUT : application/xml
         *  
         */
        
        packages("resource.crud");
        packages("resource.first");
        packages("resource.jaxb");
        
        register(CorsFilter.class);
    }
}

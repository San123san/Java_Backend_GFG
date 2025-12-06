package com.gfg_pratica.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // #1: SLF4J Logger Initialization
    // LoggerFactory.getLogger(DemoApplication.class) creates a logger instance
    // connected to this specific class (DemoApplication). SLF4J is a logging facade
    // that delegates actual logging to underlying implementations like Logback
    // (Spring Boot's default). This enables structured logging with levels:
    // TRACE, DEBUG, INFO, WARN, ERROR. The logger is tied to the class for
    // contextual log identification in output files/console. [web:77][web:79]

    private static Logger loger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("hello, World");

        // #1->1: Debug Level Log
        // loger.debug() sends DEBUG level message. Only visible if logging level
        // is DEBUG or lower (configured in application.properties or logback.xml).
        // Used for detailed troubleshooting info. Logger connection confirmed -
        // traces execution flow when enabled. [web:77][web:80]
        loger.debug("Debugging log message");

        // #1->2: Info Level Log
        // loger.info() sends INFO level message. Default visible level in Spring Boot.
        // Used for important business events/application state. Logger properly
        // connected to SLF4J/Logback pipeline. [web:77][web:79]
        loger.info("Info log message");

        // #1->3: Error Level Log
        // loger.error() sends ERROR level message. Always visible (highest priority).
        // Used for exceptions/failures. Logger connection active - outputs to
        // console/file based on Logback configuration. [web:77][web:81]
        loger.error("Error log message");
	}

}

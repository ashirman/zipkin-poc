package com.foo.bar.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * Created by ashirman on 06.01.2017.
 */
@SpringBootApplication
@EnableZipkinServer
//@EnableZipkinStreamServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

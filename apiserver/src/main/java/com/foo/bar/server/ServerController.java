package com.foo.bar.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by ashirman on 06.01.2017.
 */
@RestController
public class ServerController {
    @RequestMapping(method = RequestMethod.GET, path = "/getDate")
    public String getDate() {
        return new Date().toString();
    }
}

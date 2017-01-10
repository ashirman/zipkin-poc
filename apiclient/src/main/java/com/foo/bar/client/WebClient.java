package com.foo.bar.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ashirman on 06.01.2017.
 */
@RestController
public class WebClient {
    @Autowired
    Client client;

    @RequestMapping("/getClientDate")
    String getClientDate(){
        return client.getDate();
    }
}

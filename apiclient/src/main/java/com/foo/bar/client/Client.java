package com.foo.bar.client;

/**
 * Created by ashirman on 06.01.2017.
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "dateClient", url = "${com.foo.bar.server.url}")
public interface Client {

    @RequestMapping(method = RequestMethod.GET, path = "/getDate")
    String getDate();
}

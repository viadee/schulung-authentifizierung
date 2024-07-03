package com.example.oauth_spa_client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SingePageApplicationController {

    @RequestMapping(value = "{path:^(?!api|public|assets)[^\\.]*}/**")
    public String forward() {
        return "forward:/";
    }

}
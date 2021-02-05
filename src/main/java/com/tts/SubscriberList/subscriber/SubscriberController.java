package com.tts.SubscriberList.subscriber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscriberController {
    @GetMapping
    public String index(Subscriber subscriber){
        // where the application gets started
        return "subscriber/index";
    }
}

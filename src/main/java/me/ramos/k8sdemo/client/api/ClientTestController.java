package me.ramos.k8sdemo.client.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientTestController {

    @GetMapping("/test")
    public String test() {
        return "client only";
    }
}

package pl.keruzam.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "service is working";
    }
}

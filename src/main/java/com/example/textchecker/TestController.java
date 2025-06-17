package com.example.textchecker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}

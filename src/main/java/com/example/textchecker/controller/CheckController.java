package com.example.textchecker.controller;

import com.example.textchecker.dto.CheckRequest;
import com.example.textchecker.dto.CheckResponse;
import com.example.textchecker.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckController {

    @Autowired
    private CheckService checkService;

    @PostMapping
    public CheckResponse check(@RequestBody CheckRequest request) {
        return checkService.check(request.getContent());
    }
}

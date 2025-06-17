package com.example.textchecker.controller;

import com.example.textchecker.dto.CheckRequest;
import com.example.textchecker.dto.CheckResponse;
import com.example.textchecker.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@RestController
@RequestMapping("/check")
@CrossOrigin(origins = "*")
public class CheckController {

    @Autowired
    private CheckService checkService;

    @PostMapping
    public CheckResponse handleCheck(@RequestBody CheckRequest request) {
        return checkService.check(request.getContent());
    }
}

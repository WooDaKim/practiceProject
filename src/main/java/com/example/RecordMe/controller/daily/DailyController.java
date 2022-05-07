package com.example.RecordMe.controller.daily;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DailyController {

    @GetMapping
    public String list() {
        return "daily/daily.html";
    }

    @GetMapping
    public String write() {
        return "daily/write.html";
    }
}

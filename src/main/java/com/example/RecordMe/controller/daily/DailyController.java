package com.example.RecordMe.controller.daily;

import com.example.RecordMe.dto.daily.DailyDto;
import com.example.RecordMe.service.daily.DailyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DailyController {

    private DailyService dailyService;

    public DailyController(DailyService dailyService) {
        this.dailyService = dailyService;
    }

    @GetMapping("/")
    public String list() {
        return "daily/list.html";
    }

    @GetMapping("/post")
    public String write() {
        return "daily/write.html";
    }

    @PostMapping("/post")
    public String write(DailyDto dailyDto) {
        dailyService.savePost(dailyDto);
        return "redirect:/";
    }
}

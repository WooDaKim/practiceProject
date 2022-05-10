package com.example.RecordMe.controller.daily;

import com.example.RecordMe.dto.daily.DailyDto;
import com.example.RecordMe.service.daily.DailyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DailyController {

    private DailyService dailyService;

    public DailyController(DailyService dailyService) {
        this.dailyService = dailyService;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<DailyDto> dailyDtoList = dailyService.getDailyList();
        model.addAttribute("dailyList", dailyDtoList);

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

    @GetMapping("/post/{no}")
    public String detail(@PathVariable("no") Long id, Model model) {
        DailyDto dailyDto = dailyService.getPost(id);

        model.addAttribute("dailyDto", dailyDto);
        return "daily/detail.html";
    }
}

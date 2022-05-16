package com.example.RecordMe.controller.daily;

import com.example.RecordMe.dto.daily.DailyDto;
import com.example.RecordMe.service.daily.DailyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DailyController {

    private DailyService dailyService;

    public DailyController(DailyService dailyService) {
        this.dailyService = dailyService;
    }

    @GetMapping("/")
    public String list(Model model, @RequestParam(value = "page", defaultValue = "1") Integer pageNum) {
        List<DailyDto> dailyDtoList = dailyService.getDailyList();
        Integer[] pageList = dailyService.getPageList(pageNum);

        model.addAttribute("dailyList", dailyDtoList);
        model.addAttribute("pageList", pageList);

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

    @GetMapping("/post/edit/{no}")
    public String edit(@PathVariable("no") Long id, Model model) {
        DailyDto dailyDto = dailyService.getPost(id);

        model.addAttribute("dailyDto", dailyDto);
        return "daily/update.html";
    }

    @PutMapping("/post/edit/{no}")
    public String update(DailyDto dailyDto) {
        dailyService.savePost(dailyDto);
        return "redirect:/";
    }

    @DeleteMapping("/post/{no}")
    public String delete(@PathVariable("no") Long id) {
        dailyService.deletePost(id);

        return "redirect:/";
    }

    @GetMapping("/daily/search")
    public String search(@RequestParam(value = "keyword") String keyword, Model model) {
        List<DailyDto> dailyDtoList = dailyService.searchPosts(keyword);
        model.addAttribute("boardList", dailyDtoList);

        return "daily/list.html";
    }



}

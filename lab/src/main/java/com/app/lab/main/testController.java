package com.app.lab.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/main/*")
@Slf4j
public class MainController {

    @GetMapping("/index")
    public void main(Model model) {
        // 0430 커밋
        String str = "HELLO WORLD";
        model.addAttribute("str", str);
    }
}

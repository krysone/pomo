package com.pomoge.pbm.controller;

import com.pomoge.pbm.dto.UserDto;
import com.pomoge.pbm.service.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
@RequestMapping("register")
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;


    @GetMapping
    public String register(Model model) {
        model.addAttribute("registerForm", new UserDto());
        return "register";
    }

    @PostMapping
    public String register(@ModelAttribute UserDto registerForm){

        registerService.create(registerForm);
        log.info(registerForm.getEmail() + " has been added");
        return "redirect:/home";
    }

}

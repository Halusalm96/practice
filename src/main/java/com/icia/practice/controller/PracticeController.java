package com.icia.practice.controller;

import com.icia.practice.dto.PracticeDTO;
import com.icia.practice.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PracticeController {

    @Autowired
    PracticeService practiceService = new PracticeService();
    @GetMapping("/saveMain")
    public String saveMain(){
        return "saveMain";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute PracticeDTO practiceDTO){
        practiceService.save(practiceDTO);
        return "main";
    }

    @GetMapping("/loginMain")
    public String loginMain(){
        return "loginMain";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute PracticeDTO practiceDTO, HttpSession session){
        boolean loginResult = practiceService.login(practiceDTO);
        if(loginResult){
            session.setAttribute("loginId", practiceDTO.getId());
            return "main";
        }else {
            return "main";
        }
    }

    @GetMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginId");
        return "main";
    }
}

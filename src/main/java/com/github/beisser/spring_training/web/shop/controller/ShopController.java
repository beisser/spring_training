package com.github.beisser.spring_training.web.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @GetMapping
    public String showHomeView() {
        return "home";
    }

    @GetMapping("/order")
    public String showOrderView(Model model) {
        model.addAttribute("username","Hallo John Doe");

        return "order";
    }

}

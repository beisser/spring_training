package com.github.beisser.spring_training.web.shop.controller;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/shop")
public class ShopController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopController.class);

    @GetMapping
    public String showSearchView(@RequestParam("searchTerm") Optional<String> searchTerm) {

        if(searchTerm.isPresent()) {
            LOGGER.info("Search term is " + searchTerm.get());
        }

        return "search";
    }

    @GetMapping("/order")
    public String showOrderView(Model model) {
        model.addAttribute("username","Hallo John Doe");

        return "order";
    }

}

package com.github.beisser.spring_training.web.shop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

public class AWebController {

    protected ResponseEntity<?> handleException(Exception e) {
        return this.handleException(e, null);
    }

    @ExceptionHandler
    protected ResponseEntity<?> handleException(Exception e, HttpServletRequest request) {
        return ResponseEntity.badRequest().body("Fehler");
    }
}

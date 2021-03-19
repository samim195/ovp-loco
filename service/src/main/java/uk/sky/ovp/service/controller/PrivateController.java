package uk.sky.ovp.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {
    @GetMapping("/status")
    public String status() {
        return "OK";
    }
}

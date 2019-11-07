package com.nagpal.shivam.cors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class GreetController {

    @PostMapping("/greet")
    public ResponseEntity greet() {
        return ResponseEntity.ok("Hello");
    }
}

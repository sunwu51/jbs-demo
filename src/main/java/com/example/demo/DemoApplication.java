package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sun.misc.BASE64Encoder;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/add")
    public ResponseEntity<Integer> add(Integer a, Integer b) {
        return ResponseEntity.ok(a == null || b == null ? 0 : a + b);
    }

    @GetMapping("/base64")
    public ResponseEntity<String> base64(String str) {
        return ResponseEntity.ok("Base64("+str+") = "
                +new BASE64Encoder().encode(str.getBytes()));
    }
}

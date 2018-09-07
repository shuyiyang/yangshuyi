package com.sys.dmeo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDate.now;

@RestController

@RequestMapping("ysy")
public class UserController {
    @GetMapping("/user")
    public ResponseEntity method() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "23");
        map.put("data", now());
        return ResponseEntity.ok(map);
    }
}

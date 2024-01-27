package com.martin.springboot.client.controllers;

import com.martin.springboot.client.models.Message;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class AppController {
    @GetMapping("/list")
    public List<Message> list() {
        return Collections.singletonList(new Message("Test List"));
    }

    @PostMapping("/create")
    public Message create(@RequestBody Message message){
        return message;
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code){
        return Collections.singletonMap("code", code);
    }


}

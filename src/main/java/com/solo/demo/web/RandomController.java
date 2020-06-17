package com.solo.demo.web;

import com.solo.demo.entity.RandNumMessage;
import com.solo.demo.service.RandNumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class RandomController {
    static Random rand = new Random();
    static Logger logger = LoggerFactory.getLogger(RandomController.class);

    // 서비스
    private RandNumService randNumService;

    public RandomController(RandNumService randNumService) {
        this.randNumService = randNumService;
    }

    @GetMapping("/random")
    @ResponseBody
    // 엔티티
    public ResponseEntity<RandNumMessage> getRandom() {
        RandNumMessage random = randNumService.getRandom();
        return ResponseEntity.ok(random);
    }
}

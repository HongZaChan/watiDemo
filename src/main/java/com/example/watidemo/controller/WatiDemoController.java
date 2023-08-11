package com.example.watidemo.controller;


import com.example.watidemo.service.WatiDemoService;
import com.example.watidemo.vo.WatiDemoAddInVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping
public class WatiDemoController {

    @Autowired
    private WatiDemoService watiDemoService;

    @PostMapping("/add")
    public String add(@RequestBody WatiDemoAddInVO inVO) {
        String sum = watiDemoService.add(inVO);
        return sum;
    }
}

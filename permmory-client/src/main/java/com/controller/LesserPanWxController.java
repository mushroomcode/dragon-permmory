package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesserWx")
public class LesserPanWxController {

    @RequestMapping(value = "/getOnceTime")
    @ResponseBody
    public String getPanWxOnceSet () {
        return "connect successful!!";
    }
}

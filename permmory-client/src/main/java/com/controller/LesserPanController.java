package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class LesserPanController {

    @RequestMapping("/fileUpload")
    public void lesserFileUploader (MultipartFile file) {
        try {
            file.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

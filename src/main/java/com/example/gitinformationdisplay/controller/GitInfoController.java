package com.example.gitinformationdisplay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitInfoController {

    @GetMapping("/git")
    public String getGitInformation(){
        return "Retrived Git Info";
    }
}

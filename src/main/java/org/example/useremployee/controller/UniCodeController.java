package org.example.useremployee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//UniCodeJPA opgave
@RestController
public class UniCodeController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {

        char c = (char)i;

        return "unicode=" + i + " char=" + c;

    }

    //Step 3
    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int unicode = (int) c;

        return "char=" + c + " unicode=" + unicode;
    }
}







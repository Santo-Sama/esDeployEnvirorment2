package com.example.esDeployEnvirorment2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/es")
public class BasicController {

    @Value("${myCustomVarTree.welcomeMsg}")
    private String welcome;

    @GetMapping("/welcome")
    public String getWelcome() {
        return welcome;
    }
}